package Replit;

import java.util.Arrays;
import java.util.Scanner;

public class r106 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine(); // "Java is fun"

        String[] word=sentence.split(" ");

        for (int i=0; i<word.length; i++){
            System.out.println(word[i]);
        }



    }
}



