package day49_Polymorphism;

abstract class Alien { // abstract class cannot have an object

}


class Animal{

}

class Dog extends Animal{ // without inheritence no ploymorphism so extend animal

}

class Cat extends Animal{ // without inheritence no ploymorphism so extend animal

}

public class PolymorphismInt {
    public static void main(String[] args) {
       // Alien obj = new Alien(); // object cannot be created from an abstract class /interface.
        Animal obj1= new Animal();
        Animal obj2= new Dog(); // Dog is subclass & NOT ABSTRACT of Animal so object can be referred to the Animal
        //Super Class = sub class object
        Animal obj3= new Cat();


    }
}
