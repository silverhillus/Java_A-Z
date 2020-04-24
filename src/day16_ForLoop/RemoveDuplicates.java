package day16_ForLoop;
/*
        task:
    write a program that can remove duplicated characters from a string
    abcdabcd ==> abcd
 */

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.next();

        String duplicates = "";

        for (int i = 0; i < word.length() - 1; i++) {
            //                     empty string converts char to string
            if (duplicates.contains("" + word.charAt(i))) {
                continue;
            }

            duplicates += "" + word.charAt(i);
        }
        System.out.println(duplicates);// prints > abab





        /*
        String str="affaka";
        String duplicates="";
        for (int i=0; i<6; i++){
             //                     empty string converts char to string
            if (duplicates.contains(""+str.charAt(i))){
                continue;
            }

            duplicates+=""+str.charAt(i);
        }
        System.out.println(duplicates);// prints > abab

         */


    }
}
