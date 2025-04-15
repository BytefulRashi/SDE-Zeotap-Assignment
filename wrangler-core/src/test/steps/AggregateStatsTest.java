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

 import io.cdap.wrangler.api.DirectiveExecutionException;
 import io.cdap.wrangler.api.DirectiveParseException;
 import io.cdap.wrangler.api.ExecutorContext;
 import io.cdap.wrangler.api.Row;
 import io.cdap.wrangler.api.TransientStore;
 import io.cdap.wrangler.api.TransientVariableScope;
 import io.cdap.wrangler.api.parser.ByteSize;
 import io.cdap.wrangler.api.parser.TimeDuration;
 import io.cdap.wrangler.api.parser.UsageDefinition;
 import io.cdap.wrangler.executor.MockExecutorContext;
 import io.cdap.wrangler.parser.TextDirectives;
 import org.junit.Assert;
 import org.junit.Before;
 import org.junit.Test;
 import org.mockito.Mockito;
 
 import java.util.Arrays;
 import java.util.List;
 
 /**
  * Tests for {@link AggregateStats} directive.
  */
 public class AggregateStatsTest {
 
   private ExecutorContext context;
   private TransientStore store;
 
   @Before
   public void setup() {
     context = new MockExecutorContext();
     store = context.getTransientStore();
   }
 
   @Test
   public void testUsageDefinition() throws DirectiveParseException {
     AggregateStats directive = new AggregateStats();
     UsageDefinition definition = directive.define();
     
     Assert.assertNotNull(definition);
     Assert.assertEquals("aggregate-stats", definition.getDirectiveName());
     Assert.assertEquals(7, definition.getTokens().size());
     
     // Required arguments
     Assert.assertTrue(definition.getTokens().containsKey("byteSizeColumn"));
     Assert.assertTrue(definition.getTokens().containsKey("timeDurationColumn"));
     Assert.assertTrue(definition.getTokens().containsKey("totalSizeColumn"));
     Assert.assertTrue(definition.getTokens().containsKey("totalTimeColumn"));
     
     // Optional arguments
     Assert.assertTrue(definition.getTokens().containsKey("outputSizeUnit"));
     Assert.assertTrue(definition.getTokens().containsKey("outputTimeUnit"));
     Assert.assertTrue(definition.getTokens().containsKey("aggregationType"));
   }
 
   @Test
   public void testInitialization() throws DirectiveParseException {
     String directive = "aggregate-stats :fileSize :processingTime 'TotalSize' 'TotalTime' 'GB' 's' 'total'";
     AggregateStats aggregateStats = new TextDirectives(directive).getDirectives().get(0);
     
     // Verify the directive was initialized correctly
     Assert.assertNotNull(aggregateStats);
   }
 
   @Test(expected = DirectiveParseException.class)
   public void testInvalidSizeUnit() throws DirectiveParseException {
     String directive = "aggregate-stats :fileSize :processingTime 'TotalSize' 'TotalTime' 'XB' 's' 'total'";
     new TextDirectives(directive).getDirectives();
   }
 
   @Test(expected = DirectiveParseException.class)
   public void testInvalidTimeUnit() throws DirectiveParseException {
     String directive = "aggregate-stats :fileSize :processingTime 'TotalSize' 'TotalTime' 'GB' 'xs' 'total'";
     new TextDirectives(directive).getDirectives();
   }
 
   @Test(expected = DirectiveParseException.class)
   public void testInvalidAggregationType() throws DirectiveParseException {
     String directive = "aggregate-stats :fileSize :processingTime 'TotalSize' 'TotalTime' 'GB' 's' 'invalid'";
     new TextDirectives(directive).getDirectives();
   }
 
   @Test
   public void testTotalAggregation() throws Exception {
     // Create directive
     String directive = "aggregate-stats :fileSize :processingTime 'TotalSize' 'TotalTime' 'MB' 's' 'total'";
     AggregateStats aggregateStats = new TextDirectives(directive).getDirectives().get(0);
     
     // Create test rows with byte sizes and time durations
     Row row1 = new Row();
     row1.add("fileSize", new ByteSize("10MB"));
     row1.add("processingTime", new TimeDuration("500ms"));
     
     Row row2 = new Row();
     row2.add("fileSize", new ByteSize("5MB"));
     row2.add("processingTime", new TimeDuration("250ms"));
     
     List<Row> rows = Arrays.asList(row1, row2);
     
     // Process rows
     List<Row> result = aggregateStats.execute(rows, context);
     
     // Verify intermediate result (should be unchanged)
     Assert.assertEquals(rows, result);
     
     // Verify store values
     Assert.assertEquals(15728640L, store.get("aggregate-stats.total-size"));
     Assert.assertEquals(750000000L, store.get("aggregate-stats.total-time"));
     Assert.assertEquals(2L, store.get("aggregate-stats.row-count"));
     
     // Process empty rows list to trigger final aggregation
     result = aggregateStats.execute(Arrays.asList(), context);
     
     // Verify final result
     Assert.assertEquals(1, result.size());
     Row resultRow = result.get(0);
     
     // Verify total size in MB (15MB)
     Assert.assertEquals(15.0, resultRow.getValue("TotalSize"));
     
     // Verify total time in seconds (0.75s)
     Assert.assertEquals(0.75, resultRow.getValue("TotalTime"));
   }
 
   @Test
   public void testAverageAggregation() throws Exception {
     // Create directive
     String directive = "aggregate-stats :fileSize :processingTime 'AvgSize' 'AvgTime' 'KB' 'ms' 'average'";
     AggregateStats aggregateStats = new TextDirectives(directive).getDirectives().get(0);
     
     // Create test rows with byte sizes and time durations
     Row row1 = new Row();
     row1.add("fileSize", new ByteSize("10MB"));
     row1.add("processingTime", new TimeDuration("500ms"));
     
     Row row2 = new Row();
     row2.add("fileSize", new ByteSize("5MB"));
     row2.add("processingTime", new TimeDuration("250ms"));
     
     Row row3 = new Row();
     row3.add("fileSize", new ByteSize("15MB"));
     row3.add("processingTime", new TimeDuration("750ms"));
     
     List<Row> rows = Arrays.asList(row1, row2, row3);
     
     // Process rows
     aggregateStats.execute(rows, context);
     
     // Process empty rows list to trigger final aggregation
     List<Row> result = aggregateStats.execute(Arrays.asList(), context);
     
     // Verify final result
     Assert.assertEquals(1, result.size());
     Row resultRow = result.get(0);
     
     // Verify average size in KB (10MB = 10240KB)
     Assert.assertEquals(10240.0, resultRow.getValue("AvgSize"));
     
     // Verify average time in ms (500ms)
     Assert.assertEquals(500.0, resultRow.getValue("AvgTime"));
   }
 
   @Test
   public void testNullValues() throws Exception {
     // Create directive
     String directive = "aggregate-stats :fileSize :processingTime 'TotalSize' 'TotalTime' 'MB' 's' 'total'";
     AggregateStats aggregateStats = new TextDirectives(directive).getDirectives().get(0);
     
     // Create test rows with null values
     Row row1 = new Row();
     row1.add("fileSize", new ByteSize("10MB"));
     row1.add("processingTime", null);
     
     Row row2 = new Row();
     row2.add("fileSize", null);
     row2.add("processingTime", new TimeDuration("250ms"));
     
     List<Row> rows = Arrays.asList(row1, row2);
     
     // Process rows
     aggregateStats.execute(rows, context);
     
     // Process empty rows list to trigger final aggregation
     List<Row> result = aggregateStats.execute(Arrays.asList(), context);
     
     // Verify final result
     Assert.assertEquals(1, result.size());
     Row resultRow = result.get(0);
     
     // Verify total size in MB (10MB)
     Assert.assertEquals(10.0, resultRow.getValue("TotalSize"));
     
     // Verify total time in seconds (0.25s)
     Assert.assertEquals(0.25, resultRow.getValue("TotalTime"));
   }
 
   @Test
   public void testStringValues() throws Exception {
     // Create directive
     String directive = "aggregate-stats :fileSize :processingTime 'TotalSize' 'TotalTime' 'MB' 's' 'total'";
     AggregateStats aggregateStats = new TextDirectives(directive).getDirectives().get(0);
     
     // Create test rows with string values instead of ByteSize/TimeDuration objects
     Row row1 = new Row();
     row1.add("fileSize", "10MB");
     row1.add("processingTime", "500ms");
     
     Row row2 = new Row();
     row2.add("fileSize", "5MB");
     row2.add("processingTime", "250ms");
     
     List<Row> rows = Arrays.asList(row1, row2);
     
     // Process rows
     aggregateStats.execute(rows, context);
     
     // Process empty rows list to trigger final aggregation
     List<Row> result = aggregateStats.execute(Arrays.asList(), context);
     
     // Verify final result
     Assert.assertEquals(1, result.size());
     Row resultRow = result.get(0);
     
     // Verify total size in MB (15MB)
     Assert.assertEquals(15.0, resultRow.getValue("TotalSize"));
     
     // Verify total time in seconds (0.75s)
     Assert.assertEquals(0.75, resultRow.getValue("TotalTime"));
   }
 
   @Test(expected = DirectiveExecutionException.class)
   public void testInvalidByteSizeValue() throws Exception {
     // Create directive
     String directive = "aggregate-stats :fileSize :processingTime 'TotalSize' 'TotalTime' 'MB' 's' 'total'";
     AggregateStats aggregateStats = new TextDirectives(directive).getDirectives().get(0);
     
     // Create test row with invalid byte size value
     Row row = new Row();
     row.add("fileSize", "invalid");
     row.add("processingTime", "500ms");
     
     // Process row - should throw exception
     aggregateStats.execute(Arrays.asList(row), context);
   }
 
   @Test(expected = DirectiveExecutionException.class)
   public void testInvalidTimeDurationValue() throws Exception {
     // Create directive
     String directive = "aggregate-stats :fileSize :processingTime 'TotalSize' 'TotalTime' 'MB' 's' 'total'";
     AggregateStats aggregateStats = new TextDirectives(directive).getDirectives().get(0);
     
     // Create test row with invalid time duration value
     Row row = new Row();
     row.add("fileSize", "10MB");
     row.add("processingTime", "invalid");
     
     // Process row - should throw exception
     aggregateStats.execute(Arrays.asList(row), context);
   }
 }
 