/*
 *  UCF COP3330 Fall 2021 Assigment 2 Exercise 37 Solution
 *  Copyright 2021 Celina Alzenor
 */

package ex37;

public class Main {

    public static void main(String []args)
    {
        //randomly generates a password
        password make = new password();

        //prints out the result
        System.out.print("Your password is "+make.passGen(make.getMinInput(), make.getSpecInput(), make.getNumInput()));
    }
}
