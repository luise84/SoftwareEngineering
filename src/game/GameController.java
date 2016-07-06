package game;

import ai.AIPlayer;
import playfield.ClassicField;
import playfield.GameSetup;
import playfield.RenpaardenField;

import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;


/**
 * Created by Luise on 23.06.2016.
 */
public class GameController {
	private static Field field;
	private static String level;
	private AIPlayer aiplayer;
	private static GameSetup gamesetup;

	public GameController() {
		this.gamesetup = new GameSetup();
		aiplayer = new AIPlayer();
	}

	public boolean setMove(Stone stone, int x, int y){
		if(field.setPosition(stone,x,x)) return true;
		else return false;
	}
	private void waitForPlayerInput(){

		computerMove();
	}



	private void computerMove(){
		aiplayer.calculateMove();
		waitForPlayerInput();
	}


	private static void startGame(){
		//field = gamesetup.chooseField();
		//level = gamesetup.chooseLevel();
		field = new RenpaardenField(36).createField();
		level = "free";
		View frame = new View(field);
		frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE );
		frame.pack();
		frame.setResizable(true);
		frame.setLocationRelativeTo( null );
		frame.setVisible(true);

	}
	private void setup(){}

	public static void main(String args[]){
		startGame();
		//userMove();

	}
}


