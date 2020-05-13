package day38_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class Order {
    /*
    create a class called Order
			create five objects of the pizza
			create an arraylist of pizza and add those 5 objects into it
			calculate the total price of the order (use for each loop)
     */
    public static void main(String[] args) {
        Pizza pizza1= new Pizza("Medium",2,1);
        Pizza pizza2= new Pizza("Small",1,2);
        Pizza pizza3= new Pizza("large",5,1);
        Pizza pizza4= new Pizza("medium", 3,0);
        Pizza pizza5= new Pizza("small",0,0);

        System.out.println(pizza1);

        ArrayList<Pizza> pizzaOrders=new ArrayList<>();
        pizzaOrders.addAll(Arrays.asList(pizza1,pizza2,pizza3,pizza4,pizza5));

        //total cost of 5 pizza

        double totalCost=0;
        for (Pizza each: pizzaOrders){
            totalCost+=each.calcCost();
        }
        System.out.println(totalCost);
    }
}
