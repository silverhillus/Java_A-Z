package day12_JavaRecap;

import java.util.Scanner;

public class Scanner_NextLine_Practice {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        // 703 Ten Eyck Ave, Lyndhurst, New Jersey, 07071
        // fullAddress: Building-number  Street, city, state, zipcode

        System.out.println("Building Number: ");
        int bNumber= input.nextInt();



        input.nextLine();
        System.out.println("Street: ");
        String street=input.nextLine();


        System.out.println("Enter the City Name, State Name");
        String cityState=input.nextLine();

        System.out.println("Enter the zip code: ");
        String zipCode= input.next();
        String fullAddress= bNumber+" "+street+", "+cityState+", "+zipCode;



        System.out.println(fullAddress);


    }
}
