package day38_Constructors;


import java.text.DecimalFormat;

public class CircleObject1 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00"); // round up to 2 digits after the decimal point
        Circle1 circle1= new Circle1(12);
        double area= circle1.Area();
        double perimeter= circle1.Perimeter();

        System.out.println("Dimater: "+ circle1.diameter);
        System.out.println("Area: "+area); // Area: 452.15999999999997
        System.out.println("Round off Area: "+ df.format(area)); // Round off Area: 452.16
        System.out.println("Perimeter: "+perimeter);
    }
}
