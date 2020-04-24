package Replit;

import java.util.Scanner;

public class strloop_83 {
    public static void main(String[] args) {


        /*
        Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)
Ask for the first guest name.
Then ask does user want to enter one more guest.
 If yes - take input from.
If not - finish the program and print list of the guests.

Example of the program:

Please enter guest name:
Nick
Do you want to enter new guest name:
yes
Please enter guest name:
Linda
Do you want to enter new guest name:
no

Guest's list: Nick, Linda
         */

        Scanner input = new Scanner(System.in);
        String result="";
        System.out.println("Please enter guest name:");
        String guest = input.next();
        System.out.println("Do you want to enter new guest name:");
        String answer = input.next();
        result=guest;

        while (answer.equalsIgnoreCase("yes")){
            System.out.println("Please enter guest name:");
            guest = input.next();
            System.out.println("Do you want to enter new guest name:");
            answer = input.next();
            result+=", "+guest;
        }
        while (answer.equalsIgnoreCase("no")){
            //result=guest; >> leave it empty
            break;
        }
        while (  !(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no") ) ) {
            System.out.println("invalid entry!");
            System.out.println("Please enter yes or no");
            answer = input.next();

            if (answer.equalsIgnoreCase("no")) {
                //result=guest;
                break;
            }else{
                System.out.println("Please enter guest name:");
                guest = input.next();
                System.out.println("Do you want to enter new guest name:");
                answer = input.next();
                result+=", "+guest;
            }
        }
        System.out.println("Guest's list: "+ result);








        /* POSSIBLE OUTPUTS:
        UNEXPECTED : Guest's list: Nick, Linda,  (EXTRA COMMA AT THE END)
        UNEXPECTED : Guest's list:  ,Nick, Linda  (EXTRA COMMA AT THE BEGINNING)

        *********IT WORKS BUT  THIS DOESN'T MATCH WITH THE REQUIREMENT OF THE TASK***************

        Scanner input = new Scanner(System.in);
        String result="";
        // your code
        // ------------------------------------------
        while(true){
            System.out.println("Please enter guest name:");
            String guest = input.next();
            System.out.println("Do you want to enter new guest name:");
            String answer = input.next();
            //result+=guest+", "; ERROR >>  Nick, Linda,
            result+=", "+guest;//>>  , TTT, MMM

            if (answer.equalsIgnoreCase("no")){
                //result+=guest+" ";
                //System.out.println("Guest's list: "+ result);
                break;
            }
            if (  !(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no") ) ){
                System.out.println("invalid entry!");
                System.out.println("Please enter yes or no");
                answer=input.next();

                if (answer.equalsIgnoreCase("no")){
                    //result+=guest+" ";
                    //System.out.println("Guest's list: "+ result);
                    break;
                }

            }

        }
        System.out.println("Guest's list: "+ result);

         */





            /*


        int i = 0;
        while (answer.equalsIgnoreCase("yes")) {
            System.out.println("Please enter guest name:");
            guest = input.next();
            System.out.println("Do you want to enter new guest name:");
            answer = input.next();
            result+=guest;
            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Guest's list: " + result);
                break;
            }
            i++;
        }

        System.out.println("Guest's list: "+ result);

             */





    }
}
