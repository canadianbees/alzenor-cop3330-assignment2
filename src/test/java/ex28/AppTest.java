/*
 *  UCF COP3330 Fall 2021 Assignment 2 Exercise 28 AppTest file
 *  Copyright 2021 Celina Alzenor
 */
package ex28;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void shouldBeRight()
    {
        int []array1 = new int []{1,2,5,11,4,6,7,16,9,8};
        summation test1 = new summation(10,array1);
        assertEquals(69,test1.adding());

        int []array2 = new int []{1,2,5,9,8};
        summation test2 = new summation(5,array2);
        assertEquals(25,test2.adding());

        int []array3 = new int []{69,792,10000,63,915,45,8};
        summation test3 = new summation(7,array3);
        assertEquals(11892,test3.adding());
    }

    @Test
    public void addingNegatives()
    {
        int []array1 = new int []{-1,2,5,-11,4,6,7,16,-9,8};
        summation test1 = new summation(10,array1);
        assertEquals(27,test1.adding());

        int []array2 = new int []{-1,-2,-5,-9,-8};
        summation test2 = new summation(5,array2);
        assertEquals(-25,test2.adding());

        int []array3 = new int []{69,792,-10000,63,-915,45,8};
        summation test3 = new summation(7,array3);
        assertEquals(-9938,test3.adding());
    }

}
