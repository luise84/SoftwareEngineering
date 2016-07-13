package playfield;

import game.Field;


import java.util.Scanner;


/**
 * Created by Luise on 26.06.2016.
 */
public class GameSetup {
	private static String[] fieldtypes = {"classic", "le zug","renpaarden"};
	private static String[] leveltypes = {"straight","free","diagonal"};
	public static String choosedFieldType = "classic";


	public GameSetup() {

	}

	public static Field chooseField(){
		Field field = null;
		IPlayField playfield;
		System.out.println("Gib dein gewünschtes Spielfeld ein! Wähle Classic, Le Zug oder Renpaarden!");
		String fieldname = readUserInput(fieldtypes);
		if(fieldname != null){
			field = createChoosedField(fieldname);
			choosedFieldType = fieldname;
			return field;
		}
		else chooseField();
		return null;


	}
	public static String chooseLevel(){
		System.out.println("Gib dein Level ein!");
		System.out.println("Gib 'Straight' ein: nur waagerechte und senkrechte Bewegungen nach vorne und hinten erlaubt. ");
		System.out.println("Gib 'Free' ein: alle Bewegungsrichtungen nach vorne und hinten erlaubt. ");
		System.out.println("Gib 'Diagonal' ein: nur diagonale Bewegungsrichtungen nach vorne erlaubt.");
		String level = readUserInput(leveltypes);
		if(!level.equals(null)){
			return level;
		} else{
			chooseLevel();
		}
		return null;


	}

	private static String readUserInput(String[] options){
		Scanner in = new Scanner(System.in);
		String userAnswer = in.nextLine();
		userAnswer = userAnswer.toLowerCase();


		for(int i=0; i<options.length; i++){
			if(userAnswer.equals(options[i])) return options[i];
		}
		System.out.println("Falsche Eingabe!");
		return null;
	}


	/*public static void main(String[] args){
		chooseField();
		chooseLevel();


	}*/

	public static Field createChoosedField(String choosedfieldname){
		Field field = null;
		IPlayField playfield;
		switch(choosedfieldname){
			case "classic":
				playfield = new ClassicField(100);
				field = playfield.createField();
				break;
			case "le zug":
				playfield = new LeZugField(100);
				field = playfield.createField();
				break;
			case "renpaarden":
				playfield = new RenpaardenField(100);
				field = playfield.createField();
				break;
		}
		return field;
	}
	public static Field createReflectedChoosedField(String choosedFieldType){
		Field field = null;
		//IPlayField playfield;
		switch(choosedFieldType){
			case "classic":
				field = new ClassicField(100).createReflectedField();
				break;
			case "le zug":
				field = new LeZugField(100).createReflectedField();
				break;
			case "renpaarden":
				field = new RenpaardenField(100).createReflectedField();
				break;
		}
		return field;
	}
}
