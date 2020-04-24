package Replit;

import java.util.Scanner;

public class r147 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i <= size - 1; i++) {

            arr[i] = inp.nextInt();
        }
        //#2 Your code here
        for (int each : arr) {
            isPos(each);
        }

    }

    public static void isPos(int num) {
        //#1 your code here
        String result = (num > 0) ? "positive" : "not positive";
        System.out.println(result);

    }

}

