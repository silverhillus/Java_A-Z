package day43_MethodOverriding;

/*
Task:
1. create a class called ShapeActions:
                methods: calculateArea(), calculatePerimeter()
 */

public class Shape {
    //Each has different variables and different formulas/methods to calculate.
    // Method Overriding : Same method name , same parameter
    // Method overriding must be in subclass so basically you cannot override a method in the same class!!!
    public double area;
    public double perimeter;

    public void calculateArea(){
        area = 0;
        System.out.println("Area of the shape: "+area);
    }

    public void calculatePerimeter(){
        perimeter = 0;
        System.out.println("Perimeter of the shape: "+perimeter);
    }


    /* ONLY METHODS SHOULD BE CREATED THESE ARE NOT NECESSARY TO BE INITIALIZED IN SUPER CLASS!!!
    Each has different variables and different formulas/methods to calculate.

    Well what I did here is METHOD OVERLOADING!!!!
    public double length;
    public double width;
    public int side;
    public double radius;
    public static double Pi=3.14;

    public double calculateArea(double length,double width){ //rectangle
        return length*width;
    }
    public double calculateArea(int side){ //square
        return side*side;
    }
    public double calculateArea(double radius){ // circle
        return Pi*radius*radius;
    }
    public double calculatePerimeter(double length,double width){ //rectangle
        return 2*(length+width);
    }
    public double calculatePerimeter(int side){ //square
        return 4*side;
    }
    public double calculatePerimeter(double radius){ // circle
        return 2*Pi*radius;
    }

     */

}
