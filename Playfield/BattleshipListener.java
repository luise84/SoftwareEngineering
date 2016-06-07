package Uebung3.Uebung3_3.Playfield;// Generated from Battleship.g4 by ANTLR 4.5
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BattleshipParser}.
 */
public interface BattleshipListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BattleshipParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(BattleshipParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link BattleshipParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(BattleshipParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link BattleshipParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(BattleshipParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link BattleshipParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(BattleshipParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link BattleshipParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(BattleshipParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link BattleshipParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(BattleshipParser.ValueContext ctx);
}