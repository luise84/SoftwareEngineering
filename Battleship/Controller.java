package Uebung3.Uebung3_3.Battleship;

/**
 * Created by Luise on 28.04.2016.
 */
public class Controller {

    private Game game;

    public Controller() {
        game = new Game(createPlayField(), createComputerMoves());

    }

    public static boolean[][] createPlayField(){
        boolean[][] field = GeneratedLevel.createPlayField();
        return field;
    }
    public static String[] createComputerMoves(){
        String[] moves = GeneratedMoves.createMoves();
        return moves;
    }


}
