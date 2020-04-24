package day14_StringManipulations;
/*
2. Write a program StartEndWords:
	you have 2 words that must be 5 characters, and check if last letter of first word and first letter of second work are same.
		if either one not 5 chars length:    print "need to be exactly 5 chars length"
		if last letter of 1st word and first letter of 2nd word match:  print "Fizz"
		if they do not match:  print "Buzz - did not match"

 */

import java.util.Scanner;

public class String_RevisionTask2_StartEndWords2 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        // with substring
        System.out.println("Enter two words that must be 5 characters");
        String words1=input.next();
        String words2=input.next();
        int lWords1=words1.length();
        int lWords2=words2.length();

        //NOTE:                                        , length-1+1
        // .substring(index of the character at present, max index+1)
        //words2=words2.substring(0,1);
        //words1=words1.substring(4,5);//end is excluded


        //it needs to be corrected!!!!

        if (lWords1==5  && lWords2==5){
            //                                                 max index=length-1
            //                                                 end character=length-1+1
            // if(words2.substring(0,1)==words1.substring(4,words1.length()-1+1)){
            if(words2.substring(0,1)==words1.substring(4)){
                System.out.println("Fizz");
            }else{
                System.out.println("Buzz - did not match");
            }

        }else{
            System.out.println("need to be exactly 5 chars length");
        }







    }
}
