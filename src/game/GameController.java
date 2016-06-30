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
	private GameSetup gamesetup;

	public GameController() {
		this.gamesetup = new GameSetup();
		aiplayer = new AIPlayer();
	}

	/*private boolean setMove(Stone stone, int x, int y){
		if(field.setPosition(stone,x,x)) return true;
		else return false;
	}*/
	private void waitForPlayerInput(){

	}

	private void userMove(){

	}

	private void computerMove(){
		aiplayer.calculateMove();
	}





	private void startGame(){
		field = gamesetup.chooseField();
		level = gamesetup.chooseLevel();


	}
	private void setup(){}

	public void main(String args[]){
		startGame();
		userMove();

	}
}


