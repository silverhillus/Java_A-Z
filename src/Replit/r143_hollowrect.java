package Replit;

public class r143_hollowrect {

    public static void printHollowRect() {
        // write your code here:
        System.out.println("*****");
        int j=0;
        while(j<3){
            j++;
            int count=1;
            while(count<=5){
                if (count==1 || count==5){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                count++;
            }
            System.out.println();
        }
        System.out.println("*****");




    }// end your code

    public static void main(String[] args) {

        printHollowRect();
    }


}

