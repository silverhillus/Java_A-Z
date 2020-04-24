package Replit;
import java.util.Scanner;
public class Shoppinglist_85 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;



        do{
            System.out.println("Enter Item"+count+ " and its price:");
            item=scan.next();
            price=scan.nextDouble();
            System.out.println("Add one more item?");
            countinue=scan.next();
            shoppingListReport="Item"+count+": "+item+" Price: "+price;
            shoppingListReport+="Item"+count+": "+item+" Price: "+price+", ";
            totalPrice+=price;
            count++;

            /*no need
            if (countinue.equalsIgnoreCase("no")){
             break;
            }

             */

        }while(count<=10 && countinue.equalsIgnoreCase("yes"));

        //Item1: tom Price: 2.3, // get rid of last 2 characters
        System.out.println(shoppingListReport.substring(0,shoppingListReport.length()-2));
        System.out.println("Total price: "+totalPrice);


        /*
        expected output: Item1: Lemons Price: 2.3, Item2: Oranges Price: 6.0

        Check the shoppingListReport variable;
        shoppingListReport+="Item"+count+": "+item+" Price: "+price+", ";
        //since it's in a loop ", "(comma and space) will be printed at the end as well

        System.out.println(shoppingListReport);
        output: Item1: Lemons Price: 2.3, Item2: Oranges Price: 6.0, // ", " at the end as you see.

         //in order to eliminate the last 2 characters at the end to meet the task requirement
         // I used substring  method to print all but the last 2 character

         output: Item1: Lemons Price: 2.3, Item2: Oranges Price: 6.0 (same as expected outcome)


         */








    }
}
