/*
 *  UCF COP3330 Fall 2021 Assignment 2 Exercise 31 MainTest file
 *  Copyright 2021 Celina Alzenor
 */

package ex31;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest
{
    @Test
    public void shouldBeRight()
    {
        heartRate test1 = new heartRate(65,22);
        assertEquals(164,test1.karvHR());

        heartRate test2 = new heartRate(70,19);
        assertEquals(167,test2.karvHR());

        heartRate test3 = new heartRate(82,36);
        assertEquals(158,test3.karvHR());
    }
}
