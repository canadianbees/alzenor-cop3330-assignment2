/*
 *  UCF COP3330 Fall 2021 Assignment 2 Exercise 33 Solution
 *  Copyright 2021 Celina Alzenor
 */

package ex33;
import java.util.Scanner;

public class Main
{
    public static void main(String []args)
    {
        //prints out the questions and prompts for user input
        System.out.println("What is your question?");
        System.out.print("> ");

        //for user input
        Scanner input = new Scanner(System.in);
        input.next();

        //creates the magicBall and returns the answer to the question
        magicBall fortune = new magicBall();
        String answer = fortune.eightBall(fortune.randomSelect());

        //prints out answer;
        System.out.print("\n"+answer);

    }
}
