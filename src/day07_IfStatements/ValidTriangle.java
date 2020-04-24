package day07_IfStatements;
/*
Warmup task:
	1. A triangle is valid if the sum of all the three angles is equal to 180 degrees. Write a program that declares three integers as angles and check whether a triangle is valid or not.

 */

public class ValidTriangle {
    public static void main(String[] args) {
        double angle1 = 30; //I may use short
        double angle2 = 50; //I may use short
        double angle3 = 100; //I may use short
        short sumOfAngles = (short) (angle1+angle2+angle3); // if you have 3 shorts next none should be int

        boolean validTriangle = sumOfAngles==180;

        if (validTriangle){
            System.out.println("The shape is a triangle");
        }
        if(!validTriangle){
            System.out.println("It's not a valid triangle");
        }






    }
}
