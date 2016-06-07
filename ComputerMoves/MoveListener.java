package Uebung3.Uebung3_3.ComputerMoves;// Generated from Move.g4 by ANTLR 4.5
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MoveParser}.
 */
public interface MoveListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MoveParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(MoveParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoveParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(MoveParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoveParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(MoveParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoveParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(MoveParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoveParser#move}.
	 * @param ctx the parse tree
	 */
	void enterMove(MoveParser.MoveContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoveParser#move}.
	 * @param ctx the parse tree
	 */
	void exitMove(MoveParser.MoveContext ctx);
}