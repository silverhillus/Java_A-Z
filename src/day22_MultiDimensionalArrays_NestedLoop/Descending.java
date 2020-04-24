package day22_MultiDimensionalArrays_NestedLoop;

import java.util.Arrays;

public class Descending {
    public static void main(String[] args) {

        int[]arr={1,2,34,-12,0,99,3};
        //first sort
        Arrays.sort(arr);//ascending
        System.out.println(Arrays.toString(arr)); //> [-12, 0, 1, 2, 3, 34, 99]

        //create a new array that can hold all the elements of arr
        int[]revArr=new int[arr.length];


        // assign reverse order
        int j=arr.length-1;
        for(int i=0; i<revArr.length; i++){
            revArr[i]=arr[j];
          //0,1,2,3..=..3,2,1,0
            j--;
        }
        System.out.println(Arrays.toString(revArr)); // [99, 34, 3, 2, 1, 0, -12]


    }
}
