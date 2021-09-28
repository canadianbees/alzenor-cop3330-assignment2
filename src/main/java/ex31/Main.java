/*
 *  UCF COP3330 Fall 2021 Assignment 2 Exercise 31 Solution
 *  Copyright 2021 Celina Alzenor
 */

package ex31;

import java.util.Scanner;

public class Main {

    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);

        //asks for user input
        System.out.print("Enter age: ");
        int age = input.nextInt();
        System.out.print("Enter resting heart rate: ");
        int hr = input.nextInt();

        //calculates the heart rate
        heartRate person = new heartRate(hr,age);
        person.karvHR();

    }
}
