package playfield;

import game.Field;

import game.Stone;


/**
 * Created by Luise on 26.06.2016.
 */
public class LeZugField implements IPlayField {

	Stone[][] startFormation;

	public LeZugField() {
		this.startFormation =  new Stone[17][17];
	}

	@Override
	public Field createField() {
		for(int i=0; i<startFormation.length; i++){
			for(int j=0; j<startFormation[i].length; j++){
				//Stones of computerplayer
				if(i==0)
					startFormation[i][j] = new Stone(false);
				else if(i==1){
					if(j == 1 || j==5 || j==10)
						startFormation[i][j] = new Stone(false);
				}

				//stones of user
				else if(i==15) {
					if(j== 4 || j==8 || j==12)
						startFormation[i][j] = new Stone(true);
				}
				else if(i == 16)
					//stones of user
					startFormation[i][j] = new Stone(true);
			}
		}

		Field lezug = new Field(startFormation);
		return lezug;
	}
}
