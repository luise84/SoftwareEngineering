package Uebung3.Uebung3_3.ComputerMoves;


import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;

/**
 * Created by Luise on 09.05.2016.
 */
public class ComputerGenerator extends MoveBaseListener{
    public static final int ROWLENGTH = 7;
    public static final int ROWS = 7;
    public static String moves = "";

    //public static boolean[][] field = new boolean[ROWS][ROWLENGTH];

    /*@Override
    public void exitRow(MoveParser.RowContext ctx){
        if(ctx.LineBreak().getSymbol().getCharPositionInLine() == ROWLENGTH*3){
            if(ctx.getStart().getLine() != ROWS) moves +=
        }

    }*/
    /*@Override public void enterRow(MoveParser.RowContext ctx){
        //Add to each row
    }*/
   /*Processing the entries a1->00, a2->01*/
    @Override public void enterMove(MoveParser.MoveContext ctx){
        String separator = ctx.Separator().getText().replace(';',',');
        String row = ctx.SimpleRow().getText().toLowerCase();
        String position = ctx.SimplePosition().getText();
        int parsedPosition = Integer.parseInt(position)-1;
        moves += "\""+row+parsedPosition+"\"";
        if(ctx.getStart().getLine() < ROWS && ctx.getStart().getCharPositionInLine() <= ROWLENGTH*2+4)
                moves += separator;
        if(ctx.getStart().getLine()== ROWS && ctx.getStart().getCharPositionInLine() < ROWLENGTH*2+4)
            moves += separator;
        //System.out.println(moves);

    }

   public static void main(String[] args){

       try {
           //Create the String of the File
           /*Edit the path to edit the working directory!!*/
           String staticStart = "package Uebung3.Uebung3_3.Battleship;" +
                   "public class GeneratedMoves {"
                   + "public static String[] createMoves(){ String[] moves = new String[]";
           moves = "{"; //block begins


           //Parse and convert the level.txt
           // Get CSV lexer
           CharStream in = new org.antlr.v4.runtime.ANTLRInputStream(new FileReader(System.getProperty("user.dir")+"/src/Uebung3/Uebung3_3/ComputerMoves/computerMoves.txt"));
           MoveLexer lexer = new  MoveLexer(in);
           // Get a list of matched tokens
           CommonTokenStream tokens = new CommonTokenStream(lexer);
           // Pass the tokens to the parser
           MoveParser parser = new MoveParser(tokens);
           // Specify our entry point
           /*Dont call parser.<rule>() twice -> mismatched input '<EOF>' expecting FIELD_NAME" */
           MoveParser.FileContext fileContext = parser.file();
           // Walk it and attach our listener
           ParseTreeWalker walker = new ParseTreeWalker();
           MoveBaseListener listener = new ComputerGenerator();
           walker.walk(listener, fileContext);


           //Add last lines in File
           moves += "};"; //block ends
           String staticEnd ="return moves;}}";

           //Create the File
           /*Edit the path to edit the working directory!!*/
           File file = new File(System.getProperty("user.dir")+"/src/Uebung3/Uebung3_3/Battleship/GeneratedMoves.java");
           // if file doesn't exists, then create it
           if (!file.exists()) file.createNewFile();
           //Write all in File
           FileWriter fw = new FileWriter(file.getAbsoluteFile());
           BufferedWriter bw = new BufferedWriter(fw);
           bw.write(staticStart + moves + staticEnd);
           bw.close(); //generate from .java the .class-file
           System.out.println("GeneratedMoves.java erstellt!");
       } catch (IOException e) {
           e.printStackTrace();
       }






   }
}
