package day12_JavaRecap;
/*
4. Revenue can be calculated as the selling price of the product times the quantity sold,
    i.e. revenue = price × quantity.
    Write a program that asks the user to enter product price and quantity
    and then calculate the revenue.
    If the revenue is more than 5000 a discount is 10% offered.
    Program should display the discount and net revenue.
 */

import java.util.Scanner;

public class Scanner_WarmupTask4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the product price and the quantity sold:");
        double product = input.nextDouble();
        int quantity = input.nextInt();

        double revenue = product * quantity;
        double discount = revenue * 0.1;
        double netRevenue=revenue*0.9;

        if (revenue >= 5000) {

            System.out.println("The revenue is: $" + revenue);
            System.out.println("The 10 % discount you received is: $" + discount);
            System.out.println("The net revenue after discount is: $" +netRevenue );
        } else {
            System.out.println("The revenue is: $" + revenue);
        }


    }
}
