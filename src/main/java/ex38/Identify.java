/*
 *  UCF COP3330 Fall 2021 assignment_name Solution
 *  Copyright 2021 Celina Alzenor
 */

package ex38;
import java.util.Scanner;

public class Identify {

    public int [] getNums()
    {
        Scanner input = new Scanner(System.in);
        String nums= "";

        System.out.print("Enter a list of numbers, separated by spaces: ");
        nums += input.nextLine();

        String[] numStr = nums.split(" ");

        int[] numbers = new int[numStr.length];
        int i = 0;

        for (String n :numStr) {

            numbers[i++] = Integer.parseInt(n);

        }

        return numbers;

    }

    public int [] filterEvenNumbers(int [] old)
    {
        int [] filter = new int[old.length];
        int i = 0;
        int tracker = 0;
        for(int n : old)
        {
            if(n%2 == 0)
            {
                tracker++;
                filter[i++] = n;
            }
        }

        int [] evens = new int[tracker];

        for(i = 0; i < tracker; i++)
        {
            if(filter[i]%2 == 0)
            {
                evens[i] = filter[i];
            }
        }

        //if there are no even numbers, return a null array
        if(evens.length == 0)
        {
            return null;
        }

        return evens;
    }

    public void printEven(int [] list)
    {
        System.out.print("The even numbers are ");
        int tracker=0;
        for(int i : list)
        {
            tracker++;
            if(tracker == (list.length))
            {
                System.out.print(i+".");
            }

            else
            {
                System.out.print(i+" ");
            }


        }
    }
}
