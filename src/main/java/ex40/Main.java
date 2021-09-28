/*
 *  UCF COP3330 Fall 2021 Assigment 2 Exercise 40 Solution
 *  Copyright 2021 Celina Alzenor
 */

package ex40;


public class Main {

    public static void main(String [] args)
    {
        EmpRecords empRecs = new EmpRecords();

        //finds the employees
        empRecs.findEmp(empRecs.makeList(), empRecs.input());
    }
}
