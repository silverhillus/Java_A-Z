package day35_Static;

public class staticVariables {
    int a2 = 200; // instance >> in class outside any block

    static int a3 = 300; // static

    public static void main(String[] args) {
        int a1 = 100; // local variable >>inside the main block

        staticVariables obj1 = new staticVariables(); // it has to match with the className/case sensitive
        obj1.a2 = 1000;

        obj1.a3 = 4000;

        staticVariables obj2 = new staticVariables();
        obj2.a2 = 2000;

        obj2.a3 = 5000;


        // each instance variable has it's own copy> 2 different copy
        System.out.println( obj1.a2 );
        System.out.println( obj2.a2 );

        // static variable has only a single copy that's shared by all the
        System.out.println( obj1.a3 ); // 5000
        System.out.println( obj2.a3 ); // 5000


    }
}
