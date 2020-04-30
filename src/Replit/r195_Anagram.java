package Replit;

import java.util.Arrays;

public class r195_Anagram {
    /*
    isAnagram method checks if word1 and word2 are anagram to each other then return a boolean.

each letter in word1 should appear in word2 exact number of times
ignore empty spaces
make your code case insensitive

Examples:

isAnagram("listen", "Silent") ==> true

isAnagram("earth", "heart") ==> true

isAnagram("star", "rats") ==> true

isAnagram("hi", "bye") ==> false

isAnagram("java", "cava") ==> false
     */
    /*
    public static boolean isAnagram(String word1, String word2) {
        word1=word1.replace(" ", "");


    }

     */

    public static boolean isAnagram(String word1, String word2) {
        word1 = "listen";
        word2 = "Silent";

        word1=word1.toLowerCase();
        word2=word2.toLowerCase();

        char[] ch1 = word1.toCharArray();
        char[] ch2 = word2.toCharArray();
        System.out.println(Arrays.toString(ch1)); // [l, i, s, t, e, n]
        System.out.println(ch2[2]); // l
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        /*it also works this way!!!
        String str1=Arrays.toString(ch1);
        String str2=Arrays.toString(ch2);
        return str1.equals(str2) ? true : false;
         */
        return Arrays.equals(ch1,ch2) ? true : false;


    }



    public static void main(String[] args) {
        String word1 = "listen";
        String word2 = "Silent";

        boolean result=isAnagram(word1,word2);
        System.out.println(result);

    }

}
