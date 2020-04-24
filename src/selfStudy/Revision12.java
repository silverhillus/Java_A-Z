package selfStudy;

import java.util.Scanner;

public class Revision12 {
    public static void main(String[] args) {

          /*
   warmup tasks:
	3. write a program that can ask the user to "enter a word" five times and returns the word that has the maximum length
        */
          Scanner in= new Scanner(System.in);
          String max="";
          for (int i=0; i<5; i++) {
              System.out.println("enter a word");
              String word= in.next();
              if (word.length()>max.length()){
                  max=word;
              }
          }
        System.out.println("The word has the maximum length is "+max);




    }
}

