package selfStudy;

import java.util.Scanner;

public class Revision15 {
    public static void main(String[] args) {

         /*
     1. write a program that can divide two numbers. ( Assume that first number is greater than the second)
            NOTE: DO NOT USE division, multiplication, or module operators
            10 / 3  ==> 3 with a remainder of 1
            10 - 3 - 3 - 3 = 1
          a = a - b = 7;
          a = a - b = 4;
          a = a - b = 1;
            COUNT =  3;   a = 1;
     */
         Scanner key=new Scanner(System.in);
        System.out.println("enter two numbers");
        int num1=key.nextInt();
        int num2=key.nextInt();

         int count=0; // !!!!!NOT 1
         while(num1>=num2 ){
                 num1-=num2;
                 count++;
             }
         if (num2==0){
             System.out.println("answer: "+ count);
         }else{
             System.out.println("answer: "+count + " remainder: "+ num1);
         }



    }
}

