package selfStudy;

import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;

import java.util.Scanner;

public class Revision2 {
    public static void main(String[] args) {

          /*
        write a program to idenfiy if a string is palindrome or not. if yes==> true,.otherwise ==> false
                level ==> level ==> palindrome
         */

          Scanner input=new Scanner(System.in);
          System.out.println("enter a word");//anna
          String word= input.next();

          String reverse="";
          for (int i=word.length()-1; i>=0; i--){
              reverse+=word.charAt(i);
          }
        System.out.println(reverse);

          boolean palindrome=reverse.equalsIgnoreCase(word)?true: false;
          String palindrome2=reverse.equalsIgnoreCase(word)? "It's palindrome":"nope";
        System.out.println("the word is palindrome: "+palindrome);
        System.out.println("the word is palindrome: "+palindrome2);




    }
}
