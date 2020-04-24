package day15_ForLoops;
        /*
        /*
        write a program to idenfiy if a string is palindrome or not. if yes==> true,.otherwise ==> false
                level ==> level ==> palindrome
         */


import java.util.Scanner;

public class Reverse_Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.next();//anna

        int maxNumber = word.length() - 1;
        String reverse = "";
        for (int i = maxNumber; i >= 0; i--) {
            reverse += word.charAt(i);
        }
        System.out.println(reverse);

        String result = (word.equalsIgnoreCase(reverse)) ? "It's a Palindromic word!" : "Oops! No it's not a Palindromic word!";
        System.out.println(result);


    }
}
