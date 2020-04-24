package day13_StringClass;
/*
    input:
    cyBerTek sChool
    output:
    Cybertek // first capital remaining lowercase
    School // first capital remaining lowercase
 */

import java.util.Scanner;

public class StringManipulations_Practice {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your full name");
        String fullName= input.nextLine();// Cybertek School

        String firstName=fullName.substring(0,fullName.indexOf(" "));
        String lastName= fullName.substring(fullName.indexOf(" ")+1); //prints the remaining

        //First letter of the first name is Capital
        //First letter of the last name is Capital

                  //prints first letter   to upper case +  prints the remaining  to lower case
        firstName=firstName.substring(0,1).toUpperCase()+ firstName.substring(1).toLowerCase();
        lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();

        /*YOU CANNOT APPLY toUpperCase() to char
        firstName=""+firstName.charAt(0))toUpperCase()+ firstName.substring(1).toLowerCase();
        lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();

         */

        System.out.println(firstName);
        System.out.println(lastName);


    }
}
