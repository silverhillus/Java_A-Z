package day22_MultiDimensionalArrays_NestedLoop;

import java.util.Arrays;

public class Warmuptasks {
    public static void main(String[] args) {

        /*
        Warmup tasks:
    Task01:
        1. create an int array called numbers that has length of 100
        2. assign 1~100 to the array' each indexes
        3. use for each loop to rpint out all the even numbers.
                MUst use continue statement
    Task02:
        1. Write a program that will take five Strings and save them into an array called arr.
        2. use for each loop to print out the first three letter of each element of arr, one per line. You can assume that every element of arr is at least 3 letters long.
            Example:
                arr -> ["apple", "banana"]
                prints: app
                        ban
         */

        int[] numbers= new int[100];
       numbers=new int[100];

        for (int i=0; i<100; i++){
            numbers[i]=i+1;
        }
        System.out.println(Arrays.toString(numbers));









    }

}
