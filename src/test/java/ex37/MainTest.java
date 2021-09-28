/*
 *  UCF COP3330 Fall 2021 Assigment 2 Exercise 37 MainTest file
 *  Copyright 2021 Celina Alzenor
 */

package ex37;

import org.junit.Assert;
import org.junit.Test;


public class MainTest {

    @Test
    //checks that the password has at least as many letters and special characters and numbers combined
    public void checkNumLetters()
    {
        password test = new password();
        String testStr = test.passGen(10,5,4);

        int count = 0;
        for(int i = 0; i < testStr.length(); i++)
        {
            if(Character.isLetter(testStr.charAt(i)))
            {
                count++;
            }
        }

        System.out.print("Password: "+testStr+"\nNumber of letters: "+count);
        Assert.assertTrue(count >= (5+4));


    }

    @Test
    public void checkNumLetters1()
    {
        password test = new password();

        String testStr2 = test.passGen(5,4,3);

        int count = 0;
        for(int i = 0; i < testStr2.length(); i++)
        {
            if(Character.isLetter(testStr2.charAt(i)))
            {
                count++;
            }
        }

        System.out.print("\nPassword: "+testStr2+"\nNumber of letters: "+count);
        Assert.assertTrue(count >= (4+3));
    }
}
