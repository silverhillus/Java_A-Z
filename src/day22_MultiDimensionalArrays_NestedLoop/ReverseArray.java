package day22_MultiDimensionalArrays_NestedLoop;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        /*
        warmup tasks:
    1. write a program that can reverse the array
    2. write a program that sort the array in descending order
    3. write a program that can return the number of appearances of "java" and "python" anywhere in the sentence
                (it's similar to the task 97 in repl.it, But this time you MUST use arrays and for each loop)
    4. write a program that can count the even and odd number from an array of integers
                        MUST use for each loop
         */

        int [] arr={1,2,3,4,5};

        //print reverse
        for (int i= arr.length-1; i>=0; i--){ //
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        //assign reverse of arr to a new array
        int[] revArr = new int[arr.length];

        revArr [0]= arr[4];
        revArr [1]= arr[3];
        //so on

        /*didn't work for some reason!!!!
        for (int j=arr.length-1; j>=0; j--) {
            for (int i = 0; i < revArr.length; i++) {
                revArr[i]=arr[j];
            }

        }
        System.out.println(Arrays.toString(revArr)); // [1, 1, 1, 1, 1]

         */

        int j=arr.length-1;
        for (int i = 0; i < revArr.length; i++) {
            revArr[i]=arr[j];
            j--;
        }
        System.out.println(Arrays.toString(revArr));







    }
}
