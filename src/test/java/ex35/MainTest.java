/*
 *  UCF COP3330 Fall 2021 Assignment 2 Exercise 35 MainTest file
 *  Copyright 2021 Celina Alzenor
 */

package ex35;

import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MainTest
{
    @Test
    //assures that the pick method selects the correct winner based on the index given
    public void stringPick()
    {
        ArrayList<String> testarr = new ArrayList<>();
        testarr.add("Mary");
        testarr.add("John");
        testarr.add("Darell");
        testarr.add("Marcus");

        Winner test1 = new Winner();
        assertEquals("Mary",test1.pick(0,testarr));
        assertEquals("John",test1.pick(1,testarr));
        assertEquals("Darell",test1.pick(2,testarr));
        assertEquals("Marcus",test1.pick(3,testarr));
    }

    @Test
    //tests to see that the randomSelect method picks an index that is within range
    public void randomSelectTest()
    {
        ArrayList<String> testarr = new ArrayList<>();
        testarr.add("Mary");
        testarr.add("Lucas");
        testarr.add("Darell");
        testarr.add("Marcus");
        testarr.add("Bruce");
        testarr.add("Hector");
        testarr.add("Julie");
        testarr.add("Emily");

        Winner test1 = new Winner();
        int pick = test1.randomSelect(testarr);

        assertTrue(pick < testarr.size());
    }
}