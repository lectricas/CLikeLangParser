// Generated from /Users/aleksei/IdeaProjects/SimpleCLikeParser/src/main/java/arith/Arith.g4 by ANTLR 4.10.1
package arith;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ArithParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ArithVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ArithParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(ArithParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code number}
	 * labeled alternative in {@link ArithParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(ArithParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryOperation}
	 * labeled alternative in {@link ArithParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOperation(ArithParser.BinaryOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code brackets}
	 * labeled alternative in {@link ArithParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrackets(ArithParser.BracketsContext ctx);
}