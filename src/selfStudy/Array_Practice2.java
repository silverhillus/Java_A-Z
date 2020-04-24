package selfStudy;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Practice2 {
    public static void main(String[] args) {
        /*
        enter five names then find the longest by using arrays!!!!
         */
        Scanner input=new Scanner(System.in);
        String [] names= new String[5];

        for(int i=0; i<names.length; i++){
            System.out.println("Enter a word");
            names[i]=input.next();
        }

        String longest="";
        int max=0;
        for (int i=0; i<names.length; i++){
            if (names[i].length() > max){  //NOTE!!!!!!!!  if its a string array .length() with brackets
               max=names[i].length();
               longest=names[i]; // you have to assign names[i] to String longest inside this if block because that's where we found the max.
            }
        }
        System.out.println("longest word's length: "+ max);
        System.out.println("longest word: "+ longest);


    }
}
