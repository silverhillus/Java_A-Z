package Replit;

import java.util.Arrays;

public class As4 {
    /*
    this is a sorted collection (in this case array):

7,8,9,10

this is an unsorted collection:

5,4,9,8,7,3

sorted in this case means smallest number to biggest.
isSort gets an array and returns true if its sorted.

for example:
isSort([2,3,5,4,9]);
returns: false

isSort([1,2,3]);
returns: true

isSort([7,8,9]);
returns: true.
     */
    /*
    public static boolean isSort(int[] nums)
    {
        Arrays.sort(nums);
        int [] sorted = new int[nums.length];

        return Arrays.equals(nums,Arrays.sort(nums);) ? true : false;

    }

     */

    public static void main(String[] args) {
        int []arr={1,2,3};
       int [] sorted= new int[arr.length];

       for (int j=0; j<sorted.length; j++) {
           for (int i = 0; i < arr.length; i++) {
               arr[i] = sorted[j];
               j++;
           }
       }
        System.out.println(Arrays.toString(sorted));

    }


}
