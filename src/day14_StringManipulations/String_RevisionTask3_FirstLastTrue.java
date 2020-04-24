package day14_StringManipulations;
/*

3. Ask user to enter a word.
Print true is the first and last characters of the string are same characters,
print false otherwise.
			Input:
				abba
			Output:
				true
 */

import java.util.Scanner;

public class String_RevisionTask3_FirstLastTrue {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //3_FirstLastTrue
        System.out.println("Enter a word");
        String word = input.next();
        //with .charAt()
        char first = word.charAt(0);
        char last = word.charAt(word.length() - 1);
        boolean result = first == last;
        System.out.println(result);


    }
}
