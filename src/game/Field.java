package game;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Thundersama on 23.06.2016.
 */
public class Field{
    private Stone[][] field;
    //private Stone[][] endfield;
    private int stones = 0;
    private int field_count = 100;
    private String movement_typeLevel; //level

    public Field(Stone[][] fieldarray, int field_count, int stones){
        this.field = fieldarray;
        this.field_count = field_count;
        //this.endfield = reflectField(field);
        this.stones = stones;


    }
    public void setMovementType(String movement_typeLevel){
        this.movement_typeLevel = movement_typeLevel;
    }
    public String getMovementTypeLevel(){
        return this.movement_typeLevel;
    }


    public boolean setPosition(Stone stone, int x, int y){
        int oldx = 0;
        int oldy = 0;
        if(x > field.length -1 || y > field.length -1 ){
            return false;
        }else if(x < 0 || y < 0){
            return false;
        }
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

    /* Bewegungsart: ziehen
    * Level Straight: nur waagerechte und senkrechte Bewegungen nach vorne und hinten erlaubt (4)
	* Level Free: alle Bewegungsrichtungen nach vorne und hinten erlaubt (8)
    * Level Diagonal Forward: nur diagonale Bewegungsrichtungen nach vorne erlaubt (2)
     */
    public Point getAllowedMove(Point point){
        Point check;
        switch(movement_typeLevel){
            //forward and backward possible
            case "diagonal" :
                if(point.x == 0 || point.y == 0) return null;
                if(point.x < field.length-1 && point.y > field.length -1 ){
                    check = new Point(point.x +1 , point.y +1 );
                    if(field[check.x][check.y] == null){
                        return check;
                    }
                }
                if(point.x > 0 && point.y > 0 ) {
                    check = new Point(point.x - 1, point.y - 1);
                    if (field[check.x][check.y] == null) {
                        return check;
                    }
                }
                if(point.x < field.length -1 && point.y > 0){
                    check = new Point(point.x +1 , point.y -1);
                    if(field[check.x][check.y] == null){
                        return check;
                    }
                }
                if(point.x > 0 && point.y < field.length -1 ){
                    check = new Point(point.x - 1, point.y +1 );
                    if(field[check.x][check.y] == null){
                        return check;
                    }
                }
            break;
            //straight forward for human player
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
    /* Bewegungsart: Springen
    * Level Straight: nur waagerechte und senkrechte Bewegungen nach vorne und hinten erlaubt (4)
	* Level Free: alle Bewegungsrichtungen nach vorne und hinten erlaubt (8)
    * Level Diagonal Forward: nur diagonale Bewegungsrichtungen nach vorne erlaubt (2)
     */
    public Point getAllowedJump(Point point){

        Point check;
        switch(movement_typeLevel){
            //forward and backward possible
            case "diagonal" :
                if(point.x == 0 || point.y == 0) return null;

                if(point.x < field.length - 2 && point.y < field.length -2 ){
                    check = new Point(point.x +2 , point.y +2 );
                    if(field[check.x][check.y] == null && field[point.x +1][point.y +1] != null){
                        return check;
                    }
                }
                if(point.x > 1 && point.y > 1){
                    check = new Point(point.x -2, point.y -2 );
                    if(field[check.x][check.y] == null && field[point.x -1][point.y -1] != null){
                        return check;
                    }
                }
                if(point.x < field.length - 2 && point.y > 1){
                    check = new Point(point.x +2 , point.y -2);
                    if(field[check.x][check.y] == null && field[point.x +1][point.y -1] != null){
                        return check;
                    }
                }
                if(point.x > 1 && point.y < field.length -2 ){
                    check = new Point(point.x - 2, point.y +2 );
                    if(point.x < field.length - 2 && point.y < field.length -2 ) {
                        if (field[check.x][check.y] == null && field[point.x - 1][point.y + 1] != null) {
                            return check;
                        }
                    }
                }
                break;
            //straight forward for human player
            case "straight" :
                if(point.x < field.length-2){
                    check = new Point(point.x +2 , point.y );
                    if(field[check.x][check.y] == null && field[point.x +1][point.y] != null){
                        return check;
                    }
                }
                if(point.y < field.length-2){
                    check = new Point(point.x, point.y +2 );
                    if(field[check.x][check.y] == null && field[point.x][point.y +1] != null){
                        return check;
                    }
                }

                if(point.y>1){
                    check = new Point(point.x, point.y -2 );
                    if(field[check.x][check.y] == null && field[point.x][point.y -1] != null){
                        return check;
                    }
                }
                if(point.x>1){
                    check = new Point(point.x - 2, point.y);
                    if(field[check.x][check.y] == null && field[point.x -1][point.y] != null){
                        return check;
                    }
                }

                break;
            case "free":
                if(point.x == 0 || point.y == 0 ) return null;
                if(point.y < field.length-2) {
                    check = new Point(point.x, point.y + 2);
                    if (field[check.x][check.y] == null && field[point.x][point.y + 1] != null) {
                        return check;
                    }
                }
                if(point.y > 1) {
                    check = new Point(point.x, point.y - 2);
                    if (field[check.x][check.y] == null && field[point.x][point.y - 1] != null) {
                        return check;
                    }
                }
                if(point.x < field.length-2) {
                    check = new Point(point.x + 2, point.y);
                    if (field[check.x][check.y] == null && field[point.x + 1][point.y] != null) {
                        return check;
                    }
                }
                if(point.x > 1) {
                    check = new Point(point.x - 2, point.y);
                    if (field[check.x][check.y] == null && field[point.x - 1][point.y] != null) {
                        return check;
                    }
                }
                if(point.x < field.length - 2 && point.y < field.length -2 ) {
                    check = new Point(point.x + 2, point.y + 2);
                    if (field[check.x][check.y] == null && field[point.x + 1][point.y + 1] != null) {
                        return check;
                    }
                }
                if(point.x > 1 && point.y > 1) {
                    check = new Point(point.x - 2, point.y - 2);
                    if (field[check.x][check.y] == null && field[point.x - 1][point.y - 1] != null) {
                        return check;
                    }
                }
                if(point.x < field.length - 2 && point.y > 1) {
                    check = new Point(point.x + 2, point.y - 2);
                    if (field[check.x][check.y] == null && field[point.x + 1][point.y - 1] != null) {
                        return check;
                    }
                }
                if(point.x > 1 && point.y < field.length -2 ) {
                    check = new Point(point.x - 2, point.y + 2);
                    if (field[check.x][check.y] == null && field[point.x - 1][point.y + 1] != null) {
                        return check;
                    }
                }
                break;
        }
        return null;
    }


    public Stone checkForStone(int x, int y){
        if(x > field.length -1 || x < 0 ||  y > field.length -1|| y < 0){
            return null;
        }
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
    stone must have the right combination of right movementtype of stone and movedirection in level
     */
    private boolean checkMovement(Stone stone, int x, int y, String movement_typeLevel){
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




    public boolean endGame(Stone[][] currentField, Stone[][] endfield){
        /*field at the end is reflected to startfield, compare both fields*/
        int counterComputerplayer = 0;
        int counterPlayer = 0;
        int stonesOfOnePlayer = stones/2;


        for(int i=0; i<currentField.length; i++) {
            for (int j = 0; j < currentField.length; j++) {

                if(currentField[i][j] != null && endfield[i][j] != null){

                    //check if computerplayer has stones on endpositions
                    if(currentField[i][j].getAffiliation() == false && endfield[i][j].getAffiliation() == false) {
                        counterComputerplayer++;
                        System.out.println("computer:"+counterComputerplayer);
                    }
                    //check if player has stones on endpositions
                    else if(currentField[i][j].getAffiliation() == true && endfield[i][j].getAffiliation() == true){
                        counterPlayer++;
                        System.out.println("player:"+counterPlayer);
                    }

                }
            }
        }

        if(counterComputerplayer == stonesOfOnePlayer){
            System.out.println("Der Computer hat gewonnen!!");
            return true;
        }
        else if(counterPlayer == stonesOfOnePlayer){
            System.out.println("Du hast gewonnen!!");
            return true;
        }
        else return false;

    }
    public void printField(){
        for(int i = 0 ;i< field.length; i++){
            for(int j = 0 ;j < field[i].length; j++){
                if(field[i][j] instanceof  Stone){
					System.out.print(" X " );
                }else{
					System.out.print( " O " );

                }

            }
			System.out.println("_____");
        }
    }

    public static void main(String[] args){

    }
}
