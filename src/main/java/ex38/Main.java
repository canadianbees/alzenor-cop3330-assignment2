/*
 *  UCF COP3330 Fall 2021 Assigment 2 Exercise 38 Solution
 *  Copyright 2021 Celina Alzenor
 */

package ex38;

import java.util.ArrayList;

public class Main {

    public static void main (String []args)
    {
        Identify evenNums = new Identify();

        int [] numList = evenNums.getNums();

        numList = evenNums.filterEvenNumbers(numList);

        evenNums.printEven(numList);


    }

}
