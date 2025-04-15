// Generated from io\cdap\wrangler\parser\Directives.g4 by ANTLR 4.7
package io.cdap.wrangler.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DirectivesParser extends Parser {
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
	public static final int
		RULE_recipe = 0, RULE_statements = 1, RULE_directive = 2, RULE_ifStatement = 3, 
		RULE_ifStat = 4, RULE_elseIfStat = 5, RULE_elseStat = 6, RULE_expression = 7, 
		RULE_forStatement = 8, RULE_macro = 9, RULE_pragma = 10, RULE_pragmaLoadDirective = 11, 
		RULE_pragmaVersion = 12, RULE_codeblock = 13, RULE_identifier = 14, RULE_properties = 15, 
		RULE_propertyList = 16, RULE_property = 17, RULE_numberRanges = 18, RULE_numberRange = 19, 
		RULE_value = 20, RULE_ecommand = 21, RULE_config = 22, RULE_column = 23, 
		RULE_text = 24, RULE_number = 25, RULE_bool = 26, RULE_condition = 27, 
		RULE_command = 28, RULE_colList = 29, RULE_numberList = 30, RULE_boolList = 31, 
		RULE_stringList = 32, RULE_identifierList = 33;
	public static final String[] ruleNames = {
		"recipe", "statements", "directive", "ifStatement", "ifStat", "elseIfStat", 
		"elseStat", "expression", "forStatement", "macro", "pragma", "pragmaLoadDirective", 
		"pragmaVersion", "codeblock", "identifier", "properties", "propertyList", 
		"property", "numberRanges", "numberRange", "value", "ecommand", "config", 
		"column", "text", "number", "bool", "condition", "command", "colList", 
		"numberList", "boolList", "stringList", "identifierList"
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

	@Override
	public String getGrammarFileName() { return "Directives.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DirectivesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RecipeContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(DirectivesParser.EOF, 0); }
		public RecipeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recipe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterRecipe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitRecipe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitRecipe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecipeContext recipe() throws RecognitionException {
		RecipeContext _localctx = new RecipeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_recipe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			statements();
			setState(69);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public List<TerminalNode> Comment() { return getTokens(DirectivesParser.Comment); }
		public TerminalNode Comment(int i) {
			return getToken(DirectivesParser.Comment, i);
		}
		public List<MacroContext> macro() {
			return getRuleContexts(MacroContext.class);
		}
		public MacroContext macro(int i) {
			return getRuleContext(MacroContext.class,i);
		}
		public List<DirectiveContext> directive() {
			return getRuleContexts(DirectiveContext.class);
		}
		public DirectiveContext directive(int i) {
			return getRuleContext(DirectiveContext.class,i);
		}
		public List<PragmaContext> pragma() {
			return getRuleContexts(PragmaContext.class);
		}
		public PragmaContext pragma(int i) {
			return getRuleContext(PragmaContext.class,i);
		}
		public List<IfStatementContext> ifStatement() {
			return getRuleContexts(IfStatementContext.class);
		}
		public IfStatementContext ifStatement(int i) {
			return getRuleContext(IfStatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << Dollar) | (1L << Identifier) | (1L << Comment))) != 0)) {
				{
				setState(80);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Comment:
					{
					setState(71);
					match(Comment);
					}
					break;
				case Dollar:
					{
					setState(72);
					macro();
					}
					break;
				case Identifier:
					{
					setState(73);
					directive();
					setState(74);
					match(SColon);
					}
					break;
				case T__3:
					{
					setState(76);
					pragma();
					setState(77);
					match(SColon);
					}
					break;
				case T__0:
					{
					setState(79);
					ifStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectiveContext extends ParserRuleContext {
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public List<CodeblockContext> codeblock() {
			return getRuleContexts(CodeblockContext.class);
		}
		public CodeblockContext codeblock(int i) {
			return getRuleContext(CodeblockContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<MacroContext> macro() {
			return getRuleContexts(MacroContext.class);
		}
		public MacroContext macro(int i) {
			return getRuleContext(MacroContext.class,i);
		}
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<BoolContext> bool() {
			return getRuleContexts(BoolContext.class);
		}
		public BoolContext bool(int i) {
			return getRuleContext(BoolContext.class,i);
		}
		public List<ColumnContext> column() {
			return getRuleContexts(ColumnContext.class);
		}
		public ColumnContext column(int i) {
			return getRuleContext(ColumnContext.class,i);
		}
		public List<ColListContext> colList() {
			return getRuleContexts(ColListContext.class);
		}
		public ColListContext colList(int i) {
			return getRuleContext(ColListContext.class,i);
		}
		public List<NumberListContext> numberList() {
			return getRuleContexts(NumberListContext.class);
		}
		public NumberListContext numberList(int i) {
			return getRuleContext(NumberListContext.class,i);
		}
		public List<BoolListContext> boolList() {
			return getRuleContexts(BoolListContext.class);
		}
		public BoolListContext boolList(int i) {
			return getRuleContext(BoolListContext.class,i);
		}
		public List<StringListContext> stringList() {
			return getRuleContexts(StringListContext.class);
		}
		public StringListContext stringList(int i) {
			return getRuleContext(StringListContext.class,i);
		}
		public List<NumberRangesContext> numberRanges() {
			return getRuleContexts(NumberRangesContext.class);
		}
		public NumberRangesContext numberRanges(int i) {
			return getRuleContext(NumberRangesContext.class,i);
		}
		public List<PropertiesContext> properties() {
			return getRuleContexts(PropertiesContext.class);
		}
		public PropertiesContext properties(int i) {
			return getRuleContext(PropertiesContext.class,i);
		}
		public DirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectiveContext directive() throws RecognitionException {
		DirectiveContext _localctx = new DirectiveContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_directive);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			command();
			setState(101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					setState(99);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						setState(86);
						codeblock();
						}
						break;
					case 2:
						{
						setState(87);
						identifier();
						}
						break;
					case 3:
						{
						setState(88);
						macro();
						}
						break;
					case 4:
						{
						setState(89);
						text();
						}
						break;
					case 5:
						{
						setState(90);
						number();
						}
						break;
					case 6:
						{
						setState(91);
						bool();
						}
						break;
					case 7:
						{
						setState(92);
						column();
						}
						break;
					case 8:
						{
						setState(93);
						colList();
						}
						break;
					case 9:
						{
						setState(94);
						numberList();
						}
						break;
					case 10:
						{
						setState(95);
						boolList();
						}
						break;
					case 11:
						{
						setState(96);
						stringList();
						}
						break;
					case 12:
						{
						setState(97);
						numberRanges();
						}
						break;
					case 13:
						{
						setState(98);
						properties();
						}
						break;
					}
					} 
				}
				setState(103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public IfStatContext ifStat() {
			return getRuleContext(IfStatContext.class,0);
		}
		public List<ElseIfStatContext> elseIfStat() {
			return getRuleContexts(ElseIfStatContext.class);
		}
		public ElseIfStatContext elseIfStat(int i) {
			return getRuleContext(ElseIfStatContext.class,i);
		}
		public ElseStatContext elseStat() {
			return getRuleContext(ElseStatContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ifStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			ifStat();
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(105);
					elseIfStat();
					}
					} 
				}
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(111);
				elseStat();
				}
				break;
			}
			setState(114);
			match(CBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public IfStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitIfStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitIfStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatContext ifStat() throws RecognitionException {
		IfStatContext _localctx = new IfStatContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(T__0);
			setState(117);
			expression();
			setState(118);
			match(OBrace);
			setState(119);
			statements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseIfStatContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ElseIfStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterElseIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitElseIfStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitElseIfStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfStatContext elseIfStat() throws RecognitionException {
		ElseIfStatContext _localctx = new ElseIfStatContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_elseIfStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(CBrace);
			setState(122);
			match(T__1);
			setState(123);
			match(T__0);
			setState(124);
			expression();
			setState(125);
			match(OBrace);
			setState(126);
			statements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseStatContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ElseStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterElseStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitElseStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitElseStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatContext elseStat() throws RecognitionException {
		ElseStatContext _localctx = new ElseStatContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_elseStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(CBrace);
			setState(129);
			match(T__1);
			setState(130);
			match(OBrace);
			setState(131);
			statements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(OParen);
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(136);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
					case T__1:
					case T__2:
					case T__3:
					case T__4:
					case T__5:
					case T__6:
					case T__7:
					case OBrace:
					case CBrace:
					case SColon:
					case Or:
					case And:
					case Equals:
					case NEquals:
					case GTEquals:
					case LTEquals:
					case Match:
					case NotMatch:
					case QuestionColon:
					case StartsWith:
					case NotStartsWith:
					case EndsWith:
					case NotEndsWith:
					case PlusEqual:
					case SubEqual:
					case MulEqual:
					case DivEqual:
					case PerEqual:
					case AndEqual:
					case OrEqual:
					case XOREqual:
					case Pow:
					case External:
					case GT:
					case LT:
					case Add:
					case Subtract:
					case Multiply:
					case Divide:
					case Modulus:
					case OBracket:
					case CBracket:
					case CParen:
					case Assign:
					case Comma:
					case QMark:
					case Colon:
					case Dot:
					case At:
					case Pipe:
					case BackSlash:
					case Dollar:
					case Tilde:
					case Bool:
					case Number:
					case Identifier:
					case Macro:
					case Column:
					case String:
					case EscapeSequence:
					case Comment:
					case Space:
						{
						setState(134);
						_la = _input.LA(1);
						if ( _la <= 0 || (_la==OParen) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case OParen:
						{
						setState(135);
						expression();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(141);
			match(CParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(DirectivesParser.Identifier, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__2);
			setState(144);
			match(OParen);
			setState(145);
			match(Identifier);
			setState(146);
			match(Assign);
			setState(147);
			expression();
			setState(148);
			match(SColon);
			setState(149);
			expression();
			setState(150);
			match(SColon);
			setState(151);
			expression();
			setState(152);
			match(CParen);
			setState(153);
			match(OBrace);
			setState(154);
			statements();
			setState(155);
			match(CBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MacroContext extends ParserRuleContext {
		public TerminalNode Dollar() { return getToken(DirectivesParser.Dollar, 0); }
		public List<TerminalNode> OBrace() { return getTokens(DirectivesParser.OBrace); }
		public TerminalNode OBrace(int i) {
			return getToken(DirectivesParser.OBrace, i);
		}
		public TerminalNode CBrace() { return getToken(DirectivesParser.CBrace, 0); }
		public List<MacroContext> macro() {
			return getRuleContexts(MacroContext.class);
		}
		public MacroContext macro(int i) {
			return getRuleContext(MacroContext.class,i);
		}
		public List<TerminalNode> Macro() { return getTokens(DirectivesParser.Macro); }
		public TerminalNode Macro(int i) {
			return getToken(DirectivesParser.Macro, i);
		}
		public MacroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterMacro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitMacro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitMacro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroContext macro() throws RecognitionException {
		MacroContext _localctx = new MacroContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_macro);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(Dollar);
			setState(158);
			match(OBrace);
			setState(164);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					setState(162);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						setState(159);
						_la = _input.LA(1);
						if ( _la <= 0 || (_la==OBrace) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 2:
						{
						setState(160);
						macro();
						}
						break;
					case 3:
						{
						setState(161);
						match(Macro);
						}
						break;
					}
					} 
				}
				setState(166);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(167);
			match(CBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PragmaContext extends ParserRuleContext {
		public PragmaLoadDirectiveContext pragmaLoadDirective() {
			return getRuleContext(PragmaLoadDirectiveContext.class,0);
		}
		public PragmaVersionContext pragmaVersion() {
			return getRuleContext(PragmaVersionContext.class,0);
		}
		public PragmaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterPragma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitPragma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitPragma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PragmaContext pragma() throws RecognitionException {
		PragmaContext _localctx = new PragmaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_pragma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__3);
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				setState(170);
				pragmaLoadDirective();
				}
				break;
			case T__5:
				{
				setState(171);
				pragmaVersion();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PragmaLoadDirectiveContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public PragmaLoadDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragmaLoadDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterPragmaLoadDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitPragmaLoadDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitPragmaLoadDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PragmaLoadDirectiveContext pragmaLoadDirective() throws RecognitionException {
		PragmaLoadDirectiveContext _localctx = new PragmaLoadDirectiveContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_pragmaLoadDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(T__4);
			setState(175);
			identifierList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PragmaVersionContext extends ParserRuleContext {
		public TerminalNode Number() { return getToken(DirectivesParser.Number, 0); }
		public PragmaVersionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragmaVersion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterPragmaVersion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitPragmaVersion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitPragmaVersion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PragmaVersionContext pragmaVersion() throws RecognitionException {
		PragmaVersionContext _localctx = new PragmaVersionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_pragmaVersion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(T__5);
			setState(178);
			match(Number);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodeblockContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<TerminalNode> Space() { return getTokens(DirectivesParser.Space); }
		public TerminalNode Space(int i) {
			return getToken(DirectivesParser.Space, i);
		}
		public CodeblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterCodeblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitCodeblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitCodeblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeblockContext codeblock() throws RecognitionException {
		CodeblockContext _localctx = new CodeblockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_codeblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(T__6);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Space) {
				{
				{
				setState(181);
				match(Space);
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(187);
			match(Colon);
			setState(188);
			condition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(DirectivesParser.Identifier, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertiesContext extends ParserRuleContext {
		public List<TerminalNode> OBrace() { return getTokens(DirectivesParser.OBrace); }
		public TerminalNode OBrace(int i) {
			return getToken(DirectivesParser.OBrace, i);
		}
		public List<TerminalNode> CBrace() { return getTokens(DirectivesParser.CBrace); }
		public TerminalNode CBrace(int i) {
			return getToken(DirectivesParser.CBrace, i);
		}
		public List<PropertyListContext> propertyList() {
			return getRuleContexts(PropertyListContext.class);
		}
		public PropertyListContext propertyList(int i) {
			return getRuleContext(PropertyListContext.class,i);
		}
		public PropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_properties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertiesContext properties() throws RecognitionException {
		PropertiesContext _localctx = new PropertiesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_properties);
		int _la;
		try {
			int _alt;
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				match(T__7);
				setState(193);
				match(Colon);
				setState(194);
				match(OBrace);
				setState(196); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(195);
					propertyList();
					}
					}
					setState(198); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Identifier );
				setState(200);
				match(CBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				match(T__7);
				setState(203);
				match(Colon);
				setState(204);
				match(OBrace);
				setState(205);
				match(OBrace);
				setState(207); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(206);
					propertyList();
					}
					}
					setState(209); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Identifier );
				setState(211);
				match(CBrace);
				 notifyErrorListeners("Too many start paranthesis"); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				match(T__7);
				setState(215);
				match(Colon);
				setState(216);
				match(OBrace);
				setState(218); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(217);
					propertyList();
					}
					}
					setState(220); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Identifier );
				setState(222);
				match(CBrace);
				setState(223);
				match(CBrace);
				 notifyErrorListeners("Too many start paranthesis"); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(226);
				match(T__7);
				setState(227);
				match(Colon);
				setState(229); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(228);
					propertyList();
					}
					}
					setState(231); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Identifier );
				setState(233);
				match(CBrace);
				 notifyErrorListeners("Missing opening brace"); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(236);
				match(T__7);
				setState(237);
				match(Colon);
				setState(238);
				match(OBrace);
				setState(240); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(239);
						propertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(242); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				 notifyErrorListeners("Missing closing brace"); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyListContext extends ParserRuleContext {
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public PropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterPropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitPropertyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitPropertyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyListContext propertyList() throws RecognitionException {
		PropertyListContext _localctx = new PropertyListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_propertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			property();
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(249);
				match(Comma);
				setState(250);
				property();
				}
				}
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(DirectivesParser.Identifier, 0); }
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(Identifier);
			setState(257);
			match(Assign);
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case String:
				{
				setState(258);
				text();
				}
				break;
			case Number:
				{
				setState(259);
				number();
				}
				break;
			case Bool:
				{
				setState(260);
				bool();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberRangesContext extends ParserRuleContext {
		public List<NumberRangeContext> numberRange() {
			return getRuleContexts(NumberRangeContext.class);
		}
		public NumberRangeContext numberRange(int i) {
			return getRuleContext(NumberRangeContext.class,i);
		}
		public NumberRangesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberRanges; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterNumberRanges(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitNumberRanges(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitNumberRanges(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberRangesContext numberRanges() throws RecognitionException {
		NumberRangesContext _localctx = new NumberRangesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_numberRanges);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			numberRange();
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(264);
				match(Comma);
				setState(265);
				numberRange();
				}
				}
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberRangeContext extends ParserRuleContext {
		public List<TerminalNode> Number() { return getTokens(DirectivesParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(DirectivesParser.Number, i);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public NumberRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberRange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterNumberRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitNumberRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitNumberRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberRangeContext numberRange() throws RecognitionException {
		NumberRangeContext _localctx = new NumberRangeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_numberRange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(Number);
			setState(272);
			match(Colon);
			setState(273);
			match(Number);
			setState(274);
			match(Assign);
			setState(275);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(DirectivesParser.String, 0); }
		public TerminalNode Number() { return getToken(DirectivesParser.Number, 0); }
		public TerminalNode Column() { return getToken(DirectivesParser.Column, 0); }
		public TerminalNode Bool() { return getToken(DirectivesParser.Bool, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Number) | (1L << Column) | (1L << String))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EcommandContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(DirectivesParser.Identifier, 0); }
		public EcommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ecommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterEcommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitEcommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitEcommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EcommandContext ecommand() throws RecognitionException {
		EcommandContext _localctx = new EcommandContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_ecommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(External);
			setState(280);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConfigContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(DirectivesParser.Identifier, 0); }
		public ConfigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_config; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterConfig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitConfig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitConfig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConfigContext config() throws RecognitionException {
		ConfigContext _localctx = new ConfigContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_config);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnContext extends ParserRuleContext {
		public TerminalNode Column() { return getToken(DirectivesParser.Column, 0); }
		public ColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnContext column() throws RecognitionException {
		ColumnContext _localctx = new ColumnContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_column);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(Column);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(DirectivesParser.String, 0); }
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_text);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(String);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode Number() { return getToken(DirectivesParser.Number, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(Number);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode Bool() { return getToken(DirectivesParser.Bool, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(Bool);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode OBrace() { return getToken(DirectivesParser.OBrace, 0); }
		public List<TerminalNode> CBrace() { return getTokens(DirectivesParser.CBrace); }
		public TerminalNode CBrace(int i) {
			return getToken(DirectivesParser.CBrace, i);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(OBrace);
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (T__0 - 1)) | (1L << (T__1 - 1)) | (1L << (T__2 - 1)) | (1L << (T__3 - 1)) | (1L << (T__4 - 1)) | (1L << (T__5 - 1)) | (1L << (T__6 - 1)) | (1L << (T__7 - 1)) | (1L << (OBrace - 1)) | (1L << (SColon - 1)) | (1L << (Or - 1)) | (1L << (And - 1)) | (1L << (Equals - 1)) | (1L << (NEquals - 1)) | (1L << (GTEquals - 1)) | (1L << (LTEquals - 1)) | (1L << (Match - 1)) | (1L << (NotMatch - 1)) | (1L << (QuestionColon - 1)) | (1L << (StartsWith - 1)) | (1L << (NotStartsWith - 1)) | (1L << (EndsWith - 1)) | (1L << (NotEndsWith - 1)) | (1L << (PlusEqual - 1)) | (1L << (SubEqual - 1)) | (1L << (MulEqual - 1)) | (1L << (DivEqual - 1)) | (1L << (PerEqual - 1)) | (1L << (AndEqual - 1)) | (1L << (OrEqual - 1)) | (1L << (XOREqual - 1)) | (1L << (Pow - 1)) | (1L << (External - 1)) | (1L << (GT - 1)) | (1L << (LT - 1)) | (1L << (Add - 1)) | (1L << (Subtract - 1)) | (1L << (Multiply - 1)) | (1L << (Divide - 1)) | (1L << (Modulus - 1)) | (1L << (OBracket - 1)) | (1L << (CBracket - 1)) | (1L << (OParen - 1)) | (1L << (CParen - 1)) | (1L << (Assign - 1)) | (1L << (Comma - 1)) | (1L << (QMark - 1)) | (1L << (Colon - 1)) | (1L << (Dot - 1)) | (1L << (At - 1)) | (1L << (Pipe - 1)) | (1L << (BackSlash - 1)) | (1L << (Dollar - 1)) | (1L << (Tilde - 1)) | (1L << (Bool - 1)) | (1L << (Number - 1)) | (1L << (Identifier - 1)) | (1L << (Macro - 1)) | (1L << (Column - 1)) | (1L << (String - 1)) | (1L << (EscapeSequence - 1)) | (1L << (Comment - 1)) | (1L << (Space - 1)))) != 0)) {
				{
				setState(295);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(293);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==CBrace) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case 2:
					{
					setState(294);
					condition();
					}
					break;
				}
				}
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(300);
			match(CBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(DirectivesParser.Identifier, 0); }
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColListContext extends ParserRuleContext {
		public List<TerminalNode> Column() { return getTokens(DirectivesParser.Column); }
		public TerminalNode Column(int i) {
			return getToken(DirectivesParser.Column, i);
		}
		public ColListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterColList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitColList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitColList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColListContext colList() throws RecognitionException {
		ColListContext _localctx = new ColListContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_colList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(Column);
			setState(307); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(305);
				match(Comma);
				setState(306);
				match(Column);
				}
				}
				setState(309); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Comma );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberListContext extends ParserRuleContext {
		public List<TerminalNode> Number() { return getTokens(DirectivesParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(DirectivesParser.Number, i);
		}
		public NumberListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterNumberList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitNumberList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitNumberList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberListContext numberList() throws RecognitionException {
		NumberListContext _localctx = new NumberListContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_numberList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(Number);
			setState(314); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(312);
				match(Comma);
				setState(313);
				match(Number);
				}
				}
				setState(316); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Comma );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolListContext extends ParserRuleContext {
		public List<TerminalNode> Bool() { return getTokens(DirectivesParser.Bool); }
		public TerminalNode Bool(int i) {
			return getToken(DirectivesParser.Bool, i);
		}
		public BoolListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterBoolList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitBoolList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitBoolList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolListContext boolList() throws RecognitionException {
		BoolListContext _localctx = new BoolListContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_boolList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(Bool);
			setState(321); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(319);
				match(Comma);
				setState(320);
				match(Bool);
				}
				}
				setState(323); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Comma );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringListContext extends ParserRuleContext {
		public List<TerminalNode> String() { return getTokens(DirectivesParser.String); }
		public TerminalNode String(int i) {
			return getToken(DirectivesParser.String, i);
		}
		public StringListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterStringList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitStringList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitStringList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringListContext stringList() throws RecognitionException {
		StringListContext _localctx = new StringListContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_stringList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(String);
			setState(328); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(326);
				match(Comma);
				setState(327);
				match(String);
				}
				}
				setState(330); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Comma );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(DirectivesParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(DirectivesParser.Identifier, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectivesListener ) ((DirectivesListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DirectivesVisitor ) return ((DirectivesVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(Identifier);
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(333);
				match(Comma);
				setState(334);
				match(Identifier);
				}
				}
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3B\u0157\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3"+
		"S\n\3\f\3\16\3V\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\7\4f\n\4\f\4\16\4i\13\4\3\5\3\5\7\5m\n\5\f\5\16\5p\13\5\3\5\5\5"+
		"s\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\7\t\u008b\n\t\f\t\16\t\u008e\13\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\7\13\u00a5\n\13\f\13\16\13\u00a8\13\13\3\13\3\13\3\f\3\f\3\f"+
		"\5\f\u00af\n\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\7\17\u00b9\n\17\f"+
		"\17\16\17\u00bc\13\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\6\21"+
		"\u00c7\n\21\r\21\16\21\u00c8\3\21\3\21\3\21\3\21\3\21\3\21\3\21\6\21\u00d2"+
		"\n\21\r\21\16\21\u00d3\3\21\3\21\3\21\3\21\3\21\3\21\3\21\6\21\u00dd\n"+
		"\21\r\21\16\21\u00de\3\21\3\21\3\21\3\21\3\21\3\21\3\21\6\21\u00e8\n\21"+
		"\r\21\16\21\u00e9\3\21\3\21\3\21\3\21\3\21\3\21\3\21\6\21\u00f3\n\21\r"+
		"\21\16\21\u00f4\3\21\3\21\5\21\u00f9\n\21\3\22\3\22\3\22\7\22\u00fe\n"+
		"\22\f\22\16\22\u0101\13\22\3\23\3\23\3\23\3\23\3\23\5\23\u0108\n\23\3"+
		"\24\3\24\3\24\7\24\u010d\n\24\f\24\16\24\u0110\13\24\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3"+
		"\33\3\33\3\34\3\34\3\35\3\35\3\35\7\35\u012a\n\35\f\35\16\35\u012d\13"+
		"\35\3\35\3\35\3\36\3\36\3\37\3\37\3\37\6\37\u0136\n\37\r\37\16\37\u0137"+
		"\3 \3 \3 \6 \u013d\n \r \16 \u013e\3!\3!\3!\6!\u0144\n!\r!\16!\u0145\3"+
		"\"\3\"\3\"\6\"\u014b\n\"\r\"\16\"\u014c\3#\3#\3#\7#\u0152\n#\f#\16#\u0155"+
		"\13#\3#\4g\u00a6\2$\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BD\2\6\3\2..\3\2\13\13\4\2:;>?\3\2\f\f\2\u0163\2F\3\2\2"+
		"\2\4T\3\2\2\2\6W\3\2\2\2\bj\3\2\2\2\nv\3\2\2\2\f{\3\2\2\2\16\u0082\3\2"+
		"\2\2\20\u0087\3\2\2\2\22\u0091\3\2\2\2\24\u009f\3\2\2\2\26\u00ab\3\2\2"+
		"\2\30\u00b0\3\2\2\2\32\u00b3\3\2\2\2\34\u00b6\3\2\2\2\36\u00c0\3\2\2\2"+
		" \u00f8\3\2\2\2\"\u00fa\3\2\2\2$\u0102\3\2\2\2&\u0109\3\2\2\2(\u0111\3"+
		"\2\2\2*\u0117\3\2\2\2,\u0119\3\2\2\2.\u011c\3\2\2\2\60\u011e\3\2\2\2\62"+
		"\u0120\3\2\2\2\64\u0122\3\2\2\2\66\u0124\3\2\2\28\u0126\3\2\2\2:\u0130"+
		"\3\2\2\2<\u0132\3\2\2\2>\u0139\3\2\2\2@\u0140\3\2\2\2B\u0147\3\2\2\2D"+
		"\u014e\3\2\2\2FG\5\4\3\2GH\7\2\2\3H\3\3\2\2\2IS\7A\2\2JS\5\24\13\2KL\5"+
		"\6\4\2LM\7\r\2\2MS\3\2\2\2NO\5\26\f\2OP\7\r\2\2PS\3\2\2\2QS\5\b\5\2RI"+
		"\3\2\2\2RJ\3\2\2\2RK\3\2\2\2RN\3\2\2\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2T"+
		"U\3\2\2\2U\5\3\2\2\2VT\3\2\2\2Wg\5:\36\2Xf\5\34\17\2Yf\5\36\20\2Zf\5\24"+
		"\13\2[f\5\62\32\2\\f\5\64\33\2]f\5\66\34\2^f\5\60\31\2_f\5<\37\2`f\5>"+
		" \2af\5@!\2bf\5B\"\2cf\5&\24\2df\5 \21\2eX\3\2\2\2eY\3\2\2\2eZ\3\2\2\2"+
		"e[\3\2\2\2e\\\3\2\2\2e]\3\2\2\2e^\3\2\2\2e_\3\2\2\2e`\3\2\2\2ea\3\2\2"+
		"\2eb\3\2\2\2ec\3\2\2\2ed\3\2\2\2fi\3\2\2\2gh\3\2\2\2ge\3\2\2\2h\7\3\2"+
		"\2\2ig\3\2\2\2jn\5\n\6\2km\5\f\7\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2"+
		"\2\2or\3\2\2\2pn\3\2\2\2qs\5\16\b\2rq\3\2\2\2rs\3\2\2\2st\3\2\2\2tu\7"+
		"\f\2\2u\t\3\2\2\2vw\7\3\2\2wx\5\20\t\2xy\7\13\2\2yz\5\4\3\2z\13\3\2\2"+
		"\2{|\7\f\2\2|}\7\4\2\2}~\7\3\2\2~\177\5\20\t\2\177\u0080\7\13\2\2\u0080"+
		"\u0081\5\4\3\2\u0081\r\3\2\2\2\u0082\u0083\7\f\2\2\u0083\u0084\7\4\2\2"+
		"\u0084\u0085\7\13\2\2\u0085\u0086\5\4\3\2\u0086\17\3\2\2\2\u0087\u008c"+
		"\7.\2\2\u0088\u008b\n\2\2\2\u0089\u008b\5\20\t\2\u008a\u0088\3\2\2\2\u008a"+
		"\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2"+
		"\2\2\u008d\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\7/\2\2\u0090"+
		"\21\3\2\2\2\u0091\u0092\7\5\2\2\u0092\u0093\7.\2\2\u0093\u0094\7<\2\2"+
		"\u0094\u0095\7\60\2\2\u0095\u0096\5\20\t\2\u0096\u0097\7\r\2\2\u0097\u0098"+
		"\5\20\t\2\u0098\u0099\7\r\2\2\u0099\u009a\5\20\t\2\u009a\u009b\7/\2\2"+
		"\u009b\u009c\7\13\2\2\u009c\u009d\5\4\3\2\u009d\u009e\7\f\2\2\u009e\23"+
		"\3\2\2\2\u009f\u00a0\78\2\2\u00a0\u00a6\7\13\2\2\u00a1\u00a5\n\3\2\2\u00a2"+
		"\u00a5\5\24\13\2\u00a3\u00a5\7=\2\2\u00a4\u00a1\3\2\2\2\u00a4\u00a2\3"+
		"\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a6"+
		"\u00a4\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\7\f"+
		"\2\2\u00aa\25\3\2\2\2\u00ab\u00ae\7\6\2\2\u00ac\u00af\5\30\r\2\u00ad\u00af"+
		"\5\32\16\2\u00ae\u00ac\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af\27\3\2\2\2\u00b0"+
		"\u00b1\7\7\2\2\u00b1\u00b2\5D#\2\u00b2\31\3\2\2\2\u00b3\u00b4\7\b\2\2"+
		"\u00b4\u00b5\7;\2\2\u00b5\33\3\2\2\2\u00b6\u00ba\7\t\2\2\u00b7\u00b9\7"+
		"B\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00be\7\63"+
		"\2\2\u00be\u00bf\58\35\2\u00bf\35\3\2\2\2\u00c0\u00c1\7<\2\2\u00c1\37"+
		"\3\2\2\2\u00c2\u00c3\7\n\2\2\u00c3\u00c4\7\63\2\2\u00c4\u00c6\7\13\2\2"+
		"\u00c5\u00c7\5\"\22\2\u00c6\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c6"+
		"\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\7\f\2\2\u00cb"+
		"\u00f9\3\2\2\2\u00cc\u00cd\7\n\2\2\u00cd\u00ce\7\63\2\2\u00ce\u00cf\7"+
		"\13\2\2\u00cf\u00d1\7\13\2\2\u00d0\u00d2\5\"\22\2\u00d1\u00d0\3\2\2\2"+
		"\u00d2\u00d3\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5"+
		"\3\2\2\2\u00d5\u00d6\7\f\2\2\u00d6\u00d7\b\21\1\2\u00d7\u00f9\3\2\2\2"+
		"\u00d8\u00d9\7\n\2\2\u00d9\u00da\7\63\2\2\u00da\u00dc\7\13\2\2\u00db\u00dd"+
		"\5\"\22\2\u00dc\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00dc\3\2\2\2"+
		"\u00de\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\7\f\2\2\u00e1\u00e2"+
		"\7\f\2\2\u00e2\u00e3\b\21\1\2\u00e3\u00f9\3\2\2\2\u00e4\u00e5\7\n\2\2"+
		"\u00e5\u00e7\7\63\2\2\u00e6\u00e8\5\"\22\2\u00e7\u00e6\3\2\2\2\u00e8\u00e9"+
		"\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\u00ec\7\f\2\2\u00ec\u00ed\b\21\1\2\u00ed\u00f9\3\2\2\2\u00ee\u00ef\7"+
		"\n\2\2\u00ef\u00f0\7\63\2\2\u00f0\u00f2\7\13\2\2\u00f1\u00f3\5\"\22\2"+
		"\u00f2\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5"+
		"\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\b\21\1\2\u00f7\u00f9\3\2\2\2"+
		"\u00f8\u00c2\3\2\2\2\u00f8\u00cc\3\2\2\2\u00f8\u00d8\3\2\2\2\u00f8\u00e4"+
		"\3\2\2\2\u00f8\u00ee\3\2\2\2\u00f9!\3\2\2\2\u00fa\u00ff\5$\23\2\u00fb"+
		"\u00fc\7\61\2\2\u00fc\u00fe\5$\23\2\u00fd\u00fb\3\2\2\2\u00fe\u0101\3"+
		"\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100#\3\2\2\2\u0101\u00ff"+
		"\3\2\2\2\u0102\u0103\7<\2\2\u0103\u0107\7\60\2\2\u0104\u0108\5\62\32\2"+
		"\u0105\u0108\5\64\33\2\u0106\u0108\5\66\34\2\u0107\u0104\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0107\u0106\3\2\2\2\u0108%\3\2\2\2\u0109\u010e\5(\25\2"+
		"\u010a\u010b\7\61\2\2\u010b\u010d\5(\25\2\u010c\u010a\3\2\2\2\u010d\u0110"+
		"\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\'\3\2\2\2\u0110"+
		"\u010e\3\2\2\2\u0111\u0112\7;\2\2\u0112\u0113\7\63\2\2\u0113\u0114\7;"+
		"\2\2\u0114\u0115\7\60\2\2\u0115\u0116\5*\26\2\u0116)\3\2\2\2\u0117\u0118"+
		"\t\4\2\2\u0118+\3\2\2\2\u0119\u011a\7$\2\2\u011a\u011b\7<\2\2\u011b-\3"+
		"\2\2\2\u011c\u011d\7<\2\2\u011d/\3\2\2\2\u011e\u011f\7>\2\2\u011f\61\3"+
		"\2\2\2\u0120\u0121\7?\2\2\u0121\63\3\2\2\2\u0122\u0123\7;\2\2\u0123\65"+
		"\3\2\2\2\u0124\u0125\7:\2\2\u0125\67\3\2\2\2\u0126\u012b\7\13\2\2\u0127"+
		"\u012a\n\5\2\2\u0128\u012a\58\35\2\u0129\u0127\3\2\2\2\u0129\u0128\3\2"+
		"\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"\u012e\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u012f\7\f\2\2\u012f9\3\2\2\2"+
		"\u0130\u0131\7<\2\2\u0131;\3\2\2\2\u0132\u0135\7>\2\2\u0133\u0134\7\61"+
		"\2\2\u0134\u0136\7>\2\2\u0135\u0133\3\2\2\2\u0136\u0137\3\2\2\2\u0137"+
		"\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138=\3\2\2\2\u0139\u013c\7;\2\2\u013a"+
		"\u013b\7\61\2\2\u013b\u013d\7;\2\2\u013c\u013a\3\2\2\2\u013d\u013e\3\2"+
		"\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f?\3\2\2\2\u0140\u0143"+
		"\7:\2\2\u0141\u0142\7\61\2\2\u0142\u0144\7:\2\2\u0143\u0141\3\2\2\2\u0144"+
		"\u0145\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146A\3\2\2\2"+
		"\u0147\u014a\7?\2\2\u0148\u0149\7\61\2\2\u0149\u014b\7?\2\2\u014a\u0148"+
		"\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d"+
		"C\3\2\2\2\u014e\u0153\7<\2\2\u014f\u0150\7\61\2\2\u0150\u0152\7<\2\2\u0151"+
		"\u014f\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2"+
		"\2\2\u0154E\3\2\2\2\u0155\u0153\3\2\2\2\36RTegnr\u008a\u008c\u00a4\u00a6"+
		"\u00ae\u00ba\u00c8\u00d3\u00de\u00e9\u00f4\u00f8\u00ff\u0107\u010e\u0129"+
		"\u012b\u0137\u013e\u0145\u014c\u0153";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}