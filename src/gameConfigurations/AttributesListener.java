package gameConfigurations;// Generated from Attributes.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AttributesParser}.
 */
public interface AttributesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AttributesParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(AttributesParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link AttributesParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(AttributesParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link AttributesParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColor(AttributesParser.ColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AttributesParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColor(AttributesParser.ColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AttributesParser#computerplayer}.
	 * @param ctx the parse tree
	 */
	void enterComputerplayer(AttributesParser.ComputerplayerContext ctx);
	/**
	 * Exit a parse tree produced by {@link AttributesParser#computerplayer}.
	 * @param ctx the parse tree
	 */
	void exitComputerplayer(AttributesParser.ComputerplayerContext ctx);
	/**
	 * Enter a parse tree produced by {@link AttributesParser#player}.
	 * @param ctx the parse tree
	 */
	void enterPlayer(AttributesParser.PlayerContext ctx);
	/**
	 * Exit a parse tree produced by {@link AttributesParser#player}.
	 * @param ctx the parse tree
	 */
	void exitPlayer(AttributesParser.PlayerContext ctx);
	/**
	 * Enter a parse tree produced by {@link AttributesParser#playfield}.
	 * @param ctx the parse tree
	 */
	void enterPlayfield(AttributesParser.PlayfieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link AttributesParser#playfield}.
	 * @param ctx the parse tree
	 */
	void exitPlayfield(AttributesParser.PlayfieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link AttributesParser#level}.
	 * @param ctx the parse tree
	 */
	void enterLevel(AttributesParser.LevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link AttributesParser#level}.
	 * @param ctx the parse tree
	 */
	void exitLevel(AttributesParser.LevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link AttributesParser#ai}.
	 * @param ctx the parse tree
	 */
	void enterAi(AttributesParser.AiContext ctx);
	/**
	 * Exit a parse tree produced by {@link AttributesParser#ai}.
	 * @param ctx the parse tree
	 */
	void exitAi(AttributesParser.AiContext ctx);
	/**
	 * Enter a parse tree produced by {@link AttributesParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(AttributesParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link AttributesParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(AttributesParser.PathContext ctx);
	/**
	 * Enter a parse tree produced by {@link AttributesParser#pType}.
	 * @param ctx the parse tree
	 */
	void enterPType(AttributesParser.PTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AttributesParser#pType}.
	 * @param ctx the parse tree
	 */
	void exitPType(AttributesParser.PTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AttributesParser#lType}.
	 * @param ctx the parse tree
	 */
	void enterLType(AttributesParser.LTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AttributesParser#lType}.
	 * @param ctx the parse tree
	 */
	void exitLType(AttributesParser.LTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AttributesParser#aiType}.
	 * @param ctx the parse tree
	 */
	void enterAiType(AttributesParser.AiTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AttributesParser#aiType}.
	 * @param ctx the parse tree
	 */
	void exitAiType(AttributesParser.AiTypeContext ctx);
}