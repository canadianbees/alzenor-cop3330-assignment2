/*
 *  UCF COP3330 Fall 2021 Assignment 2 Exercise 29 Solution
 *  Copyright 2021 Celina Alzenor
 */
package ex29;

public class Main
{
    public static void main( String[] args )
    {
        investment bank = new investment();
        //validates user's input
        bank.validInput();
        System.out.print("It will take "+bank.doubleInvest(bank.getROR())+" years to double your initial investment.");

    }
}
