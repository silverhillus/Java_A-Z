package Replit;

import java.util.Arrays;

public class As3_reverse {
    public static String[] reverse(String[] arr) {

        String [] reverse = new String[arr.length];
        int j=0;
        for (int i=arr.length-1; i>=0; i--){
            reverse[j]=arr[i];
            j++;
        }


        return reverse;
    }

    public static void main(String[] args) {
        String[] arr1 = {"1","2"};
        System.out.println( Arrays.toString(reverse(arr1)));



    }
}
