package Replit;
import java.util.Scanner;
public class VideoGameCoupons_34 {
    public static void main(String[] args) {

        //Write your code here
        Scanner input= new Scanner(System.in);
        System.out.println("Enter number of coupons:");
        int numberOfCoupons= input.nextInt();
        int candies=numberOfCoupons/10;
        int gumballs=(numberOfCoupons%10)/3;

        if(numberOfCoupons>=10 || numberOfCoupons>=3){
            System.out.println("Number of Candies: " + candies);
            System.out.println("Number of Gumballs: " + gumballs);
        }else {
            System.out.println("Not enough coupons");
        }


    }


}
