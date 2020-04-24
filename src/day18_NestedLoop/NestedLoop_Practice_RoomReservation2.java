package day18_NestedLoop;

import java.util.Scanner;
public class NestedLoop_Practice_RoomReservation2 {
    public static void main(String[] args) {

        // 2_Phu
        Scanner scan = new Scanner(System.in);
        int price = 0;
        String bed = "";
        String answer = "";
        do {
            System.out.println("Which bed do you want to reserve: King Bed, Queen Bed, or Single Bed?");
            bed = scan.nextLine().toLowerCase();
            while ( !(bed.equals("king bed") || bed.equals("queen bed") || bed.equals("single bed")) ) {
                System.out.println("Please re-enter bed type");
                bed = scan.nextLine();
            }
            price += bed.equals("king bed") ? 120 : bed.equals("queen bed") ? 100 : 80;
            System.out.println("Do you want to reserve another room?");
            answer = scan.nextLine().toLowerCase();
            while ( !(answer.equals("yes") || answer.equals("no")) ) {
                System.out.println("Please re-enter yes or no");
                answer = scan.nextLine();
            }
            if (answer.equals("no"))
                break;
        } while (answer.equals("yes"));
        System.out.println("Your total price is: $" + price);
    }
}
