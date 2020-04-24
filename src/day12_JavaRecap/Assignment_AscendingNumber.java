package day12_JavaRecap;
/*

     Assignment:
        write a program that asks to enter 5 numbers and prints the numbers in ascending order
                Ex:
                    5, 4, 1, 2, 3
                 output:
                    1, 2, 3, 4, 5
        Scanner input= new Scanner(System.in);
        System.out.println("Enter five positive numbers:");
        int num1= input.nextInt();
        int num2= input.nextInt();
        int num3= input.nextInt();
        int num4= input.nextInt();
        int num5= input.nextInt();


        /*String result="";
        result=(num1 > num2 && num2>num3 && num3>num4 && num4>num5)? num1 + ", "+ num2+", "+num3 + ", "+ num4 +", "+num5;

         */

import java.util.Scanner;

public class Assignment_AscendingNumber {
    public static void main(String[] args) {

        // Write a program that accepts 5 numbers, and you need to print out those numbers in ascending order.
        // Whole number or decimals accepted, and provide right boolean expression
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter five numbers:");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double d = scan.nextDouble();
        double e = scan.nextDouble();
        double temp;
        if (a > b) {     // check and assign lowest of abcde to a      //  (a > b) is a boolean expression
            temp = a;
            a = b;
            b = temp;
        }
        if (a > c) {
            temp = a;
            a = c;
            c = temp;
        }
        if (a > d) {
            temp = a;
            a = d;
            d = temp;
        }
        if (a > e) {
            temp = a;
            a = e;
            e = temp;
        }
        if (b > c) {     // check and assign lowest of bcde to b
            temp = b;
            b = c;
            c = temp;
        }
        if (b > d) {
            temp = b;
            b = d;
            d = temp;
        }
        if (b > e) {
            temp = b;
            b = e;
            e = temp;
        }
        if (c > d) {     // check and assign lowest of cde to c
            temp = c;
            c = d;
            d = temp;
        }
        if (c > e) {
            temp = c;
            c = e;
            e = temp;
        }
        if (d > e) {     // check and assign lowest of de to d
            temp = d;
            d = e;
            e = temp;
        }               // don't need to check e
        System.out.println("Ascending Order: " + a + ", " + b + ", " + c + ", " + d + ", " + e);


    }
}
