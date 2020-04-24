package day12_JavaRecap;
/*
scanner warmup tasks:
    1. write a program that can calculate the area of circle
                needed information:
                                    1. radius of the cirle
    2. Ask user to enter two words. Then add them together and print.
                        Input:
                            one
                            eight
                        Output:
                            oneeight
    3. Write a Java Program that can calculate the garde of a student based on the score,
        implement the following logic:
                If marks < 60, then print "Fail"
                If marks >= 60, but less than 90, then print "Pass"
                If marks >= 90, then print "Passed with Distinction"
                MUST use scanner
    4. Revenue can be calculated as the selling price of the product times the quantity sold,
    i.e. revenue = price × quantity. Write a program that asks the user to enter product price and quantity
    and then calculate the revenue. If the revenue is more than 5000 a discount is 10% offered.
    Program should display the discount and net revenue.
 */

import java.util.Scanner;

public class Scanner_WarmupTask1 {
    public static void main(String[] args) {
        //1_ area of circle
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius of the circle:");
        double r = input.nextDouble();
        double area = r * r * 3.14;
        System.out.println("The area of the circle is: " + area);
        System.out.println("===================");

        // 2. Ask user to enter two words.


    }
}
