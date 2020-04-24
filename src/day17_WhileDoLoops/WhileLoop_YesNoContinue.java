package day17_WhileDoLoops;

import java.util.Scanner;

public class WhileLoop_YesNoContinue {
    public static void main(String[] args) {
        /*
        ask the user to enter yes or no.
            if the user enters other than yes or no, repeat the previous step
         */

        Scanner key = new Scanner(System.in);
        System.out.println("Enter yes or no");
        String answer = key.next();

        boolean valid = answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no");

        int i = 1;
        while (!valid) {
            System.out.println("re=enter");
            answer = key.next();
            i++;

            if (i == 3) {
                    answer = answer.equalsIgnoreCase("yes") ? "you entered yes" : "you entered no";
                if (!valid) {
                    System.out.println("you have entered wrong answer 3 times. Try again later");
                    break;
                }
                }


            }
            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("you entered yes");
            }
            if (answer.equalsIgnoreCase("no")) {
                System.out.println("you entered no");
            }


        }
    }

