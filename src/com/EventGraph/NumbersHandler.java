package com.EventGraph;

import java.util.Scanner;

public class NumbersHandler
{
    //Public function to call from outside of class
    public void toBinary()
    {
        //Create an object of Scanner class from java.utils.Scanner
        Scanner cs = new Scanner(System.in);
        //Ask an user to enter a number
        System.out.println("Enter a number: ");
        //Read the next line as an integer and assign it value to int Number
        int Number = cs.nextInt();

        //Check is Number negative
        boolean IsNegative = Number < 0;

        //If it is negative then multiply it to (-1)
        Number = IsNegative ? Number*(-1) : Number;

        //Create an object of StringBuilder

        StringBuilder BinNumberString = new StringBuilder();

        while(Number > 0)
        {
            //Append to string new char which value is 0 or 1
            BinNumberString.append((char) (Number % 2 + '0'));
            //Divide Number on 2
            Number /= 2;
        }
        //If the source number was negative then we add '1' to the BinNumberString else add '0'
        BinNumberString.append(IsNegative ? '1' : '0');

        //Reverse the string
        BinNumberString = new StringBuilder(BinNumberString.reverse().toString());


        //Check is negative
        if(IsNegative)
        {
            //Make the string in additional code
            BinNumberString = new StringBuilder(toAdditional(BinNumberString.toString()));
        }
        //Print the binary number
        System.out.printf("The binary is %s\n", BinNumberString);
    }
    //Private methode to call inside class, using for making the number additional
    private String toAdditional(String str)
    {
        //Make an array of chars from inputted string
        char []arr = str.toCharArray();
        //For each index in arr, except 0
        for(int i = 1; i < arr.length; i++)
        {
            //Reverse the number
            int ni = (arr[i] - '0')==1 ? 0 : 1;
            //Set new value
            arr[i] = (char)(ni + '0');
        }
        //Return new string
        return String.copyValueOf(arr);
    }
}
