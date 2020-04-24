package Replit;

import java.util.Scanner;

public class TipCalculator_51_2 {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE
        Scanner input=new Scanner(System.in);
        System.out.println("Split:");
        String split=input.next();
        System.out.println("Number of people:");
        int numberOfPeople=input.nextInt();
        System.out.println("Check amount:");
        double checkAmount=input.nextDouble();
        System.out.println("Service Quality:");
        String service=input.next();
        double tipPercent=0;
        if(service.equals("Poor")){
            tipPercent=0.05;
        }else if(service.equals("Fair")){
            tipPercent=0.10;
        }else if(service.equals("Good")){
            tipPercent=0.15;
        }else if(service.equals("Great")){
            tipPercent=0.20;
        }else if(service.equals("Excellent")){
            tipPercent=0.25;
        }
        double totalTip=checkAmount*tipPercent;
        double totalPay=checkAmount+totalTip;
        double totalPerPerson= totalPay/numberOfPeople;
        double tipPerPerson=totalTip/numberOfPeople;
        String people="&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&";
        System.out.println("Number of people entered: "+people.substring(0,numberOfPeople));
        System.out.println("Total to pay: "+totalPay);
        System.out.println("Total tip: "+totalTip);
        System.out.println("Total per person: "+totalPerPerson);
        System.out.println("Tip per person: "+tipPerPerson);


    }
}
