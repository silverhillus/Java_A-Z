package Replit;

import java.util.Scanner;

public class r104_fivefive {
    public static void main(String[] args) {

        /*
        Given an array of ints, print true if the array contains a 5 next to a 5 anywhere in the array.
        If no consecutive 5s or no 5s are detected in your code then print false.
        1
5
5
1
1

         */

        //Anna
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        String result="";
        for (int i=0; i<=nums.length-2; i++) {
            if (nums[i] == 5 && nums[i + 1] == 5) {
                result="true";
            } else if (!(result.equalsIgnoreCase("true"))){
                result="false";
            }
        }
        System.out.println(result);











    }
}
