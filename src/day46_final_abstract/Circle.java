package day46_final_abstract;

public final class Circle extends Shape {

    public double radius;
    public final static double PI = 3.14;

    public Circle(double radius){
        this.radius = radius;
    }

    public void Area(){
        double area = radius * radius * PI;
        System.out.println("Area of circle: "+area);
    }

}





