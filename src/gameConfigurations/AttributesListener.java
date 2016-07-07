package gameConfigurations;// Generated from C:\Users\Luise\01Luise_Ordner\StudiumMI\Master\semester1\SE\Uebung4_Semesterprojekt\SoftwareEngineering\src\gameConfigurations\Attributes.g4 by ANTLR 4.5.3
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
	 * Enter a parse tree produced by {@link AttributesParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(AttributesParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link AttributesParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(AttributesParser.PathContext ctx);
}