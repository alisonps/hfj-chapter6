package com.twassignment.arraylistguessinggame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by alisonps on 8/17/14.
 */

public class GuessingGameInputHelper {

    //Prompts user for input and returns the entered line
    public String getUserGuess(String prompt) {
        String inputLine = null;
        System.out.print(prompt + ": ");

        try {
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
            inputLine = inputReader.readLine();
            if(inputLine.length() == 0) return null;
        }
        catch (IOException e) {
            System.out.println("IO Exception: " + e);
        }

        return inputLine;
    }
}