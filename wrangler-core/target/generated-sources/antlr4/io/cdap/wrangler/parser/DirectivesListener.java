// Generated from io\cdap\wrangler\parser\Directives.g4 by ANTLR 4.7
package io.cdap.wrangler.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DirectivesParser}.
 */
public interface DirectivesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#recipe}.
	 * @param ctx the parse tree
	 */
	void enterRecipe(DirectivesParser.RecipeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#recipe}.
	 * @param ctx the parse tree
	 */
	void exitRecipe(DirectivesParser.RecipeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(DirectivesParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(DirectivesParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterDirective(DirectivesParser.DirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitDirective(DirectivesParser.DirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(DirectivesParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(DirectivesParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(DirectivesParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(DirectivesParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#elseIfStat}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStat(DirectivesParser.ElseIfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#elseIfStat}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStat(DirectivesParser.ElseIfStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#elseStat}.
	 * @param ctx the parse tree
	 */
	void enterElseStat(DirectivesParser.ElseStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#elseStat}.
	 * @param ctx the parse tree
	 */
	void exitElseStat(DirectivesParser.ElseStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(DirectivesParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(DirectivesParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(DirectivesParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(DirectivesParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#macro}.
	 * @param ctx the parse tree
	 */
	void enterMacro(DirectivesParser.MacroContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#macro}.
	 * @param ctx the parse tree
	 */
	void exitMacro(DirectivesParser.MacroContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#pragma}.
	 * @param ctx the parse tree
	 */
	void enterPragma(DirectivesParser.PragmaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#pragma}.
	 * @param ctx the parse tree
	 */
	void exitPragma(DirectivesParser.PragmaContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#pragmaLoadDirective}.
	 * @param ctx the parse tree
	 */
	void enterPragmaLoadDirective(DirectivesParser.PragmaLoadDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#pragmaLoadDirective}.
	 * @param ctx the parse tree
	 */
	void exitPragmaLoadDirective(DirectivesParser.PragmaLoadDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#pragmaVersion}.
	 * @param ctx the parse tree
	 */
	void enterPragmaVersion(DirectivesParser.PragmaVersionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#pragmaVersion}.
	 * @param ctx the parse tree
	 */
	void exitPragmaVersion(DirectivesParser.PragmaVersionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#codeblock}.
	 * @param ctx the parse tree
	 */
	void enterCodeblock(DirectivesParser.CodeblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#codeblock}.
	 * @param ctx the parse tree
	 */
	void exitCodeblock(DirectivesParser.CodeblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(DirectivesParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(DirectivesParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#properties}.
	 * @param ctx the parse tree
	 */
	void enterProperties(DirectivesParser.PropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#properties}.
	 * @param ctx the parse tree
	 */
	void exitProperties(DirectivesParser.PropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#propertyList}.
	 * @param ctx the parse tree
	 */
	void enterPropertyList(DirectivesParser.PropertyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#propertyList}.
	 * @param ctx the parse tree
	 */
	void exitPropertyList(DirectivesParser.PropertyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(DirectivesParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(DirectivesParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#numberRanges}.
	 * @param ctx the parse tree
	 */
	void enterNumberRanges(DirectivesParser.NumberRangesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#numberRanges}.
	 * @param ctx the parse tree
	 */
	void exitNumberRanges(DirectivesParser.NumberRangesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#numberRange}.
	 * @param ctx the parse tree
	 */
	void enterNumberRange(DirectivesParser.NumberRangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#numberRange}.
	 * @param ctx the parse tree
	 */
	void exitNumberRange(DirectivesParser.NumberRangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(DirectivesParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(DirectivesParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#ecommand}.
	 * @param ctx the parse tree
	 */
	void enterEcommand(DirectivesParser.EcommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#ecommand}.
	 * @param ctx the parse tree
	 */
	void exitEcommand(DirectivesParser.EcommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#config}.
	 * @param ctx the parse tree
	 */
	void enterConfig(DirectivesParser.ConfigContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#config}.
	 * @param ctx the parse tree
	 */
	void exitConfig(DirectivesParser.ConfigContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumn(DirectivesParser.ColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumn(DirectivesParser.ColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(DirectivesParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(DirectivesParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(DirectivesParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(DirectivesParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(DirectivesParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(DirectivesParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(DirectivesParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(DirectivesParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(DirectivesParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(DirectivesParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#colList}.
	 * @param ctx the parse tree
	 */
	void enterColList(DirectivesParser.ColListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#colList}.
	 * @param ctx the parse tree
	 */
	void exitColList(DirectivesParser.ColListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#numberList}.
	 * @param ctx the parse tree
	 */
	void enterNumberList(DirectivesParser.NumberListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#numberList}.
	 * @param ctx the parse tree
	 */
	void exitNumberList(DirectivesParser.NumberListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#boolList}.
	 * @param ctx the parse tree
	 */
	void enterBoolList(DirectivesParser.BoolListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#boolList}.
	 * @param ctx the parse tree
	 */
	void exitBoolList(DirectivesParser.BoolListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#stringList}.
	 * @param ctx the parse tree
	 */
	void enterStringList(DirectivesParser.StringListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#stringList}.
	 * @param ctx the parse tree
	 */
	void exitStringList(DirectivesParser.StringListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DirectivesParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(DirectivesParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DirectivesParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(DirectivesParser.IdentifierListContext ctx);
}