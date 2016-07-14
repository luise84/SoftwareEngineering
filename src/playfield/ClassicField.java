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
				startFormation[i][j] = new Stone(false);
				startFormation[root-1-i][root-1-j] = new Stone(true);
				stones = stones+2;
			}


		}

		Field classic = new Field(startFormation,this.fieldCount,stones);
		return classic;
	}

	public Field createReflectedField(){
		int root = (int) Math.sqrt(this.fieldCount);
		int linecount = root / 2;
		for(int i = 0; i<root / 2 ; i++) {
			for(int j = 0; j + i < linecount; j++){
				//algorithm to get the half pyramid formation for stones
				startFormation[i][j] = new Stone(true);
				startFormation[root-1-i][root-1-j] = new Stone(false);
			}


		}
		Field classicReflected = new Field(startFormation,this.fieldCount,stones);
		return classicReflected;

	}
}
