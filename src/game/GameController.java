package game;

import ai.AIPlayer;
import gameConfigurations.AttributeGenerator;
import playfield.GameSetup;

import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;


/**
 * Created by Luise on 23.06.2016.
 */
public class GameController {
	private static Field field;
	private static Field endField;
	private static int stones;
	private static String level;
	private static AIPlayer aiplayer;
	private static GameSetup gamesetup;
	private static View frame;
	private static AttributeGenerator attributeGenerator;

	public GameController() {
		this.gamesetup = new GameSetup();
		this.attributeGenerator = new AttributeGenerator();
		attributeGenerator.main();

	}

	public boolean setMove(Stone stone, int x, int y){
		if(field.setPosition(stone,x,x)) return true;
		else return false;
	}
	private void waitForPlayerInput(){
		computerMove();
	}

	private void userInput(){
		frame.enableUserInput(true);
	}

	private void computerMove(){
		aiplayer.calculateMove();
		waitForPlayerInput();
	}

	public void notifyOfInput(){
		System.out.println(field.endGame(field.getPlayField(), endField.getPlayField()));
		frame.enableUserInput(false);
		aiplayer.calculateMove();
		frame.updateView();
		//frame.showEndGame();
		if(field.endGame(field.getPlayField(), endField.getPlayField())){
			frame.enableUserInput(false);
			frame.showEndGame();
		}
		userInput();
//		Stone[][] f =field.getPlayField();
//		for(int i = 0 ;i< f.length; i++){
//			for(int j = 0 ;j < f[i].length; j++){
//				if(f[i][j] instanceof  Stone){
//					System.out.print(" X " );
//				}else{
//					System.out.print(" O " );
//
//				}
//
//			}
//			System.out.println("_____");
//		}
	}

	private void startGame(){
		field = gamesetup.chooseField();
		level = gamesetup.chooseLevel();
		//field = new LeZugField(100).createField();
		endField = gamesetup.createReflectedChoosedField(gamesetup.choosedFieldType);

				//new LeZugField(100).createReflectedField();
		//level = "straight";
		field.setMovementType(level);
		aiplayer = new AIPlayer();
		aiplayer.setField(field);

		frame = new View(field,this);
		frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE );
		frame.pack();
		frame.setResizable(true);
		frame.setLocationRelativeTo( null );
		frame.setVisible(true);

		frame.enableUserInput(true);


	}
	private void setup(){}

	public static void main(String args[]){
		GameController game = new GameController();
		game.startGame();
		//userMove();

	}
}


