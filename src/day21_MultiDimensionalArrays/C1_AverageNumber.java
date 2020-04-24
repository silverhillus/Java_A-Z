package day21_MultiDimensionalArrays;

import java.text.DecimalFormat; // shortcut! when you type "Dec" in the main body it pops up.

public class C1_AverageNumber {
    public static void main(String[] args) {
        DecimalFormat DF = new DecimalFormat("0.00");
        double[] arr = {1, 2, 2};
        //av=sum/number of items or sum/length

        //Step1_find the sum

        double sum=0;
        for (int i=0; i<arr.length; i++ ){
            sum+=arr[i];
        }
        System.out.println(sum);

        //Step2_find the average
        double average= sum / arr.length;
        System.out.println(average); // 1.6666666666666667

        //Step3_Rounding off the result by DecimalFormat
        System.out.println(DF.format(average)); // 1.67




         /*
                [2,1,3] ==> 6
                [1,2,3] ==> 6
         */

/*
        int[] arr2 = {1,2,2}; // 5/3 =
        System.out.println( 5/3 );
        System.out.println( 5/(double)3);
*/














    }
}
