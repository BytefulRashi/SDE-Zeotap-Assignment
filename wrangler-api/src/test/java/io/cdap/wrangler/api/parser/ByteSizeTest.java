
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
  * Tests for {@link ByteSize} class.
  */
 public class ByteSizeTest {
 
   @Test
   public void testValidByteSizes() {
     // Test bytes
     ByteSize bytes = new ByteSize("10B");
     Assert.assertEquals(10L, bytes.getBytes());
     Assert.assertEquals(10.0, bytes.getNumericValue(), 0.001);
     Assert.assertEquals("B", bytes.getUnit());
 
     // Test kilobytes
     ByteSize kilobytes = new ByteSize("1.5KB");
     Assert.assertEquals(1536L, kilobytes.getBytes());
     Assert.assertEquals(1.5, kilobytes.getNumericValue(), 0.001);
     Assert.assertEquals("KB", kilobytes.getUnit());
     Assert.assertEquals(1.5, kilobytes.getKilobytes(), 0.001);
 
     // Test megabytes
     ByteSize megabytes = new ByteSize("2.5MB");
     Assert.assertEquals(2621440L, megabytes.getBytes());
     Assert.assertEquals(2.5, megabytes.getNumericValue(), 0.001);
     Assert.assertEquals("MB", megabytes.getUnit());
     Assert.assertEquals(2.5, megabytes.getMegabytes(), 0.001);
 
     // Test gigabytes
     ByteSize gigabytes = new ByteSize("1GB");
     Assert.assertEquals(1073741824L, gigabytes.getBytes());
     Assert.assertEquals(1.0, gigabytes.getNumericValue(), 0.001);
     Assert.assertEquals("GB", gigabytes.getUnit());
     Assert.assertEquals(1.0, gigabytes.getGigabytes(), 0.001);
 
     // Test terabytes
     ByteSize terabytes = new ByteSize("0.5TB");
     Assert.assertEquals(549755813888L, terabytes.getBytes());
     Assert.assertEquals(0.5, terabytes.getNumericValue(), 0.001);
     Assert.assertEquals("TB", terabytes.getUnit());
     Assert.assertEquals(0.5, terabytes.getTerabytes(), 0.001);
   }
 
   @Test
   public void testCaseInsensitiveUnits() {
     // Test lowercase units
     ByteSize lowercase = new ByteSize("10kb");
     Assert.assertEquals(10240L, lowercase.getBytes());
     Assert.assertEquals("KB", lowercase.getUnit());
 
     // Test mixed case units
     ByteSize mixedCase = new ByteSize("5Mb");
     Assert.assertEquals(5242880L, mixedCase.getBytes());
     Assert.assertEquals("MB", mixedCase.getUnit());
   }
 
   @Test
   public void testZeroValues() {
     ByteSize zero = new ByteSize("0KB");
     Assert.assertEquals(0L, zero.getBytes());
     Assert.assertEquals(0.0, zero.getKilobytes(), 0.001);
   }
 
   @Test
   public void testUnitConversions() {
     ByteSize size = new ByteSize("1024KB");
     Assert.assertEquals(1048576L, size.getBytes());
     Assert.assertEquals(1024.0, size.getKilobytes(), 0.001);
     Assert.assertEquals(1.0, size.getMegabytes(), 0.001);
     Assert.assertEquals(0.0009765625, size.getGigabytes(), 0.0000001);
   }
 
   @Test(expected = IllegalArgumentException.class)
   public void testInvalidFormat() {
     new ByteSize("invalid");
   }
 
   @Test(expected = IllegalArgumentException.class)
   public void testMissingUnit() {
     new ByteSize("100");
   }
 
   @Test(expected = IllegalArgumentException.class)
   public void testInvalidUnit() {
     new ByteSize("100XB");
   }
 
   @Test
   public void testToString() {
     ByteSize size = new ByteSize("10MB");
     Assert.assertEquals("10MB", size.toString());
   }
 
   @Test
   public void testToJson() {
     ByteSize size = new ByteSize("10MB");
     Assert.assertNotNull(size.toJson());
     Assert.assertTrue(size.toJson().isJsonObject());
     Assert.assertEquals("10MB", size.toJson().getAsJsonObject().get("value").getAsString());
     Assert.assertEquals(10485760L, size.toJson().getAsJsonObject().get("bytes").getAsLong());
   }
 }
 