# Wrangler Enhancements: Byte Size and Time Duration Units Parsers

This document provides information about the new byte size and time duration units parsers added to the Wrangler library, as well as the new AggregateStats directive that utilizes these parsers.

## Byte Size Parser

The byte size parser allows you to work with data sizes (bytes, kilobytes, megabytes, etc.) in your data wrangling pipelines. It automatically handles unit conversions and provides a consistent way to represent and manipulate size values.

### Supported Units

- B (Bytes)
- KB (Kilobytes)
- MB (Megabytes)
- GB (Gigabytes)
- TB (Terabytes)

### Usage Examples

In directives:
```
set-column :fileSize 10MB;
set-column :diskSpace 1.5GB;
```

In Java code:
```java
// Create a ByteSize object
ByteSize size = new ByteSize("10MB");

// Get the numeric value
double value = size.getNumericValue(); // 10.0

// Get the unit
String unit = size.getUnit(); // "MB"

// Get the size in bytes
long bytes = size.getBytes(); // 10485760

// Get the size in other units
double kilobytes = size.getKilobytes(); // 10240.0
double megabytes = size.getMegabytes(); // 10.0
double gigabytes = size.getGigabytes(); // 0.009765625
```

## Time Duration Parser

The time duration parser allows you to work with time durations (nanoseconds, milliseconds, seconds, etc.) in your data wrangling pipelines. It automatically handles unit conversions and provides a consistent way to represent and manipulate duration values.

### Supported Units

- ns (Nanoseconds)
- us (Microseconds)
- ms (Milliseconds)
- s (Seconds)
- m (Minutes)
- h (Hours)
- d (Days)

### Usage Examples

In directives:
```
set-column :processingTime 500ms;
set-column :timeout 2.5s;
```

In Java code:
```java
// Create a TimeDuration object
TimeDuration duration = new TimeDuration("500ms");

// Get the numeric value
double value = duration.getNumericValue(); // 500.0

// Get the unit
String unit = duration.getUnit(); // "ms"

// Get the duration in nanoseconds
long nanoseconds = duration.getNanoseconds(); // 500000000

// Get the duration in other units
double microseconds = duration.getMicroseconds(); // 500000.0
double milliseconds = duration.getMilliseconds(); // 500.0
double seconds = duration.getSeconds(); // 0.5
```

## AggregateStats Directive

The AggregateStats directive allows you to aggregate byte size and time duration values across multiple records. It can calculate totals or averages and convert the results to specified output units.

### Syntax

```
aggregate-stats <byteSizeColumn> <timeDurationColumn> <totalSizeColumn> <totalTimeColumn> [<outputSizeUnit>] [<outputTimeUnit>] [<aggregationType>]
```

### Parameters

- **byteSizeColumn**: Source column containing byte size values
- **timeDurationColumn**: Source column containing time duration values
- **totalSizeColumn**: Target column name for the aggregated size
- **totalTimeColumn**: Target column name for the aggregated time
- **outputSizeUnit** (optional): Output unit for size (B, KB, MB, GB, TB), defaults to MB
- **outputTimeUnit** (optional): Output unit for time (ns, ms, s, m, h), defaults to s
- **aggregationType** (optional): Aggregation type (total, average), defaults to total

### Usage Examples

```
// Calculate total size in GB and total time in seconds
aggregate-stats :fileSize :processingTime 'TotalSize' 'TotalTime' 'GB' 's' 'total';

// Calculate average size in MB and average time in milliseconds
aggregate-stats :fileSize :processingTime 'AvgSize' 'AvgTime' 'MB' 'ms' 'average';
```

## Implementation Details

The implementation includes:

1. Grammar modifications in Directives.g4 to add lexer rules for BYTE_SIZE and TIME_DURATION tokens
2. New ByteSize and TimeDuration classes in the API module
3. Updates to TokenType.java to include the new token types
4. Modifications to RecipeVisitor.java to handle the new token types
5. Implementation of the AggregateStats directive that uses the new token types

## Testing

Comprehensive unit tests have been implemented for:
- ByteSize and TimeDuration classes
- Parser tests for the new syntax
- AggregateStats directive functionality

All tests pass successfully, ensuring the reliability of the implementation.
