// Generated from /Users/aleksei/IdeaProjects/SimpleCLikeParser/src/main/java/clike/CLikeLang.g4 by ANTLR 4.10.1
package clike;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CLikeLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CLikeLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CLikeLangParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(CLikeLangParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link CLikeLangParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(CLikeLangParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link CLikeLangParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(CLikeLangParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link CLikeLangParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(CLikeLangParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expression}
	 * labeled alternative in {@link CLikeLangParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CLikeLangParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLikeLangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(CLikeLangParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code myString}
	 * labeled alternative in {@link CLikeLangParser#arithExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMyString(CLikeLangParser.MyStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link CLikeLangParser#arithExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(CLikeLangParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryInt}
	 * labeled alternative in {@link CLikeLangParser#arithExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryInt(CLikeLangParser.UnaryIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code myInt}
	 * labeled alternative in {@link CLikeLangParser#arithExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMyInt(CLikeLangParser.MyIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code power}
	 * labeled alternative in {@link CLikeLangParser#arithExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(CLikeLangParser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bracketsArith}
	 * labeled alternative in {@link CLikeLangParser#arithExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketsArith(CLikeLangParser.BracketsArithContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link CLikeLangParser#arithExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(CLikeLangParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andOr}
	 * labeled alternative in {@link CLikeLangParser#boolExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOr(CLikeLangParser.AndOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compare}
	 * labeled alternative in {@link CLikeLangParser#boolExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(CLikeLangParser.CompareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryBool}
	 * labeled alternative in {@link CLikeLangParser#boolExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryBool(CLikeLangParser.UnaryBoolContext ctx);
}