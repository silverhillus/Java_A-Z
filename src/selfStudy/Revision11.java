package selfStudy;

import Replit.Switch_HTTP;

import java.util.Scanner;

public class Revision11 {
    public static void main(String[] args) {
/*
        Warmup tasks:
        4.	write a program that can calculate the two numbers based on the user provided operators, the program will ask:
        1. enter first number
        2. enter the second number
        3. enter the math operators
        (assume that only the +, -, *, /, and % will be entered)
        then the system will give the result based on the operator
        at the end it will ask if the user want's to calculate another numbers, if user
        entered "NO" or "no", the program will stop execution, otherwise it repeats all the previous steps
        (you will need a lop that has true condition without the iterator)

 */

        int i = 0;
        while (i > -1) {
            Scanner input = new Scanner(System.in);
            System.out.println("enter two numbers");
            double num1 = input.nextDouble();
            double num2 = input.nextDouble();
            System.out.println("enter math operator");
            String op = input.next();
            String result = "";

            switch (op) {
                case "+":
                    result="the result is: " + (num1 + num2);
                    break;

                case "-":
                    result="the result is: " + (num1 - num2);
                    break;

                case "*":
                    result="the result is: " + (num1 * num2);
                    break;

                case "/":
                    result="the result is: " + (num1 / num2);
                    break;

                case "%":
                    result="the result is: " + (num1 % num2);
                    break;
                default:
                    System.out.println("invalid entry!");
            }
            System.out.println(result);

            System.out.println("do you want to continue?");
            String answer=input.next();
            if(answer.equalsIgnoreCase("no")){
                System.out.println(result);
                System.out.println("Thank you for using!");
                break;
            }
            if( !(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){
            System.out.println("invalid answer! try again");
            answer=input.next();


            i++;
        }




        }
    }
}

