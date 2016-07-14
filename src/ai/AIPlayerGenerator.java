package ai;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Luise on 26.06.2016.
 */
public class AIPlayerGenerator extends AiMovesBaseListener{
	private static String aiType = "hard";
	private static String methodString;
	private String stoneParam;
	private String methodName;
	private String methodConstruct;
	private ArrayList<String> methods = new ArrayList<>();

	public AIPlayerGenerator(String aiType){
		this.aiType = aiType;
	}



	@Override public void enterFile(AiMovesParser.FileContext ctx)
	{

		//System.out.println(ctx.alternativeSymbol());
		List<AiMovesParser.CommandContext> commands = ctx.command();
		for(AiMovesParser.CommandContext command : commands){

			switch(command.choosetype().getText().trim().toLowerCase()){
				case "vorderster":
					stoneParam = "first)";
					break;
				case "hinterster":
					stoneParam = "last)";
					break;
				case "zufaelliger":
					stoneParam = "random)";
					break;
			}
			switch(command.move().getText().trim().toLowerCase()){
				case "ziehe":
					methodName = "move";
					break;
				case "springe":
					methodName = "jump";
					break;

			}
			switch(command.movetype().getText().trim().toLowerCase()){
				case "zufaellig":
					methodName += "Random(";
					break;
				case "gerade":
					methodName += "Forward(";
					break;
				case "diagonal":
					methodName += "Forward(";
					break;
				case "zur seite":
					methodName += "SideWays(";
					break;
			}

			String string = methodName+stoneParam;
			methods.add(string);
			//System.out.println(methods.toString());



			//System.out.println("stoneParam:"+stoneParam + ", methodString:"+methodName);

		}

		System.out.println(createConstruct(methods));




	}


	/*@Override public void enterCommand(AiMovesParser.CommandContext ctx) {
		System.out.println(ctx.getText());
		System.out.println();
		switch(ctx.choosetype().getText().trim().toLowerCase()){
			case "vorderster":
				stoneParam = "first)";
				break;
			case "hinterster":
				stoneParam = "last)";
				break;
			case "zufaelliger":
				stoneParam = "random)";
				break;
		}
		switch(ctx.move().getText().trim().toLowerCase()){
			case "ziehe":
				methodName = "move";
				break;
			case "springe":
				methodName = "jump";
				break;

		}
		switch(ctx.movetype().getText().trim().toLowerCase()){
			case "zufaellig":
				methodName += "Random(";
				break;
			case "gerade":
				methodName += "Forward(";
				break;
			case "diagonal":
				methodName += "Forward(";
				break;
			case "zur seite":
				methodName += "SideWays(";
				break;
		}

		System.out.println("stoneParam:"+stoneParam + ", methodString:"+methodName);

	}
*/

	public String createConstruct(List<String> methodNames){
		String method = "";
		for(String element:methodNames){
			method+=getConstruct(element);
			//method+="}";

		}
		method += "return false;}";
		return method;
	}

	public String getConstruct(String con){
		String construct = "move = " + con + ";"+
				"if(move){"+
				"return true;"+
				"}else{"+
				//recursion
				"";
		return construct;
	}







/*	private String getMethodString(String aiType){
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
	}*/


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


						"public AIPlayer() {"+

						"}"+

						"public boolean calculateMove(){" +
							"Stone first = findForwardStone();"+
							"Stone random = findRandomStone();"+
							"Stone last = findLastStone();"+
							"boolean move;"+
							methodString+
						"}"+
						"\tpublic boolean jumpRandom(Stone stone){\n" +
					"\t\tPoint point = field.getAllowedJump(field.getPositionOfStone(stone));\n" +
					"\t\tboolean allowed = field.setPosition(stone, (int)point.getX(), (int)point.getY());\n" +
					"\t\treturn allowed;\n" +
					"\t}\n" +
					"\n" +
					"\tpublic boolean moveRandom(Stone stone){\n" +
					"\t\tPoint point = field.getAllowedMove(field.getPositionOfStone(stone));\n" +
					"\t\tboolean allowed = field.setPosition(stone,(int)point.getX(), (int)point.getY());\n" +
					"\t\treturn allowed;\n" +
					"\n" +
					"\t}\n" +
					"\n" +
					"\n" +
					"\tpublic boolean moveStraightForward(Stone stone){\n" +
					"\t\tPoint pos = field.getPositionOfStone(stone);\n" +
					"\t\tswitch(movement){\n" +
					"\t\t\tcase \"straight\" :\n" +
					"\t\t\t\treturn field.setPosition( stone,(int)pos.getX(), (int)pos.getY()+1);\n" +
					"\t\t\tcase \"free\":\n" +
					"\t\t\t\treturn field.setPosition( stone,(int)pos.getX(), (int)pos.getY()+1);\n" +
					"\t\t\tdefault :\n" +
					"\t\t\t\treturn false;\n" +
					"\t\t}\n" +
					"\t}\n" +
					"\n" +
					"\n" +
					"\tpublic Stone findRandomStone()\n" +
					"\t{\n" +
					"\t\treturn stone_list.get(new Random().nextInt(stone_list.size()));\n" +
					"\t}\n" +
					"\n" +
					"\n" +
					"\tpublic boolean jumpForward(Stone stone){\n" +
					"\t\tPoint pos = field.getPositionOfStone(stone);\n" +
					"\t\tswitch(movement){\n" +
					"\t\t\tcase \"straight\" :\n" +
					"\t\t\t\tStone check = field.checkForStone((int)pos.getX(),(int)pos.getY()+1);\n" +
					"\t\t\t\tif(check != null){\n" +
					"\t\t\t\t\t\treturn field.setPosition( stone,(int)pos.getX(), (int)pos.getY()+2);\n" +
					"\t\t\t\t}else{\n" +
					"\t\t\t\t\treturn false;\n" +
					"\t\t\t\t}\n" +
					"\t\t\tcase \"diagonal\":\n" +
					"\t\t\t\tStone check_dia = field.checkForStone((int)pos.getX()+1,(int)pos.getY()+1);\n" +
					"\t\t\t\tif(check_dia != null){\n" +
					"\t\t\t\t\treturn field.setPosition( stone,(int)pos.getX()+2, (int)pos.getY()+2);\n" +
					"\t\t\t\t}else{\n" +
					"\t\t\t\t\treturn false;\n" +
					"\t\t\t\t}\n" +
					"\t\t\tcase \"free\":\n" +
					"\t\t\t\tStone check_free = field.checkForStone((int)pos.getX(),(int)pos.getY()+1);\n" +
					"\t\t\t\tif(check_free != null){\n" +
					"\t\t\t\t\treturn field.setPosition( stone,(int)pos.getX(), (int)pos.getY()+2);\n" +
					"\t\t\t\t}else{\n" +
					"\t\t\t\t\treturn false;\n" +
					"\t\t\t\t}\n" +
					"\t\t\tdefault :\n" +
					"\t\t\t\tStone check_def = field.checkForStone((int)pos.getX(),(int)pos.getY()+1);\n" +
					"\t\t\t\tif(check_def != null){\n" +
					"\t\t\t\t\treturn field.setPosition( stone,(int)pos.getX(), (int)pos.getY()+2);\n" +
					"\t\t\t\t}else{\n" +
					"\t\t\t\t\treturn false;\n" +
					"\t\t\t\t}\n" +
					"\t\t}\n" +
					"\n" +
					"\t}\n" +
					"\n" +
					"\n" +
					"\tpublic boolean moveForward(Stone stone){\n" +
					"\t\tPoint pos = field.getPositionOfStone(stone);\n" +
					"\t\tswitch(movement){\n" +
					"\t\t\tcase \"straight\" :\n" +
					"\t\t\t\treturn field.setPosition( stone,(int)pos.getX(), (int)pos.getY()+1);\n" +
					"\t\t\tcase \"diagonal\":\n" +
					"\t\t\t\treturn field.setPosition( stone,(int)pos.getX()+1, (int)pos.getY()+1);\n" +
					"\t\t\tcase \"free\":\n" +
					"\t\t\t\treturn field.setPosition( stone,(int)pos.getX(), (int)pos.getY()+1);\n" +
					"\t\t\tdefault :\n" +
					"\t\t\t\treturn field.setPosition( stone,(int)pos.getX(), (int)pos.getY()+1);\n" +
					"\t\t}\n" +
					"\n" +
					"\t}\n" +
					"\n" +
					"\tpublic boolean moveSideways(Stone stone){\n" +
					"\t\tPoint pos = field.getPositionOfStone(stone);\n" +
					"\t\tswitch(movement){\n" +
					"\t\t\tcase \"straight\" :\n" +
					"\t\t\t\treturn field.setPosition( stone,(int)pos.getX()+1, (int)pos.getY());\n" +
					"\t\t\tcase \"free\":\n" +
					"\t\t\t\treturn field.setPosition( stone,(int)pos.getX(), (int)pos.getY()+1);\n" +
					"\t\t\tdefault :\n" +
					"\t\t\t\treturn false;\n" +
					"\t\t}\n" +
					"\n" +
					"\t}\n" +
					"\n" +
					"\n" +
					"\tpublic Stone findLastStone(){\n" +
					"\t\tStone ret = null;\n" +
					"\t\tfor(Stone stone : stone_list){\n" +
					"\t\t\tif(ret == null){\n" +
					"\t\t\t\tret = stone;\n" +
					"\t\t\t}\n" +
					"\t\t\tPoint dim_ret = field.getPositionOfStone(ret);\n" +
					"\t\t\tPoint dim = field.getPositionOfStone(stone);\n" +
					"\t\t\tif(dim_ret.getY() > dim.getY()){\n" +
					"\t\t\t\tret = stone;\n" +
					"\t\t\t}\n" +
					"\t\t}\n" +
					"\t\treturn ret;\n" +
					"\t}\n" +
					"\n" +
					"\tpublic Stone findForwardStone(){\n" +
					"\t\tStone ret = null;\n" +
					"\t\tint big_y = 0;\n" +
					"\t\tfor(Stone stone : stone_list){\n" +
					"\t\t\tPoint dim_stone = field.getPositionOfStone(stone);\n" +
					"\t\t\tint new_y = (int)dim_stone.getY();\n" +
					"\t\t\tif(new_y > big_y){\n" +
					"\t\t\t\tbig_y = new_y;\n" +
					"\t\t\t\tret = stone;\n" +
					"\t\t\t}\n" +
					"\t\t}\n" +
					"\t\treturn ret;\n" +
					"\t}\n" +
					"\n" +
					"\tpublic Stone findJumpyStone(){\n" +
					"\t\tStone ret = null;\n" +
					"\t\tfor(Stone stone : stone_list){\n" +
					"\t\t\tPoint stone_pos = field.getPositionOfStone(stone);\n" +
					"\t\t\tPoint jump = field.getAllowedJump(stone_pos);\n" +
					"\t\t\tif(jump != null){\n" +
					"\t\t\t\tret = stone;\n" +
					"\t\t\t\treturn ret;\n" +
					"\t\t\t}\n" +
					"\t\t}\n" +
					"\t\treturn null;\n" +
					"\t}"+

					""+



					"}";


			//Create the File
			System.out.println(aiType + " und methode: "+ methodString);
			//Edit the path to edit the working directory!!
	/*		File file = new File(System.getProperty("user.dir")+"/src/ai/AIPlayer2.java");
			// if file doesn't exists, then create it
			if (!file.exists()) file.createNewFile();
			//Write all in File
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(classString);
			bw.close(); //generate from .java the .class-file
			System.out.println("AIPlayer.java erstellt!");
*/
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
