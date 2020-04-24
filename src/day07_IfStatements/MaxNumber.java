package day07_IfStatements;

public class MaxNumber {
    public static void main(String[] args) {
        double num1 = 4;
        double num2 = 8;
        double num3 = 1;

        boolean num1Max = num1 > num2 && num1 > num3;
        boolean num2Max = num2 > num1 && num2 > num3;
        boolean num3Max = num3 > num1 && num3 > num2;

        if (num1Max){
            System.out.println("The maximum number is: " + num1);
        }

        if (num2Max) {
            System.out.println("The maximum number is: " + num2);
        }

        if (num3Max){
            System.out.println("The maximum number is: " + num3);
        }
    }
}
