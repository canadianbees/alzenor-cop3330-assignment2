/*
 *  UCF COP3330 Fall 2021 Assignment 2 Exercise 34 MainTest file
 *  Copyright 2021 Celina Alzenor
 */

package ex34;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class MainTest {
    @Test
    //this test checks for status before and after the removal of the name
    public void beforeAndAfter()
    {
        Employees test1 = new Employees();
        test1.printEmpy(); //prints the list before anyone is removed
        System.out.println();
        assertTrue(test1.fireEmp("Amanda Cullen")); //removes the employee
        assertFalse(test1.fireEmp("Amanda Cullen")); //employee is no longer there so this should return false

        System.out.println();
        Employees test2 = new Employees();
        test2.printEmpy();
        System.out.println();
        assertTrue(test2.fireEmp("Jeremy Goodwin"));
        assertFalse(test2.fireEmp("Jeremy Goodwin"));

        System.out.println();
        Employees test3 = new Employees();
        test3.printEmpy();
        System.out.println();
        assertTrue(test3.fireEmp("Chris Jones"));
        assertFalse(test3.fireEmp("Chris Jones"));

    }

    @Test
    //this test checks for names that do not exist
    public void doesNotExist()
    {
        Employees test1 = new Employees();
        assertFalse(test1.fireEmp("Beyonce"));

        Employees test2 = new Employees();
        assertFalse(test2.fireEmp("Bruce Wayne"));

        Employees test3 = new Employees();
        assertFalse(test3.fireEmp("Chris Cullen"));
    }

}
