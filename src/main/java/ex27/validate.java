/*
 *  UCF COP3330 Fall 2021 Assigment 2 Exercise 27 validate Class file
 *  Copyright 2021 Celina Alzenor
 */

package ex27;

public class validate
{
    private final String fName;
    private final String lName;
    private final String zip;
    private final String ID;

    //constructor
    public validate(String fName, String lName, String zip, String ID) {
        this.fName = fName;
        this.lName = lName;
        this.zip = zip;
        this.ID = ID;
    }

    //checks if first name meets conditions
    public int valiFirst()
    {
        //tally mark for conditions broken
        int tally = 0;

        //if user inputted nothing, mark it
        if(this.fName.isEmpty())
        {
            tally++;
        }

        //if user did not meet the character limit, mark it
        if(this.fName.length() < 2)
        {
            tally++;
        }

        return tally;
    }

    //works the same way as the valiFirst() method
    public int valiLast()
    {
        int tally = 0;

        if(this.lName.isEmpty())
        {
            tally++;
        }

        if(this.lName.length() < 2)
        {
            tally++;
        }

        return tally;
    }

    //if the id matches the format, return true
    public boolean valiID()
    {
        return this.ID.matches("^[A-Z]{2}-\\d{4}");
    }

    //if the zip code matches the format, return true
    public boolean valiZip()
    {
        return this.zip.matches("\\d{5}");
    }

    //one big method to validate all the input
    public String validateInput()
    {
        //empty string
        String output = "";

        //if there is at least 1 tally
        if(this.valiFirst() >= 1)
        {
            //if there are two, add the appropriate rule
            if(this.valiFirst() == 2)
            {
                output = "The first name must be filled in.\n";
            }

            //add the rule
            output = output + "The first name must be at least 2 characters long.\n";
        }

        //works the same way as the above if statement
        if(this.valiLast() >= 1)
        {
            if(this.valiLast() == 2)
            {
                output = output + "The last name must be filled in.\n";
            }

            output = output + "The last name must be at least 2 characters long.\n";
        }

        //if the user did not input the id in the right format
        if(!this.valiID())
        {
            //add the rule to output
            output = output +"The employee ID must be in the format of AA-1234.\n";
        }

        //if zipcode format is wrong
        if(!this.valiZip())
        {
            //add the rule
            output = output + "The zipcode must be a 5 digit number.";
        }

        //if nothing was added to the output string, every condition is satisfied
        if(output.equals(""))
        {
            output = "There were no errors found.\n";
        }

        //print output
        System.out.print(output);
        return output;
    }
}
