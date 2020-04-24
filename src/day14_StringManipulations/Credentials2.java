package day14_StringManipulations;

import java.util.Scanner;

public class Credentials2 {
    public static void main(String[] args) {
       /*
        valid credentials are:
            username: Cybertek
            password: cybertekschool
         precondition:
        username and password cannot be empty
        if they are empty ==> please enter the credentials
        if user entered both valid username and password  ==> log in
        if valid password, invalid username ==> username is incorrect
        if valid user name, invalid password ==> password is incorrect
        if both password and username are invalid ==> invalid username and password
     */


            Scanner input = new Scanner(System.in);

            System.out.println("Enter your username");
            String inputUsername = input.nextLine();

            System.out.println("Enter your password");
            String inputPassWord = input.nextLine();

        boolean loggedIn = inputUsername.equals("Cybertek") && inputPassWord.equals("cybertekschool");
        // user entered both valid username and password

        boolean InvalidUserName =  !inputUsername.equals("Cybertek") && inputPassWord.equals("cybertekschool");
        // user entered invalid username and valid password

        boolean InvalidPassWord = inputUsername.equals("Cybertek") && ! inputPassWord.equals("cybertekschool");
        // username is valid, but password is invalid

        if( !inputUsername.isEmpty()  && !inputPassWord.isEmpty() ){  // username and password are not empty

            if( loggedIn ){
                System.out.println("Logged in");
            }else if(InvalidUserName){
                System.out.println("Password is correct, username is incorrect");
            }else if(InvalidPassWord){
                System.out.println("Username is correct, password is incorrect");
            }else{
                System.out.println("Both username and password are incorrect");
            }


        } else{ // username and password are empty
            System.out.println(" please enter the credentials");
        }

            /* My own way
            if (inputUsername.isEmpty() && inputPassWord.isEmpty()){
                System.out.println("Please enter credentials");
            }
            if (inputUsername.equals("Cybertek") && inputPassWord.equals("cybertekschool")){
                System.out.println("Logged in successfully");
            }
            if(!inputUsername.equals("Cybertek") && inputPassWord.equals("cybertekschool")){
                System.out.println("Wrong username");
            }
            if(inputUsername.equals("Cybertek") && !inputPassWord.equals("cybertekschool")){
                System.out.println("Wrong password");
            }
            if(!inputUsername.equals("Cybertek") && !inputPassWord.equals("cybertekschool")){
                System.out.println("invalid username and password");
            }

             */



    }
}
