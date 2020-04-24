package day14_StringManipulations;
       /*
        Assignment:
            write me a program that asks the user first and last names, then prints the initials.
            ex: input:
                    cybertek
                    school
                output:
                    CS
         */

import java.util.Scanner;

public class Assignment_String_Initials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Enter first and last name
        System.out.println("Enter your first and last name");
        String fName = input.nextLine();
        String lName = input.nextLine();
        fName = fName.substring(0, 1).toUpperCase();
        lName = lName.substring(0, 1).toUpperCase();
        System.out.println(fName + lName);
        System.out.println("===========");

        //Or Enter full name
        System.out.println("Enter your full name");
        String fullName = input.nextLine();//fatih silverhill //!!!!! make sure to use nextLine() not next();
        String firstName = fullName.substring(0, 1).toUpperCase();
        String lastName = fullName.substring(fullName.indexOf(" ") + 1, fullName.indexOf(" ") + 2).toUpperCase();
        System.out.println(firstName + lastName);

        //All together
        fullName=fullName.substring(0,1).toUpperCase()+fullName.substring(fullName.indexOf(" ")+1,fullName.indexOf(" ")+2).toUpperCase();
        System.out.println(fullName);



        /*
      ATTN: ERRORS!!!
      > fullName.indexOf(" " +1));  / fullName.indexOf(" ")+1 CORRECT
      > fullName.indexOf(" "+2));=
         */


    }
}
