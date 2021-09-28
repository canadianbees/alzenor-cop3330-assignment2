/*
 *  UCF COP3330 Fall 2021 Assignment 2 Exercise 28 Solution
 *  Copyright 2021 Celina Alzenor
 */
package ex28;

import java.util.Scanner;

public class Main
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        int []copy;

        //asks user how many numbers they would like to add
        System.out.print("How many numbers do you want to add: ");
        int times = input.nextInt();

        copy = new int [times];

        //runs for this.p times
        for(int i = 0; i < copy.length; i++)
        {
            //inserts user-prompted numbers into the array
            System.out.print("Enter a number: ");
            copy[i] = input.nextInt();
        }

        summation numbers = new summation(times,copy);

        //adds all the numbers in an array
        int sum = numbers.adding();
        System.out.println("The total is "+sum);


    }
}
