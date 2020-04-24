package Replit;

import java.util.Scanner;

public class TipCalculator_51_3 {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE
        Scanner input = new Scanner(System.in);
        System.out.println("Split:"); //yes
        String split = input.next();
        System.out.println("Number of people:"); //4
        int people = input.nextInt();
        System.out.println("Check amount:");//100
        double checkAmount = input.nextDouble();
        System.out.println("Service Quality:");//
        String sQuality = input.next();

        /*
        Poor = 0.05;
        Fair = 0.1;
        Good = 0.15;
        Great = 0.2;
        Excellent = 0.25;
         */
        double tipPercent = 0;
        double totalToPay = 0;
        double totalTip = 0;
        double tipPerP = 0;
        double payPerP = 0;
        String s = "&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&";

        System.out.println("Number of people entered: " + s.substring(0, people));

        if (sQuality.equalsIgnoreCase("Poor")) {
            tipPercent = .05;
        } else if (sQuality.equalsIgnoreCase("Fair")) {
            tipPercent = .1;
        } else if (sQuality.equalsIgnoreCase("Good")) {
            tipPercent = .15;
        } else if (sQuality.equalsIgnoreCase("Great")) {
            tipPercent = .2;
        } else if (sQuality.equalsIgnoreCase("Excellent")) {
            tipPercent = .25;
        }

        totalTip = checkAmount * tipPercent;
        totalToPay += checkAmount + totalTip;


        if (split.equalsIgnoreCase("Yes")) {
            payPerP = totalToPay / people;
            tipPerP = totalTip / people;
        } else {
            payPerP = totalToPay;
            tipPerP = totalTip;
        }

        System.out.println("Total to pay: " + totalToPay);
        System.out.println("Total tip: " + totalTip);
        System.out.println("Total per person: " + payPerP);
        System.out.println("Tip per person:" + tipPerP);

    }
}
