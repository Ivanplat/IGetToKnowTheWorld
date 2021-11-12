package com.EventGraph;

import java.util.Arrays;
import java.util.Scanner;

public class FibonachiNumberHandler
{
    //Public constructor
    public FibonachiNumberHandler()
    {
        int CountOfNumbers = 2;
        //Call private methode initFibonachi(int);
        initFibonachi(CountOfNumbers);
        //Call private methode fillTheFibonachi();
        fillTheFibonachi();
    }
    //Public methode to get a number at some position
    public void numberAt()
    {
        //Ask an user to enter the position which they would like to find
        System.out.print("Enter the position which you would like to find: ");

        //Create an object of Scanner class from java.utils.Scanner
        Scanner sc = new Scanner(System.in);
        //Read the next line as an integer and assign it value to int n
        int n = sc.nextInt();

        //Check if n > length of arr
        if(n > arr.length)
        {
            //Print to user that the value is more...
            System.out.println("This value is more than Fibonachi numbers array initialized! The array will be expaned");
            //Expand the array
            expandFibonachiNumbersArray(n);
        }
        //Print the position and the number at this position
        System.out.printf("The number at position %d is %d", n, arr[n-1]);

    }
    public void showFirstNumbers()
    {
        //Ask an user to enter the count of Fibonachi numbers
        System.out.print("Enter the count of Fibonachi nubers: ");

        //Create an object of Scanner class from java.utils.Scanner
        Scanner sc = new Scanner(System.in);
        //Read the next line as an integer and assign it value to int n
        int n = sc.nextInt();

        //Check if n > length of arr
        if(n > arr.length)
        {
            //Print to user that the value is more...
            System.out.println("This value is more the Fibonachi numbers array initialized! The array will be expaned");
            //Expand the array
            expandFibonachiNumbersArray(n);
        }
        //For each index from 0 to n
        for(int i = 0; i < n; i++)
        {
            //Print the Fibonachi number at i position
            System.out.println(arr[i]);
        }
    }
    //Private methode to initialize Fibonachi numbers
    private void initFibonachi(int CountOfNumbers)
    {
        //Crete a new array with CountOfNumbers size
        arr = new int[CountOfNumbers];
        //Set arr value at 0 index = 1
        arr[0] = 1;
        //Set arr value at 1 index = 1
        arr[1] = 1;
    }
    //Private methode to fill Fibonachi numbers from default start point
    private void fillTheFibonachi()
    {
        //For each index from 2 to length of arr in arr
        for(int i = 2; i < arr.length; i++)
        {
            //Fill the arr
            arr[i] = arr[i-1]+arr[i-2];
        }
    }
    //Private methode to fill Fibonachi numbers from user start point
    private void fillTheFibonachi(int startPoint)
    {
        //For each index from startPoint to length of arr in arr
        for(int i = startPoint; i < arr.length; i++)
        {
            //Fill the arr
            arr[i] = arr[i-1]+arr[i-2];
        }
    }
    //Private methode for expand Fibonachi numbers array
    private void expandFibonachiNumbersArray(int newSize)
    {
        //Get all size
        int OldSize = arr.length;
        //Expand the array
        arr = Arrays.copyOf(arr, newSize);
        //Fill new values
        fillTheFibonachi(OldSize);
    }
    //Private class field array of Fibonaci numbers
    private int []arr;
}
