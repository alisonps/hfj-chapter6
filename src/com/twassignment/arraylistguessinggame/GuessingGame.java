package com.twassignment.arraylistguessinggame;

/**
 * Created by alisonps on 8/17/14.
 */
public class GuessingGame {

    public static void main(String[] args) {

        GuessingGameInputHelper helper = new GuessingGameInputHelper();
        TargetNumber targetNumber = new TargetNumber();
        boolean correctGuess = false;

        //Continue game until the player guesses correctly
        while(correctGuess == false) {
            String userGuess = helper.getUserGuess("Enter a guess");
            targetNumber.addUserGuess(userGuess);
            correctGuess = targetNumber.checkUserGuess(userGuess);
        }
        targetNumber.printUserGuesses();
    }
}