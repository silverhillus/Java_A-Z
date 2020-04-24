package day17_WhileDoLoops;

import java.util.Scanner;

public class Username {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter his/her username and password until user enters correctly.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter username"); // "silverhill"
        String username = input.next();
        System.out.println("Enter password"); //"themaster@Java"
        String password = input.next();

        //LOGICAL ERRORS
        // while (!username.equalsIgnoreCase( "silverhill") && !password.equalsIgnoreCase("themaster@Java"))
        // while (!username.equalsIgnoreCase( "silverhill") || !password.equalsIgnoreCase("themaster@Java"))

        while (!(username.equalsIgnoreCase( "silverhill") && password.equalsIgnoreCase("themaster@Java")) ){
            System.out.println("Wrong username or password please re-enter!");
            System.out.println("Enter username");
            username = input.next();
            System.out.println("Enter password");
            password = input.next();

            if(password.equalsIgnoreCase( "themaster@Java") && username.equalsIgnoreCase( "silverhill")) {
                System.out.println();
                break;
            }

        }

        if (username.equalsIgnoreCase("silverhill") && password.equalsIgnoreCase("themaster@java")){
            System.out.println("You're logged in!");
        }


          /*
        while (!password.equalsIgnoreCase("themaster@Java")){
            System.out.println("Wrong password please re-enter!");
             password = input.next();
            if(password.equalsIgnoreCase( "themaster@Java")){
                break;
            }
        }

         */


    }
}
