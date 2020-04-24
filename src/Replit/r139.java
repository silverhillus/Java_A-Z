package Replit;

import java.util.Scanner;

public class r139 {


    public static void main(String[] args) {




        plus();
    }

    public static void plus() { //scanner within plus method/ without perimeter!!!
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 = scan.nextInt();
        int num2= scan.nextInt();
        int result=num1+num2;
        System.out.println("result: "+ result);


        /*
        //your code here
        int sum=0;
        for (int each: num){
            sum+=each;
        }
        System.out.println(sum);
    }

         */
    }


}
