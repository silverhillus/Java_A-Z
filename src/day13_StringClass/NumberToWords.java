package day13_StringClass;
/*
 2. write a java program that can convert any given numbers between 0 ~ 9 to words,
 if the number is greater than 9 or less than zero, out put should be "Invalid".
			MUST use Scanner and switch statement
 */

import java.util.Scanner;

public class NumberToWords {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number between 0 ~ 9");
        byte num1=input.nextByte();
        String word="";// switch
        String word1="";//ternary

        // switch
        switch(num1){
            case 0:
                word="zero";
                break;
            case 1:
                word="one";
                break;
            case 2:
                word="two";
                break;
            case 3:
                word="three";
                break;
            case 4:
                word="four";
                break;
            case 5:
                word="five";
                break;
            case 6:
                word="six";
                break;
            case 7:
                word="seven";
                break;
            case 8:
                word="eight";
                break;
            case 9:
                word="nine";
                break;
            default:
                word="invalid!";

        }
        System.out.println(word);
        System.out.println("=================");

        //ternary
        word1=(num1==0)? "zero" :(num1==1)? "one" : (num1==2)? "two" : (num1==3)? "three" : (num1==4)? "four" : (num1==5)? "five":
                (num1==6)? "six":(num1==7)? "seven" : (num1==8)? "eight" : (num1==9)? "nine" : "invalid!";
        System.out.println(word1);






    }
}
