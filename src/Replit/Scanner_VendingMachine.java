package Replit;

import java.io.Serializable;
import java.util.Scanner;
/*
Write a program that determines the change to be dispensed from a vending
machine.
An item in the machine can cost between 25 cents and 1 dollar, in 5-cent
increments (25, 30, 35, . . . , 90, 95, or 100),
and the machine accepts only a single
dollar bill to pay for the item.

- int variable itemPrice
- int variables quarters, dimes, nickels
- Scanner object

Program accepts itemPrice, which is a price for the item you would like to purchase.

Positive behaviour:

Please follow the example in the image. dots mean empty space.
-Since the item price was entered 95, change is 1 nickels

Negative behaviour:

If itemPrice is less than 25 or more than 100 cents, then display error message:
Invalid price!

If itemPrice is not divisible by 5, then also display error message:
Invalid price!

use (itemPrice % 5 == 0) expression to find it is divisible by 5.

Do not display anything else.
 */

public class Scanner_VendingMachine {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter price in cents:");
        int itemPrice= input.nextInt();
        int change= 100- itemPrice;
        int quarters=change/25;
        int dimes=change%25/10;
        int nickels=(change%25)%10/5;
        String result="";

           result= (itemPrice<25 || itemPrice>100 || itemPrice % 5 != 0)? "invalid price!":
                   "Your change is "+ quarters + " quarters " + dimes + " dimes " + "and " + nickels + " nickels.";

        System.out.println(result);
        System.out.println("===================");

        Scanner count= new Scanner(System.in);
        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
        int seniorCitizens= count.nextInt();
        int nonSeniorCitizens=count.nextInt();
        System.out.println("What is new citizen's age?");
        int age= count.nextInt();
        String last="";
        if(age>=65){
            System.out.println("Senior Citizen");
            ++seniorCitizens;
            System.out.println(last+"New seniorCitizens count " +seniorCitizens);
            System.out.println("New nonSeniorCitizens count " +nonSeniorCitizens);

        }else{
            System.out.println("Non-Senior Citizen");
            ++nonSeniorCitizens;
            System.out.println("New seniorCitizens count " +seniorCitizens);
            System.out.println(last+ "New nonSeniorCitizens count " +nonSeniorCitizens);

        }

        /*last=(age>=65)?"Senior Citizen" + ++seniorCitizens :
                "NonSenior Citizen" + ++nonSeniorCitizens ;
        System.out.println(last+ "\nNew seniorCitizens count " +seniorCitizens );
        System.out.println(last+ "\nNew nonSeniorCitizens count " +nonSeniorCitizens );

         */






    }
}
