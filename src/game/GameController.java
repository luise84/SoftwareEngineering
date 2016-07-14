package game;

import ai.AIPlayer;
import ai.AIPlayerGenerator;
import gameConfigurations.Attribute;
import gameConfigurations.AttributeGenerator;
import playfield.GameSetup;
import playfield.RenpaardenField;

import javax.swing.*;
import java.awt.event.ActionEvent;

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
	private static Attribute attribute;
	private static AIPlayerGenerator aiGenerator;

	public GameController() {
		this.gamesetup = new GameSetup();
		this.attributeGenerator = new AttributeGenerator();
		attributeGenerator.main();
		this.attribute = new Attribute();
		this.aiGenerator = new AIPlayerGenerator(attribute.ai);
		//aiGenerator.main();


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
		if(field.endGame(field.getPlayField(), endField.getPlayField())){
			frame.enableUserInput(false);
			frame.showEndGame();
		}
		field.printField();
		userInput();
	}

	private void startGame(){
		field = gamesetup.createChoosedField(attribute.playfield, attribute.fieldnumber);
		level = attribute.level;
		//field = new LeZugField(100).createField();
		endField = gamesetup.createReflectedChoosedField(attribute.playfield, attribute.fieldnumber);

		//new LeZugField(100).createReflectedField();
		//level = "straight";

		//new LeZugField(100).createReflectedField();
//		level = "straight";
		//level = "diagonal";
		field.setMovementType(level);
		aiplayer = new AIPlayer();
		aiplayer.setField(field);

		showGame();


	}
	private void setup(){}

	private void showGame(){
		frame = new View(field,this);

		JMenuBar menubar = new JMenuBar();
		JMenu menu = new JMenu("Game Settings");
		JMenuItem startItem = new JMenuItem(new AbstractAction("Start new game") {
			@Override
			public void actionPerformed(ActionEvent e) {
				Field newfield = new RenpaardenField(100).createField();
				//frame.resetBoard(newfield);
				//frame.updateView();
			}
		});
		menu.add(startItem);
		menubar.add(menu);

		frame.setJMenuBar(menubar);

		frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE );
		frame.pack();
		frame.setResizable(true);
		frame.setLocationRelativeTo( null );
		frame.setVisible(true);

		frame.enableUserInput(true);
	}
	public static void main(String args[]){
		GameController game = new GameController();
		game.startGame();
		//userMove();

	}
}


