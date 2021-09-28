/*
 *  UCF COP3330 Fall 2021 Assigment 2 Exercise 26 Solution
 *  Copyright 2021 Celina Alzenor
 */

package ex26;

public class Main {

    public static void main(String[]args)
    {
        debtCalc amex = new debtCalc();
       int months = amex.calculateMonthsUntilPaidOff(amex.balInput(),amex.APRInput(),amex.monthInput());

        System.out.print("It will take you "+months+" months to pay off this card.");

    }
}
