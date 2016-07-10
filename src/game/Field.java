package game;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Thundersama on 23.06.2016.
 */
public class Field{
    private Stone[][] field;
    private int field_count = 100;
    private String movement_type;
    public Field(Stone[][] fieldarray, int field_count){
        this.field = fieldarray;
        this.field_count = field_count;


    }
    public void setMovementType(String movement_type){
        this.movement_type = movement_type;
    }
    public String  getMovementType(){
        return this.movement_type;
    }
    public boolean setPosition(Stone stone, int x, int y){
        int oldx = 0;
        int oldy = 0;
        for(int i = 0 ; i<field.length; i++){
            for(int j = 0; j<field[i].length; j++){
                if(field[i][j] == stone){
                    oldx = i;
                    oldy =j;
                }
            }
        }
        if(field[x][y] == null){
            field[x][y]= stone;
            field[oldx][oldy] = null;

            return true;
        }

        else{
            return false;
        }
    }
    public int getFieldCount(){
        return this.field_count;
    }

    public Point getAllowedMove(Point point){
        Point check;
        switch(movement_type){
            case "diagonal" :
                if(point.x == 0 || point.y == 0) return null;
                check = new Point(point.x +1 , point.y +1 );
                if(field[check.x][check.y] == null){
                    return check;
                }
                check = new Point(point.x -1, point.y -1 );
                if(field[check.x][check.y] == null){
                    return check;
                }
                check = new Point(point.x +1 , point.y -1);
                if(field[check.x][check.y] == null){
                    return check;
                }
                check = new Point(point.x - 1, point.y +1 );
                if(field[check.x][check.y] == null){
                    return check;
                }
            break;
            case "straight" :
                if(point.x < field.length-1){
                    check = new Point(point.x +1 , point.y );
                    if(field[check.x][check.y] == null){
                        return check;
                    }
                }
                if(point.y < field.length-1){
                    check = new Point(point.x, point.y +1 );
                    if(field[check.x][check.y] == null){
                        return check;
                    }
                }

//                if(point.y>0){
//                    check = new Point(point.x, point.y -1 );
//                    if(field[check.x][check.y] == null){
//                        return check;
//                    }
//                }
                if(point.x>0){
                    check = new Point(point.x - 1, point.y);
                    if(field[check.x][check.y] == null){
                        return check;
                    }
                }

                break;
            case "free":
                if(point.x == 0 || point.y == 0 ) return null;
                check = new Point(point.x, point.y +1 );
                if(field[check.x][check.y] == null){
                    return check;
                }
                check = new Point(point.x, point.y -1 );
                if(field[check.x][check.y] == null){
                    return check;
                }
                check = new Point(point.x +1 , point.y );
                if(field[check.x][check.y] == null){
                    return check;
                }

                check = new Point(point.x - 1, point.y);
                if(field[check.x][check.y] == null){
                    return check;
                }
                check = new Point(point.x +1 , point.y +1 );
                if(field[check.x][check.y] == null){
                    return check;
                }
                check = new Point(point.x -1, point.y -1 );
                if(field[check.x][check.y] == null){
                    return check;
                }
                check = new Point(point.x +1 , point.y -1);
                if(field[check.x][check.y] == null){
                    return check;
                }
                check = new Point(point.x - 1, point.y +1 );
                if(field[check.x][check.y] == null){
                    return check;
                }
                break;
        }
        return null;
    }


    public Stone checkForStone(int x, int y){
        Stone ret = this.field[x][y];
        if(ret != null){
            return ret;
        }
        return null;
    }

    public ArrayList<Stone> getStonesByAffiliation (boolean affiliation){
        ArrayList<Stone> ret_list =  new ArrayList<>();
        for(int i = 0 ; i<field.length; i++){
            for(int j = 0; j<field[i].length; j++){
                if(field[i][j] instanceof Stone){
                    Stone stone = field[i][j];
                    if(stone.getAffiliation() == affiliation){
                        ret_list.add(stone);
                    }
                }

            }
        }
        return ret_list;
    }
    public Point getPositionOfStone(Stone stone){
        for(int i = 0 ; i<field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                Stone temp = field[i][j];
                if (temp == stone) {
                    return new Point(i, j);
                }
            }
        }
        return null;
    }

    public Stone[][] getPlayField(){
        return this.field;
    }
    /*
    stone must have the right combination of right movementtype and movedirection
     */
    private boolean checkMovement(Stone stone, int x, int y){
        //stone can jump
        if(stone.movementType){
           //@ToDO check if new field in (after next row or after next column) or (in after next row and after next column)
    // condition: leveltype!!!
                // field is free
                if(field[x][y] == null) return true;

                else return false;

        }

        //stone can only move
        else{
            //@ToDO check if new field in next row or in next column
            //condition: leveltype!!!
            if(field[x][y] == null){
                //set MoveNumber (this includes also setMovementType)
                stone.setMoveNumber();
                return true;
            }
            else{

                return false;
            }

        }
    }




    public boolean endGame(){
        int root = (int)Math.sqrt(field_count);
        for(int i = 0 ; i<root; i++){
            if(field[i][0] instanceof  Stone){
                //needs to be true
                if(!field[i][0].getAffiliation()){
                    return false;
                }
            }else{
                return false;
            }
            if(field[i][1] instanceof  Stone){
                //needs to be true
                if(!field[i][0].getAffiliation()){
                    return false;
                }
            }else{
                return false;
            }
            if(field[i][root-1] instanceof  Stone){
                //needs to be false
                if(field[i][0].getAffiliation()){
                    return false;
                }
            }else{
                return false;
            }
            if(field[i][root-2] instanceof  Stone){
                //needs to be false
                if(field[i][0].getAffiliation()){
                    return false;
                }
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){

    }
}
