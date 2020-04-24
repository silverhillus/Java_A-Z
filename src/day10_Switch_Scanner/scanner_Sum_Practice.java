package day10_Switch_Scanner;

import java.util.Scanner;

public class scanner_Sum_Practice {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Enter the first byte number: ");
        //Scanner Methods >> nextByte()
        Byte num1=input.nextByte();

        System.out.println("Enter the second byte number: ");
        //Scanner Methods >> nextByte()
        Byte num2=input.nextByte();

        int sum=num1 + num2;
        System.out.println("Sum of the numbers is: "+ sum);

        System.out.println("============================");


        /*
        write a program for the rate calculater: rateCalculator
                        1. asks the user to enter salary (as integer)
                        2. asks the user how many hours does she/he works in a week
                        3. print the hourly rate
         */


        //Scanner Methods >> nextInt()
        Scanner input1 = new Scanner(System.in);


        System.out.println("Please enter your salary as integer: $");
        int salary =input1.nextInt();

        System.out.println("Please enter your work hours per week: ");
        int workHours =input1.nextInt();

        double hourlyRate= salary / workHours*52;
        System.out.println("Your hourly rate is: $" +hourlyRate );







    }
}

