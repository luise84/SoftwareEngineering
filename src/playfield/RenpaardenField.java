package playfield;

import game.Field;

import game.Stone;


/**
 * Created by Luise on 26.06.2016.
 */
public class RenpaardenField implements IPlayField {
	Stone[][] startFormation;
	int fieldCount;
	int stones = 0;

	public RenpaardenField(int fieldCount) {
		this.fieldCount = fieldCount;
		int root = (int)Math.sqrt(this.fieldCount);
		this.startFormation = new Stone[root][root];
	}

	@Override
	public Field createField() {
		int root = (int)Math.sqrt(this.fieldCount);
		for(int i = 0; i<root; i++){
			startFormation[i][0] = new Stone(false);
			startFormation[i][1] = new Stone(false);
			startFormation[root-1- i][root-1] = new Stone(true);
			startFormation[root-1- i][root-2] = new Stone(true);
			stones = stones+4;
		}
		Field renpaarden = new Field(this.startFormation,this.fieldCount, stones);
		return renpaarden;
	}
	public Field createReflectedField(){
		int root = (int)Math.sqrt(this.fieldCount);
		for(int i = 0; i<root; i++){
			startFormation[i][0] = new Stone(true);
			startFormation[i][1] = new Stone(true);
			startFormation[root-1- i][root-1] = new Stone(false);
			startFormation[root-1- i][root-2] = new Stone(false);

		}

		Field renpaardenReflected = new Field(this.startFormation,this.fieldCount, stones);
		return renpaardenReflected;
	}
}
