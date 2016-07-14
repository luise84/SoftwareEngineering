package ai;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Luise on 26.06.2016.
 */
public class AIPlayerGenerator extends AiMovesBaseListener{
	private static String aiType = "hard";
	private String stoneParam;
	private String methodName;
	private static ArrayList<String> methods = new ArrayList<>();
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

		}
	}


	public static String createConstruct(){
		String method = "";
		for(String element: methods){
			method+=getConstruct(element);
		}
		//recursionmove
		method += "return calculateMove();}";
		for(int i = 0; i<  methods.size(); i++ ){
			method += "}";

		}
		return method;
	}

	public static String getConstruct(String con){
		String construct =
				"move = " + con + ";"+
				"if(move){"+
					"return true;"+
				"}else{"+
				//recursion
				"";
		return construct;
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
					"import game.Field;\n" +
					"import game.Stone;\n" +
					"\n" +
					"import java.awt.*;\n" +
					"import java.util.ArrayList;\n" +
					"import java.util.Random;"+

					"public class AIPlayer {"+
					"\tField field;\n" +
					"\tArrayList<Stone> stone_list;\n" +
					"\tString movement;\n" +

					"public AIPlayer() {"+

					"}"+ "public void setField(Field field){\n" +
					"\t\tthis.field = field;\n" +
					"\t\tthis.stone_list = field.getStonesByAffiliation(false);\n" +
					"\t\tthis.movement = field.getMovementTypeLevel();\n" +
					"\t}"+

					"public boolean calculateMove(){" +
					"Stone first = findForwardStone();"+
					"Stone random = findRandomStone();"+
					"Stone last = findLastStone();"+
					"boolean move;"+
					createConstruct()+
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
					"\tpublic boolean moveSideWays(Stone stone){\n" +
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
			//Edit the path to edit the working directory!!
			File file = new File(System.getProperty("user.dir")+"/src/ai/AIPlayer.java");
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
