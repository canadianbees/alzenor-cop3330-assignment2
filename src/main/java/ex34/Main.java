/*
 *  UCF COP3330 Fall 2021 Assignment 2 Exercise 34 Solution
 *  Copyright 2021 Celina Alzenor
 */

package ex34;

import java.util.Scanner;

public class Main {

    public static void main (String []args)
    {
        Scanner input = new Scanner(System.in);
        Employees terminate = new Employees();

        //gets number of employees and prints the list of employees
        int numEmpy = terminate.getWorkplace().size();
        System.out.println("There are "+numEmpy+" employees:");
        terminate.printEmpy();
        System.out.println();

        //prompts user to enter a name to remove
        System.out.print("Enter an employee name to remove: ");
        String fire = "";
        fire += input.nextLine(); //adds first and last name to the same string
        input.close();
        System.out.println();

        //finds the name and terminates them
        terminate.fireEmp(fire);

    }

}
