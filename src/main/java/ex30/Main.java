/*
 *  UCF COP3330 Fall 2021 Assignment 2 Exercise 30 Solution
 *  Copyright 2021 Celina Alzenor
 */

package ex30;

import java.util.Scanner;

public class Main
{
    public static void main(String [] args)
    {
        //user input
        Scanner input = new Scanner(System.in);
        System.out.println("What number do you want the multiplication table to go up to?  ");
        int num = input.nextInt();

        multiply maths = new multiply();
        maths.table(num); //prints out multiplication table
    }
}
