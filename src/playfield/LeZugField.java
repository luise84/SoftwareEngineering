package playfield;

import game.Field;

import game.Stone;


/**
 * Created by Luise on 26.06.2016.
 */
public class LeZugField implements IPlayField {

	Stone[][] startFormation;
	int stones = 0;
	int fieldCount;

	public LeZugField(int fieldcount) {
		this.fieldCount = fieldcount;
		int root = (int)Math.sqrt(this.fieldCount);
		this.startFormation = new Stone[root][root];
	}

	@Override
	public Field createField() {
		int root = (int)Math.sqrt(this.fieldCount);
		for(int i=0; i<startFormation.length; i++){
			for(int j=0; j<startFormation[i].length; j++){

				startFormation[i][0] = new Stone(false);//oberste zeile
				startFormation[root-2][1] = new Stone(false);
				startFormation[root-7][1] = new Stone(false);

				startFormation[root-1- i][root-1] = new Stone(true);//unterste zeile
				startFormation[root-2][root-2] = new Stone(true);
				startFormation[root-7][root-2] = new Stone(true);
				stones = stones+6;

			}
		}


		Field lezug = new Field(startFormation,fieldCount, stones);

		return lezug;
	}

	public Field createReflectedField(){
		int root = (int)Math.sqrt(this.fieldCount);
		for(int i=0; i<startFormation.length; i++){
			for(int j=0; j<startFormation[i].length; j++){
				startFormation[i][0] = new Stone(true);//oberste zeile
				startFormation[root-2][1] = new Stone(true);
				startFormation[root-7][1] = new Stone(true);

				startFormation[root-1- i][root-1] = new Stone(false);//unterste zeile
				startFormation[root-2][root-2] = new Stone(false);
				startFormation[root-7][root-2] = new Stone(false);

			}
		}


		Field lezugReflected = new Field(startFormation,289, stones);

		return lezugReflected;
	}
}
