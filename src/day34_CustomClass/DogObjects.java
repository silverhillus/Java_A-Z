package day34_CustomClass;

public class DogObjects {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setDogInfo("Husky", "Small",4, "White", "Ghost");
     /*
        dog1.breed = "Husky";
        dog1.size = "Small";
        dog1.color = "White";
        dog1.name = "Ghost";
        dog1.age = 4;

      */

        System.out.println( dog1.breed );
        System.out.println(dog1.size);
        System.out.println(dog1.color);
        System.out.println(dog1.name);
        System.out.println(dog1.age);



    }

}
