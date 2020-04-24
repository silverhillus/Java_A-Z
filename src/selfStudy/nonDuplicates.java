package selfStudy;

import java.util.Arrays;

public class nonDuplicates {
    public static void main(String[] args) {

        /*
        if 2 strings build out of same characters
         */

        String str1 = "aabbbc";
        String str2 = "cab";

        String nonDupstr1 = "";
        String nonDupstr2 = "";

        for (int i = 0; i < str1.length(); i++) {
            if (nonDupstr1.contains("" + str1.charAt(i))) {
                continue;
            }
            nonDupstr1 += "" + str1.charAt(i);
        }
        System.out.println(nonDupstr1);

        for (int i = 0; i < str2.length(); i++) {
            if (nonDupstr2.contains("" + str2.charAt(i))) {
                continue;
            }
            nonDupstr2 += "" + str2.charAt(i);
        }
        System.out.println(nonDupstr2);

        //nonDupstr1=abc
        //nonDupstr2=cab

        char[] ch1 = nonDupstr1.toCharArray();
        char[] ch2 = nonDupstr2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        str1 = Arrays.toString(ch1);
        str2 = Arrays.toString(ch2);
        System.out.println(str1.equals(str2));


    }
}
