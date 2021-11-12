/*
 * Laboratory work #4. Platonov Ivan, group 02121-DB, IMIT ISU.
 * Block "I get to know the world!"
 * */
package com.EventGraph;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //Call a static methode selectProgram()
        selectProgram();
    }
    static public void selectProgram()
    {
        //Print to user that they need to choose a program
        System.out.print("Need to choose a program: \n1)Array\n2)String\n3)ToBinary\n4)Fibonachi\n");
        //Create an object of Scanner class from java.utils.Scanner
        Scanner sc = new Scanner(System.in);
        //Read next line as an integer
        int Selected = sc.nextInt();

        //Make a switch at selection
        switch (Selected)
        {
            //In case of Selected == 1
            case 1 ->
                    {
                        //Create an object of ArrH class from com.EventGraph.ArrH
                        ArrH ar = new ArrH();
                        //Call doArray() methode
                        ar.doArray();
                    }
                    //In case of Selected == 2
            case 2 ->
                    {
                        //Create an object of StringH class from com.EventGraph.StringH
                        StringH st = new StringH();
                        //Call countOfLetters() methode
                        st.countOfLetters();
                    }
                    //In case of Selected == 3
            case 3 ->
                    {
                        //Create an object of NumbersHandler class from com.EventGraph.NumbersHandler
                        NumbersHandler nh = new NumbersHandler();
                        //Call countOfLetters() methode
                        nh.toBinary();
                    }
                    //In case of Selected == 4
            case 4 ->
                    {
                        //Create an object of FibonachiNumberHandler class from com.EventGraph.FibonachiNumberHandler
                        FibonachiNumberHandler fh = new FibonachiNumberHandler();
                        //Call showFirstNumbers() methode
                        fh.showFirstNumbers();
                        //Call numberAt() methode
                        fh.numberAt();
                    }
                    //In other cases
            default ->
                    {
                        //Print to user that they did a wrong choice
                        System.out.println("This is not correct choice! Try again!");
                        //Call itself methode (try again)
                        selectProgram();
                    }
        }
    }
}
