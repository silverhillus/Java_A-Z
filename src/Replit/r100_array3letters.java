package Replit;
import java.util.Arrays;
import java.util.Scanner;

public class r100_array3letters {
    public static void main(String[] args) {

        /*
        The code provided in your main method will take in five Strings and save them into an array called arr.
        Print out the first three letter of each element of arr, one per line.
        You can assume that every element of arr is at least 3 letters long.

        Example:
        arr -> ["apple", "banana"]
        prints: app
                ban
         */

            Scanner input = new Scanner(System.in);
            String[] arr = new String[5];
            for (int i=0;i<5;i++)
            {
                arr[i] = input.nextLine();
            }
            //leave above alone!  write your code below.
            //Create another loop for your solution!
        for (String each3 : arr){
            System.out.println(each3.substring(0,3));

        }








    }
}
