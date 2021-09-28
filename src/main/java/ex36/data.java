/*
 *  UCF COP3330 Fall 2021 Assignment 2 Exercise 36 Data class file Solution
 *  Copyright 2021 Celina Alzenor
 */

package ex36;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class data
{
    public ArrayList<Integer> getNums()
    {
        boolean valid = true;
        ArrayList <String> list = new ArrayList<>();

        String number;
        //while the user does not input "done"
        while (valid) {

            System.out.print("Enter a number: ");
            Scanner input = new Scanner(System.in);
            number = input.next();

            //if user inputs done, exit the loop
            if (number.matches("done")) {

                valid = false;
            }

            else
            {
                list.add(number);
            }

        }

        ArrayList<Integer> newList = new ArrayList<>();
        //convert all the inputted strings into integers and add them to an integer array
        for (String s : list)
        {
            newList.add(Integer.parseInt(s));
        }

        return newList;
    }

    //prints average, min, max, and standard deviation in an array
    public void getStats(ArrayList<Integer> list)
    {
        printArray(list);

        DecimalFormat round = new DecimalFormat("###.##");

        System.out.println("\nThe average is "+average(list));
        System.out.println("The minimum is "+minimum(list));
        System.out.println("The maximum is "+maximum(list));
        System.out.println("The standard deviation is "+round.format(std(list)));

    }

    //prints all integers in an array
    public void printArray(ArrayList <Integer> list)
    {
        System.out.print("Numbers: ");
        int track = 0;
        for(int num : list)
        {
            track++;

            //for formatting purposes, if item is the last in the array
            if(track == list.size())
            {
                System.out.print(num);
            }

            //add a comment if it's not the last number in the array
            else
            {
                System.out.print(num+", ");
            }
        }
    }

    //returns the average of the array
    public float average(ArrayList <Integer> list)
    {
        float sum = 0.0F;

        for(int num : list)
        {
            sum += num;
        }

       return sum/list.size();
    }

    //returns the minimum value in the array
    public int minimum(ArrayList <Integer> list)
    {
        //assume the minimum value is the first value
        int min = list.get(0);
        for(int num : list)
        {
            //if there is a number that's less than the current min, update it
            if(num < min)
            {
                min = num;
            }
        }

        return min;
    }

    //returns the maximum value in the array
    public int maximum(ArrayList <Integer> list)
    {
        int max = 0;

        for(int num : list)
        {
            //if there is a number greater than the current max, update max
            if(num > max)
            {
                max = num;
            }
        }

        return max;
    }

    //calculates the standard deviation of an array
    public double std(ArrayList <Integer> list)
    {
        float discrim = 0.0F;

        for(int num : list)
        {
            discrim += Math.pow((num - average(list)),2);
        }

        discrim /= list.size();

        return Math.sqrt(discrim);

    }

}
