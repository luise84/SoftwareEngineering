package ai;

import game.Field;
import game.Stone;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Luise on 26.06.2016.
 */
public class AIPlayer {
	Field field;
	ArrayList<Stone> stone_list;
	public AIPlayer(){

	}

	public void setField(Field field){
		this.field = field;
		this.stone_list = field.getStonesByAffiliation(false);
	}

	public boolean calculateMove(){

		//just move a random stone for now
		Stone randomStone  = stone_list.get(new Random().nextInt(stone_list.size()));
		Point point = field.getPositionOfStone(randomStone);

		Point move = field.getAllowedMove(point);
		System.out.println("point " + move);
		if(move==null){
			return calculateMove();
		}

		return field.setPosition(randomStone,(int)move.getX(),(int)move.getY());
	}


}
