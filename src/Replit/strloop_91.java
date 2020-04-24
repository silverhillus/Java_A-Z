package Replit;

import java.util.Scanner;

public class strloop_91 {
    public static void main(String[] args) {

        String s="abc hi how hi hi hi";
        int count=0;
        while(s.contains("hi")){
            s=s.replaceFirst("hi","");
            count++;
        }
        System.out.println(count);



    }
}
