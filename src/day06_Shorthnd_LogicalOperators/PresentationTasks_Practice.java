package day06_Shorthnd_LogicalOperators;
    /*
Task
1.Create a double variable with the value 20
2.Create a second variable of type double with the value 80
3.Add both numbers up and multiply by 25
4.Use the remainder operator to figure out the remainder from the sum of #3 divided by 40
5.Print remaining total (#4)  is equal to 20 or less : true/false
 */



public class PresentationTasks_Practice {
    public static void main(String[] args) {
        double a = 20;
        double b = 80;
        double result1 = (a + b )*25;
        double result2 = result1 % 40;
        System.out.println(result2);

    /*
Task
Write a Java program:
1)Declare a variable and initialize user age.
2)Then the program will show if the user is eligible to vote.
A Person who is eligible to vote must be older than or equal to 18 years old.
Input: age :18 Output: You are eligible to vote
 */
         byte age= 17;
         boolean eligibleToVote = age > 18 || age ==18;

         if (eligibleToVote){
             System.out.println("Age: " + age + " \n You're eligible to vote.");
         }

         if (!eligibleToVote){
             System.out.println("Age: " + age + " \nYou're not eligible to vote.");
         }

     /*
         Write Java program that will accept three numbers and return the greatest number.
         •Input:
         number1: 4
         number2: 8
         number3: 1

         •Output:
         The greatest number is: 8
          */

          int num1 = 4;
          int num2 = 8;
          int num3 = 1;

          boolean num1Greatest = num1 > num2 && num1 > num3;
          boolean num2Greatest = num2 > num1 && num2 > num3;
          boolean num3Greatest = num3 > num1 && num3 > num2;

          if (num1Greatest){
              System.out.println("The greatest number is: " + num1);
          }

          if (num2Greatest) {
              System.out.println("The greatest number is: " + num2);
          }

          if (num3Greatest){
              System.out.println("The greatest number is: " + num3);
          }

    /*
    Write a Java program that will accept two numbers and check if two numbers are equal or not.
     */

          int key1=10;
          int key2=28;

          if (key1 == key2){
              System.out.println(key1+" is equal to "+ key2);
          }

          if (key1 != key2){
              System.out.println(key1+" is not equal to "+ key2);
          }

        System.out.println("======================");

          /*
           Write a Java program to implement following logic using if statement
           1. if hour is less than 12 noon, greet with Good Morning
           2.  if hour is greater than or equal 12 noon but less than 3 pm, greet with Good Afternoon
           3.  if hour is greater than or equal to 3 pm, greet with Good Evening

           */
          /*
          byte hourAm = 12;
          byte hourPm = 3;

          boolean GMorning = hourAm < 12;
          boolean GAfternoon = hourAm >= 12 || hourPm < 3;
          boolean GEvening = hourPm >= 3;

          if (GMorning){
              System.out.println("Good Morning");
          }

          if (GAfternoon){
            System.out.println("Good Afternoon");
          }

        if (GEvening){
            System.out.println("Good Evening");
        }

           */













    }
}
