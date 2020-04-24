package day17_WhileDoLoops;


import java.util.Scanner;

public class WarmUp_LongerWord {
    public static void main(String[] args) {
        /*
   warmup tasks:
	3. write a program that can ask the user to "enter a word" five times and returns the word that has the maximum length
        */
        Scanner input= new Scanner(System.in);
        System.out.println("Enter 5 random words");


       String max="";
        for (int i=0; i<5; i+=1){
           String word= input.next();

           if (word.length()>max.length()){
               max=word;
           }

       }
        System.out.println("Longer word is: "+max);





    }
}
