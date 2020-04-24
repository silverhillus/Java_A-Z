package selfStudy;

import java.util.Scanner;

public class Revision1 {
    public static void main(String[] args) {

         /*
         warmup tasks:
	     1. write a program that asks user's first and last name, then prints out the initials of the user
			Ex:
				input:
					cybertek
					batch12
				output:your initial is: CB
        */

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your first and last name");
        String fName=input.next();
        String lName=input.next();
        fName=""+fName.charAt(0);
        lName=""+lName.charAt(0);
        System.out.println(fName.toUpperCase()+lName.toUpperCase());



    }
}
