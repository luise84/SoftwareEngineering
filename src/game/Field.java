package game;

/**
 * Created by Thundersama on 23.06.2016.
 */
public class Field{
    private Stone[][] field;
    private int field_count = 100;

    public Field(Stone[][] fieldarray, int field_count){
        this.field = fieldarray;
        this.field_count = field_count;

    }

    public boolean setPosition(Stone stone, int x, int y){
        if(field[x][y] == null){
            field[x][y]= stone;
            return true;
        }

        else{
            return false;
        }
    }
    public int getFieldCount(){
        return this.field_count;
    }

    public Stone checkForStone(int x, int y){
        Stone ret = this.field[x][y];
        if(ret != null){
            return ret;
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




    private void notifyView(){

    }

    private boolean endGame(){
        return true;
    }


    public static void main(String[] args){

    }
}
