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

	public boolean calculateRandomMove(){
		Stone randomStone  = findRandomStone();
		Point point = field.getPositionOfStone(randomStone);

		Point move = field.getAllowedMove(point);
		if(move==null){
			return calculateRandomMove();
		}

		return field.setPosition(randomStone,(int)move.getX(),(int)move.getY());
	}
	public boolean calculateMove(){

		return true;
	}
	public Stone findRandomStone(){
		return stone_list.get(new Random().nextInt(stone_list.size()));
	}

	public Stone findForwardStone(){
		Stone ret = null;
		for(Stone stone : stone_list){
			if(ret == null){
				ret = stone;
			}
			Point dim_ret = field.getPositionOfStone(ret);
			Point dim = field.getPositionOfStone(stone);
			if(dim_ret.getY() < dim.getY()){
				ret = stone;
			}
		}
		return ret;
	}

	public Stone findJumpyStone(){
		Stone ret = null;
		for(Stone stone : stone_list){
			Point stone_pos = field.getPositionOfStone(stone);
			Point jump = field.getAllowedJump(stone_pos);
			if(jump != null){
				ret = stone;
				return ret;
			}
		}
		return null;
	}

}
