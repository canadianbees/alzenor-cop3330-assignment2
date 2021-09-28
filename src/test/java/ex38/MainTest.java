/*
 *  UCF COP3330 Fall 2021 Assigment 2 Exercise 38 MainTest file
 *  Copyright 2021 Celina Alzenor
 */

package ex38;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


public class MainTest {

    @Test
    //tests the filtration of even number
    public void evenTest()
    {
        Identify test = new Identify();
        int [] testarr1 = {1,2,3,4,5,6,7,8,9,10,11,12};
        int [] testarr2 = {1,-23,63,234,-345,-4436,2347,68};
        int [] testarr3 = test.filterEvenNumbers(testarr1);
        int [] testarr4 = test.filterEvenNumbers(testarr2);

        for (int j : testarr3) {

            assertEquals(0, j % 2);
        }

        for (int j : testarr4) {

            assertEquals(0, j % 2);
        }

    }

    @Test
    //tests to ensure that the filtration method runs null if no even numbers are present
    public void allOdd()
    {
        Identify test = new Identify();
        int [] testarr1 = {1,3,5,7,9,11,13,15,17,19,21};
        int [] testarr2 = {-1,-57,31,43,-99,-83,5};
        int [] testarr3 = test.filterEvenNumbers(testarr1);
        int [] testarr4 = test.filterEvenNumbers(testarr2);

        assertNull(testarr3);
        assertNull(testarr4);
    }
}
