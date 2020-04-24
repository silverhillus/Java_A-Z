package day06_Shorthnd_LogicalOperators;

import java.util.Scanner;// How to Print an Integer entered by an user >> import scanner into class

public class EnterNumbersByUser {
    public static void main(String[] args) {

        // How to Print an Integer entered by an user
        Scanner reader = new Scanner(System.in);
        //to be able to use this you need to import "import java.util.Scanner;" into class before public class.
        System.out.println("Enter two numbers: ");

        int num1 = reader.nextInt();
        System.out.println("You entered: " + num1);

        int num2 = reader.nextInt();
        System.out.println("You entered: " + num2);

        // Write a Java program that will accept two numbers and check if two numbers are equal or not.

        if (num1 == num2){
            System.out.println(num1+" is equal to "+ num2);
        }

        if (num1 != num2){
            System.out.println(num1+" is not equal to "+ num2);
        }

    }
}
