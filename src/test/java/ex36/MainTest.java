/*
 *  UCF COP3330 Fall 2021 Assignment 2 Exercise 36 MainTest file
 *  Copyright 2021 Celina Alzenor
 */

package ex36;

import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    //test to find the average value in an arraylist
    public void avgTest()
    {
        ArrayList<Integer> testarr = new ArrayList<>();
        data test = new data();
        testarr.add(100);
        testarr.add(41);
        testarr.add(23);
        testarr.add(78);
        assertEquals(60.5, test.average(testarr),0.5);

        ArrayList<Integer> testarr1 = new ArrayList<>();
        testarr1.add(5);
        testarr1.add(97);
        testarr1.add(6542);
        testarr1.add(720);
        testarr1.add(-35);
        testarr1.add(120);
        testarr1.add(-63);
        testarr1.add(-45);
        assertEquals(917.6, test.average(testarr1),0.5);

    }

    @Test
    //test to find the min value in an arraylist
    public void minTest()
    {
        ArrayList<Integer> testarr = new ArrayList<>();
        data test = new data();
        testarr.add(5);
        testarr.add(97);
        testarr.add(6542);
        testarr.add(720);
        testarr.add(-35);
        testarr.add(120);
        testarr.add(-63);
        testarr.add(-45);
        assertEquals(-63,test.minimum(testarr));

    }

    @Test
    //test to find the max value in an arraylist
    public void maxTest()
    {
        ArrayList<Integer> testarr = new ArrayList<>();
        data test = new data();
        testarr.add(100);
        testarr.add(41);
        testarr.add(23);
        testarr.add(78);
        assertEquals(100,test.maximum(testarr));

    }

    @Test
    //test to find the standard deviation in an arraylist
    public void stdTest()
    {
        ArrayList<Integer> testarr = new ArrayList<>();
        data test = new data();
        testarr.add(5);
        testarr.add(97);
        testarr.add(6542);
        testarr.add(720);
        testarr.add(-35);
        testarr.add(120);
        testarr.add(-63);
        testarr.add(-45);
        assertEquals(2139.24,test.std(testarr),0.05);

    }
}
