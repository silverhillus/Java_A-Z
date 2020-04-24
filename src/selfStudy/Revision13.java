package selfStudy;

import java.util.Scanner;

public class Revision13 {
    public static void main(String[] args) {

           /*
   warmup tasks:
	1. write a program that can ask the user "enter a number" five times and return the maximum number
				hint: you will nedd for loop and if statement
	2. write a program that can ask the user "enter a number" five times and return the minimum number
           */
           Scanner in=new Scanner(System.in);
           int max=-2000000000;
           int min=-max;
           for (int i=0; i<5; i++){
               System.out.println("enter a number");
               int num=in.nextInt();
               if(num>max){
                   max=num;
               }
               if (num<min){
                   min=num;
               }
           }
        System.out.println("max: "+max);
        System.out.println("min: "+min);



    }
}

