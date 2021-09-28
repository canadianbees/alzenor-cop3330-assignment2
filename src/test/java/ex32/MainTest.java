/*
 *  UCF COP3330 Fall 2021 Assignment 2 Exercise 32 MainTest file
 *  Copyright 2021 Celina Alzenor
 */

package ex32;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class MainTest {

    @Test
    public void notValidDiffcultiesTest()
    {
        mechanics test = new mechanics();

        //the difficulty is a not a valid option so the return value should be 0
        assertEquals(0,test.getSystemNum(5));
        assertEquals(0,test.getSystemNum(4));
        assertEquals(0,test.getSystemNum(6));
        assertEquals(0,test.getSystemNum(0));


    }

    @Test
    public void difficultyValid()
    {
        mechanics test = new mechanics();

        ///the following difficulties are valid options for user input, so they should return numbers that are not 0
        assertNotEquals(0,test.getSystemNum(1));
        assertNotEquals(0,test.getSystemNum(2));
        assertNotEquals(0,test.getSystemNum(3));
    }
}
