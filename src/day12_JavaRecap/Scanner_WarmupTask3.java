package day12_JavaRecap;
/*
3. Write a Java Program that can calculate the garde of a student based on the score,
        implement the following logic:
                If marks < 60, then print "Fail"
                If marks >= 60, but less than 90, then print "Pass"
                If marks >= 90, then print "Passed with Distinction"
                MUST use scanner
 */

import java.util.Scanner;

public class Scanner_WarmupTask3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your exam score:");
        String grade="";
        byte score= input.nextByte();
        if(score<60 && score>=0){
            grade="Fail";
        }else if(score>=60 && score<90){
            grade="Pass";
        }else if(score>=90 && score<=100 ){
            grade="Passed with Distinction";
        }else{
            grade="Invalid score!";
        }

        System.out.println(grade);


    }
}
