package com.EventGraph;

import java.util.Arrays;
import java.util.Scanner;

public class StringH
{
    public void countOfLetters()
    {
        //Create an object of Scanner class from java.utils.Scanner
        Scanner sc = new Scanner(System.in);
        //Ask an user to enter a string
        System.out.print("Enter a string: ");
        //Read next line as string and assign it value to String str
        String str = sc.nextLine();

        //Create a new int array with 26 elements
        int []Letters = new int[26];

        //For each index in str
        for(int i = 0; i < str.length(); i++)
        {
            //Get current character
            char c = str.toLowerCase().charAt(i);
            //Get char as int
            int val = (int)c;
            //If char is letter
            if(val >= 97 && val <= 122)
            {
                //Increment a value at position of this letter
                Letters[c-'a']++;
            }
        }
        //Get sum of the array
        int Sum = Arrays.stream(Letters).sum();
        //For each index in Letters
        for(int i = 0; i<Letters.length; i++)
        {
            //If value of current position > 0 then print count of this letter at given string and its percentage
            if(Letters[i] > 0)
            {
                System.out.printf("The count of `%c` is %x, the percentage is %f \n", (char)97+i, Letters[i], (double)Letters[i]/Sum);
            }
        }

    }
}
