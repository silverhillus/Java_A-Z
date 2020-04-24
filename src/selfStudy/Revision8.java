package selfStudy;

import java.util.Scanner;

public class Revision8 {
    public static void main(String[] args) {
        //frequency of the word or character
        String str="There are four variants of lastIndexOf() method.This article depicts about all of them.";
        String frequency="t".toLowerCase();// how many t's in the str

        int count=0;
        while (str.contains(frequency)){
            count++;
            str=str.replaceFirst(frequency,""); //!!!!!!!! .REPLACEFIRST not replace.
        }
        System.out.println(count);





    }
}
