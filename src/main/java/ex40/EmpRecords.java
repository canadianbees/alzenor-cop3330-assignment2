/*
 *  UCF COP3330 Fall 2021 Assigment 2 Exercise 40 EmpRecords class file
 *  Copyright 2021 Celina Alzenor
 */

package ex40;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class EmpRecords {

    //returns a tree map of people
    public Map<String, Workers> makeList()
    {
        Map<String, Workers> list = new TreeMap<>();

        list.put("Johnson", new Workers("John","Johnson","Manager","2016-12-31"));
        list.put("Xiong", new Workers("Tou","Xiong","Software Engineer","2016-10-05"));
        list.put("Michaelson", new Workers("Michaela","Michaelson","District Manager","2015-12-19"));
        list.put("Jacobson", new Workers("Jake","Jacobson","Programmer",""));
        list.put("Jackson", new Workers("Jacquelyn","Jackson","DBA",""));
        list.put("Webber", new Workers("Sally","Webber","Web Developer","2015-12-18"));

        return list;

    }

    public boolean findEmp(Map<String, Workers> list, String search)
    {
        //prints the header for the table

        System.out.format("Results:\n%-20s| %-18s| %s\n","Name","Position","Separation Date");
        System.out.format("--------------------|-------------------|-----------------\n");

        for(Map.Entry<String, Workers> s : list.entrySet())
        {
            //gets the last name
           String find = s.getKey();

           //finds the information based on the key
           String lName = list.get(find).getLname();
           String fName = list.get(find).getFname();
           String pos = list.get(find).getPos();
           String sepDate = list.get(find).getDate();


           //if the first name contains the keywords, print it
           if(fName.contains(search))
           {
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


        }

        return true;
    }

    //gets user input
    public String input()
    {
        Scanner findThis = new Scanner(System.in);
        System.out.print("Enter a search string: ");

        return findThis.next();
    }
}


