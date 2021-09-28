/*
 *  UCF COP3330 Fall 2021 Assignment 2 Exercise 30 AppTest file
 *  Copyright 2021 Celina Alzenor
 */

package ex30;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for main function
 */
public class MainTest
{
    @Test
    //checks the sum of all the numbers in the multiplication table
    public void shouldBeRight()
    {
        multiply test1 = new multiply();
        assertEquals(6084,test1.table(12));
        System.out.println();

        multiply test2 = new multiply();
        assertEquals(225,test2.table(5));
        System.out.println();

        multiply test3 = new multiply();
        assertEquals(784,test3.table(7));
        System.out.println();


    }

}