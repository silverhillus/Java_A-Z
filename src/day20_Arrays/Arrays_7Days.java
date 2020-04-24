package day20_Arrays;

import java.util.Scanner;

public class Arrays_7Days {
    public static void main(String[] args) {
        /*Create an array that holds the days
        User should be able to enter the day index and output should be:“Today is Monday”
         */

        String[]days ={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"}; //size=days.length=7 , max=7-1=6;

        Scanner in=new Scanner(System.in);
        System.out.println("enter a number");
        byte num= in.nextByte();
        String result="";

        int count=1;
        while(num>7 || num<=0){
            System.out.println("invalid entry!");
            System.out.println("Please re-enter");
            num=in.nextByte(); // re-initialised the number
            count++;

            if (count==3 && (num>7 || num<=0) ){
                System.out.println("Invalid entry! you already have 3 attempts come back later!");
                System.exit(0);
            }
        }

        result=days[num-1];
        System.out.println(result);







    }
}
