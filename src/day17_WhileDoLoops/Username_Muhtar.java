package day17_WhileDoLoops;

import java.util.Scanner;

public class Username_Muhtar {
    public static void main(String[] args) {

        /*
        user: cybertek
        pass: cybertek123

        if user cannot enter correctly in 3 attempts print "your account is locked"
 */

            Scanner input = new Scanner(System.in);

            System.out.println("Enter User name");
            String username  = input.next();

            System.out.println("Enter Password");
            String password  = input.next();

            boolean valid = (username.equals("cybertek") && password.equals("cybertek123") ); // false
            // validating the first username and password

            int count = 1;

            while( ! valid   ){
                // !true
                System.out.println("Please re enter your credentials");
                System.out.println("Enter User name");
                username  = input.next();

                System.out.println("Enter Pass Word");
                password  = input.next();

                valid = (username.equals("cybertek") && password.equals("cybertek123") );  // true
                // validating new username and passwords
                count++;

                if(count ==3 ){
                    System.out.println("Your account is locked");
                    break;
                }

                if(valid){
                    System.out.println("Logged in"); // this is only valid inside while loop
                }

            }//end of while loop

        if(valid) {
            System.out.println("Logged in");//this is needed for the first attempt which is not inside the while loop
        }





// System.exit(0), break, continue

    }
}
