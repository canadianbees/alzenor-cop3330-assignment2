/*
 *  UCF COP3330 Fall 2021 Exercise 24 Solution
 *  Copyright 2021 Celina Alzenor
 */
package ex24;

import java.util.Scanner;

public class Main
{
    public static void main( String[] args )
    {
        //asks user to enter two strings
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");

        System.out.print("Enter the first string: ");
        String word1 = input.next();

        System.out.print("Enter the second string: ");
        String word2 = input.next();

        Word words = new Word(word1,word2);

        //if input is an anagram, print the result
         if(words.isAnagram())
         {
             System.out.print("\""+words.getWord1()+"\""+" and "+"\""+words.getWord2()+"\" are anagrams.");
         }

         else
         {
             System.out.print("\""+words.getWord1()+"\""+" and "+"\""+words.getWord2()+"\" are not anagrams.");
         }

    }
}
