package day15_ForLoops;
        /*
          3. write a program that can reverse the following string:
				String str = "Java";
				output: avaJ
         */

import java.util.Scanner;

public class Task3_Reverse {
    public static void main(String[] args) {
        String str="Java";
        //          0123

        //that's how  ""+  you change char characters into string by concatenation.
        //way1 charAt
        String reverse=""+str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0);

        //way2 substring
        String reverse1=str.substring(3)+str.substring(2,3)+str.substring(1,2)+str.substring(0,1);

        System.out.println(reverse);
        System.out.println(reverse1);



    }
}
