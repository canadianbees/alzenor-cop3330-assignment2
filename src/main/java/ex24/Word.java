/*
 *  UCF COP3330 Fall 2021 Word Class file
 *  Copyright 2021 Celina Alzenor
 */

package ex24;
import java.util.Arrays;


public class Word
{
    private final String word1;
    private final String word2;

    public Word(String word1, String word2)
    {
        this.word1 = word1;
        this.word2 = word2;
    }

    //getting the strings since it is private
    public String getWord1() {
        return word1;
    }

    public String getWord2() {
        return word2;
    }

    //returns true if it is an anagram and false if it is not
    public boolean isAnagram()
    {
        //getting the length of both words
        int len1 = this.word1.length();
        int len2 = this.word2.length();

        //if they aren't the same length, they aren't anagrams so return false
        if(len1 != len2)
        {
            return false;
        }

        //creating arrays for each word
        char [] ch2 = new char[len2];
        char [] ch1 = new char[len1];

        //copy the letters of each word into their respective array
        for(int i = 0; i < len1; i++)
        {
            ch1[i] = this.word1.charAt(i);
            ch2[i] = this.word2.charAt(i);
        }

        //sort the arrays alphabetically
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        //goes through each letter and checks if they are the same
        for(int i = 0; i < len1; i++)
        {
            //if they do not consist of the same letters, they are not anagrams, return false
            if(ch1[i] != ch2[i])
            {
                return false;
            }
        }

        //at this point they are anagrams, return true
        return true;
    }
}
