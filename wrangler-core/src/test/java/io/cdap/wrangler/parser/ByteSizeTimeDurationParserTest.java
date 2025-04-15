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

 package io.cdap.wrangler.parser;

 import io.cdap.wrangler.TestingRig;
 import io.cdap.wrangler.api.CompileStatus;
 import io.cdap.wrangler.api.RecipeSymbol;
 import io.cdap.wrangler.api.parser.ByteSize;
 import io.cdap.wrangler.api.parser.TimeDuration;
 import io.cdap.wrangler.api.parser.Token;
 import io.cdap.wrangler.api.parser.TokenType;
 import org.junit.Assert;
 import org.junit.Test;
 
 /**
  * Tests for parsing ByteSize and TimeDuration tokens in recipes.
  */
 public class ByteSizeTimeDurationParserTest {
 
   @Test
   public void testByteSizeTokenParsing() throws Exception {
     String[] recipe = new String[] {
       "set-column :size 10MB;",
       "set-column :size2 1.5GB;"
     };
     
     CompileStatus status = TestingRig.compile(recipe);
     Assert.assertTrue(status.isSuccess());
     
     RecipeSymbol symbols = status.getSymbols();
     Assert.assertEquals(2, symbols.size());
     
     // Check first directive tokens
     Token token = symbols.get(0).get(2);
     Assert.assertEquals(TokenType.BYTE_SIZE, token.type());
     Assert.assertTrue(token instanceof ByteSize);
     ByteSize byteSize = (ByteSize) token;
     Assert.assertEquals(10.0, byteSize.getNumericValue(), 0.001);
     Assert.assertEquals("MB", byteSize.getUnit());
     Assert.assertEquals(10485760L, byteSize.getBytes());
     
     // Check second directive tokens
     token = symbols.get(1).get(2);
     Assert.assertEquals(TokenType.BYTE_SIZE, token.type());
     Assert.assertTrue(token instanceof ByteSize);
     byteSize = (ByteSize) token;
     Assert.assertEquals(1.5, byteSize.getNumericValue(), 0.001);
     Assert.assertEquals("GB", byteSize.getUnit());
     Assert.assertEquals(1610612736L, byteSize.getBytes());
   }
 
   @Test
   public void testTimeDurationTokenParsing() throws Exception {
     String[] recipe = new String[] {
       "set-column :duration 500ms;",
       "set-column :duration2 2.5s;"
     };
     
     CompileStatus status = TestingRig.compile(recipe);
     Assert.assertTrue(status.isSuccess());
     
     RecipeSymbol symbols = status.getSymbols();
     Assert.assertEquals(2, symbols.size());
     
     // Check first directive tokens
     Token token = symbols.get(0).get(2);
     Assert.assertEquals(TokenType.TIME_DURATION, token.type());
     Assert.assertTrue(token instanceof TimeDuration);
     TimeDuration timeDuration = (TimeDuration) token;
     Assert.assertEquals(500.0, timeDuration.getNumericValue(), 0.001);
     Assert.assertEquals("ms", timeDuration.getUnit());
     Assert.assertEquals(500000000L, timeDuration.getNanoseconds());
     
     // Check second directive tokens
     token = symbols.get(1).get(2);
     Assert.assertEquals(TokenType.TIME_DURATION, token.type());
     Assert.assertTrue(token instanceof TimeDuration);
     timeDuration = (TimeDuration) token;
     Assert.assertEquals(2.5, timeDuration.getNumericValue(), 0.001);
     Assert.assertEquals("s", timeDuration.getUnit());
     Assert.assertEquals(2500000000L, timeDuration.getNanoseconds());
   }
 
   @Test
   public void testAggregateStatsDirectiveParsing() throws Exception {
     String[] recipe = new String[] {
       "aggregate-stats :fileSize :processingTime 'TotalSize' 'TotalTime' 'GB' 's' 'total';"
     };
     
     CompileStatus status = TestingRig.compile(recipe);
     Assert.assertTrue(status.isSuccess());
     
     RecipeSymbol symbols = status.getSymbols();
     Assert.assertEquals(1, symbols.size());
     Assert.assertEquals(8, symbols.get(0).size());
   }
 
   @Test
   public void testMixedTokenTypes() throws Exception {
     String[] recipe = new String[] {
       "set-column :size 10MB;",
       "set-column :duration 500ms;",
       "set-column :text 'This is text';",
       "set-column :number 42;"
     };
     
     CompileStatus status = TestingRig.compile(recipe);
     Assert.assertTrue(status.isSuccess());
     
     RecipeSymbol symbols = status.getSymbols();
     Assert.assertEquals(4, symbols.size());
     
     // Check byte size token
     Token token = symbols.get(0).get(2);
     Assert.assertEquals(TokenType.BYTE_SIZE, token.type());
     
     // Check time duration token
     token = symbols.get(1).get(2);
     Assert.assertEquals(TokenType.TIME_DURATION, token.type());
     
     // Check text token
     token = symbols.get(2).get(2);
     Assert.assertEquals(TokenType.TEXT, token.type());
     
     // Check numeric token
     token = symbols.get(3).get(2);
     Assert.assertEquals(TokenType.NUMERIC, token.type());
   }
 
   @Test
   public void testCaseInsensitiveUnits() throws Exception {
     String[] recipe = new String[] {
       "set-column :size 10mb;",
       "set-column :duration 500MS;"
     };
     
     CompileStatus status = TestingRig.compile(recipe);
     Assert.assertTrue(status.isSuccess());
     
     RecipeSymbol symbols = status.getSymbols();
     Assert.assertEquals(2, symbols.size());
     
     // Check byte size token
     Token token = symbols.get(0).get(2);
     Assert.assertEquals(TokenType.BYTE_SIZE, token.type());
     ByteSize byteSize = (ByteSize) token;
     Assert.assertEquals("MB", byteSize.getUnit());
     
     // Check time duration token
     token = symbols.get(1).get(2);
     Assert.assertEquals(TokenType.TIME_DURATION, token.type());
     TimeDuration timeDuration = (TimeDuration) token;
     Assert.assertEquals("ms", timeDuration.getUnit());
   }
 }
 