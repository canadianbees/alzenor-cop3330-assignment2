/*
 *  UCF COP3330 Fall 2021 Assignment 2 Exercise 34 Employee class file
 *  Copyright 2021 Celina Alzenor
 */

package ex34;

import java.util.ArrayList;

public class Employees {

    private final ArrayList<String> workplace;

    //makes the array
    public Employees() {
        this.workplace = new ArrayList<>();
        this.workplace.add("John Smith");
        this.workplace.add("Jackie Jackson");
        this.workplace.add("Chris Jones");
        this.workplace.add("Amanda Cullen");
        this.workplace.add("Jeremy Goodwin");
    }

    public ArrayList<String> getWorkplace() {
        return workplace;
    }

    public boolean fireEmp(String removeThis) {
        int numEmpy = this.workplace.size();

        //if the name is in the array, remove it and update the number of employees
        if (this.workplace.contains(removeThis)) {
            this.workplace.remove(removeThis);
            numEmpy--;
            System.out.println("There are " + numEmpy + " employees:");
            this.printEmpy();


        }

        //if not, name doesn't exist
        else {
            System.out.println(removeThis + " does not exist.");
            return false;
        }

        //name was removed, return true
        return true;
    }

    //prints the list of employees
    public void printEmpy() {

        //for each name in the workplace array, print it
        for (String s : this.workplace) {
            System.out.println(s);
        }
    }
}