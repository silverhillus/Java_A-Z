package Replit;

import java.util.Scanner;

public class r145 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i <= size - 1; i++) {

            arr[i] = inp.nextInt();
        }

        plus_minus(arr);
    }//end main

    public static void plus_minus(int[] arr) {

        /*int j = 0;
        while (j < arr.length) {
            j++;

         */
            int positives = 0;
            int negatives = 0;
            int zeros = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0) {
                    positives++;

                } else if (arr[i] < 0) {
                    negatives++;

                } else {
                    zeros++;

                }
            }
            System.out.print("positives:" + positives + ", ");
            System.out.print("negatives:" + negatives + ", ");
            System.out.print("zeros:" + zeros);

        }

    }


