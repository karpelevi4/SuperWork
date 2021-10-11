package task11.game;

import java.util.Random;

public class Player {

    private int numberToGuess;
    private int possibleNumber;
    private int numberOfTries;

    public  Player() {
        Random r = new Random();
        this.numberToGuess = r.nextInt(20);
        this.numberOfTries = 0;
        this.possibleNumber = 0;
    }
    
    public void setPossibleNumber(int possibleNumber) {
        this.possibleNumber = possibleNumber;
    }
    
    public int getPossibleNumber() {
        return possibleNumber;
    }
    
    public void updateNumberOfTries() {
        this.numberOfTries++;
    }
    
    public int getNumberOfTries() {
        return numberOfTries;
    }
    
    public int getNumberToGuess() {
        return numberToGuess;
    }
}
