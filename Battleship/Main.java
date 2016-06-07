package Uebung3.Uebung3_3.Battleship;

public class Main {

    public static void main(String[] args) {

        Controller controller = new Controller();
        Game game = new Game(Controller.createPlayField(), Controller.createComputerMoves());
        game.play();
    }
}
