package ai; import java.awt.*;import game.Field;
import game.Stone;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;public class AIPlayer {	Field field;
	ArrayList<Stone> stone_list;
	String movement;
public AIPlayer() {}public void setField(Field field){
		this.field = field;
		this.stone_list = field.getStonesByAffiliation(false);
		this.movement = field.getMovementTypeLevel();
	}public boolean calculateMove(){Stone first = findForwardStone();Stone random = findRandomStone();Stone last = findLastStone();boolean move;move = moveForward(first);if(move){return true;}else{return calculateMove();}}	public boolean jumpRandom(Stone stone){
		Point point = field.getAllowedJump(field.getPositionOfStone(stone));
		boolean allowed = field.setPosition(stone, (int)point.getX(), (int)point.getY());
		return allowed;
	}

	public boolean moveRandom(Stone stone){
		Point point = field.getAllowedMove(field.getPositionOfStone(stone));
		boolean allowed = field.setPosition(stone,(int)point.getX(), (int)point.getY());
		return allowed;

	}


	public boolean moveStraightForward(Stone stone){
		Point pos = field.getPositionOfStone(stone);
		switch(movement){
			case "straight" :
				return field.setPosition( stone,(int)pos.getX(), (int)pos.getY()+1);
			case "free":
				return field.setPosition( stone,(int)pos.getX(), (int)pos.getY()+1);
			default :
				return false;
		}
	}


	public Stone findRandomStone()
	{
		return stone_list.get(new Random().nextInt(stone_list.size()));
	}


	public boolean jumpForward(Stone stone){
		Point pos = field.getPositionOfStone(stone);
		switch(movement){
			case "straight" :
				Stone check = field.checkForStone((int)pos.getX(),(int)pos.getY()+1);
				if(check != null){
						return field.setPosition( stone,(int)pos.getX(), (int)pos.getY()+2);
				}else{
					return false;
				}
			case "diagonal":
				Stone check_dia = field.checkForStone((int)pos.getX()+1,(int)pos.getY()+1);
				if(check_dia != null){
					return field.setPosition( stone,(int)pos.getX()+2, (int)pos.getY()+2);
				}else{
					return false;
				}
			case "free":
				Stone check_free = field.checkForStone((int)pos.getX(),(int)pos.getY()+1);
				if(check_free != null){
					return field.setPosition( stone,(int)pos.getX(), (int)pos.getY()+2);
				}else{
					return false;
				}
			default :
				Stone check_def = field.checkForStone((int)pos.getX(),(int)pos.getY()+1);
				if(check_def != null){
					return field.setPosition( stone,(int)pos.getX(), (int)pos.getY()+2);
				}else{
					return false;
				}
		}

	}


	public boolean moveForward(Stone stone){
		Point pos = field.getPositionOfStone(stone);
		switch(movement){
			case "straight" :
				return field.setPosition( stone,(int)pos.getX(), (int)pos.getY()+1);
			case "diagonal":
				return field.setPosition( stone,(int)pos.getX()+1, (int)pos.getY()+1);
			case "free":
				return field.setPosition( stone,(int)pos.getX(), (int)pos.getY()+1);
			default :
				return field.setPosition( stone,(int)pos.getX(), (int)pos.getY()+1);
		}

	}

	public boolean moveSideWays(Stone stone){
		Point pos = field.getPositionOfStone(stone);
		switch(movement){
			case "straight" :
				return field.setPosition( stone,(int)pos.getX()+1, (int)pos.getY());
			case "free":
				return field.setPosition( stone,(int)pos.getX(), (int)pos.getY()+1);
			default :
				return false;
		}

	}


	public Stone findLastStone(){
		Stone ret = null;
		for(Stone stone : stone_list){
			if(ret == null){
				ret = stone;
			}
			Point dim_ret = field.getPositionOfStone(ret);
			Point dim = field.getPositionOfStone(stone);
			if(dim_ret.getY() > dim.getY()){
				ret = stone;
			}
		}
		return ret;
	}

	public Stone findForwardStone(){
		Stone ret = null;
		int big_y = 0;
		for(Stone stone : stone_list){
			Point dim_stone = field.getPositionOfStone(stone);
			int new_y = (int)dim_stone.getY();
			if(new_y > big_y){
				big_y = new_y;
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
	}}