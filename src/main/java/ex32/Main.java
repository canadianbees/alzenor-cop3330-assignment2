/*
 *  UCF COP3330 Fall 2021 Assignment 2 Exercise 32 Solution
 *  Copyright 2021 Celina Alzenor
 */

package ex32;
import java.util.Scanner;

public class Main {

    public static void main( String [] args) {

        System.out.println("Let's play Guess the Number!\n");

        Scanner input = new Scanner(System.in);
        String choice = "";

        //runs until user doesn't want to play anymore
        while(choice.matches("Y") || choice.matches("y") || choice.matches("yes") || choice.matches("Yes") || choice.matches("")) {

            mechanics game = new mechanics();
            game.getGuess(game.getSystemNum(game.difficultySelect()));
            System.out.println();

            System.out.print("Would you like to play again: ");
            choice = input.next();
            System.out.println();
        }

        System.out.print("Thanks for playing!");
        input.close();
    }


}






