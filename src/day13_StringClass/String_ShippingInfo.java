package day13_StringClass;
/*
2. write a program for the shipping info that, the program should ask:
					building number
					Street address (Assume it has more than one word) //nextLine
					city name
					state name
					zip code
					full name of the person:
			and prints the ship to info in the following format:
			ex output:
					Ship To:  Jimmy joe
							  7925 Jones Branch Dr
							  MCLean, VA 22102
 */

import java.util.Scanner;

public class String_ShippingInfo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("This is shipping Info page" + "\nPlease enter building number");

        String buildingNum=input.next(); // it only takes one word but not enter so
        input.nextLine();// i need to use this to return enter !!!!!!!in between input.next,nextInt,nextByte... and nextLine!!!!!!!!

        /*so 1.next or nextInt or nextByte...
        input.nextLine(); >> extra nextLine needed
             2.nextLine

             BUT
             1.next or nextInt or nextByte...
             NO NEED!!!
             2.next

         */

        System.out.println("Enter your street address");
        String street=input.next();
        System.out.println("Enter your city name");

        String cityName=input.next(); // next does not take enter so
        input.nextLine();// extra nextline needed

        System.out.println("Enter your state name");
        String stateName=input.nextLine();
        System.out.println("Enter your  zipcode");

        String zipcode=input.next(); // next does not take enter so
        input.nextLine();// extra nextline needed

        System.out.println("Enter your full name");
        String fullName=input.nextLine();

        String result= "Ship to:"+"\t" +
                fullName +"\n\t\t\t"+buildingNum +" "+ street+ "\n\t\t\t"+
                cityName+", "+stateName +" "+zipcode;

        System.out.println(result);












    }
}
