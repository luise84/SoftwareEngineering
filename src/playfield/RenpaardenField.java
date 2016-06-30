package playfield;

import game.Field;

import game.Stone;


/**
 * Created by Luise on 26.06.2016.
 */
public class RenpaardenField implements IPlayField {
	Stone[][] startFormation;

	public RenpaardenField() {
		this.startFormation = new Stone[9][9];
	}

	@Override
	public Field createField() {
		for(int i=0; i<startFormation.length; i++){
			for(int j=0; j<startFormation[i].length; j++){
				if(i<2)
					//Stones of computerplayer
					startFormation[i][j] = new Stone(false);
				else if(i>5)
					//stones of user
					startFormation[i][j] = new Stone(true);
			}
		}

		Field renpaarden = new Field(this.startFormation);
		return renpaarden;
	}
}
