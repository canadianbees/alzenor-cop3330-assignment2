/*
 *  UCF COP3330 Fall 2021 App Test file
 *  Copyright 2021 Celina Alzenor
 */

package org.example;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple Main.
 */
public class AppTest 
{
    @Test
    public void shouldAnswerWithTrue()
    {
        Word test = new Word("dog","god");
        assertTrue(test.isAnagram());

        Word test2 = new Word("meat","team");
        assertTrue(test2.isAnagram());

    }

    @Test
    public void shouldBeFalse()
    {
        Word test3 = new Word("cat","feline");
        assertFalse(test3.isAnagram());

        Word test4 = new Word("note","tore");
        assertFalse(test4.isAnagram());
    }

}
