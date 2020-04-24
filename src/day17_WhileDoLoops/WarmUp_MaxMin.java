package day17_WhileDoLoops;


import java.util.Scanner;

public class WarmUp_MaxMin {
    public static void main(String[] args) {
        /*
   warmup tasks:
	1. write a program that can ask the user "enter a number" five times and return the maximum number
				hint: you will nedd for loop and if statement
	2. write a program that can ask the user "enter a number" five times and return the minimum number
 */
        Scanner input= new Scanner(System.in);
        System.out.println("Enter 5 random numbers");
        // int range: [-2147483648,2147483647]
        int max=-2147483648;//-999999999 not correct //lowest possible number
        int min=-max-1;//

       for (int i=0; i<5; i+=1){
           int num= input.nextInt();

           if (num>max){
               max=num;
           }
           if (num<min){
               min=num;
           }
       }
        System.out.println("Max is: "+max);
        System.out.println("Min is: "+ min);




    }
}
