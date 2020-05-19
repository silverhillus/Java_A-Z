package day41_Inheritance;

public class Fish extends Animal {

    public void swim(){
        System.out.println(name+" is swimming");
    }


    public static void main(String[] args) {

        Fish obj1 = new Fish();
        obj1.name = "Nemo";
        obj1.weight = 5;
        obj1.size = "Small";


        obj1.eat();
        obj1.move();
        obj1.swim();
       // obj1.bark()


    }



}
