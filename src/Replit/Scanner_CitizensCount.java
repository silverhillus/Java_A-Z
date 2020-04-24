package Replit;

import java.util.Scanner;

public class Scanner_CitizensCount {
    public static void main(String[] args) {

        Scanner count = new Scanner(System.in);
        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
        int seniorCitizens = count.nextInt();
        int nonSeniorCitizens = count.nextInt();
        System.out.println("What is new citizen's age?");
        int age = count.nextInt();
        /*
        String last="";
        last=(age >= 65)? "Senior Citizen" : "Non-Senior Citizen"
        System.out.println(last);
         */
        if (age >= 65) {
            System.out.println("Senior Citizen");// if you use String last on the top you don't need this.
            ++seniorCitizens;
           // System.out.println("New seniorCitizens count " + seniorCitizens);
           // System.out.println("New nonSeniorCitizens count " + nonSeniorCitizens);
        } else {
            System.out.println("Non-Senior Citizen");// if you use String last on the top you don't need this.
            ++nonSeniorCitizens;
           // System.out.println("New seniorCitizens count " + seniorCitizens);
           // System.out.println("New nonSeniorCitizens count " + nonSeniorCitizens);
        }
           // No need to repeat twice in if else that's more practical
        System.out.println("New seniorCitizens count " + seniorCitizens);
        System.out.println("New nonSeniorCitizens count " + nonSeniorCitizens);



    }
}
