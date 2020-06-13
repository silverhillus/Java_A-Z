package day43_MethodOverriding;

class Test { // super class

     public void method() {
        System.out.println("Onur");
    }
    //Access modifier must be same / more visible
    // Super  - Sub class
    // public - public
    // default - default / protected /public
    // protected - protected / public
    // public NEVER

}


public class MethodOverriding extends day43_MethodOverriding.Test { // sub class

    // Override Rules:
    // 1-same method name, same parameter - MUST happen in the sub class
    // 2-Access modifier must be same / more visible > public-public
    // 3-Return type must be the same > void - void
    // Change the function inside method

    @Override // // identifies if the method is overridden method
    public void method() {
        System.out.println("Zarina");
    }

    public static void main(String[] args) {
        day43_MethodOverriding.Test obj1 = new day43_MethodOverriding.Test();
        obj1.method();  // Onur

        day43_MethodOverriding.MethodOverriding obj2 = new day43_MethodOverriding.MethodOverriding();
        obj2.method(); // Zarina

    }

}
