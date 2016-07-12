package playfield;

import game.Field;

import game.Stone;

/**
 * Created by Luise on 26.06.2016.
 */
public class ClassicField implements IPlayField {
	Stone[][] startFormation;
	int fieldCount;
	int stones = 0;

	public ClassicField(int fieldCount) {
		this.fieldCount = fieldCount;
		int root = (int)Math.sqrt(this.fieldCount);
		this.startFormation = new Stone[root][root];

	}

	@Override
	public Field createField() {
		int root = (int) Math.sqrt(this.fieldCount);
		int linecount = root / 2;
		for(int i = 0; i<root / 2 ; i++) {
			for(int j = 0; j + i < linecount; j++){
				//algorithm to get the half pyramid formation for stones
				startFormation[i][j] = new Stone(true);
				startFormation[root-1-i][root-1-j] = new Stone(false);
				stones = stones+2;
			}


		}
		/*
		for (int i = 0; i < startFormation.length; i++) {
			for (int j = 0; j < startFormation[i].length; j++) {
				//Stones of computerplayer
				if (i == 0 && j < 5)
					startFormation[i][j] = new Stone(false);
				else if (i == 1 && j < 4)
					startFormation[i][j] = new Stone(false);
				else if (i == 2 && j < 3)
					startFormation[i][j] = new Stone(false);
				else if (i == 3 && j < 2)
					startFormation[i][j] = new Stone(false);
				else if (i == 4 && j < 1)
					startFormation[i][j] = new Stone(false);

					//stones of user
				else if (i == 5 && j > 8)
					startFormation[i][j] = new Stone(false);
				else if (i == 6 && j > 7)
					startFormation[i][j] = new Stone(false);
				else if (i == 7 && j > 6)
					startFormation[i][j] = new Stone(false);
				else if (i == 8 && j > 5)
					startFormation[i][j] = new Stone(false);
				else if (i == 9 && j > 4)
					startFormation[i][j] = new Stone(false);
			}
		}*/

		Field classic = new Field(startFormation,this.fieldCount,stones);
		return classic;
	}

	public Field createReflectedField(){
		int root = (int) Math.sqrt(this.fieldCount);
		int linecount = root / 2;
		for(int i = 0; i<root / 2 ; i++) {
			for(int j = 0; j + i < linecount; j++){
				//algorithm to get the half pyramid formation for stones
				startFormation[i][j] = new Stone(false);
				startFormation[root-1-i][root-1-j] = new Stone(true);
			}


		}
		Field classicReflected = new Field(startFormation,this.fieldCount,stones);
		return classicReflected;

	}
}
