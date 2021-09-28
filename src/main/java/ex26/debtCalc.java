/*
 *  UCF COP3330 Fall 2021 Assigment 2 Exercise 26 debtCalc class file
 *  Copyright 2021 Celina Alzenor
 */

package ex26;

import java.util.Scanner;
import static java.lang.Math.log;

public class debtCalc {

    //gets monthly payment
    public double monthInput()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the monthly payment you can make? ");

        return input.nextDouble();
    }

    //gets balance
    public double balInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your balance? ");

        return input.nextDouble();
    }

    //gets the APR
    public int APRInput()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the APR on the card (as a percent)? ");

        return input.nextInt();
    }

    //returns the number of months it will take to pay off the card
    public int calculateMonthsUntilPaidOff(double bal, int apr, double mp)
    {
        double i = (apr/100.0)/365.0;
        double months = (-1.0/30.0)*((log(1+(bal/mp)  * (1-(Math.pow((1+i),30)))))/log(1+i));
        months = Math.ceil(months);

        return (int) months;
    }
}
