package day07_IfStatements;
/*
4. write a java program that accepts three numbers and return the median number
				(assume that none of them are equal)
 */

public class MedianNumber {
    public static void main(String[] args) {
            double num1 = 4;
            double num2 = 8;
            double num3 = 1;

            boolean num1Med = (num1 < num2 && num1 > num3);
            boolean num2Med = (num2 < num1 && num2 > num3);
            boolean num3Med = (num3 < num1 && num3 > num2);

            if (num1Med){
                System.out.println("The median number is: " + num1);
            }

            if (num2Med) {
                System.out.println("The median number is: " + num2);
            }

            if (num3Med){
                System.out.println("The median number is: " + num3);
            }
    }
}
