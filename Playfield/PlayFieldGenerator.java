package Uebung3.Uebung3_3.Playfield;

import Uebung3.Uebung3_2.BattleshipBaseListener;
import Uebung3.Uebung3_2.BattleshipLexer;
import Uebung3.Uebung3_2.BattleshipParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;

/**
 * Created by Luise on 09.05.2016.
 */
public class PlayFieldGenerator extends BattleshipBaseListener{
    public static final int ROWLENGTH = 7;
    public static final int ROWS = 7;
    private final String WATER = "w";
    private final String SHIP = "s";
    public static String playField = "";
    //public static boolean[][] field = new boolean[ROWS][ROWLENGTH];

    /*Diese Funktion verarbeitet die ‚w’	bzw. ‚s’	Einträge*/
    @Override public void enterValue(BattleshipParser.ValueContext ctx) {
        String value = ctx.SimpleValue().getText().toLowerCase();
        int line = ctx.getStart().getLine(); //Line starts at 1 and goes to 7
        int position = ctx.getStart().getCharPositionInLine(); //positions: 0,2,4,6,8,10,12

       //fill the FieldArray
        if (value.equals(SHIP))  playField+="true";
        else if(value.equals(WATER))  playField+= "false";
        //Add to all elements in row "," except last element
        if(position != (ROWLENGTH*2-2)) playField += ",";



    }
    @Override public void enterRow(BattleshipParser.RowContext ctx){
        //Add to each row start bracket
        if(ctx.getStart().getCharPositionInLine()==0) playField+="{";
    }
    /*Die Funktion bestimmt das Zeilenende sowie evt. Zeilenlängenprüfungen*/
    @Override public void exitRow(BattleshipParser.RowContext ctx) {
        //if lines end, adds end bracket
        if(ctx.LineBreak().getSymbol().getCharPositionInLine() == ROWLENGTH*2-1) playField += "}";
        //add to each line-block a comma, except last line
        if(ctx.getStart().getLine() != ROWS)  playField += ",";
    }


   public static void main(String[] args){

       try {
           //Create the String of the File
           /*Edit the path to edit the working directory!!*/
           String staticStart = "package Uebung3.Uebung3_3.Battleship;" +
                   "public class GeneratedLevel {"
                   + "public static boolean[][] createPlayField(){ boolean[][] field = new boolean[][]";
           playField = "{"; //block begins


           //Parse and convert the level.txt
           // Get CSV lexer
           CharStream in = new org.antlr.v4.runtime.ANTLRInputStream(new FileReader(System.getProperty("user.dir")+"/src/Uebung3/Uebung3_3/Playfield/level.txt"));
           BattleshipLexer lexer = new  BattleshipLexer(in);
           // Get a list of matched tokens
           CommonTokenStream tokens = new CommonTokenStream(lexer);
           // Pass the tokens to the parser
           BattleshipParser parser = new BattleshipParser(tokens);
           // Specify our entry point
           /*Dont call parser.<rule>() twice -> mismatched input '<EOF>' expecting FIELD_NAME" */
           BattleshipParser.FileContext fileContext = parser.file();
           // Walk it and attach our listener
           ParseTreeWalker walker = new ParseTreeWalker();
           BattleshipBaseListener listener = new PlayFieldGenerator();
           walker.walk(listener, fileContext);


           //Add last lines in File
           playField += "};"; //block ends
           String staticEnd ="return field;}}";

           //Create the File
           /*Edit the path to edit the working directory!!*/
           File file = new File(System.getProperty("user.dir")+"/src/Uebung3/Uebung3_3/Battleship/GeneratedLevel.java");
           // if file doesn't exists, then create it
           if (!file.exists()) file.createNewFile();
           //Write all in File
           FileWriter fw = new FileWriter(file.getAbsoluteFile());
           BufferedWriter bw = new BufferedWriter(fw);
           bw.write(staticStart + playField + staticEnd);
           bw.close(); //generate from .java the .class-file*/
           System.out.println("GeneratedLevel.java erstellt!");
       } catch (IOException e) {
           e.printStackTrace();
       }






   }
}
