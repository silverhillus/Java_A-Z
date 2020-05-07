package Replit;

import java.util.Arrays;
import java.util.Collections;

public class As2_twice {
    /*
    Write a a method appearsTwice() that returns true if value of variable target appears only twice
    in the string sentence, otherwise return false.

Examples:
Main.appearsTwice("java", "java is fun!") - returns false, because java appears only once.
Main.appearsTwice("laptop", "I would like to buy a new laptop, because my laptop is too old.") - returns true, because laptop appears twice.
     */
    public static void main(String[] args) {
        String sentence = "java is fun! java is best";    //"hey hey hi bye";
        String target = "java";
        boolean result = appearsTwice(target, sentence);
        System.out.println(result);


    }

    public static boolean appearsTwice(String target, String sentence) {

        // way2
        int count=0;
        while(sentence.contains(target)){
            sentence=sentence.replaceFirst(target,"");
            count++;
        }
        return (count == 2) ? true : false;




        /* way1 // it fails in 2 tests in replit for some reason!!!!

        String[] ar = sentence.split(" ");
            int count = 0;
            for (int i = 0; i < ar.length; i++) {
                if (target.equals(ar[i])) {
                    count++;
                }
            }
           return (count==2) ? true:false;
         */



        /* way3 //  it fails in 2 tests in replit for some reason!!!!
        String[] ar = sentence.split(" ");
        System.out.println(Arrays.toString(ar)); // [java, is, fun!, java, is, best]
                                       //collection
        int count=Collections.frequency(Arrays.asList(ar),target);
        System.out.println(count); // 2
          return (count==2) ? true:false;

         */

    }
}
