package day38_Constructors;

public class Circle1 {
    /*Create a class called Circle
            instance variables:
    radius, pi, diameter
    add a constructor that can initialize the radius of the circle
    instance methods:
    area(): can return the area of the circle as double
    perimeter(): cna return the perimeter of the circle as double
    toString(): returns the info of the circle
    Note: global value of PI is 3.14
    diameter of circle = 2 * radius
    area of circle = PI * r * r

     */

    static double Pi=3.14; // 3.14 is a global constant that's why it's static
    double radius;
    double diameter;

    public Circle1(double radius){ // we only need to know radius / we can find diameter with radius.
        this.radius=radius;
        //this.diameter=radius*2; // since I don't have a local var called dimater no need this.
        diameter=radius*2;
    }
    public double Area(){
        return Pi*radius*radius;
    }
    public double Perimeter(){
        return Pi*diameter;
    }
    public String toString(){
        return "Circles radius: "+radius+
                ", Circles diameter: "+diameter+
                ", Circles area: "+Area()+
                ", Circles perimeter: "+Perimeter();
    }



}
