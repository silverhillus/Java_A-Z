package day22_MultiDimensionalArrays_NestedLoop;

import java.util.Arrays;

public class NestedForEach {
    public static void main(String[] args) {

        int[][] numbers = {
                {1,2,3},
                {4,5,6,7,8,9},
                {10,11,12,13,14},
                {15,16,17,18,19,20,21}
        };

        // 1. print all even numbers ina same line
        // 2. count odd numbers ==> return the total odd number


        int oddCount=0;
        int sumOdd=0;
        int sumEven=0;
        String elements="";

        for (int [] each1DArray :  numbers){

            for (int eachElement : each1DArray){
                if (eachElement%2==0){
                    //System.out.print(eachElement+" ");
                    elements+=eachElement+" ";
                    sumEven+=eachElement;
                }else{
                    oddCount++;
                    sumOdd+=eachElement;
                }
            }
        }
        System.out.println("2D Array:              "+Arrays.deepToString(numbers));
        System.out.println("All elements toString: "+elements);
        System.out.println("Sum of evens:          "+ sumEven);
        System.out.println("Sum odds:              "+sumOdd);








    }
}
