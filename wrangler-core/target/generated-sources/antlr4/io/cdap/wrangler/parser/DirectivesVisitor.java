// Generated from io\cdap\wrangler\parser\Directives.g4 by ANTLR 4.7
package io.cdap.wrangler.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DirectivesParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DirectivesVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DirectivesParser#recipe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecipe(DirectivesParser.RecipeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DirectivesParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(DirectivesParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DirectivesParser#directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirective(DirectivesParser.DirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link DirectivesParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(DirectivesParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DirectivesParser#ifStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStat(DirectivesParser.IfStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link DirectivesParser#elseIfStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfStat(DirectivesParser.ElseIfStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link DirectivesParser#elseStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStat(DirectivesParser.ElseStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link DirectivesParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(DirectivesParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DirectivesParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(DirectivesParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DirectivesParser#macro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacro(DirectivesParser.MacroContext ctx);
	/**
	 * Visit a parse tree produced by {@link DirectivesParser#pragma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma(DirectivesParser.PragmaContext ctx);
	/**
	 * Visit a parse tree produced by {@link DirectivesParser#pragmaLoadDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragmaLoadDirective(DirectivesParser.PragmaLoadDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link DirectivesParser#pragmaVersion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragmaVersion(DirectivesParser.PragmaVersionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DirectivesParser#codeblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeblock(DirectivesParser.CodeblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DirectivesParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(DirectivesParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DirectivesParser#properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperties(DirectivesParser.PropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DirectivesParser#propertyList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyList(DirectivesParser.PropertyListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DirectivesParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(DirectivesParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DirectivesParser#numberRanges}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberRanges(DirectivesParser.NumberRangesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DirectivesParser#numberRange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberRange(DirectivesParser.NumberRangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DirectivesParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(DirectivesParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DirectivesParser#ecommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEcommand(DirectivesParser.EcommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link DirectivesParser#config}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfig(DirectivesParser.ConfigContext ctx);
	/**
	 * Visit a parse tree produced by {@link DirectivesParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn(DirectivesParser.ColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DirectivesParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(DirectivesParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link DirectivesParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(DirectivesParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link DirectivesParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(DirectivesParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link DirectivesParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(DirectivesParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DirectivesParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(DirectivesParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link DirectivesParser#colList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColList(DirectivesParser.ColListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DirectivesParser#numberList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberList(DirectivesParser.NumberListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DirectivesParser#boolList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolList(DirectivesParser.BoolListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DirectivesParser#stringList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringList(DirectivesParser.StringListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DirectivesParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(DirectivesParser.IdentifierListContext ctx);
}