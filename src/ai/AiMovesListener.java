package ai;// Generated from AiMoves.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AiMovesParser}.
 */
public interface AiMovesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AiMovesParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(AiMovesParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiMovesParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(AiMovesParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiMovesParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(AiMovesParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiMovesParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(AiMovesParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiMovesParser#choosetype}.
	 * @param ctx the parse tree
	 */
	void enterChoosetype(AiMovesParser.ChoosetypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiMovesParser#choosetype}.
	 * @param ctx the parse tree
	 */
	void exitChoosetype(AiMovesParser.ChoosetypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiMovesParser#move}.
	 * @param ctx the parse tree
	 */
	void enterMove(AiMovesParser.MoveContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiMovesParser#move}.
	 * @param ctx the parse tree
	 */
	void exitMove(AiMovesParser.MoveContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiMovesParser#movetype}.
	 * @param ctx the parse tree
	 */
	void enterMovetype(AiMovesParser.MovetypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiMovesParser#movetype}.
	 * @param ctx the parse tree
	 */
	void exitMovetype(AiMovesParser.MovetypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiMovesParser#movedirection}.
	 * @param ctx the parse tree
	 */
	void enterMovedirection(AiMovesParser.MovedirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiMovesParser#movedirection}.
	 * @param ctx the parse tree
	 */
	void exitMovedirection(AiMovesParser.MovedirectionContext ctx);
}