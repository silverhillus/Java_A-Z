package day12_JavaRecap;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the product price and quantity");
        double price = scan.nextDouble();
        double quantity = scan.nextDouble();
        double revenue = price * quantity;
//double newRevenue =9.0;
        System.out.println("The revenue is: " + revenue);
        if (revenue >= 5000) {
            double newRevenue = revenue - (revenue * 0.1);
            System.out.println("After discount new revenue is: " + newRevenue);
        }

    }
}
