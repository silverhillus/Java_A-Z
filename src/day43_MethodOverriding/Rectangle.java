package day43_MethodOverriding;

public class Rectangle extends Shape {

     /*
    inherited:
            area, perimeter
            calculateArea(), calculatePerimeter()
     */

    //give the instance variables that are needed to calculate
    public double length;
    public double width;

    public Rectangle(double length, double width){ // constructor with argument
        // initialize the local var.
        this.length=length;
        this.width=width;
    }

    // let's override calculateArea() & calculatePerimeter() method to fix the bug in ShapeObject Class
    // Override Rules:
    // 1-same method name, same parameter MUST happen in the sub class
    // 2-Access modifier must be same / more visible > public-public
    // 3-Return type must be the same > void - void
    // Change the function inside method

    @Override // identifies if the method is overridden method
    public void calculateArea(){
        area = length*width;
        System.out.println("Area of the Rectangle: "+area);
    }
    @Override // identifies if the method is overridden method
    public void calculatePerimeter(){
        perimeter = 2*(length+width);
        System.out.println("Perimeter of the Rectangle: "+perimeter);
    }

}
