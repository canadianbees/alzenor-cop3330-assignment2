/*
 *  UCF COP3330 Fall 2021 Assignment 2 Exercise 39 People class fiile
 *  Copyright 2021 Celina Alzenor
 */

package ex39;

public class People {
    private final String fname;
    private final String lname;
    private final String pos;
    private final String date;

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getPos() {
        return pos;
    }

    public String getDate() {
        return date;
    }

    //constructor
    public People(String fname, String lname, String pos, String date) {
        this.fname = fname;
        this.lname = lname;
        this.pos = pos;
        this.date = date;
    }
}
