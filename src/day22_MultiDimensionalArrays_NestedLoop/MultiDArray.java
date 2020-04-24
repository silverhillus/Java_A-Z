package day22_MultiDimensionalArrays_NestedLoop;

import java.util.Arrays;

public class MultiDArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        //           0 1 2

        // n dimensional array contains (n-1) dimensional arrays

        // 2D array: [index num of 1D array ][index num of elements]
        int[][] arr2D = { {1,2,3} ,  {4,5,6} };
        //                    0          1

        int[]arr1D=arr2D[0]; // arr2D[0] gives a single D array and we can assign it to another single D new array

        //HOW TO PRINT SINGLE D ARRAY?
        //System.out.println(arr1D); // hashcode
        System.out.println(Arrays.toString(arr1D)); // [1, 2, 3]
        //or
        System.out.println(Arrays.toString(arr2D[0])); // [1, 2, 3] >> single dimensional array from arr2D
        System.out.println( Arrays.toString(  arr2D[1]  )  );

        //PRINTING AN ELEMENT FROM 2D ARRAY?
        System.out.println(arr2D[0][2]); // since it's an int value no need any method to print! > 3

        // PRINTING 2D ARRAY TO STRING?

        System.out.println(  Arrays.deepToString( arr2D  ) ); // [[1, 2, 3], [4, 5, 6]]

        //PRINTING 1D ELEMENTS 1 BY 1?
        //USE LOOP FOR SINGLE D ARRAYS
        for(int eachElement : arr2D[0] ){
            System.out.print(eachElement);
        }
        System.out.println();
        System.out.println("======");

        for(int i=0; i < arr2D[0].length; i++){
            int num =  arr2D[0][i];
            System.out.print(num);
        }
        System.out.println();

        // PRINTING ALL THE ELEMENTS IN 2D ARRAY WITH NESTED LOOP

        //int[][] arr2D = { {1,2,3} ,  {4,5,6} };

        for(int j=0; j<arr2D.length; j++) { // outer loop repeats 2 times
            for (int i = 0; i < arr2D[j].length; i++) {// inner loop if j=0 >it repeats 3 times ---- if j=1 >it repeats 3 times
                System.out.print(arr2D[j][i]+" ");// arr2D[0][1/2/3]
            }
        }









    }
}
