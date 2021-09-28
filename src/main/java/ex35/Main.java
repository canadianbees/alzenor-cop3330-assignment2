/*
 *  UCF COP3330 Fall 2021 Assignment 2 Exercise 35 Solution
 *  Copyright 2021 Celina Alzenor
 */

package ex35;

import java.util.ArrayList;

public class Main {

    public static void main(String []args)
    {
        Winner champ = new Winner();
        ArrayList<String> list = new ArrayList<>();
        champ.makeList(list);
        System.out.print("The winner is... "+champ.pick(champ.randomSelect(list),list));

    }

}
