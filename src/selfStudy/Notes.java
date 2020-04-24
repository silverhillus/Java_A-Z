package selfStudy;


import java.util.Arrays;
import java.util.Scanner;

public class Notes {
    public static void main(String[] args) {

//        int i=9;
//        --i;
//        System.out.println(i); //pre-decrement> 8
//
//        int k=9;
//        System.out.println(--k);//>8

        int i = 9;
        i--;
        System.out.println(i); //post-decrement> 8

        int k = 9;
        System.out.println(k--); //post-decrement> 9

        System.out.println("========");

        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1.equals(s2));
        System.out.println("s1==s2 is:" + s1 == s2);//false
        //                 "s1==s2is:abc" concatenate first
        //                  "s1==s2is:abc"==abc >> false
        //pay attention to bracket
        System.out.println("s1==s2 is:" + (s1 == s2));//> s1==s2 is:true


        byte[] myNum = new byte[4];
        for (i = 0; i < myNum.length; i++) {
            // System.out.print(myNum[i]);// 0000
        }
        System.out.println(Arrays.toString(myNum));

        //combining these 2 arrays
        int[] ar1 = {1, 2, 3};//size 3
        int[] ar2 = {4, 5, 6};//size 3

        //1_initialise a new array with size of 6 so that it can contain all the elements
        //int[] combine = new int[6]; // [0,0,0,0,0,0] by default

        //make it more general:
        int[] combine = new int[ar1.length + ar2.length];


        for (i = 0; i < combine.length; i++) {
            System.out.print(combine[i] + " ");//> 0 0 0 0 0 0
        }
        System.out.println();//break a line
        System.out.println(Arrays.toString(combine));//outside the loop because i want to print it once >[0, 0, 0, 0, 0, 0]

        //now how do i assign a new variable ?

//        //ar1 to combine
//        combine[0]=ar1[0];
//        combine[1]=ar1[1];
//        combine[2]=ar1[2];
//        System.out.print(combine);// you cannot print by just typing array variable name > hashcode
//
//        System.out.println();
//
//        for (i = 0; i<combine.length; i++){
//            System.out.print(combine[i]);
//        }
//
//        System.out.println();
//
//        //ar2 to combine
//        combine[3]=ar2[0];
//        combine[4]=ar2[1];
//        combine[5]=ar2[2];
//
//        for (i=0; i<combine.length; i++){
//            System.out.print(combine[i]);
//        }

        /*
        // All in one > assigning ar1 and ar2 to combine array
        combine[0] = ar1[0];
        combine[1] = ar1[1];
        combine[2] = ar1[2];
        combine[3] = ar2[0];
        combine[4] = ar2[1];
        combine[5] = ar2[2];

        for (i=0; i<combine.length; i++){
            System.out.print(combine[i]+" ");// > 1 2 3 4 5 6
        }
        System.out.println();

        System.out.println(Arrays.toString(combine)); // > [1, 2, 3, 4, 5, 6]

         */

        System.out.println("=============");

        // This is very primitive way of doing it
        //how do I make it short by using loops?

        for(i=0; i< ar1.length; i++){
            combine[i]=ar1[i];
        }
        // //System.out.print(Arrays.toString(combine));// [1, 2, 3, 0, 0, 0]
        for(i=0; i< ar2.length; i++){
            combine[i+ar1.length]=ar2[i];
        }
        System.out.print(Arrays.toString(combine));// [1, 2, 3, 4, 5, 6]










    }

}
