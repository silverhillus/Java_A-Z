package day14_StringManipulations;
/*
2. Write a program StartEndWords:
	you have 2 words that must be 5 characters, and check if last letter of first word and first letter of second work are same.
		if either one not 5 chars length:    print "need to be exactly 5 chars length"
		if last letter of 1st word and first letter of 2nd word match:  print "Fizz"
		if they do not match:  print "Buzz - did not match"

 */

import java.util.Scanner;

public class String_RevisionTask2_StartEndWords {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        //StartEndWords
        System.out.println("Enter two words that must be 5 characters");
        String word1=input.next();
        String word2=input.next();
        int lWord1=word1.length();
        int lWord2=word2.length();


        //With char
        if (lWord1==5  && lWord2==5){
                                   //length-1=5-1
            if(word2.charAt(0)== word1.charAt(4)){
              System.out.println("Fizz");
          }else{
              System.out.println("Buzz - did not match");
          }


        }else{
            System.out.println("need to be exactly 5 chars length");
        }

        System.out.println("====================");




    }
}
