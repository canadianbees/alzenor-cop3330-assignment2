/*
 *  UCF COP3330 Fall 2021 Assignment 2 Exercise 30 multiply Class file
 *  Copyright 2021 Celina Alzenor
 */

package ex30;

public class multiply
{
    public int table(int x)
    {
        int sum = 0;
        //rows from 1 to x
        for(int i = 1; i <= x; i++)
        {
            //columns from 1 to x
            for(int j = 1; j <= x; j++)
            {
                //prints the product
                System.out.printf("%3d ",i*j);
                sum += i*j; //for testing purposes
            }

            System.out.println();
        }

       return sum; //returns sum for testing purposes
    }
}
