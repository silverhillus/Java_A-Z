package Replit;
/*
Write an if statement that will print day of the week based on value of the day variable.
For example:

if day = 1, then print "It's a Monday!"
or, if day = 5, then print "It's a Friday!"

Otherwise (else), print "There is no such a day!"

#################################################

input: 1
output: It's a Monday!

input: 7
output: It's a Sunday!
 */

import java.util.Scanner;

public class MultiIf_Days {
    public static void main(String[] args) {

            // DO NOT CHANGE:
            System.out.println("Enter the number of the day in a week");
            Scanner input = new Scanner(System.in);
            int day = input.nextInt();

            //WRITE YOUR CODE HERE:
            if (day==1){
                System.out.println("it's Monday!");
            }
            else if (day==2){
                System.out.println("it's Tuesday!");
            }
            else if (day==3){
                System.out.println("it's Wednesday!");
            }
            else if (day==4){
                System.out.println("it's Thursday!");
            }
            else if (day==5){
                System.out.println("it's Friday!");
            }
            else if (day==6){
                System.out.println("it's Saturday!");
            }
            else if (day==7){
                System.out.println("it's Sunday!");
            }

            else{
                System.out.println("There is no such a day!");
            }


        }

}
