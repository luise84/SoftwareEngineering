package game;

/**
 * Created by Luise on 23.06.2016.
 */
public class Stone {

	private boolean affiliation;
	private String color;
	//movementType: true = jump, false = move
	public boolean movementType;
	//moveNumber = 0 -> jump, 1 = first move done, 2 = second move done
	public int moveNumber = 0;
	public void setMovementType() {
		if(movementType) movementType = false;
		else movementType = true;
	}

	public void setMoveNumber(){
		if(moveNumber == 0 || moveNumber == 1){
			moveNumber++;
			return;
		}
		else if(moveNumber == 2){
			moveNumber = 0;
			return;
		}
	}




	public Stone(boolean affiliation) {
		this.movementType = true;
		this.affiliation = affiliation;
	}

}
