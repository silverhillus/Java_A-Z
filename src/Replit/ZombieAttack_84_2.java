package Replit;

import java.util.Scanner;

public class ZombieAttack_84_2 {
    public static void main(String[] args) {

        //zuleyha
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        String days="";
        int result=0;
        int num=0;
        for(int i=inhabitants; i>=0;i--){ // ATTENTION: if i>=0 day 0 is also printed so it should be i>0
            result=inhabitants;
            inhabitants=inhabitants/2;
            days="Day "+num;
            num++;
            if(result==0){
                break;
            }
            System.out.println(days+" ["+result+"]");
        }
        System.out.println("---- EXTINCT ----");


    }
}
