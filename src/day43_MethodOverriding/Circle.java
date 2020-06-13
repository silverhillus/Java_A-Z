package day43_MethodOverriding;
/*
2. create sub classes of Shape:
                Circle
                rectangle
                square
     give the instance variables that are needed to calculate the Area, perimeter, of those shapes
 */

public class Circle extends Shape {
    //give the instance variables that are needed to calculate
    public double radius;
    public static double PI = 3.14; // since it's a constant so it could be static

    public Circle(double radius){
        this.radius = radius;
    } // constructor with argument

    /*
    calculateArea & calculatePerimeter
     */

    // let's override calculateArea() & calculatePerimeter() method to fix the bug in ShapeObject Class
    // Override Rules:
    // 1-same method name, same parameter MUST happen in the sub class
    // 2-Access modifier must be same / more visible > public-public
    // 3-Return type must be the same > void - void
    // Change the function inside method

    @Override // identifies if the method is overridden method
    public void calculateArea(){ // everything same except the functionality
        area = PI*radius*radius;
        System.out.println("Area of the Circle: "+area);
    }
    @Override // identifies if the method is overridden method
    public void calculatePerimeter(){
        perimeter = 2*PI*radius;
        System.out.println("Perimeter of the Circle: "+perimeter);
    }
}
