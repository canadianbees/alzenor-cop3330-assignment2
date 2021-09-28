/*
 *  UCF COP3330 Fall 2021 Assignment 2 Exercise 36 Solution
 *  Copyright 2021 Celina Alzenor
 */

package ex36;

import java.util.ArrayList;

public class Main {

    public static void main( String []args)
    {
        data info = new data();
        ArrayList<Integer> list = info.getNums();
        info.getStats(list);
    }
}
