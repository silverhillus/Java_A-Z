package day10_Switch_Scanner;
/*
it's in java.util package
scanner is a class
has the methods to get the user inputs
to call scanner we have to import it first.
=====================================
SYNTAX: import packageName.className
so      import java.util.Scanner;
=====================================
when you call it it'll be under package before class
ex:
 package day10_Switch_Scanner;
 >> import java.util.Scanner
 public class scanner{}

 */

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;
public class scannerClass {
    public static void main(String[] args) {
        /* Declare Scanner:
        SYNTAX :
        Scanner variableName= new Scanner(System.in)
         */
        Scanner input= new Scanner(System.in);

        System.out.println("Enter a byte number: ");
        //Scanner Methods

        Byte num=input.nextByte(); // 9

        /*int num1=input.nextInt(); // 16
        long num2=input.nextLong();// 199999
        short num3=input.nextShort();// 67

        String num4=input.next(); // single word// wes
        String num5=input.nextLine(); // multiple words+ Enter
         */


    }





}
