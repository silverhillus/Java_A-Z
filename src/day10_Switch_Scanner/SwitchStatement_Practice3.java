package day10_Switch_Scanner;
/*
Task§
Create a new switch statement using char instead of int.
§Create a new char variable
§Create a switch statement testing for A, B, C, D or E
§Display a message if any of these are found and then break
§Add a default which displays a message saying not found.
 */

public class SwitchStatement_Practice3 {
    public static void main(String[] args) {
        char ch='C';
        String result="";

        switch (ch){
            case 'A':
                //System.out.println("A");
                result="A";
                break; // if it matches exit case
            case 'B':
                //System.out.println("B");
                result="B";

            case 'C':
                //System.out.println("C");
                result="C";

            case 'D':
                //System.out.println("D");
                result="D";
                break;
            default:
                //System.out.println("Not found!");
                result="Not found!";
                //  break; // it's the end so no need break.
        }

        System.out.println(result);

        System.out.println("======================");



    }
}
