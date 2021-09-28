/*
 *  UCF COP3330 Fall 2021 Assigment 2 Exercise 27 AppTest file
 *  Copyright 2021 Celina Alzenor
 */
package ex27;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple Main.
 */
public class AppTest
{
    @Test
    //all tests in this method should have no errors
    public void noErrors()
    {
        validate test1 = new validate("Harry","Potter","36201","HP-0317");
        assertEquals("No errors","There were no errors found.\n",test1.validateInput());

        validate test2 = new validate("Meghan","Smith","32816","MS-6548");
        assertEquals("No errors","There were no errors found.\n",test2.validateInput());

        validate test3 = new validate("Tiffany","Diamonds","47856","TD-5447");
        assertEquals("No errors","There were no errors found.\n",test3.validateInput());

        validate test4 = new validate("Bruce","Wayne","53540","BW-7078");
        assertEquals("No errors","There were no errors found.\n",test4.validateInput());
    }

    @Test
    //these tests include errors in at least one parameter
    public void Errors()
    {
        validate test1 = new validate("s","","1123","Hp-AAAA");
        assertEquals(1, test1.valiFirst());
        assertEquals(2, test1.valiLast());
        assertFalse(test1.valiID());
        assertFalse(test1.valiZip());

        validate test2 = new validate("","Smith","14785","sg-123");
        assertEquals(2, test2.valiFirst());
        assertEquals(0, test2.valiLast());
        assertFalse(test2.valiID());
        assertTrue(test2.valiZip());

        validate test3 = new validate("","","48","55-7895");
        assertEquals(2, test3.valiFirst());
        assertEquals(2, test3.valiLast());
        assertFalse(test3.valiID());
        assertFalse(test3.valiZip());

        validate test4 = new validate("Tim","Drake","53540","110011011011101100001");
        assertEquals(0, test4.valiFirst());
        assertEquals(0, test4.valiLast());
        assertFalse(test4.valiID());
        assertTrue(test4.valiZip());
    }
}
