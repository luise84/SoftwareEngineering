package ai;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;

/**
 * Created by Luise on 26.06.2016.
 */
public class AIPlayerGenerator extends AiMovesBaseListener{
	private static String aiType;

	public AIPlayerGenerator(String aiType){
		this.aiType = aiType;
	}


	public static void main (String[] args){
		//Parse and convert the attributes.txt
		try {
			CharStream in = new org.antlr.v4.runtime.ANTLRInputStream(new FileReader(System.getProperty("user.dir")+"/src/ai/"+aiType+".txt"));
			AiMovesLexer lexer = new AiMovesLexer(in);
			// Get a list of matched tokens
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// Pass the tokens to the parser
			AiMovesParser parser = new AiMovesParser(tokens);
			// Specify our entry point
			//Dont call parser.<rule>() twice -> mismatched input '<EOF>' expecting FIELD_NAME"
			AiMovesParser.FileContext fileContext = parser.file();
			// Walk it and attach our listener
			ParseTreeWalker walker = new ParseTreeWalker();
			AiMovesBaseListener listener = new AIPlayerGenerator(aiType);
			walker.walk(listener, fileContext);

			//Create the String of new File
			String classString = "package ai; "+
					"import java.awt.*;"+
					"public class AIPlayer {"+
					"public Color fieldColor;"+
					"public String aiStoneImagePath;"+
					"public String playerStoneImagePath;"+
					"public String playfield; "+
					"public String level;"+
					"public String ai;"+

					"public AIPlayer() {"+

					"}"+
					"}";


			//Create the File
			//Edit the path to edit the working directory!!
			File file = new File(System.getProperty("user.dir")+"/src/gameConfigurations/AIPlayer.java");
			// if file doesn't exists, then create it
			if (!file.exists()) file.createNewFile();
			//Write all in File
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(classString);
			bw.close(); //generate from .java the .class-file
			System.out.println("AIPlayer.java erstellt!");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
