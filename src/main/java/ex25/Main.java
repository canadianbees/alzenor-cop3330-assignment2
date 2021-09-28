/*
 *  UCF COP3330 Fall 2021 Assignment 2 Exercise 25 Solution
 *  Copyright 2021 Celina Alzenor
 */

package ex25;

public class Main {

    public static void main(String [] args)
    {
        password checkPass = new password();
        String pass = checkPass.input();
       checkPass.output(checkPass.passwordValidator(pass),pass);

    }
}
