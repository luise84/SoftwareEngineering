package game;

import ai.AIPlayer;
import playfield.GameSetup;



/**
 * Created by Luise on 23.06.2016.
 */
public class GameController {
	private Field field;
	private String level;
	private AIPlayer aiplayer;
	private static GameSetup gamesetup;

	public GameController() {
		this.gamesetup = new GameSetup();
		aiplayer = new AIPlayer();
	}

	private boolean setMove(Stone stone, int x, int y){
		return false;
	}
	private void waitForPlayerInput(){

	}



	private static void startGame(){
		gamesetup.main();

	}
	private void setup(){}

	public static void main(String args[]){
		startGame();

	}
}


