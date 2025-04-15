// Generated from io\cdap\wrangler\parser\Directives.g4 by ANTLR 4.7
package io.cdap.wrangler.parser;

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

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DirectivesLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, OBrace=9, 
		CBrace=10, SColon=11, Or=12, And=13, Equals=14, NEquals=15, GTEquals=16, 
		LTEquals=17, Match=18, NotMatch=19, QuestionColon=20, StartsWith=21, NotStartsWith=22, 
		EndsWith=23, NotEndsWith=24, PlusEqual=25, SubEqual=26, MulEqual=27, DivEqual=28, 
		PerEqual=29, AndEqual=30, OrEqual=31, XOREqual=32, Pow=33, External=34, 
		GT=35, LT=36, Add=37, Subtract=38, Multiply=39, Divide=40, Modulus=41, 
		OBracket=42, CBracket=43, OParen=44, CParen=45, Assign=46, Comma=47, QMark=48, 
		Colon=49, Dot=50, At=51, Pipe=52, BackSlash=53, Dollar=54, Tilde=55, Bool=56, 
		Number=57, Identifier=58, Macro=59, Column=60, String=61, EscapeSequence=62, 
		Comment=63, Space=64;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "OBrace", 
		"CBrace", "SColon", "Or", "And", "Equals", "NEquals", "GTEquals", "LTEquals", 
		"Match", "NotMatch", "QuestionColon", "StartsWith", "NotStartsWith", "EndsWith", 
		"NotEndsWith", "PlusEqual", "SubEqual", "MulEqual", "DivEqual", "PerEqual", 
		"AndEqual", "OrEqual", "XOREqual", "Pow", "External", "GT", "LT", "Add", 
		"Subtract", "Multiply", "Divide", "Modulus", "OBracket", "CBracket", "OParen", 
		"CParen", "Assign", "Comma", "QMark", "Colon", "Dot", "At", "Pipe", "BackSlash", 
		"Dollar", "Tilde", "Bool", "Number", "Identifier", "Macro", "Column", 
		"String", "EscapeSequence", "OctalEscape", "UnicodeEscape", "HexDigit", 
		"Comment", "Space", "Int", "Digit"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'if'", "'else'", "'for'", "'#pragma'", "'load-directives'", "'version'", 
		"'exp'", "'prop'", "'{'", "'}'", "';'", "'||'", "'&&'", "'=='", "'!='", 
		"'>='", "'<='", "'=~'", "'!~'", "'?:'", "'=^'", "'!^'", "'=$'", "'!$'", 
		"'+='", "'-='", "'*='", "'/='", "'%='", "'&='", "'|='", "'^='", "'^'", 
		"'!'", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'%'", "'['", "']'", 
		"'('", "')'", "'='", "','", "'?'", "':'", "'.'", "'@'", "'|'", "'\\'", 
		"'$'", "'~'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "OBrace", "CBrace", 
		"SColon", "Or", "And", "Equals", "NEquals", "GTEquals", "LTEquals", "Match", 
		"NotMatch", "QuestionColon", "StartsWith", "NotStartsWith", "EndsWith", 
		"NotEndsWith", "PlusEqual", "SubEqual", "MulEqual", "DivEqual", "PerEqual", 
		"AndEqual", "OrEqual", "XOREqual", "Pow", "External", "GT", "LT", "Add", 
		"Subtract", "Multiply", "Divide", "Modulus", "OBracket", "CBracket", "OParen", 
		"CParen", "Assign", "Comma", "QMark", "Colon", "Dot", "At", "Pipe", "BackSlash", 
		"Dollar", "Tilde", "Bool", "Number", "Identifier", "Macro", "Column", 
		"String", "EscapeSequence", "Comment", "Space"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public DirectivesLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Directives.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2B\u01cb\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'"+
		"\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3"+
		"\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38"+
		"\39\39\39\39\39\39\39\39\39\59\u013f\n9\3:\3:\3:\7:\u0144\n:\f:\16:\u0147"+
		"\13:\5:\u0149\n:\3;\3;\7;\u014d\n;\f;\16;\u0150\13;\3<\3<\7<\u0154\n<"+
		"\f<\16<\u0157\13<\3=\3=\3=\7=\u015c\n=\f=\16=\u015f\13=\3>\3>\3>\7>\u0164"+
		"\n>\f>\16>\u0167\13>\3>\3>\3>\3>\7>\u016d\n>\f>\16>\u0170\13>\3>\5>\u0173"+
		"\n>\3?\3?\3?\3?\5?\u0179\n?\3@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u0184\n@\3A"+
		"\3A\3A\3A\3A\3A\3A\3B\3B\3C\3C\3C\3C\7C\u0193\nC\fC\16C\u0196\13C\3C\3"+
		"C\3C\3C\7C\u019c\nC\fC\16C\u019f\13C\3C\3C\3C\3C\3C\3C\7C\u01a7\nC\fC"+
		"\16C\u01aa\13C\5C\u01ac\nC\3C\3C\3D\6D\u01b1\nD\rD\16D\u01b2\3D\3D\3E"+
		"\5E\u01b8\nE\3E\3E\7E\u01bc\nE\fE\16E\u01bf\13E\3E\7E\u01c2\nE\fE\16E"+
		"\u01c5\13E\3E\5E\u01c8\nE\3F\3F\3\u019d\2G\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177\2\u0081"+
		"\2\u0083\2\u0085A\u0087B\u0089\2\u008b\2\3\2\20\6\2//C\\aac|\7\2//\62"+
		";C\\aac|\5\2C\\aac|\6\2\62;C\\aac|\7\2//\62<C\\aac|\3\2))\3\2$$\n\2$$"+
		"))^^ddhhppttvv\5\2\62;CHch\4\2\f\f\17\17\5\2\13\f\16\17\"\"\3\2\63;\3"+
		"\2NN\3\2\62;\2\u01de\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q"+
		"\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2"+
		"\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2"+
		"\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w"+
		"\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2"+
		"\2\2\3\u008d\3\2\2\2\5\u0090\3\2\2\2\7\u0095\3\2\2\2\t\u0099\3\2\2\2\13"+
		"\u00a1\3\2\2\2\r\u00b1\3\2\2\2\17\u00b9\3\2\2\2\21\u00bd\3\2\2\2\23\u00c2"+
		"\3\2\2\2\25\u00c4\3\2\2\2\27\u00c6\3\2\2\2\31\u00c8\3\2\2\2\33\u00cb\3"+
		"\2\2\2\35\u00ce\3\2\2\2\37\u00d1\3\2\2\2!\u00d4\3\2\2\2#\u00d7\3\2\2\2"+
		"%\u00da\3\2\2\2\'\u00dd\3\2\2\2)\u00e0\3\2\2\2+\u00e3\3\2\2\2-\u00e6\3"+
		"\2\2\2/\u00e9\3\2\2\2\61\u00ec\3\2\2\2\63\u00ef\3\2\2\2\65\u00f2\3\2\2"+
		"\2\67\u00f5\3\2\2\29\u00f8\3\2\2\2;\u00fb\3\2\2\2=\u00fe\3\2\2\2?\u0101"+
		"\3\2\2\2A\u0104\3\2\2\2C\u0107\3\2\2\2E\u0109\3\2\2\2G\u010b\3\2\2\2I"+
		"\u010d\3\2\2\2K\u010f\3\2\2\2M\u0111\3\2\2\2O\u0113\3\2\2\2Q\u0115\3\2"+
		"\2\2S\u0117\3\2\2\2U\u0119\3\2\2\2W\u011b\3\2\2\2Y\u011d\3\2\2\2[\u011f"+
		"\3\2\2\2]\u0121\3\2\2\2_\u0123\3\2\2\2a\u0125\3\2\2\2c\u0127\3\2\2\2e"+
		"\u0129\3\2\2\2g\u012b\3\2\2\2i\u012d\3\2\2\2k\u012f\3\2\2\2m\u0131\3\2"+
		"\2\2o\u0133\3\2\2\2q\u013e\3\2\2\2s\u0140\3\2\2\2u\u014a\3\2\2\2w\u0151"+
		"\3\2\2\2y\u0158\3\2\2\2{\u0172\3\2\2\2}\u0178\3\2\2\2\177\u0183\3\2\2"+
		"\2\u0081\u0185\3\2\2\2\u0083\u018c\3\2\2\2\u0085\u01ab\3\2\2\2\u0087\u01b0"+
		"\3\2\2\2\u0089\u01c7\3\2\2\2\u008b\u01c9\3\2\2\2\u008d\u008e\7k\2\2\u008e"+
		"\u008f\7h\2\2\u008f\4\3\2\2\2\u0090\u0091\7g\2\2\u0091\u0092\7n\2\2\u0092"+
		"\u0093\7u\2\2\u0093\u0094\7g\2\2\u0094\6\3\2\2\2\u0095\u0096\7h\2\2\u0096"+
		"\u0097\7q\2\2\u0097\u0098\7t\2\2\u0098\b\3\2\2\2\u0099\u009a\7%\2\2\u009a"+
		"\u009b\7r\2\2\u009b\u009c\7t\2\2\u009c\u009d\7c\2\2\u009d\u009e\7i\2\2"+
		"\u009e\u009f\7o\2\2\u009f\u00a0\7c\2\2\u00a0\n\3\2\2\2\u00a1\u00a2\7n"+
		"\2\2\u00a2\u00a3\7q\2\2\u00a3\u00a4\7c\2\2\u00a4\u00a5\7f\2\2\u00a5\u00a6"+
		"\7/\2\2\u00a6\u00a7\7f\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7t\2\2\u00a9"+
		"\u00aa\7g\2\2\u00aa\u00ab\7e\2\2\u00ab\u00ac\7v\2\2\u00ac\u00ad\7k\2\2"+
		"\u00ad\u00ae\7x\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7u\2\2\u00b0\f\3\2"+
		"\2\2\u00b1\u00b2\7x\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7t\2\2\u00b4\u00b5"+
		"\7u\2\2\u00b5\u00b6\7k\2\2\u00b6\u00b7\7q\2\2\u00b7\u00b8\7p\2\2\u00b8"+
		"\16\3\2\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7z\2\2\u00bb\u00bc\7r\2\2\u00bc"+
		"\20\3\2\2\2\u00bd\u00be\7r\2\2\u00be\u00bf\7t\2\2\u00bf\u00c0\7q\2\2\u00c0"+
		"\u00c1\7r\2\2\u00c1\22\3\2\2\2\u00c2\u00c3\7}\2\2\u00c3\24\3\2\2\2\u00c4"+
		"\u00c5\7\177\2\2\u00c5\26\3\2\2\2\u00c6\u00c7\7=\2\2\u00c7\30\3\2\2\2"+
		"\u00c8\u00c9\7~\2\2\u00c9\u00ca\7~\2\2\u00ca\32\3\2\2\2\u00cb\u00cc\7"+
		"(\2\2\u00cc\u00cd\7(\2\2\u00cd\34\3\2\2\2\u00ce\u00cf\7?\2\2\u00cf\u00d0"+
		"\7?\2\2\u00d0\36\3\2\2\2\u00d1\u00d2\7#\2\2\u00d2\u00d3\7?\2\2\u00d3 "+
		"\3\2\2\2\u00d4\u00d5\7@\2\2\u00d5\u00d6\7?\2\2\u00d6\"\3\2\2\2\u00d7\u00d8"+
		"\7>\2\2\u00d8\u00d9\7?\2\2\u00d9$\3\2\2\2\u00da\u00db\7?\2\2\u00db\u00dc"+
		"\7\u0080\2\2\u00dc&\3\2\2\2\u00dd\u00de\7#\2\2\u00de\u00df\7\u0080\2\2"+
		"\u00df(\3\2\2\2\u00e0\u00e1\7A\2\2\u00e1\u00e2\7<\2\2\u00e2*\3\2\2\2\u00e3"+
		"\u00e4\7?\2\2\u00e4\u00e5\7`\2\2\u00e5,\3\2\2\2\u00e6\u00e7\7#\2\2\u00e7"+
		"\u00e8\7`\2\2\u00e8.\3\2\2\2\u00e9\u00ea\7?\2\2\u00ea\u00eb\7&\2\2\u00eb"+
		"\60\3\2\2\2\u00ec\u00ed\7#\2\2\u00ed\u00ee\7&\2\2\u00ee\62\3\2\2\2\u00ef"+
		"\u00f0\7-\2\2\u00f0\u00f1\7?\2\2\u00f1\64\3\2\2\2\u00f2\u00f3\7/\2\2\u00f3"+
		"\u00f4\7?\2\2\u00f4\66\3\2\2\2\u00f5\u00f6\7,\2\2\u00f6\u00f7\7?\2\2\u00f7"+
		"8\3\2\2\2\u00f8\u00f9\7\61\2\2\u00f9\u00fa\7?\2\2\u00fa:\3\2\2\2\u00fb"+
		"\u00fc\7\'\2\2\u00fc\u00fd\7?\2\2\u00fd<\3\2\2\2\u00fe\u00ff\7(\2\2\u00ff"+
		"\u0100\7?\2\2\u0100>\3\2\2\2\u0101\u0102\7~\2\2\u0102\u0103\7?\2\2\u0103"+
		"@\3\2\2\2\u0104\u0105\7`\2\2\u0105\u0106\7?\2\2\u0106B\3\2\2\2\u0107\u0108"+
		"\7`\2\2\u0108D\3\2\2\2\u0109\u010a\7#\2\2\u010aF\3\2\2\2\u010b\u010c\7"+
		"@\2\2\u010cH\3\2\2\2\u010d\u010e\7>\2\2\u010eJ\3\2\2\2\u010f\u0110\7-"+
		"\2\2\u0110L\3\2\2\2\u0111\u0112\7/\2\2\u0112N\3\2\2\2\u0113\u0114\7,\2"+
		"\2\u0114P\3\2\2\2\u0115\u0116\7\61\2\2\u0116R\3\2\2\2\u0117\u0118\7\'"+
		"\2\2\u0118T\3\2\2\2\u0119\u011a\7]\2\2\u011aV\3\2\2\2\u011b\u011c\7_\2"+
		"\2\u011cX\3\2\2\2\u011d\u011e\7*\2\2\u011eZ\3\2\2\2\u011f\u0120\7+\2\2"+
		"\u0120\\\3\2\2\2\u0121\u0122\7?\2\2\u0122^\3\2\2\2\u0123\u0124\7.\2\2"+
		"\u0124`\3\2\2\2\u0125\u0126\7A\2\2\u0126b\3\2\2\2\u0127\u0128\7<\2\2\u0128"+
		"d\3\2\2\2\u0129\u012a\7\60\2\2\u012af\3\2\2\2\u012b\u012c\7B\2\2\u012c"+
		"h\3\2\2\2\u012d\u012e\7~\2\2\u012ej\3\2\2\2\u012f\u0130\7^\2\2\u0130l"+
		"\3\2\2\2\u0131\u0132\7&\2\2\u0132n\3\2\2\2\u0133\u0134\7\u0080\2\2\u0134"+
		"p\3\2\2\2\u0135\u0136\7v\2\2\u0136\u0137\7t\2\2\u0137\u0138\7w\2\2\u0138"+
		"\u013f\7g\2\2\u0139\u013a\7h\2\2\u013a\u013b\7c\2\2\u013b\u013c\7n\2\2"+
		"\u013c\u013d\7u\2\2\u013d\u013f\7g\2\2\u013e\u0135\3\2\2\2\u013e\u0139"+
		"\3\2\2\2\u013fr\3\2\2\2\u0140\u0148\5\u0089E\2\u0141\u0145\7\60\2\2\u0142"+
		"\u0144\5\u008bF\2\u0143\u0142\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143"+
		"\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0148"+
		"\u0141\3\2\2\2\u0148\u0149\3\2\2\2\u0149t\3\2\2\2\u014a\u014e\t\2\2\2"+
		"\u014b\u014d\t\3\2\2\u014c\u014b\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c"+
		"\3\2\2\2\u014e\u014f\3\2\2\2\u014fv\3\2\2\2\u0150\u014e\3\2\2\2\u0151"+
		"\u0155\t\4\2\2\u0152\u0154\t\5\2\2\u0153\u0152\3\2\2\2\u0154\u0157\3\2"+
		"\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156x\3\2\2\2\u0157\u0155"+
		"\3\2\2\2\u0158\u0159\7<\2\2\u0159\u015d\t\2\2\2\u015a\u015c\t\6\2\2\u015b"+
		"\u015a\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2"+
		"\2\2\u015ez\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u0165\7)\2\2\u0161\u0164"+
		"\5}?\2\u0162\u0164\n\7\2\2\u0163\u0161\3\2\2\2\u0163\u0162\3\2\2\2\u0164"+
		"\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0168\3\2"+
		"\2\2\u0167\u0165\3\2\2\2\u0168\u0173\7)\2\2\u0169\u016e\7$\2\2\u016a\u016d"+
		"\5}?\2\u016b\u016d\n\b\2\2\u016c\u016a\3\2\2\2\u016c\u016b\3\2\2\2\u016d"+
		"\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0171\3\2"+
		"\2\2\u0170\u016e\3\2\2\2\u0171\u0173\7$\2\2\u0172\u0160\3\2\2\2\u0172"+
		"\u0169\3\2\2\2\u0173|\3\2\2\2\u0174\u0175\7^\2\2\u0175\u0179\t\t\2\2\u0176"+
		"\u0179\5\u0081A\2\u0177\u0179\5\177@\2\u0178\u0174\3\2\2\2\u0178\u0176"+
		"\3\2\2\2\u0178\u0177\3\2\2\2\u0179~\3\2\2\2\u017a\u017b\7^\2\2\u017b\u017c"+
		"\4\62\65\2\u017c\u017d\4\629\2\u017d\u0184\4\629\2\u017e\u017f\7^\2\2"+
		"\u017f\u0180\4\629\2\u0180\u0184\4\629\2\u0181\u0182\7^\2\2\u0182\u0184"+
		"\4\629\2\u0183\u017a\3\2\2\2\u0183\u017e\3\2\2\2\u0183\u0181\3\2\2\2\u0184"+
		"\u0080\3\2\2\2\u0185\u0186\7^\2\2\u0186\u0187\7w\2\2\u0187\u0188\5\u0083"+
		"B\2\u0188\u0189\5\u0083B\2\u0189\u018a\5\u0083B\2\u018a\u018b\5\u0083"+
		"B\2\u018b\u0082\3\2\2\2\u018c\u018d\t\n\2\2\u018d\u0084\3\2\2\2\u018e"+
		"\u018f\7\61\2\2\u018f\u0190\7\61\2\2\u0190\u0194\3\2\2\2\u0191\u0193\n"+
		"\13\2\2\u0192\u0191\3\2\2\2\u0193\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0194"+
		"\u0195\3\2\2\2\u0195\u01ac\3\2\2\2\u0196\u0194\3\2\2\2\u0197\u0198\7\61"+
		"\2\2\u0198\u0199\7,\2\2\u0199\u019d\3\2\2\2\u019a\u019c\13\2\2\2\u019b"+
		"\u019a\3\2\2\2\u019c\u019f\3\2\2\2\u019d\u019e\3\2\2\2\u019d\u019b\3\2"+
		"\2\2\u019e\u01a0\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\u01a1\7,\2\2\u01a1"+
		"\u01ac\7\61\2\2\u01a2\u01a3\7/\2\2\u01a3\u01a4\7/\2\2\u01a4\u01a8\3\2"+
		"\2\2\u01a5\u01a7\n\13\2\2\u01a6\u01a5\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8"+
		"\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01ac\3\2\2\2\u01aa\u01a8\3\2"+
		"\2\2\u01ab\u018e\3\2\2\2\u01ab\u0197\3\2\2\2\u01ab\u01a2\3\2\2\2\u01ac"+
		"\u01ad\3\2\2\2\u01ad\u01ae\bC\2\2\u01ae\u0086\3\2\2\2\u01af\u01b1\t\f"+
		"\2\2\u01b0\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2"+
		"\u01b3\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b5\bD\2\2\u01b5\u0088\3\2"+
		"\2\2\u01b6\u01b8\7/\2\2\u01b7\u01b6\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8"+
		"\u01b9\3\2\2\2\u01b9\u01bd\t\r\2\2\u01ba\u01bc\5\u008bF\2\u01bb\u01ba"+
		"\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be"+
		"\u01c3\3\2\2\2\u01bf\u01bd\3\2\2\2\u01c0\u01c2\t\16\2\2\u01c1\u01c0\3"+
		"\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4"+
		"\u01c8\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c6\u01c8\7\62\2\2\u01c7\u01b7\3"+
		"\2\2\2\u01c7\u01c6\3\2\2\2\u01c8\u008a\3\2\2\2\u01c9\u01ca\t\17\2\2\u01ca"+
		"\u008c\3\2\2\2\31\2\u013e\u0145\u0148\u014e\u0155\u015d\u0163\u0165\u016c"+
		"\u016e\u0172\u0178\u0183\u0194\u019d\u01a8\u01ab\u01b2\u01b7\u01bd\u01c3"+
		"\u01c7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}