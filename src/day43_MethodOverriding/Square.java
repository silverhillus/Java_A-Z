package day43_MethodOverriding;

public class Square extends Shape{
    public double side;
    public Square(double side){
        this.side=side;
    }

    // let's override calculateArea() & calculatePerimeter() method to fix the bug in ShapeObject Class
    // Override Rules:
    // 1-same method name, same parameter MUST happen in the sub class
    // 2-Access modifier must be same / more visible > public-public
    // 3-Return type must be the same > void - void
    // Change the function inside method

    @Override // identifies if the method is overridden method
    public void calculateArea(){
        area = side*side;
        System.out.println("Area of the Square: "+area);
    }
    @Override // identifies if the method is overridden method
    public void calculatePerimeter(){
        perimeter = 4*side;
        System.out.println("Perimeter of the Square: "+perimeter);
    }

}
