package Replit;

import java.util.Scanner;

public class ArithmeticsOp_SliceNum {
    public static void main(String[] args) {
        //DO NOT CHANGE
        int num, digit1, digit2, digit3, digit4, digit5;
        //WRITE YOUR CODE HERE
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Number:");
        num = input.nextInt();
        digit1 = num / 10000;
        digit2 = (num % 10000) / 1000;
        digit3 = (num % 1000) / 100;
        digit4 = (num % 100) / 10;
        digit5 = (num % 10);
        String result = "";
        result = (num < 100000) ? digit1 + "\n" + digit2 + "\n" + digit3 + "\n" + digit4 + "\n" + digit5 :
                "Oops! Try entering five digit number!";
        System.out.println(result);
        /*
        if (num<100000){
            System.out.println(digit1+"\n"+digit2+"\n"+digit3+"\n"+digit4+"\n"+digit5);
        }else{
            System.out.println("Oops! Try entering five digit number!");
        }

         */


    }
}
