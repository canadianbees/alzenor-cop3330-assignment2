/*
*  UCF COP3330 Fall 2021 Assignment 2 Exercise 29 MainTest file
*  Copyright 2021 Celina Alzenor
*/

package ex29;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for main function
 */
public class MainTest
{
    @Test
    public void shouldBeRight()
    {
        investment test1 = new investment();
        assertEquals(14,test1.doubleInvest(5));

        investment test2= new investment();
        assertEquals(8,test2.doubleInvest(9));

        investment test3 = new investment();
        assertEquals(7,test3.doubleInvest(10));
    }

}