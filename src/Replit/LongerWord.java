package Replit;

import java.util.Scanner;

public class LongerWord {
    public static void main(String[] args) {
        /*Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //WRTIE YOUR CODE HERE
        String result=(word1.length()>word2.length())? word1:word2;
        System.out.print(result);

         */

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE

        String result="";
        result+=""+word.charAt(0)+word.charAt(word.length()-1);
        System.out.print(result);
    }
}
