package Replit;

import java.util.Scanner;

public class Scanner_Patient {
    public static void main(String[] args) {

        // Too much details needs outermost attention!!!
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");
        System.out.println("Enter your first name");
        String firstName = input.nextLine();
        System.out.println("Enter your last name");
        String lastName = input.nextLine();
        System.out.println("Enter your email");
        String email = input.nextLine();
        System.out.println("Enter your street");
        String street = input.nextLine();
        System.out.println("Enter your city");
        String city = input.nextLine();
        System.out.println("Enter your state");
        String state = input.nextLine();
        System.out.println("Enter your zip code");
        int zipcode = input.nextInt();
        System.out.println("Enter your work phone number");
        long workPhoneNumber = input.nextLong();
        System.out.println("Enter your personal phone number");
        long personalPhoneNumber = input.nextLong();
        System.out.println("Enter your age");
        int age = input.nextInt();
        System.out.println("Enter your height");
        double height = input.nextDouble();
        System.out.println("Enter your weight");
        double weight = input.nextDouble();
        System.out.println("Are you married?");
        boolean married = input.nextBoolean();

        String fullName = "Full name: " + lastName + ", " + firstName;
        String address = "Address: " + street + ", " + city + ", " + state + " " + zipcode;
        String contacts = "Contacts: " + "work phone number - " + workPhoneNumber + ", " + "personal phone number - " + personalPhoneNumber + ", email: " + email;
        //Patient personal information
        System.out.println("Patient personal information");
        System.out.println(fullName);
        System.out.println(address);
        System.out.println(contacts);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight+ " pounds");
        System.out.println("Married?: " + married);


    }
}
