package day14_StringManipulations;
/*
          username:cybertek
          password:cybertekschool
 */

import java.util.Scanner;

public class Equals_Credentials {
    public static void main(String[] args) {
        String validName="cybertek";
        String validPassword="cybertekschool";

        Scanner input=new Scanner(System.in);
        System.out.println("Enter username");
        String inputUsername=input.next();

        System.out.println("Enter password");
        String inputPassword=input.next();

        if (inputUsername.equals(validName) && inputPassword.equals(validPassword) ){
            System.out.println("Log in successful");
        }else{
            System.out.println("Wrong username or password! Try again.");
        }





    }
}
