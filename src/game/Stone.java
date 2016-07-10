package game;

import java.awt.*;

/**
 * Created by Luise on 23.06.2016.
 */
public class Stone {

	private boolean affiliation;
	private String color;

	//movementType: true = jump, false = move
	public boolean movementType;
	//moveNumber = 0 -> jump, 1 = first move done, 2 = second move done
	public int moveNumber;
	public void setMovementType(boolean nextState) {
		movementType = nextState;

	}

	public void setMoveNumber(){
		if(moveNumber == 0){
			moveNumber++;
			//from true to false
			setMovementType(false);
			return;
		}
		else if (moveNumber == 1){
			moveNumber++;
			return;
		}
		else if(moveNumber == 2){
			moveNumber = 0;
			//from false to true
			setMovementType(true);
			return;
		}
	}

	public boolean getAffiliation(){
		return this.affiliation;
	}


	public Stone(boolean affiliation) {
		this.movementType = true;
		this.affiliation = affiliation;
		this.moveNumber = 0;
	}

}
