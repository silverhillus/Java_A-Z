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
        int j=0;
       for (int i = 0; i < arr.length; i++) {
               arr[i] = sorted[j];
               j++;
           System.out.println(Arrays.toString(sorted));
           }

        return Arrays.equals(nums,Arrays.sort(nums);) ? true : false;

    }

     */

    public static void main(String[] args) {
        int []nums={2,3,5,4,9};
        int [] sorted= new int[nums.length];

        /* LONG WAY
        sorted[0]=arr[0]; //!!!INCORRECT ASSIGNMENT  arr[0]=sorted[0] >> 0
        sorted[1]=arr[1]; //!!!INCORRECT ASSIGNMENT  arr[1]=sorted[1] >> 0
        sorted[2]=arr[2]; //!!!INCORRECT ASSIGNMENT  arr[2]=sorted[2] >> 0
        System.out.println(Arrays.toString(sorted)); // [1, 2, 3]
         */
        int j=0;
        for (int i=0; i<nums.length; i++){
            sorted[j]=nums[i];
            j++;
        }
        //After assigning each element of nums array to sorted array now they're equal.
        //!!!ATTENTION !!! Don't sort nums first / sort sorted after loop
        //What I wanted to do is second array I created sorted array has to be sorted so apply
        //Arrays.sort(sorted); //to sort
        Arrays.sort(sorted); //
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(sorted)); // [1, 2, 3]

        boolean result=Arrays.equals(nums,sorted);
        System.out.println(result);








    }


}
