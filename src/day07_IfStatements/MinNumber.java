package day07_IfStatements;

/*
3. write a java program that accepts three numbers and return the minimum number
				(assume that none of them are equal)
 */

public class MinNumber {
    public static void main(String[] args) {
        double num1 = 4;
        double num2 = 8;
        double num3 = 1;

        boolean num1Min = (num1 < num2 && num1 < num3);
        boolean num2Min = (num2 < num1 && num2 < num3);
        boolean num3Min = (num3 < num1 && num3 < num2);

        if (num1Min){
            System.out.println("The minimum number is: " + num1);
        }

        if (num2Min) {
            System.out.println("The minimum number is: " + num2);
        }

        if (num3Min){
            System.out.println("The minimum number is: " + num3);
        }

    }
}
