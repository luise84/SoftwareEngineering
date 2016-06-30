package playfield;

import game.Field;

import game.Stone;

/**
 * Created by Luise on 26.06.2016.
 */
public class ClassicField implements IPlayField {
	Stone[][] startFormation;

	public ClassicField() {
		this.startFormation = new Stone[10][10];
	}



	@Override
	public Field createField() {
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
		}

		Field classic = new Field(startFormation);
		return classic;
	}
}
