package selfStudy;

public abstract class Shape {
    final public double pi=3.14;
    public abstract void Area();
}
class Triangle extends Shape{
    @Override
    public void Area() {
        System.out.println("base*height*1/2");
    }
}

class  Circle extends Shape{
    public double radius;
    public final static double pi=3.14;
    @Override
    public void Area() {
        double area = radius * radius * pi;
        System.out.println("Area is: "+area);

    }
}

class Square extends Shape{
    @Override
    public void Area() {
        System.out.println("side*side");

    }
}
