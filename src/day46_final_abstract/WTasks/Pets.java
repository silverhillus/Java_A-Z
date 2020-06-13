package day46_final_abstract.WTasks;
        /*
        Task01:
        1. creat an abstract class called Pets
                attributes: name, age, color, breed, gender
                methods:
                    abstract methods: sleep, eat, speak
                    instance method: toString
        2. create three sub classes (non-abstract) of pet:
                                1. Dog
                                2. Cat
                                3. Tiger
                each class MUST have constructors to initialize the attributes
         */

public abstract class Pets {
    String name;
    int age;
    String color;
    String breed;
    char gender;

    public abstract void sleep();

    public abstract void eat();

    public abstract void speak();

    public String toString(String name, int age, String color, String breed, char gender) {
        return "Name is: " + name + ", Age is: " + age + ", Color is: " + color + ", Breed is: " + breed + ", Gender is: " + gender;
    }

}

class Dog extends Pets {

    // constructor to initialize the attributes
    public Dog(String name, int age, String color, String breed, char gender) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
        this.gender = gender;
    }

    // Abstract methods inherited from super class  to be overridden and
    // no abstract keyword in methods because the sub class is a regular class
    // override means change the functionality inside the body of the method
    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void speak() {
        System.out.println(name + " is barking");
    }

}

class Cat extends Pets {
    public Cat(String name, int age, String color, String breed, char gender) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
        this.gender = gender;
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void speak() {
        System.out.println(name + " is meowing");
    }

}

class Tiger extends Pets {

    public Tiger(String name, int age, String color, String breed, char gender) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
        this.gender = gender;
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void speak() {
        System.out.println(name + " is roaring");
    }

}

class PetsObjects {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Chomar", 3, "Multi-colored", "Kangal", 'M');
        dog1.eat();
        dog1.sleep();
        dog1.speak();

        Cat cat1 = new Cat("Silver", 1, "Grey", "Eyup", 'M');
        cat1.eat();
        cat1.sleep();
        cat1.speak();

        Tiger tiger1 = new Tiger("Big Cat", 4, "Golden with Black Stripes", "Bengal", 'F');
        tiger1.sleep();
        tiger1.eat();
        tiger1.speak();


    }

}
