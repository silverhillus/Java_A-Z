package day20_Arrays;

import java.util.Arrays;

public class Array_Sorting {
    public static void main(String[] args) {
        /*
        > Arrays.sort(arrayName);
         */

        int [] ar1={9,8,0,2,3,5,12,43,1};

        Arrays.sort(ar1); // it sorts the numbers in ascending order
        System.out.println(Arrays.toString(ar1));// > [0, 1, 2, 3, 5, 8, 9, 12, 43]

        // after it's sorted out how do you find the max & min numbers?
        System.out.println("first min num: "+ ar1[0]);//index 0 is smallest
        System.out.println("second min num: "+ ar1[1]);//index 1 is second smallest


        System.out.println("first min num: "+ ar1[ar1.length-1]);//index max is largest
        System.out.println("second min num: "+ ar1[ar1.length-2]);//index max-1  is second largest

        System.out.println("=======================================================");

        char[] ch = {'Z', 'D', 'W', 'Y', 'A', 'B', 'E' , 'D' };
        Arrays.sort(ch);

        System.out.println( Arrays.toString(ch) );

        System.out.println("=======================================================");


        String[] names = {"Deniz", "Osman", "Rustem",  "Anna", "Ali", "Adil"};
        Arrays.sort(names);
        System.out.println( Arrays.toString(names) );

        System.out.println("=======================================================");

        int[] arr = {3,1,4,-1,100, -100, 200, 155};
        Arrays.sort(arr);                          //         ascending order
        System.out.println(Arrays.toString(arr)); // > [-100, -1, 1, 3, 4, 100, 155, 200]
                                                  //      0,   1, 2, 3, 4,  5,   6,   7
        //How to reverse it to descending order
        int[] arrDesc = new int[arr.length];// first create new array with the same size=8
                                            // int [ ] arrDesc=[0,0,0,0,0,0,0,0]   by default

        int j = 0;
        for(int i = arr.length -1;  i >= 0; i--){
            //index: 7,6,5,4,3,2,1,0 > that's what I want
            //System.out.print( arr[i] +" "); // >> 200 155 100 4 3 1 -1 -100 not array
            // from 0-7   7-0
            arrDesc[j]  = arr[i];

            j++;
        }
        System.out.println(Arrays.toString(arrDesc));// [200, 155, 100, 4, 3, 1, -1, -100]









    }
}
