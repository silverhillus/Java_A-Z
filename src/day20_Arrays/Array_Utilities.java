package day20_Arrays;

import java.util.Arrays;

public class Array_Utilities {
    public static void main(String[] args) {
        /*
        > Arrays.toString(arrayName);
         */


        int [] arr={1,2,3};

        Arrays.toString(arr);//it converts the array into string to print so
        //System.out.println(arr); incorrect!!!! [I@61bbe9ba
        String r= Arrays.toString(arr);
        System.out.println(r);

        System.out.println("=======");

        String names[] = {"Madina", "Fatih", "Osman"};

        System.out.println( Arrays.toString(  names  )  );


        double[] nums = {10, 20, 30 , 40, 50};// [10.0, 20.0, 30.0, 40.0, 50.0] because it's double

        System.out.println( Arrays.toString( nums )  );

        System.out.println( nums[0] + 1  );



    }
}
