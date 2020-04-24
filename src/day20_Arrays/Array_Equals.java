package day20_Arrays;

import java.util.Arrays;

public class Array_Equals {
    public static void main(String[] args) {
        /*
        > Arrays.equals(array1, array2);
         */

        int [] ar1={9,8,0,2,3,5,12,43,1};
        int [] ar2={9,8,0,2,3,5};
        boolean result=Arrays.equals(ar1,ar2);
       //System.out.println(Arrays.equals(ar1,ar2)); // false
        System.out.println(result);
        System.out.println("===================================");

        int [] ar3={1,2,3};
        int [] ar4={3,1,2};
        boolean result1=Arrays.equals(ar3,ar4);
        System.out.println(result1); // false > same elements but indexes are different
        System.out.println("===================================");

        int [] ar5={1,2,3};
        int [] ar6={3,1,2};

        //if I sort them first then compare
        Arrays.sort(ar5);
        Arrays.sort(ar6);
        boolean result2=Arrays.equals(ar5,ar6);
        System.out.println(result2); // true > same elements same indexes










    }
}
