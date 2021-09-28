/*
 *  UCF COP3330 Fall 2021 Assignment 2 Exercise 25 Solution
 *  Copyright 2021 Celina Alzenor
 */

package ex25;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class password {

    public int passwordValidator(String pass)
    {
        int tally = 0;
        Pattern special = Pattern.compile("[^A-Za-z0-9]");
        Pattern letters = Pattern.compile("[A-Za-z]+");
        Pattern numbers = Pattern.compile("[0-9]+");

        Matcher s = special.matcher(pass);
        Matcher l = letters.matcher(pass);
        Matcher n = numbers.matcher(pass);

        //if the password contains letters
        if(l.find())
        {
            tally--;
        }

        //if the password doesn't contain any letters, increase the tally
        else if(!l.find())
        {
            tally--;
        }


        //if the password contains numbers
        if(n.find())
        {
            tally--;
        }

        //if the password contains special characters
        if(s.find())
        {
            tally--;
        }

        //if the password length is less than 8
        if(pass.length() >= 8)
        {
            tally--;
        }

        return tally;
    }

    public void output(int val,String pass)
    {
        String output = "";

        if(val == -4)
        {
            output = "The password '"+pass+"' is a very strong password";
        }

        else if(val == -3)
        {
            output = "The password '"+pass+"' is a strong password";
        }

        else if(val == -1)
        {
            output = "The password '"+pass+"' is a weak password";
        }

        else if(val == -2)
        {
            output = "The password '"+pass+"' is a very weak password";
        }

        System.out.print(output);
    }

    public String input()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a password for strength indication: ");
        return input.next();
    }
}
