package day15_ForLoops;
       /*
         warmup tasks:
	     1. write a program that asks user's first and last name, then prints out the initials of the user
			Ex:
				input:
					cybertek
					batch12
				output:your initial is: CB
        */

import java.util.Scanner;

public class Task1_Initials {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your first name");
        String name= input.next();
        System.out.println("Enter your last name");
        String lName= input.next();

        //substring
        name=name.substring(0,1).toUpperCase();
        lName=lName.substring(0,1).toUpperCase();
        System.out.println(name+lName);

        //charAt
        //Normally you cannot call string object with char
        //by concatenating with "" you convert char characters to string
        String initials=""+name.charAt(0) + lName.charAt(0); //
        initials=initials.toUpperCase();
        System.out.println(initials);

    }
}
