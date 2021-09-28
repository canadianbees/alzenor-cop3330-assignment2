/*
 *  UCF COP3330 Fall 2021 Assigment 2 Exercise 40 Workers class file
 *  Copyright 2021 Celina Alzenor
 */

package ex40;

public class Workers {
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
    public Workers(String fname, String lname, String pos, String date) {
        this.fname = fname;
        this.lname = lname;
        this.pos = pos;
        this.date = date;
    }
}
