package Replit;

import java.util.Scanner;

public class r148_next3 {

    public static void main(String[] args) {

        /*
        Create a method called next3 . This method gets an int argument and prints the next 3 numbers after that number. Call the method from main method and pass num to it.

enter number
1
next 3 are:
2 3 4
         */

        Scanner inp = new Scanner(System.in);
        System.out.print("enter number");
        int num = inp.nextInt();
        next3(num);


    }
    public static void next3(int n){

        String result="";
        for (int i=0; i<3; i++){
            result+=(n+1)+" ";
            n++;
       }
        System.out.println(result);


        }

    }

