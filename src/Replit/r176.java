package Replit;

import java.util.Arrays;

public class r176 {
    public static int findMax(int [] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public static double findMax(double [] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }


    public static void main(String[] args) {
        int arr []={0,1,2,12,5,-10};
        int m=findMax(arr);
        System.out.println(m);
    }

}
