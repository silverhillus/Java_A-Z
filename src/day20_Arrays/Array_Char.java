package day20_Arrays;

import java.util.Arrays;

public class Array_Char {
    public static void main(String[] args) {
        /*
        > toCharArray();
         */

        String name="fatih";
          //          =name.toCharArray();
        char [] characters=name.toCharArray();
        System.out.println(Arrays.toString(characters)); // >> [f, a, t, i, h]


        //check if they comprise of the same characters?
        String str1 = "Cybertek School";
        String str2 = "School Cybertek";

        char [] ch1=str1.toCharArray();
        char [] ch2=str2.toCharArray();

        //Arrays.sort(ch1);
        //Arrays.sort(ch2);
        //wITHOUT SORTING
        System.out.println(Arrays.toString(ch1));// [C, y, b, e, r, t, e, k,  , S, c, h, o, o, l]
        System.out.println(Arrays.toString(ch2));//[S, c, h, o, o, l,  , C, y, b, e, r, t, e, k]

        boolean result=Arrays.equals(ch1,ch2);
        System.out.println(result);//false


        //wITH SORTING
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        System.out.println(Arrays.toString(ch1));// [C, y, b, e, r, t, e, k,  , S, c, h, o, o, l]
        System.out.println(Arrays.toString(ch2));//[S, c, h, o, o, l,  , C, y, b, e, r, t, e, k]

        boolean result1=Arrays.equals(ch1,ch2);
        System.out.println(result1);//true







        /*
        Muhtar
        char[] ch1 = str1.toCharArray(); //[C, y, b, e, r, t, e, k,  , S, c, h, o, o, l]
        char[] ch2 = str2.toCharArray(); //[S, c, h, o, o, l,  , C, y, b, e, r, t, e, k]

        Arrays.sort(ch1); // [ , C, S, b, c, e, e, h, k, l, o, o, r, t, y]
        Arrays.sort(ch2); // [ , C, S, b, c, e, e, h, k, l, o, o, r, t, y]

        boolean euqalStr = Arrays.equals(ch1, ch2);

        System.out.println(euqalStr); // str1 & str2 are biuld out of same characters

         */












    }
}
