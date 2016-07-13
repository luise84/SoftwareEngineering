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
	String movement;
	public AIPlayer(){

	}

	public void setField(Field field){
		this.field = field;
		this.stone_list = field.getStonesByAffiliation(false);
		this.movement = field.getMovementTypeLevel();
	}
	public boolean calculateMove(){
		return calculateHardMove();
	}

	public boolean calculateEasyMove(){
		Stone randomStone  = findRandomStone();
		Point point = field.getPositionOfStone(randomStone);

		boolean move = moveForward(randomStone);
		if(move){
			return true;
		}else{
			return calculateEasyMove();
		}
	}

	public boolean calculateMediumMove(){
		Stone randomStone  = findRandomStone();
		Point point = field.getPositionOfStone(randomStone);
		boolean move = jumpForward(randomStone);
		if(move){
			return true;
		}else{
			Point jumper = field.getAllowedJump(point);
			boolean jumped = field.setPosition(randomStone,(int)point.getX(),(int)point.getY());
			if(jumped){
				return true;
			}else{
				Stone lastStone = findLastStone();
				boolean move_last = moveForward(lastStone);
				if(move_last){
					return true;
				}else{
					boolean move_sideways = moveSideways(lastStone);
					if(move_sideways){
						return true;
					}else{
						boolean move_forward =moveStraightForward(randomStone);
						if(move_forward){
							return move_forward;
						}else{
							return calculateMediumMove();
						}

					}
				}
			}
		}
	}

	public boolean calculateHardMove(){
		Stone first = findForwardStone();
		System.out.println("hard Mode");
		if(jumpForward(first)){
			return true;
		}else{
			Stone last = findLastStone();
			if(jumpForward(last)){
				return true;
			}else{
				if(moveForward(first)){
					return true;
				}else{
					if(moveSideways(first)){
						return true;
					}else{
						Stone random = findRandomStone();
						if(moveForward(random)){
							return true;
						}else{
							return calculateHardMove();
						}
					}
				}
			}
		}
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

	public boolean moveSideways(Stone stone){
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
