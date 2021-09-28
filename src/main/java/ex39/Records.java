/*
 *  UCF COP3330 Fall 2021 Assigment 2 Exercise 39 Records class file
 *  Copyright 2021 Celina Alzenor
 */

package ex39;

import java.util.*;

public class Records {

    //returns a tree map of people
    public Map<String, People> makeList()
    {
        Map<String, People> list = new TreeMap<>();

        list.put("Johnson", new People("John","Johnson","Manager","2016-12-31"));
        list.put("Xiong", new People("Tou","Xiong","Software Engineer","2016-10-05"));
        list.put("Michaelson", new People("Michaela","Michaelson","District Manager","2015-12-19"));
        list.put("Jacobson", new People("Jake","Jacobson","Programmer",""));
        list.put("Jackson", new People("Jacquelyn","Jackson","DBA",""));
        list.put("Webber", new People("Sally","Webber","Web Developer","2015-12-18"));

        return list;

    }

    public boolean sort(Map<String, People> list)
    {
        //prints the header for the table
        System.out.format("%-20s| %-18s| %s\n","Name","Position","Separation Date");
        System.out.format("--------------------|-------------------|-----------------\n");

        for(Map.Entry<String, People> s : list.entrySet())
        {
            //gets the last name
           String find = s.getKey();

           //finds the information based on the key
           String lName = list.get(find).getLname();
           String fName = list.get(find).getFname();
           String pos = list.get(find).getPos();
           String sepDate = list.get(find).getDate();

           StringBuilder fullname = new StringBuilder(fName +" "+lName); //joins first name and last name together
           StringBuilder position = new StringBuilder(pos);

           //until the border is reached, add space
           while(fullname.length() <= 18)
           {
               fullname.append(" ");
           }

           while(position.length() <= 16)
           {
                position.append(" ");
           }
            System.out.println(fullname+" | "+position+" | "+sepDate);
        }

        return true;
    }
}


