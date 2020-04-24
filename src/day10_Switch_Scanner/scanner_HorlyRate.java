package day10_Switch_Scanner;

/*
        write a program for the rate calculater: rateCalculator
                        1. asks the user to enter salary (as integer)
                        2. asks the user how many hours does she/he works in a week
                        3. print the hourly rate
         */

import java.util.Scanner;


public class scanner_HorlyRate {
    public static void main(String[] args) {
        //Scanner Methods >> nextInt()
        Scanner input1 = new Scanner(System.in);
        System.out.println("Please enter your annual salary as integer: \n$");
        int salary =input1.nextInt();

        System.out.println("Please enter your work hours per week: ");
        byte workHours =input1.nextByte();

        System.out.println("How many weeks do you work per year: ");
        byte weeks =input1.nextByte();



        double hourlyRate= salary /(workHours*weeks);
        System.out.println("Your hourly rate is: $"+hourlyRate );
    }
}
