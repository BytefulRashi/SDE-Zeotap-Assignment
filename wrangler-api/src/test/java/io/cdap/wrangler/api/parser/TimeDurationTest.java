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

 package io.cdap.wrangler.api.parser;

 import org.junit.Assert;
 import org.junit.Test;
 
 /**
  * Tests for {@link TimeDuration} class.
  */
 public class TimeDurationTest {
 
   @Test
   public void testValidTimeDurations() {
     // Test nanoseconds
     TimeDuration nanoseconds = new TimeDuration("100ns");
     Assert.assertEquals(100L, nanoseconds.getNanoseconds());
     Assert.assertEquals(100.0, nanoseconds.getNumericValue(), 0.001);
     Assert.assertEquals("ns", nanoseconds.getUnit());
 
     // Test microseconds
     TimeDuration microseconds = new TimeDuration("1.5us");
     Assert.assertEquals(1500L, microseconds.getNanoseconds());
     Assert.assertEquals(1.5, microseconds.getNumericValue(), 0.001);
     Assert.assertEquals("us", microseconds.getUnit());
     Assert.assertEquals(1.5, microseconds.getMicroseconds(), 0.001);
 
     // Test milliseconds
     TimeDuration milliseconds = new TimeDuration("2.5ms");
     Assert.assertEquals(2500000L, milliseconds.getNanoseconds());
     Assert.assertEquals(2.5, milliseconds.getNumericValue(), 0.001);
     Assert.assertEquals("ms", milliseconds.getUnit());
     Assert.assertEquals(2.5, milliseconds.getMilliseconds(), 0.001);
 
     // Test seconds
     TimeDuration seconds = new TimeDuration("1s");
     Assert.assertEquals(1000000000L, seconds.getNanoseconds());
     Assert.assertEquals(1.0, seconds.getNumericValue(), 0.001);
     Assert.assertEquals("s", seconds.getUnit());
     Assert.assertEquals(1.0, seconds.getSeconds(), 0.001);
 
     // Test minutes
     TimeDuration minutes = new TimeDuration("0.5m");
     Assert.assertEquals(30000000000L, minutes.getNanoseconds());
     Assert.assertEquals(0.5, minutes.getNumericValue(), 0.001);
     Assert.assertEquals("m", minutes.getUnit());
     Assert.assertEquals(0.5, minutes.getMinutes(), 0.001);
 
     // Test hours
     TimeDuration hours = new TimeDuration("2h");
     Assert.assertEquals(7200000000000L, hours.getNanoseconds());
     Assert.assertEquals(2.0, hours.getNumericValue(), 0.001);
     Assert.assertEquals("h", hours.getUnit());
     Assert.assertEquals(2.0, hours.getHours(), 0.001);
 
     // Test days
     TimeDuration days = new TimeDuration("1d");
     Assert.assertEquals(86400000000000L, days.getNanoseconds());
     Assert.assertEquals(1.0, days.getNumericValue(), 0.001);
     Assert.assertEquals("d", days.getUnit());
     Assert.assertEquals(1.0, days.getDays(), 0.001);
   }
 
   @Test
   public void testCaseInsensitiveUnits() {
     // Test lowercase units
     TimeDuration lowercase = new TimeDuration("10ms");
     Assert.assertEquals(10000000L, lowercase.getNanoseconds());
     Assert.assertEquals("ms", lowercase.getUnit());
 
     // Test uppercase units
     TimeDuration uppercase = new TimeDuration("5MS");
     Assert.assertEquals(5000000L, uppercase.getNanoseconds());
     Assert.assertEquals("ms", uppercase.getUnit());
   }
 
   @Test
   public void testZeroValues() {
     TimeDuration zero = new TimeDuration("0ms");
     Assert.assertEquals(0L, zero.getNanoseconds());
     Assert.assertEquals(0.0, zero.getMilliseconds(), 0.001);
   }
 
   @Test
   public void testUnitConversions() {
     TimeDuration duration = new TimeDuration("1000ms");
     Assert.assertEquals(1000000000L, duration.getNanoseconds());
     Assert.assertEquals(1000000.0, duration.getMicroseconds(), 0.001);
     Assert.assertEquals(1000.0, duration.getMilliseconds(), 0.001);
     Assert.assertEquals(1.0, duration.getSeconds(), 0.001);
     Assert.assertEquals(1.0 / 60.0, duration.getMinutes(), 0.0001);
     Assert.assertEquals(1.0 / 3600.0, duration.getHours(), 0.0000001);
   }
 
   @Test(expected = IllegalArgumentException.class)
   public void testInvalidFormat() {
     new TimeDuration("invalid");
   }
 
   @Test(expected = IllegalArgumentException.class)
   public void testMissingUnit() {
     new TimeDuration("100");
   }
 
   @Test(expected = IllegalArgumentException.class)
   public void testInvalidUnit() {
     new TimeDuration("100xs");
   }
 
   @Test
   public void testToString() {
     TimeDuration duration = new TimeDuration("10ms");
     Assert.assertEquals("10ms", duration.toString());
   }
 
   @Test
   public void testToJson() {
     TimeDuration duration = new TimeDuration("10ms");
     Assert.assertNotNull(duration.toJson());
     Assert.assertTrue(duration.toJson().isJsonObject());
     Assert.assertEquals("10ms", duration.toJson().getAsJsonObject().get("value").getAsString());
     Assert.assertEquals(10000000L, duration.toJson().getAsJsonObject().get("nanoseconds").getAsLong());
   }
 }
 