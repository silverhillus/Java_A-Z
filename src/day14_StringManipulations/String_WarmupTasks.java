package day14_StringManipulations;
/*
      1. Ask user to enter two words. Print the first word, second word, second word, first word
            Input:
                one
                two
            Output:
                onetwotwoone
                    DO NOT USE + OPERATOR
    2. Ask user to enter two words. Print first word without its first character then print the second word without its first character.
            Input:
                apple
                banana
            Output:
                ppleanana
    3. Write a Java method to display the middle character of a string
        a) If the length of the string is even there will be two middle characters.
        b) If the length of the string is odd there will be one middle character.
                Input :
                    elephant
                Output:
                    The middle character in the string: ph
 */

import java.util.Scanner;

public class String_WarmupTasks {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        // 1_two words concatenate
        System.out.println("Enter two words");
        String word1=input.next();
        String word2=input.next();
        String together=word1.concat(word2).concat(word2).concat(word1);
        System.out.println(together);
        System.out.println("===========");

        // 2_print words without first characters
        System.out.println("Enter two words");
        word1=word1.substring(1);
        word2=word2.substring(1);
        System.out.println(word1+word2);
        System.out.println("============");

        //========================================

        //3_Display the middle character of a string
        Scanner input1= new Scanner(System.in);
        System.out.println("Enter a word");
        String word=input1.nextLine();//elephant
        int midIndexNum = (word.length() - 1)/2;
        if(word.length()%2!=0){
            char middle=word.charAt(midIndexNum);
            System.out.println(middle);
        }else{
            String mi=word.substring(midIndexNum,(midIndexNum+2));
            System.out.println(mi);
        }




    }
}
