package Replit;

import java.util.Scanner;

public class TipCalculator_51 {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE
        Scanner input = new Scanner(System.in);
        System.out.println("Split:");
        String split = input.next();
        System.out.println("Number of people:");
        int people = input.nextInt();
        System.out.println("Check amount:");
        double checkAmount = input.nextDouble();
        System.out.println("Service Quality:");
        String sQuality = input.next();

        double tipPoor = 0.05 * checkAmount;
        double tipFair = 0.1 * checkAmount;
        double tipGood = 0.15 * checkAmount;
        double tipGreat = 0.2 * checkAmount;
        double tipExcellent = 0.25 * checkAmount;
        double totalToPay = 0;
        double totalTip = 0;


        System.out.println("Number of people entered: &&&&");

        if (split.equals("Yes")) {
            if (sQuality.equals("Poor")) {
                totalToPay += checkAmount + tipPoor;
                System.out.println("Total to pay: " + totalToPay);
                System.out.println("Total tip: " + tipPoor);
                System.out.println("Total per person: " + (totalToPay / people));
                System.out.println("Tip per person:" + tipPoor / people);
            } else if (sQuality.equals("Fair")) {
                totalToPay += checkAmount + tipFair;
                System.out.println("Total to pay: " + totalToPay);
                System.out.println("Total tip: " + tipFair);
                System.out.println("Total per person: " + (totalToPay / people));
                System.out.println("Tip per person:" + tipFair / people);
            } else if (sQuality.equals("Good")) {
                totalToPay += checkAmount + tipGood;
                System.out.println("Total to pay: " + totalToPay);
                System.out.println("Total tip: " + tipGood);
                System.out.println("Total per person: " + (totalToPay / people));
                System.out.println("Tip per person:" + tipGood / people);
            } else if (sQuality.equals("Great")) {
                totalToPay += checkAmount + tipGreat;
                System.out.println("Total to pay: " + totalToPay);
                System.out.println("Total tip: " + tipGreat);
                System.out.println("Total per person: " + (totalToPay / people));
                System.out.println("Tip per person:" + tipGreat / people);
            } else if (sQuality.equals("Excellent")) {
                totalToPay += checkAmount + tipExcellent;
                System.out.println("Total to pay: " + totalToPay);
                System.out.println("Total tip: " + tipExcellent);
                System.out.println("Total per person: " + (totalToPay / people));
                System.out.println("Tip per person:" + tipExcellent / people);
            }
        } else {
            if (sQuality.equals("Poor")) {
                totalToPay += checkAmount + tipPoor;
                System.out.println("Total to pay: " + totalToPay);
                System.out.println("Total tip: " + tipPoor);
                System.out.println("Total per person: " + (totalToPay));
                System.out.println("Tip per person:" + tipPoor);
            } else if (sQuality.equals("Fair")) {
                totalToPay += checkAmount + tipFair;
                System.out.println("Total to pay: " + totalToPay);
                System.out.println("Total tip: " + tipFair);
                System.out.println("Total per person: " + (totalToPay));
                System.out.println("Tip per person:" + tipFair);
            } else if (sQuality.equals("Good")) {
                totalToPay += checkAmount + tipGood;
                System.out.println("Total to pay: " + totalToPay);
                System.out.println("Total tip: " + tipGood);
                System.out.println("Total per person: " + (totalToPay));
                System.out.println("Tip per person:" + tipGood);
            } else if (sQuality.equals("Great")) {
                totalToPay += checkAmount + tipGreat;
                System.out.println("Total to pay: " + totalToPay);
                System.out.println("Total tip: " + tipGreat);
                System.out.println("Total per person: " + (totalToPay));
                System.out.println("Tip per person:" + tipGreat);
            } else if (sQuality.equals("Excellent")) {
                totalToPay += checkAmount + tipExcellent;
                System.out.println("Total to pay: " + totalToPay);
                System.out.println("Total tip: " + tipExcellent);
                System.out.println("Total per person: " + (totalToPay));
                System.out.println("Tip per person:" + tipExcellent);
            }

        }


    }
}
