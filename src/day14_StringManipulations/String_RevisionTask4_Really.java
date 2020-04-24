package day14_StringManipulations;
/*
4. Ask user to enter a word. Print "really?"  if the word ends with ly, print "never mind" otherwise.
			Input:
				Seriously
			Output:
				really?
 */

import java.util.Scanner;

public class String_RevisionTask4_Really {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        //4_endsWithly
        System.out.println("Enter a word");
        String word=input.next();
        String result=(word.endsWith("ly"))?"really?":"never mind";
        System.out.println(result);



    }
}
