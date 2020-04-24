package Replit;

import java.util.Scanner;

public class ZombieAttack_84_3 {
    public static void main(String[] args) {

         // my way
        // for loop is not a good option
       Scanner scan = new Scanner(System.in);
        System.out.println("enter the number of inhabitants");
        int inhabitants = scan.nextInt();

        int day=0;
        for (int i=inhabitants; i>=0; i--) {
            System.out.println("Day "+ day+" "+"["+inhabitants+"]");
            inhabitants = inhabitants / 2;
            day++;
            if (inhabitants == 0) {
                break;
            }
        }
        System.out.println("---- EXTINCT ----");






    }
}
