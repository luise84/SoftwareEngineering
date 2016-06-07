package Uebung3.Uebung3_3.Battleship;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Luise on 28.04.2016.
 */
public class Game {

    private boolean[][] field;
    private String[] moves;
    private final int ROWLENGTH = 7;

    private int hitCounterUser = 0; //Treffer
    private int shotcounterUser = 0; //abgegebene Schüsse
    private ArrayList<String> lastShotsUser = new ArrayList<String>();

    private int hitCounterComputer = 0; //Treffer
    private int shotcounterComputer = 0; //abgegebene Schüsse
    private int hitsToWin = 14;
    private int computerIndex = 0;

    public Game(boolean[][] playField, String[] computerMoves) {
        this.field = playField;
        this.moves = computerMoves;
    }
    private void userMove(){
        String userInput;
        int userInputRow;
        int rowPosition;
        //if all ships were hit:
       // if(!askWin()){
            System.out.println("Gib Deine Schusskoordinaten in Form <Spalte><Zeile> ein: ");
            Scanner in = new Scanner(System.in);
            String inputString = in.next();
            if(inputString.matches("[a-g][1-7]")){
                char row = inputString.toLowerCase().charAt(0);
                //Transform the second element of user input in columnnumbers
                rowPosition = Integer.parseInt(String.valueOf(inputString.charAt(1)))-1;
                // transform the first element of user input in linenumbers and create the userInput string
                switch(row){
                    case 'a' : userInputRow=0; break;
                    case 'b' : userInputRow=1; break;
                    case 'c' : userInputRow=2; break;
                    case 'd' : userInputRow=3; break;
                    case 'e' : userInputRow=4; break;
                    case 'f' : userInputRow=5; break;
                    case 'g' : userInputRow=6; break;
                    default: userInputRow = -1; break;
                }
                userInput = String.valueOf(userInputRow) + String.valueOf(rowPosition);

                boolean repeatValue = checkRepetitionUserInput(userInput);
                if(repeatValue == false) userMove();
                else{
                    if(field[userInputRow][rowPosition] == true){
                        System.out.println("Treffer!!!");
                        hitCounterUser++;
                        shotcounterUser++;
                        viewScore();
                        if(!askWin()) computerMove();
                        else return;
                    }
                    else{
                        System.out.println("kein Treffer!");
                        shotcounterUser++;
                        viewScore();
                        computerMove();
                    }
                }
            }
            else{
                System.out.println("Falsche Eingabe");
                userMove();
            }

    }

    public void play(){
        userMove();
    }

    public void computerMove(){
        //if all ships were hit:
       // if(!askWin()){
            String move = moves[computerIndex];
            System.out.println("Der Computer feuert bei dir auf die Koordinaten: "+ move);
            computerIndex++;
            shotcounterComputer++;
            System.out.println("Ist das ein Treffer? j/n");
            boolean valid = readUserInput();
            if(valid == true){
                viewScore();
                if(!askWin()) userMove();
                else return;
            }

    }


    private void viewScore(){
        System.out.println("PC:"+hitCounterComputer+"--"+ hitCounterUser + ":Du");
    }
    private boolean readUserInput(){
        Scanner in = new Scanner(System.in);
        String userAnswer = in.next();

        if(userAnswer.equals("j")){
            hitCounterComputer++;
            return true;
        }
        else if(userAnswer.equals("n")){
            return true;
        }
        else{
            System.out.println("Falsche Eingabe!");
            System.out.println("Antworte mit j oder n");
            readUserInput();
            return true;
        }

    }

    private boolean checkRepetitionUserInput(String input){
        //check, if userInput repeats
        for (String string : lastShotsUser) {
            if(input.equals(string)){
                System.out.println("Wiederholte Eingabe!");
                return false;
            }
        }
        lastShotsUser.add(input);
        return true;

    }
    private boolean askWin(){
        if(hitCounterComputer == hitsToWin){
            System.out.println("\n" + "Der Computer hat das Spiel nach Abgabe von "+shotcounterComputer +" Schüssen gewonnen!");
            return true;
        }
        else if(hitCounterUser == hitsToWin){
            System.out.println("\n" + "Du hast das Spiel nach Abgabe von "+shotcounterUser+" Schüssen gewonnen!");
            return true;
        }
        else return false;

    }



}

