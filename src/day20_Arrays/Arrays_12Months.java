package day20_Arrays;

import java.util.Scanner;

public class Arrays_12Months {
    public static void main(String[] args) {
        /* Slide tasks
        Create an array that holds 12 months names
        User should be able to enter month index and output should be:“The month name is <MonthName>”
         */
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August","September", "October", "November", "December"};
        // index numbers      0          1           2
        //             1st month=1-1=0

        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        byte num=in.nextByte();
        String result="";

        /*
        This just checks once and exits the program
        if(num>12 || num<=0){
            System.out.println("invalid entry!");
            System.exit(0);
        }
         */

        int count=1;
        while(num>12 || num<=0){
            System.out.println("invalid entry!");
            System.out.println("Please re-enter");
            num=in.nextByte(); // re-initialised the number
            count++;

            if (count==3 && (num>12 || num<=0 )){
                System.out.println("Invalid entry! you already have 3 attempts come back later!");
                //break; only exit the loop so it'll still print the result and give you error.
                System.exit(0); //forcefully exits the whole program.
            }
        }

        result=months[num-1];//user input num-1 will give the actual index num
        System.out.println("The month is "+result);

        System.out.println("====================");




    }
}
