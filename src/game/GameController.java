package game;

import ai.AIPlayer;
import playfield.GameSetup;



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
		field = gamesetup.chooseField();
		level = gamesetup.chooseLevel();


	}
	private void setup(){}

	public static void main(String args[]){
		startGame();
		//userMove();

	}
}


