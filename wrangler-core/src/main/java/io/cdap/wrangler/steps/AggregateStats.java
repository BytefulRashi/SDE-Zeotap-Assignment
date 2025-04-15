/*
 * Copyright © 2017-2019 Cask Data, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

 package io.cdap.wrangler.steps;

 import io.cdap.wrangler.api.Arguments;
 import io.cdap.wrangler.api.Directive;
 import io.cdap.wrangler.api.DirectiveExecutionException;
 import io.cdap.wrangler.api.DirectiveParseException;
 import io.cdap.wrangler.api.ErrorRowException;
 import io.cdap.wrangler.api.ExecutorContext;
 import io.cdap.wrangler.api.ReportErrorAndProceed;
 import io.cdap.wrangler.api.Row;
 import io.cdap.wrangler.api.TransientStore;
 import io.cdap.wrangler.api.TransientVariableScope;
 import io.cdap.wrangler.api.annotations.Categories;
 import io.cdap.wrangler.api.annotations.Description;
 import io.cdap.wrangler.api.annotations.Name;
 import io.cdap.wrangler.api.annotations.Plugin;
 import io.cdap.wrangler.api.parser.ByteSize;
 import io.cdap.wrangler.api.parser.ColumnName;
 import io.cdap.wrangler.api.parser.Text;
 import io.cdap.wrangler.api.parser.TimeDuration;
 import io.cdap.wrangler.api.parser.TokenType;
 import io.cdap.wrangler.api.parser.UsageDefinition;
 
 import java.util.ArrayList;
 import java.util.List;
 
 /**
  * A directive that aggregates byte size and time duration values from specified columns.
  */
 @Plugin(type = Directive.TYPE)
 @Name("aggregate-stats")
 @Categories(categories = {"aggregate"})
 @Description("Aggregates byte size and time duration values from specified columns.")
 public class AggregateStats implements Directive {
   
   private String byteSizeColumn;
   private String timeDurationColumn;
   private String totalSizeColumn;
   private String totalTimeColumn;
   private String outputSizeUnit;
   private String outputTimeUnit;
   private String aggregationType;
   
   // Constants for store keys
   private static final String TOTAL_SIZE_KEY = "aggregate-stats.total-size";
   private static final String TOTAL_TIME_KEY = "aggregate-stats.total-time";
   private static final String ROW_COUNT_KEY = "aggregate-stats.row-count";
   
   @Override
   public UsageDefinition define() {
     UsageDefinition.Builder builder = UsageDefinition.builder("aggregate-stats");
     builder.define("byteSizeColumn", TokenType.COLUMN_NAME, "Source column with byte sizes");
     builder.define("timeDurationColumn", TokenType.COLUMN_NAME, "Source column with time durations");
     builder.define("totalSizeColumn", TokenType.TEXT, "Target column name for total size");
     builder.define("totalTimeColumn", TokenType.TEXT, "Target column name for total time");
     builder.define("outputSizeUnit", TokenType.TEXT, "Output unit for size (B, KB, MB, GB, TB)", true);
     builder.define("outputTimeUnit", TokenType.TEXT, "Output unit for time (ns, ms, s, m, h)", true);
     builder.define("aggregationType", TokenType.TEXT, "Aggregation type (total, average)", true);
     return builder.build();
   }
 
   @Override
   public void initialize(Arguments args) throws DirectiveParseException {
     this.byteSizeColumn = ((ColumnName) args.value("byteSizeColumn")).value();
     this.timeDurationColumn = ((ColumnName) args.value("timeDurationColumn")).value();
     this.totalSizeColumn = ((Text) args.value("totalSizeColumn")).value();
     this.totalTimeColumn = ((Text) args.value("totalTimeColumn")).value();
     
     if (args.contains("outputSizeUnit")) {
       this.outputSizeUnit = ((Text) args.value("outputSizeUnit")).value().toUpperCase();
     } else {
       this.outputSizeUnit = "MB"; // Default to MB
     }
     
     if (args.contains("outputTimeUnit")) {
       this.outputTimeUnit = ((Text) args.value("outputTimeUnit")).value().toLowerCase();
     } else {
       this.outputTimeUnit = "s"; // Default to seconds
     }
     
     if (args.contains("aggregationType")) {
       this.aggregationType = ((Text) args.value("aggregationType")).value().toLowerCase();
     } else {
       this.aggregationType = "total"; // Default to total
     }
     
     // Validate output units
     if (!isValidSizeUnit(outputSizeUnit)) {
       throw new DirectiveParseException(
         String.format("Invalid size unit: %s. Valid units are: B, KB, MB, GB, TB", outputSizeUnit));
     }
     
     if (!isValidTimeUnit(outputTimeUnit)) {
       throw new DirectiveParseException(
         String.format("Invalid time unit: %s. Valid units are: ns, us, ms, s, m, h, d", outputTimeUnit));
     }
     
     if (!isValidAggregationType(aggregationType)) {
       throw new DirectiveParseException(
         String.format("Invalid aggregation type: %s. Valid types are: total, average", aggregationType));
     }
   }
   
   private boolean isValidSizeUnit(String unit) {
     return "B".equals(unit) || "KB".equals(unit) || "MB".equals(unit) || 
            "GB".equals(unit) || "TB".equals(unit);
   }
   
   private boolean isValidTimeUnit(String unit) {
     return "ns".equals(unit) || "us".equals(unit) || "ms".equals(unit) || 
            "s".equals(unit) || "m".equals(unit) || "h".equals(unit) || "d".equals(unit);
   }
   
   private boolean isValidAggregationType(String type) {
     return "total".equals(type) || "average".equals(type);
   }
 
   @Override
   public List<Row> execute(List<Row> rows, ExecutorContext context) 
     throws DirectiveExecutionException, ErrorRowException, ReportErrorAndProceed {
     
     TransientStore store = context.getTransientStore();
     
     // Initialize the store if needed
     if (store.get(TOTAL_SIZE_KEY) == null) {
       store.set(TransientVariableScope.GLOBAL, TOTAL_SIZE_KEY, 0L);
     }
     
     if (store.get(TOTAL_TIME_KEY) == null) {
       store.set(TransientVariableScope.GLOBAL, TOTAL_TIME_KEY, 0L);
     }
     
     if (store.get(ROW_COUNT_KEY) == null) {
       store.set(TransientVariableScope.GLOBAL, ROW_COUNT_KEY, 0L);
     }
     
     // Process each row
     for (Row row : rows) {
       // Increment row count
       store.increment(TransientVariableScope.GLOBAL, ROW_COUNT_KEY, 1);
       
       // Process byte size
       int byteSizeIdx = row.find(byteSizeColumn);
       if (byteSizeIdx != -1) {
         Object byteSizeObj = row.getValue(byteSizeIdx);
         if (byteSizeObj != null) {
           try {
             ByteSize byteSize;
             if (byteSizeObj instanceof ByteSize) {
               byteSize = (ByteSize) byteSizeObj;
             } else {
               byteSize = new ByteSize(byteSizeObj.toString());
             }
             
             // Add to total
             long bytes = byteSize.getBytes();
             store.increment(TransientVariableScope.GLOBAL, TOTAL_SIZE_KEY, bytes);
           } catch (Exception e) {
             throw new DirectiveExecutionException(
               String.format("Failed to parse byte size value '%s': %s", byteSizeObj, e.getMessage()));
           }
         }
       }
       
       // Process time duration
       int timeDurationIdx = row.find(timeDurationColumn);
       if (timeDurationIdx != -1) {
         Object timeDurationObj = row.getValue(timeDurationIdx);
         if (timeDurationObj != null) {
           try {
             TimeDuration timeDuration;
             if (timeDurationObj instanceof TimeDuration) {
               timeDuration = (TimeDuration) timeDurationObj;
             } else {
               timeDuration = new TimeDuration(timeDurationObj.toString());
             }
             
             // Add to total
             long nanoseconds = timeDuration.getNanoseconds();
             store.increment(TransientVariableScope.GLOBAL, TOTAL_TIME_KEY, nanoseconds);
           } catch (Exception e) {
             throw new DirectiveExecutionException(
               String.format("Failed to parse time duration value '%s': %s", timeDurationObj, e.getMessage()));
           }
         }
       }
     }
     
     // Check if this is the last batch of rows (empty rows list)
     if (rows.isEmpty()) {
       // Create a new row with the aggregated results
       Row resultRow = new Row();
       
       // Get totals from store
       long totalBytes = (Long) store.get(TOTAL_SIZE_KEY);
       long totalNanoseconds = (Long) store.get(TOTAL_TIME_KEY);
       long rowCount = (Long) store.get(ROW_COUNT_KEY);
       
       // Calculate final values based on aggregation type
       double finalSizeValue;
       double finalTimeValue;
       
       if ("average".equals(aggregationType) && rowCount > 0) {
         finalSizeValue = (double) totalBytes / rowCount;
         finalTimeValue = (double) totalNanoseconds / rowCount;
       } else {
         finalSizeValue = totalBytes;
         finalTimeValue = totalNanoseconds;
       }
       
       // Convert to requested output units
       double convertedSize = convertSize(finalSizeValue, outputSizeUnit);
       double convertedTime = convertTime(finalTimeValue, outputTimeUnit);
       
       // Add to result row
       resultRow.add(totalSizeColumn, convertedSize);
       resultRow.add(totalTimeColumn, convertedTime);
       
       // Reset the store for next use
       store.reset(TransientVariableScope.GLOBAL);
       
       // Return the single result row
       List<Row> resultRows = new ArrayList<>();
       resultRows.add(resultRow);
       return resultRows;
     }
     
     // Return the input rows unchanged for intermediate processing
     return rows;
   }
   
   private double convertSize(double bytes, String unit) {
     switch (unit) {
       case "B":
         return bytes;
       case "KB":
         return bytes / 1024.0;
       case "MB":
         return bytes / (1024.0 * 1024.0);
       case "GB":
         return bytes / (1024.0 * 1024.0 * 1024.0);
       case "TB":
         return bytes / (1024.0 * 1024.0 * 1024.0 * 1024.0);
       default:
         return bytes / (1024.0 * 1024.0); // Default to MB
     }
   }
   
   private double convertTime(double nanoseconds, String unit) {
     switch (unit) {
       case "ns":
         return nanoseconds;
       case "us":
         return nanoseconds / 1000.0;
       case "ms":
         return nanoseconds / (1000.0 * 1000.0);
       case "s":
         return nanoseconds / (1000.0 * 1000.0 * 1000.0);
       case "m":
         return nanoseconds / (60.0 * 1000.0 * 1000.0 * 1000.0);
       case "h":
         return nanoseconds / (60.0 * 60.0 * 1000.0 * 1000.0 * 1000.0);
       case "d":
         return nanoseconds / (24.0 * 60.0 * 60.0 * 1000.0 * 1000.0 * 1000.0);
       default:
         return nanoseconds / (1000.0 * 1000.0 * 1000.0); // Default to seconds
     }
   }
 
   @Override
   public void destroy() {
     // No resources to clean up
   }
 }
 