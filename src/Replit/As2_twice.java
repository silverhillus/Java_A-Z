package Replit;

import java.util.Arrays;

public class As2_twice {
    /*
    Write a a method appearsTwice() that returns true if value of variable target appears only twice in the string sentence, otherwise return false.

Examples:
Main.appearsTwice("java", "java is fun!") - returns false, because java appears only once.
Main.appearsTwice("laptop", "I would like to buy a new laptop, because my laptop is too old.") - returns true, because laptop appears twice.
     */
    public static void main(String[] args) {
        String sentence= "java is fun! java is best" ;    //"hey hey hi bye";
        String target="java";
        boolean result=appearsTwice(target,sentence);
        System.out.println(result);

    }
    public static boolean appearsTwice(String target, String sentence) {

        String[] ar = sentence.split(" ");
            int count = 0;
            for (int i = 0; i < ar.length; i++) {
                if (target.equals(ar[i])) {
                    count++;
                }
            }
           return (count==2) ? true:false;

    }
}
