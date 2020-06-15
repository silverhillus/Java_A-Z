package day50_Polymorphism;

public class AnimalObjects {

    public static void main(String[] args) {
                  // created dog object with existing constructor
        Dog obj1= new Dog("Lucy", 5, "Female");
        System.out.println(obj1.dogName);
        obj1.bark();


        //reference type
        //Parent Class
        Animal obj2= new Dog("Kito", 6, "Female");
        //System.out.println( obj2.dogName); // it does not exist in Animal class so does not compile!
        //obj2.bark(); // it does not exist in Animal class so does not compile!

                                                        //object type is executed
        obj2.eat(); // if it's overridden calls the one in dog (child ) class is executed!!!
        // output >> Dog Kito is eating (Dog)
        obj2.sleep(); // if it's not overridden calls the one in reference type(parent class)!!!
        // output >> Animal is sleeping (Animal)

        obj2.methodA();

        Animal animal1 = new Cat("A","F", 1);

        boolean isCat = animal1 instanceof Cat;
        System.out.println(isCat);

        Dog d1 = new Dog("A",1,"f");

        // boolean r1 = d1 instanceof Cat; // there is no IS A relation between dog and cat

        Animal animal2 = new Cat("Q","f",2);

        boolean r2 = animal2 instanceof Dog;

        System.out.println(r2);

    }

}
