package day18_NestedLoop;

import java.util.Scanner;

public class NestedLoop_Practice_RoomReservation {
    public static void main(String[] args) {

        /*

    Assignment:
    write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$
                should ask which bedroom do you wanna reserve
                    if user provided invalid entry => please re-enter
                    calculate the total price
                do you want to reserve another room:
                            if yes ==> repeat the previous steps
                            if no ==> your total price is: $$$
                            if answer either yes or no ==> please re-enter

     */
        // 1_Zuura
        Scanner scan = new Scanner(System.in);
        int price =0;

        while(true){
            System.out.println("WELCOME TO HILTON INTERNATIONAL!!!");
            System.out.println("Do you want to reserve a room with King bed, Queen bed OR Single bed? :");
            String answer = scan.nextLine();
            while( ! (answer.equalsIgnoreCase("King Bed") ||
                    answer.equalsIgnoreCase("Queen Bed") ||
                    answer.equalsIgnoreCase("Single Bed"))){
                System.out.println("Invalid entry!Please re-enter? ");
                answer = scan.nextLine();
            }
            if(answer.equalsIgnoreCase("King Bed")){
                price+=120;
            }else if(answer.equalsIgnoreCase("Queen Bed")){
                price+=100;
            }else if(answer.equalsIgnoreCase("Single Bed")){
                price+=80;
            }
            System.out.println("Your room total is: "+price+" $");
            System.out.println("Do you want to continue?");
            String reply = scan.next();
            if(reply.equalsIgnoreCase("Yes")){
                answer = scan.nextLine();
            }
            if(reply.equalsIgnoreCase("NO")){
                System.out.println("Thank you for staying with us!");
                System.out.println("Your total price is: "+price+" $");
                break;
            }
        }

        // 2_




        /*


        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Breeze Hotel");
        System.out.println("We have 3 types of room options;King,Queen,Single");
        System.out.println("Which bedroom would you like to reserve?");
        String room= input.nextLine();

        boolean valid= room.equalsIgnoreCase("king bed") || room.equalsIgnoreCase("queen bed") || room.equalsIgnoreCase("single bed");

        int king=120;
        int queen=100;
        int single=80;

        while (valid){
            System.out.println("Do you want to reserve another room");
            String answer=input.next();
            if (answer.equalsIgnoreCase("yes")){

            }


        }

         */







    }

}
