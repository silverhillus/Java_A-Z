package Replit;

import java.sql.SQLOutput;
import java.util.Scanner;

public class r101_Arraysprintfirstlastchar {
    public static void main(String[] args) {

        /*
        Given a String array words, iterate through each word and print
        first and last letter of each element in separate lines.

Example:words → ["hello", "why", "by", "apple" , "note"]
print:
       ho
       wy
       by
       ae
       ne
         */



        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        String firstLast="";
        for (String each:words){
            firstLast+=""+each.charAt(0)+each.charAt(each.length()-1)+" ";
        }
        System.out.println(firstLast);

        /*
         //TODO: Write your code below

        for (String eachWord : words){
            System.out.println( eachWord.substring(0,1)+ eachWord.substring(eachWord.length()-1));

        }

        //second solution
        //TODO: Write your code below
        for( int i=0; i<5; i++){
            System.out.println(""+words[i].charAt(0)+words[i].charAt(words[i].length()-1));
        }

         */








        }
}
