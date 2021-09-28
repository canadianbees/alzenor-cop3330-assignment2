/*
 *  UCF COP3330 Fall 2021 Assigment 2 Exercise 37 password class file
 *  Copyright 2021 Celina Alzenor
 */

package ex37;
import java.util.*;

public class password
{
    //asks user the minimum length they would like their password to be
    public int getMinInput()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("What's the minimum length? ");
         return input.nextInt();
    }

    //asks user how many special characters
    public int getSpecInput()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("How many special characters? ");
        return input.nextInt();
    }

    //asks user how many numbers they would like in their password
    public int getNumInput()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers? ");
        return input.nextInt();
    }

    public String passGen(int min, int spec, int num)
    {
        char [] specChar = "!@#$%^&*()_+~`];<>/?,.-={}|\"'\\".toCharArray();
        ArrayList<Character> specList = new ArrayList<>();
        ArrayList<Integer> numList = new ArrayList<>(10);
        ArrayList<Character> alphaList = new ArrayList<>(26);

        Random rand = new Random();
        StringBuilder draft = new StringBuilder();

        //add characters in the special character array to the list.
        for(char c : specChar)
        {
            specList.add(c);
        }

        //add numbers 0-9 to a list
        for(int i = 0; i < 10; i++)
        {
            numList.add(i);
        }

        //add letters of the alphabet to the list
        for(char letter = 'a'; letter <= 'z'; letter++)
        {
            alphaList.add(letter);
        }

        //adds a number of special characters to the password based on user input
        for(int i =0; i < spec; i++)
        {
            draft.append(specList.get(rand.nextInt(specList.size())));

        }

        //adds a number of special characters to the password based on user inpu
        for(int i =0; i < num; i++)
        {
            draft.append(numList.get(rand.nextInt(numList.size())));
        }

        //calculates number of chars needed to meet min length, plus 1 to make to its at least the number of special characters + numbers
        //int left = min - (spec+num) +1;

        //randomly selects how many numbers to put from the number of characters left to the sum of special characters and number of numbers
        int numLetters = 0;

        boolean valid = false;
        while(!valid)
        {
            numLetters = rand.nextInt((min)) + (spec+num);

            if(numLetters >= (spec+num))
            {
                valid = true;
            }
        }

        //adds a number of letters based on the minimum length
        for(int i = 0; i < numLetters; i++)
        {
            draft.append(alphaList.get(rand.nextInt((alphaList.size()))));
        }

        //puts the draft password into a list
        List<String> shuffPass = Arrays.asList(draft.toString().split(""));

        //shuffles the draft password
        Collections.shuffle(shuffPass);

        StringBuilder p = new StringBuilder();

        //adds the characters to the final password variable
        for(String c : shuffPass)
        {
            p.append(c);
        }

        //return the randomly generated password
        return p.toString();
    }
}
