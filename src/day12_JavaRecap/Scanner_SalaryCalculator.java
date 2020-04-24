package day12_JavaRecap;
/*
        ask the user enter salary
        ask the user enter full name
        ask the user to enter company name
        ask the user to enter SSN
        ask the user to enter JobTitle
     */

import java.util.Scanner;

public class Scanner_SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your salary: ");
        double salary = input.nextDouble();

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

        input.nextLine(); // take the enter from the scanner
        System.out.println("Enter your SSN: ");
        int ssn = input.nextInt();

        System.out.println("Enter your company name:");
        String companyName = input.nextLine();

        input.nextLine(); // take the enter from the scanner
        System.out.println("Enter your job title: ");
        String jobTitle = input.nextLine();


        //there is a bug to fix!!!
        System.out.println("Full name is: "+fullName);
        System.out.println("Job Title is: "+jobTitle);
        System.out.println("Company Name: "+companyName);
        System.out.println("SSN: "+ssn);
        System.out.println("Salary is: $"+salary);
        //System.out.println("Full name is: "+ fullName + "\nJob Title is: "+ jobTitle+ "\nCompany Name is: "+companyName);


    }
}
