package selfStudy;



public class Revision17 {
    public static void main(String[] args) {



        for (int j=0; j<5; j+=1){
            for (int i = 1; i <= 5; i++) {  // 1,2,3,4,5
                System.out.print(i + " ");
            }
            System.out.println();

        }
        System.out.println("==============");

        /*
         ******
         ******
         ******
         ******
         ******
         ******
         ******
         */

        for (int j=0; j<=7; j++){
            for (int i=0; i<6; i++){
                System.out.print("*");// ******
            }
            System.out.println();
        }
        System.out.println("=============");

        /*
         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * *

         */


        for (int j=0; j<6; j++){
            for (int i=0; i<6; i++){
                System.out.print("* ");//* * * * * *
            }
            System.out.println();
        }

        System.out.println("=============");

        for (int i=0; i<8; i++){
            int a = 1;
            while(a<=10){
                System.out.print("* ");//* * * * * * * * * *
                a++;
            }
            System.out.println();
        }

        System.out.println("=============");
        for (int i=0; i<=60; i++){
            System.out.print("=");
        }
        for (int i=0; i<=60; i++){
            System.out.print(" ");
        }


        /*

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *
         * * * * * * *
         * * * * * * * *
         * * * * * * * * *  //9 by 9

         */

        for (int j=0; j<=9; j++){
            for(int i =1; i <= j; i++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=0; i<=60; i++){
            System.out.print("=");
        }

        /*
         * * * * * * * * *
         * * * * * * * *
         * * * * * * *
         * * * * * *
         * * * * *
         * * * *
         * * *
         * *
         *
         */

        System.out.println();
        for (int i=9; i>0; i--){
            for (int j=i; j>0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=0; i<=60; i++){
            System.out.print("=");
        }
















    }
}

