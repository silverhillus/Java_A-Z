package day08_IfStatements;
/*
presentation tasks
**if else statement**

2.   A triangle is valid if the sum of all the three angles is equal to 180 degrees.
Write a program that declares three integers as angles and check whether a triangle is valid or not.
 */

public class Practice_Self {
    public static void main(String[] args) {
        double ang1= 23;
        double ang2= 78;
        double ang3= 88;

        if(ang1+ang2+ang3==180){
            System.out.println("it's a valid triangle");
        }
        else {
            System.out.println("it's not a valid triangle");
        }
        System.out.println("=============================");

// IF...ELSE IF...ELSE Statement
       /* 2. Write a Java Program for the following logic:§
       If marks < 60, then print “Fail”
       §If marks >= 60, but less than 90, then print “Pass”
       §If marks >= 90, then print “Passed with Distinction”
        */
       double score= 78;
        if (score<60){
            System.out.println("Fail");
        }
       else if (score>=60 && score<90){
           System.out.println("Pass");
       }
       else {
            System.out.println("Passed with Distinction");
        }
        System.out.println("=============================");

        // NESTED IF  Statement
        int salary= 15000;
       float yearsOfExperience= 2;
       if (salary>=30000){
           if (yearsOfExperience>=2){
               System.out.println("You qualify for the loan");
           } else{
               System.out.println("You must have at least 2 years of working history");
           }
       }else {
           System.out.println("You must earn at least $30000");
       }
        System.out.println("=============================");









    }
}
