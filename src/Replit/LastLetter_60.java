package Replit;
/*
     60_Write a program that will print out last letter of the word (string).
 */
import java.util.Scanner;

public class LastLetter_60 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();
        //WRITE YOUR CODE HERE

        //with substring()
        word=word.substring(word.length()-1);
        System.out.println(word);
        //with charAt()
        char last=word.charAt(word.length()-1);
        System.out.println(last);

    }
}
