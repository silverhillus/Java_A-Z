package day24_Methods;

import java.util.Scanner;

public class Methods_WarmupTasks_Github {
    public static void Max(int num1, int num2 ){

        if(num1>=num2){
            System.out.println("Maximum number is: "+num1);
        }else{
            System.out.println("Maximum number is: "+num2);
        }

    }

    //                                     10           20           *
    public static void Calculation(double num1, double num2, char operator){

        switch (operator){
            case '+':
                System.out.println(num1+num2);
                break;

            case '-':
                System.out.println(num1-num2);
                break;

            case '*':
                System.out.println(num1*num2);
                break;

            case '/':
                System.out.println(num1/num2);
                break;

            case '%':
                System.out.println(num1%num2);
                break;

            default:
                System.out.println("Invalid");

        }


    }


    public static void palindrome(String str){  // Anna ==>
        str = str.toLowerCase(); // anna
        String reversed = "";
        for(int i = str.length()-1; i >= 0; i--){
            reversed += str.charAt(i);
        }

        System.out.println( str.equals(reversed) );


    }


    public static void main(String[] args) {
        int a = 1000000;
        int b = 200;

        Max(a,b);

        Calculation(10,20,'*');

        Calculation(30, 40, '+');

        int n1 = 10000;
        int n2 = 100;

        Calculation(n1,n2, '/');


        palindrome("Anna");  // annA

        while (true) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter num1: ");
            int num1 = scan.nextInt();
            System.out.println("Enter num2: ");
            int num2 = scan.nextInt();
            System.out.println("Enter operator: ");
            char operator = scan.next().charAt(0);
            Calculation(num1, num2, operator);  // result of calculation
            System.out.println("Do you want to continue?");
            String answer = scan.next();

            while( !(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))  ){
                System.out.println("Invalid Entry, Please re-enter");
                System.out.println("Do you want to continue?");
                answer = scan.next();
            }

            if(answer.equalsIgnoreCase("No")){
                break;
            }

        }


        //   method("Muhtar");

    }




    public static void method(String name){
        name.toLowerCase();
        String reversed="";
        for (int i=name.length()-1; i>=0; i--){
            reversed+=name.charAt(i);
        }
        System.out.println(name.equals(reversed));

    }

}
