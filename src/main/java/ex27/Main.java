/*
 *  UCF COP3330 Fall 2021 Assigment 2 Exercise 27 Solution
 *  Copyright 2021 Celina Alzenor
 */
package ex27;
import java.util.Scanner;

public class Main
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        //asks for user input
        System.out.print("Enter the first name: ");
        String fn = input.nextLine();
        System.out.print("Enter the last name: ");
        String ln = input.nextLine();
        System.out.print("Enter the ZIP code: ");
        String zip = input.next();
        System.out.print("Enter the employee ID: ");
        String id = input.next();

        validate info = new validate(fn,ln,zip,id);

        //validates info user inputted
        info.validateInput();

    }
}
