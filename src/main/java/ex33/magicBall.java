/*
 *  UCF COP3330 Fall 2021 Assignment 2 Exercise 33 magicBall class file
 *  Copyright 2021 Celina Alzenor
 */
package ex33;

import java.util.ArrayList;
import java.util.Random;

public class magicBall {


    //returns an answer
    public String eightBall(int val)
    {
        //makes array list with the possible answers
        ArrayList<String> ateBall = new ArrayList<>();
        ateBall.add("Yes.");
        ateBall.add("No.");
        ateBall.add("Maybe.");
        ateBall.add("Ask again later.");

        //randomly selects an answer from the arraylist
        return ateBall.get(val);
    }

    //randomly selects a value from 0-3
    public int randomSelect()
    {
        Random rand = new Random();
        return rand.nextInt(3);
    }

}
