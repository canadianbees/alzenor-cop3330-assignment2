/*
 *  UCF COP3330 Fall 2021 assignment_name Solution
 *  Copyright 2021 Celina Alzenor
 */

package ex35;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Winner {

    public void makeList(ArrayList<String> list) {

        boolean valid = true;

        //while the user does not input an empty string
        while (valid) {
            //start with an empty string
            String name = "";

            System.out.print("Enter a name: ");
            Scanner input = new Scanner(System.in);
            name += input.nextLine();

            //if user inputs nothing, exit the loop
            if (name.matches("")) {
                valid = false;
            }

            list.add(name);
        }
    }

    //returns a string in the arrayList based on the value passed in
    public String pick (int val,ArrayList<String> names)
    {
        return names.get(val);
    }

    //randomly selects a value from 0 to (the size of the array-1)
    public int randomSelect(ArrayList<String> names)
    {
        Random rand = new Random();
        return rand.nextInt(names.size());
    }
}
