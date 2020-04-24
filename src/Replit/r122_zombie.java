package Replit;

import java.util.Arrays;
import java.util.Scanner;

public class r122_zombie {
    public static void main(String[] args) {

        /*
        Day 0 [3, 6, 0, 4, 3, 2, 7, 1]
        Day 1 [1, 3, 0, 2, 1, 1, 3, 0]
        Day 2 [0, 1, 0, 1, 0, 0, 1, 0]
        Day 3 [0, 0, 0, 0, 0, 0, 0, 0]
         ---- EXTINCT ----
         */

        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for(int i=0; i<inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }

        //TODO. Write you code below this line.

        int day=0;
        System.out.println("Day " + day + " [" +  Arrays.toString(inhabitants) +"]");
        day++;
        for (int each : inhabitants){
            if (each!=0){
                each=each/2;
            } else {
                System.out.println("---- EXTINCT ----");
            }

        }

        /*
        int day=0;
       sout

         */



    }
}
