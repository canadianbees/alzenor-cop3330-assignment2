/*
 *  UCF COP3330 Fall 2021 Assignment 2 Exercise 33 MainTest file
 *  Copyright 2021 Celina Alzenor
 */

package ex33;

import ex35.Winner;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class MainTest
{
    @Test
    //testing that each message is in the appropriate index
    public void testBall()
    {
        magicBall test1 = new magicBall();
        assertEquals("Yes.",test1.eightBall(0));
        assertEquals("No.",test1.eightBall(1));
        assertEquals("Maybe.",test1.eightBall(2));
        assertEquals("Ask again later.",test1.eightBall(3));

    }

    @Test
    //testing that the randomSelect method chooses an index that is within range
    public void randSelectTest()
    {
        magicBall test1 = new magicBall();
        int pick = test1.randomSelect();

        assertTrue(pick < 4);
    }



}
