/*
 *  UCF COP3330 Fall 2021 Assignment 2 Exercise 29 investment Class file
 *  Copyright 2021 Celina Alzenor
 */

package ex29;

import java.util.Scanner;

public class investment
{
    private int ROR;

    public int getROR()
    {
        return ROR;
    }

    //initializes the ROR
    public investment()
    {
        this.ROR = 0;
    }

    //asks user for input and checks if it is valid
    public void validInput()
    {
        Scanner input = new Scanner(System.in);
        boolean valid = false;

        //runs until the user inputs valid input
        while(!valid)
        {
            System.out.print("What is the rate of return? ");

            //if user input is an integer
            if(input.hasNextInt())
            {
                this.ROR = input.nextInt();

                //if the input is greater than 0, the input is valid
                if(this.ROR > 0)
                {
                    valid = true;
                }

                //if user inputs 0 or a negative number
                else
                {
                    System.out.println("Sorry. That's not a valid input.");
                }
            }

            //if user inputs a non-numeric value
            else
            {
                System.out.println("Sorry. That's not a valid input.");
            }

            //throw away the last thing inputted so loop can properly start again
            input.nextLine();
        }

        input.close();
    }


    //returns number of years needed to double investment
    public int doubleInvest(int ROR)
    {
        return 72/ROR;
    }


}
