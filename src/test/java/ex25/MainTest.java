/*
 *  UCF COP3330 Fall 2021 Assignment 2 Exericse 25 MainTest file
 *  Copyright 2021 Celina Alzenor
 */

package ex25;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void passStrength()
    {
        password test = new password();

        assertEquals(-3,test.passwordValidator("12233344"));
        assertEquals(-2,test.passwordValidator("112"));
        assertEquals(-3,test.passwordValidator("123456abc"));
        assertEquals(-4,test.passwordValidator("!@appl3p3@r$"));
        assertEquals(-2,test.passwordValidator("applebana"));
    }
}
