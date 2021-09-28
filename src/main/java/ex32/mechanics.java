/*
 *  UCF COP3330 Fall 2021 Assignment 2 Exercise 32 mechanics class file
 *  Copyright 2021 Celina Alzenor
 */

package ex32;

import java.util.Random;
import java.util.Scanner;

public class mechanics
{
    public int difficultySelect()
    {
        boolean valid = false;
        int d = 0;
        Scanner input = new Scanner(System.in);

        //runs until user enters valid input
        while(!valid){
            System.out.print("Enter the difficulty level (1,2, or 3): ");

            //if user has inputted an integer
            if(input.hasNextInt()){
                d = input.nextInt();
                //if that input is a valid option
                if(d == 1 || d == 2 || d == 3){
                    valid = true;
                }
                //if it's not
                else{
                    System.out.println("Not a valid input!");
                }
            }

            //if user inputted a non-numeric value
            else{
                System.out.println("Not a valid input!");
            }
            input.nextLine();
        }

        return d;
    }

    public int getSystemNum(int difficulty)
    {
        Random rand = new Random();
        int value = 0;

        //range of the random number generator is different with each difficulty
        if (difficulty == 1) {
            value = rand.nextInt((10 - 1) + 1) + 1;
        }
        else if (difficulty == 2) {
            value = rand.nextInt((100 - 1) + 1) + 1;
        }

        else if (difficulty == 3) {
            value = rand.nextInt((1000 - 1) + 1) + 1;
        }

        return value;
    }

    public void getGuess(int value)
    {
        Scanner input = new Scanner(System.in);
        int guess = 0, tracker = 0;
        boolean valid = false;

        //runs until the user has inputted an integer
        while(!valid) {

            //if user hasn't guessed anything yet, it's the beginning of the game.
            if(tracker == 0) {
                System.out.print("I have my number. What is your guess? ");
            }

            //user guessed an integer
            if(input.hasNextInt()) {
                guess = input.nextInt();
                tracker ++;
                valid = true;
            }

            //they inputted a non-numeric value, counts as a guess
            else {
                System.out.print("Not a valid guess! Guess again: ");
                tracker ++;
            }

            input.nextLine();
        }

        boolean logic = true;
        //runs until user guessed the correct value
        while (guess != value) {

            //if it's too low, ask for new input and update tracker counter
            if (guess < value) {

                //if user has inputted a number but simply got it wrong, print this
                if(logic)
                {
                    System.out.print("Too low. Guess again: ");
                }

                if(input.hasNextInt()) {
                    guess = input.nextInt();
                    logic = true;
                }

                //user has inputted a non-numeric value
                else {
                    System.out.print("Not a valid guess! Guess again: ");
                    logic = false;
                }
                tracker++;

                input.nextLine();

            }

            //if it's too high,ask for new input
            if (guess > value) {

                //if user has inputted a number but simply got it wrong, print this
                if(logic)
                {
                    System.out.print("Too high. Guess again: ");
                }

                //user inputted a number
                if(input.hasNextInt()) {
                    guess = input.nextInt();
                    logic = true;
                }

                //user has inputted a non-numeric value
                else {
                    System.out.print("Not a valid guess! Guess again: ");
                    logic = false;
                }

                tracker++;
                input.nextLine();
            }
        }

        System.out.print("You got it in "+ tracker+" guesses!");
    }
}
