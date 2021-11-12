package com.EventGraph;

import java.util.Arrays;
import java.util.Scanner;

public class ArrH
{
    public void doArray()
    {
        //Ask a user to enter a size of a new array
        System.out.println("Enter a new size of a new array: ");
        //Create an object of Scanner class from java.utils.Scanner
        Scanner sc = new Scanner(System.in);
        //Read the next line as an integer and set it value to int Size
        int Size = sc.nextInt();
        //Create new array of double with initialized  size
        double []arr = new double[Size];

        //For each index of the array
        for(int i = 0; i <Size; i++)
        {
            //Set a value to each array element as a random value
            arr[i] = Math.random();
        }
        //Sort the array
        Arrays.sort(arr);
        //Print the min element, max element and middle element
        System.out.printf("Min number: %f - Max number: %f - Middle number: %f", arr[0], arr[Size-1], arr[Math.round(Size/2)]);
    }
}
