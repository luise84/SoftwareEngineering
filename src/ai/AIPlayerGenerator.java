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
	private static String methodString;

	public AIPlayerGenerator(String aiType){
		this.aiType = aiType;
	}

	private String getMethodString(String aiType){
		switch(aiType){
			case "easy":
				methodString = "Stone randomStone  = findRandomStone();\n" +
						"\t\tPoint point = field.getPositionOfStone(randomStone);\n" +
						"\n" +
						"\t\tboolean move = moveForward(randomStone);\n" +
						"\t\tif(move){\n" +
						"\t\t\treturn true;\n" +
						"\t\t}else{\n" +
						"\t\t\treturn calculateEasyMove();\n" +
						"\t\t}";
				break;
			case "medium":
				methodString = "";
				break;
			case "hard":
				methodString = "";
				break;

		}
		return methodString;
	}


	public static void main (){
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
					"public class AIPlayer2 {"+

						"public AIPlayer() {"+

						"}"+

						"public boolean calculateMove(){" +
							methodString+
						"}"+
					"}";


			//Create the File
			System.out.println(aiType + " und methode: "+ methodString);
			//Edit the path to edit the working directory!!
			File file = new File(System.getProperty("user.dir")+"/src/ai/AIPlayer2.java");
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
