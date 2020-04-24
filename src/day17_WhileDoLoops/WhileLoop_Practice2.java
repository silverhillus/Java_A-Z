package day17_WhileDoLoops;

import java.util.Scanner;

public class WhileLoop_Practice2 {
    public static void main(String[] args) {
        //FOR
        for (int i=1; i<=100; i++){
            System.out.print("*");//PRINTS> ****************************************************************************************************
        }

        System.out.println();

        //WHILE
        int i=0;//declare variable OUTSIDE the loop and initialize first!!!!
            //boolean
        while(i<100){
            System.out.print("*");//PRINTS> ****************************************************************************************************
            i++;//iterator at the end
        }

        // *RESULT: Every for loop can be converted into while loop*

        System.out.println();




    }
}
