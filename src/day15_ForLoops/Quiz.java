package day15_ForLoops;


import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        String str = "Batch 18";

        int Z = str.trim().length();
        System.out.println(Z);

        String s1="abc";
        String s2="abc";
        //                 string+
        System.out.println("s1==s2 is:"+s1  ==s2);
        // "s1==s2 is:abc"==abc so it's false

        String s=" ";
        s=s.trim();
        System.out.println(s);
        boolean a=s.isEmpty();
        System.out.println(a);


    }
}
