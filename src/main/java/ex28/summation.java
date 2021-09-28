/*
 *  UCF COP3330 Fall 2021 Assignment 2 Exercise 28 summation Class file
 *  Copyright 2021 Celina Alzenor
 */

package ex28;

public class summation
{
    private final int[] numbers;
    private final int p;

    public summation(int p,int [] copy)
    {
        this.p = p;

        //initializes array of numbers based on how many numbers user wants
        this.numbers = new int [this.p];

        //runs for this.p times
        for(int i = 0; i < this.numbers.length; i++)
        {
            //inserts user-prompted numbers into the array
            this.numbers[i] = copy[i];
        }

    }

    public int adding()
    {
        //initial sum;
        int sum = 0;

        //runs p times
        for(int i = 0; i < this.p; i++)
        {
            //adds the number at the current index to the sum
            sum += this.numbers[i];
        }

        //returns the total of the array
        return sum;
    }
}
