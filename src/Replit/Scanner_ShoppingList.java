package Replit;

import java.util.Scanner;

public class Scanner_ShoppingList {
    public static void main(String[] args) {

        //WRITE YOUR CODE HERE:
        Scanner input = new Scanner(System.in);
        System.out.println("Enter item1, count and its price:");
        String item1 = input.next();
        int count1 = input.nextInt();
        double price1 = input.nextDouble();
        double tPrice1=count1*price1;
        //System.out.println("Explanation: " + "(" + "Item1 is " + item1 + ", count is " + count1 + ", price is " + price1 + ")");


        System.out.println("Enter item2, count and its price:");
        String item2 = input.next();
        int count2 = input.nextInt();
        double price2 = input.nextDouble();
        double tPrice2=count2*price2;
        //System.out.println("Explanation: " + "(" + "Item2 is " + item2 + ", count is " + count2 + ", price is " + price2 + ")");

        System.out.println("Enter item3, count and its price:");
        String item3 = input.next();
        int count3 = input.nextInt();
        double price3 = input.nextDouble();
        double tPrice3=count3*price3;
        //System.out.println("Explanation: " + "(" + "Item3 is " + item3 + ", count is " + count3 + ", price is " + price3 + ")");

        input.nextLine();
        double totalPrice=0;
        String report="";
        if (count1>0){
            totalPrice +=tPrice1;
            report+="Item1: "+item1 +" Price: "+tPrice1+", ";
        }
        if (count2>0){
            totalPrice +=tPrice2;
            report+="Item2: "+item2 +" Price: "+tPrice2+", ";
        }
        if (count3>0){
            totalPrice +=tPrice3;
            report+="Item3: "+item3 +" Price: "+tPrice3;
        }
        System.out.println(report);
        System.out.println("The total price is "+ totalPrice);



         /*
         -build the report variable by concatenating Strings and double price values:
         -do not include items that have count 0, use if statement !
         -Calculate total price for the item and concatenate like below

         "Item1: Tomatoes Price: 10.8, Item3: Apples Price: 31.5"
          Item1: tttt: 63.0Item2: hhhh: 36.0Item3: jjjj: 348.0
          Explanation: (Item2 "Cheese" is not included since its count is 0)

         - Print the value of report variable

         - Print total Price:
         "Total price: 42.3"
          */
         /*
         if(count1==0 && count2==0 && count3==0){
             System.out.println("Explanation: "+ "("+"Item1 "+ "\""+ item1+"\""+" is not included since its count is 0)");
             System.out.println("Explanation: "+ "("+"Item2 "+ "\""+ item2+"\""+" is not included since its count is 0)");
             System.out.println("Explanation: "+ "("+"Item3 "+ "\""+ item3+"\""+" is not included since its count is 0)");
         }else{
             System.out.println();
         }

          */



    }
}


