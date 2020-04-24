package day16_ForLoop;

import java.util.Scanner;

public class PalindromeTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your words");
        String word=input.nextLine();
        String reverse="";
        for(int i=word.length()-1; i>=0; i--){
            reverse+=word.charAt(i);
        }
        System.out.println(reverse);//make sure keep the print statement outside the loop

        String result=word.equalsIgnoreCase(reverse)? "It's a palindrome" : "No It's not!";
        //or
        boolean result1=word.equalsIgnoreCase(reverse)? true: false;
        System.out.println(result);
        System.out.println(result1);


    }
}
