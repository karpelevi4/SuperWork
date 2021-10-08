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
}
