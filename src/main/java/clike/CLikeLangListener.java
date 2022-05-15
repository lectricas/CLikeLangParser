// Generated from /Users/aleksei/IdeaProjects/SimpleCLikeParser/src/main/java/clike/CLikeLang.g4 by ANTLR 4.10.1
package clike;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CLikeLangParser}.
 */
public interface CLikeLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CLikeLangParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(CLikeLangParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLikeLangParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(CLikeLangParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link CLikeLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(CLikeLangParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link CLikeLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(CLikeLangParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link CLikeLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile(CLikeLangParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link CLikeLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile(CLikeLangParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link CLikeLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIf(CLikeLangParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link CLikeLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIf(CLikeLangParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expression}
	 * labeled alternative in {@link CLikeLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CLikeLangParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expression}
	 * labeled alternative in {@link CLikeLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CLikeLangParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLikeLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(CLikeLangParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLikeLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(CLikeLangParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code myString}
	 * labeled alternative in {@link CLikeLangParser#arithExp}.
	 * @param ctx the parse tree
	 */
	void enterMyString(CLikeLangParser.MyStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code myString}
	 * labeled alternative in {@link CLikeLangParser#arithExp}.
	 * @param ctx the parse tree
	 */
	void exitMyString(CLikeLangParser.MyStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link CLikeLangParser#arithExp}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(CLikeLangParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link CLikeLangParser#arithExp}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(CLikeLangParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryInt}
	 * labeled alternative in {@link CLikeLangParser#arithExp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryInt(CLikeLangParser.UnaryIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryInt}
	 * labeled alternative in {@link CLikeLangParser#arithExp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryInt(CLikeLangParser.UnaryIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code myInt}
	 * labeled alternative in {@link CLikeLangParser#arithExp}.
	 * @param ctx the parse tree
	 */
	void enterMyInt(CLikeLangParser.MyIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code myInt}
	 * labeled alternative in {@link CLikeLangParser#arithExp}.
	 * @param ctx the parse tree
	 */
	void exitMyInt(CLikeLangParser.MyIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code power}
	 * labeled alternative in {@link CLikeLangParser#arithExp}.
	 * @param ctx the parse tree
	 */
	void enterPower(CLikeLangParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code power}
	 * labeled alternative in {@link CLikeLangParser#arithExp}.
	 * @param ctx the parse tree
	 */
	void exitPower(CLikeLangParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracketsArith}
	 * labeled alternative in {@link CLikeLangParser#arithExp}.
	 * @param ctx the parse tree
	 */
	void enterBracketsArith(CLikeLangParser.BracketsArithContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracketsArith}
	 * labeled alternative in {@link CLikeLangParser#arithExp}.
	 * @param ctx the parse tree
	 */
	void exitBracketsArith(CLikeLangParser.BracketsArithContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link CLikeLangParser#arithExp}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(CLikeLangParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link CLikeLangParser#arithExp}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(CLikeLangParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andOr}
	 * labeled alternative in {@link CLikeLangParser#boolExp}.
	 * @param ctx the parse tree
	 */
	void enterAndOr(CLikeLangParser.AndOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andOr}
	 * labeled alternative in {@link CLikeLangParser#boolExp}.
	 * @param ctx the parse tree
	 */
	void exitAndOr(CLikeLangParser.AndOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compare}
	 * labeled alternative in {@link CLikeLangParser#boolExp}.
	 * @param ctx the parse tree
	 */
	void enterCompare(CLikeLangParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compare}
	 * labeled alternative in {@link CLikeLangParser#boolExp}.
	 * @param ctx the parse tree
	 */
	void exitCompare(CLikeLangParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryBool}
	 * labeled alternative in {@link CLikeLangParser#boolExp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryBool(CLikeLangParser.UnaryBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryBool}
	 * labeled alternative in {@link CLikeLangParser#boolExp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryBool(CLikeLangParser.UnaryBoolContext ctx);
}