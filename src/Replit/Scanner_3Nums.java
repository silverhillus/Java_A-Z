package Replit;

import java.util.Scanner;

public class Scanner_3Nums {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE:
        Scanner number = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int num1 = number.nextInt();
        int num2 = number.nextInt();
        int num3 = number.nextInt();
        int sum = num1 + num2 + num3;
        System.out.println("Sum of numbers: " + sum);
        System.out.println("======================");

        Scanner num = new Scanner(System.in);

        System.out.println("Enter your area code");
        int areaCode=num.nextInt();
        System.out.println("Enter your local number");
        int localNumber=num.nextInt();
        String phoneNumber="("+areaCode+")"+"-"+localNumber;

        System.out.println("Calling number "+phoneNumber);
        System.out.println("===========================");




    }
}

