package day14_StringManipulations;
/*
1. Write a program CheckWords:
	Program accepts 3 words and :
	- if they are same length:      print "All words are same length"
	- if some same length and others not:    print "Not Same nor Different lengths"
	- if all different length :  print "All different length"
2. Write a program StartEndWords:
	you have 2 words that must be 5 characters, and check if last letter of first word and first letter of second work are same.
		if either one not 5 chars length:    print "need to be exactly 5 chars length"
		if last letter of 1st word and first letter of 2nd word match:  print "Fizz"
		if they do not match:  print "Buzz - did not match"
3. Ask user to enter a word. Print true is the first and last characters of the string are same characters, print false otherwise.
			Input:
				abba
			Output:
				true
4. Ask user to enter a word. Print "really?"  if the word ends with ly, print "never mind" otherwise.
			Input:
				Seriously
			Output:
				really?
 */

import java.util.Scanner;

public class String_RevisionTask1_CheckWords {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        //1_CheckWords Length
        System.out.println("Enter three words");
        String word1=input.next();
        String word2=input.next();
        String word3=input.next();
        int lWord1=word1.length();
        int lWord2=word2.length();
        int lWord3=word3.length();

        if (lWord1==lWord2 && lWord2==lWord3){
            System.out.println("All words are same length");
        }else if (lWord1!=lWord2 && lWord2!=lWord3){
            System.out.println("All different length");

        }else{
            System.out.println("Not Same nor Different lengths");
        }

//lWord1!= lWord2 || lWord1!=lWord3 || lWord2!=lWord3


    }
}
