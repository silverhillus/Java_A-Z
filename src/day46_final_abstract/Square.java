package day46_final_abstract;

public class Square extends Shape {

   public double side;

   public Square(double side){
       this.side = side;
   }

    public void Area(){
        double area = side * side;
        System.out.println("Area of square: "+area);
    }


}
