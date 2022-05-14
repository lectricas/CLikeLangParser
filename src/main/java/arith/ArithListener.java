// Generated from /Users/aleksei/IdeaProjects/SimpleCLikeParser/src/main/java/arith/Arith.g4 by ANTLR 4.10.1
package arith;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArithParser}.
 */
public interface ArithListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ArithParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(ArithParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(ArithParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code number}
	 * labeled alternative in {@link ArithParser#e}.
	 * @param ctx the parse tree
	 */
	void enterNumber(ArithParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code number}
	 * labeled alternative in {@link ArithParser#e}.
	 * @param ctx the parse tree
	 */
	void exitNumber(ArithParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryOperation}
	 * labeled alternative in {@link ArithParser#e}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperation(ArithParser.BinaryOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryOperation}
	 * labeled alternative in {@link ArithParser#e}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperation(ArithParser.BinaryOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code brackets}
	 * labeled alternative in {@link ArithParser#e}.
	 * @param ctx the parse tree
	 */
	void enterBrackets(ArithParser.BracketsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code brackets}
	 * labeled alternative in {@link ArithParser#e}.
	 * @param ctx the parse tree
	 */
	void exitBrackets(ArithParser.BracketsContext ctx);
}