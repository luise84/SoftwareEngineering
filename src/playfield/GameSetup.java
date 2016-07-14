package playfield;

import game.Field;


/**
 * Created by Luise on 26.06.2016.
 */
public class GameSetup {

	public GameSetup() {

	}

	public static Field createChoosedField(String choosedfieldname, int fieldnumber){
		Field field = null;
		IPlayField playfield;
		int powFieldnumber = fieldnumber*fieldnumber;
		switch(choosedfieldname){
			case "classic":
				playfield = new ClassicField(powFieldnumber);
				field = playfield.createField();
				break;
			case "le zug":
				playfield = new LeZugField(powFieldnumber);
				field = playfield.createField();
				break;
			case "renpaarden":
				playfield = new RenpaardenField(powFieldnumber);
				field = playfield.createField();
				break;
		}
		return field;
	}
	public static Field createReflectedChoosedField(String choosedFieldType, int fieldnumber){
		Field field = null;
		//IPlayField playfield;
		int powFieldnumber = fieldnumber*fieldnumber;
		switch(choosedFieldType){
			case "classic":
				field = new ClassicField(powFieldnumber).createReflectedField();
				break;
			case "le zug":
				field = new LeZugField(powFieldnumber).createReflectedField();
				break;
			case "renpaarden":
				field = new RenpaardenField(powFieldnumber).createReflectedField();
				break;
		}
		return field;
	}
}
