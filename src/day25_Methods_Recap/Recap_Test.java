package day25_Methods_Recap;
import Resources.Library;

import java.util.Arrays;

public class Recap_Test {
    public static void main(String[] args) {
        String test=Library.Reverse("This is just a test!");
        System.out.println(test);
        int[] arr= {3,12,0,23,-98,11};
        int [] res=Library.sortDescending(arr);
        System.out.println(Arrays.toString(res));

        String str1="AAABBBNNNHHHOOOS";
        String str2="A";
        int fr=Library.Frequency(str1,str2);
        System.out.println();


    }
}
