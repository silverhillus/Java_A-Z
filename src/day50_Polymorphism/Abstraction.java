package day50_Polymorphism;

interface I{

    // public I(){}; // CANNOT have a constructor
    //abstract method can be created in interface
    void method2(); // even if you don't put public abstract given by default
    abstract int method3();

    //  public I(){}
    //  public void m(){ }
    // {  }
    //  static { }

    int a = 1000;  // public static final

    public static void main(String[] args) {
        System.out.println(a);
        // a = 2000;

    }
}

abstract class A{


    public A(){ // can have a constructor

    }

    //abstract method can be created in abstract class
    public abstract void method1();
    // public void method4(); // you must include abstract keyword otherwise it'll be instance method
    // private void method4(); // it's meant to ne overridden so CANNOT BE PRIVATE!

    { // can have instance block

    }
    static { //can have static block

    }

    public void method4(){ }

    // IN SUMMARY: u can have anything that regular class has, plus abstract methods!!!

}

interface I2{

}

public class Abstraction extends A  implements I, I2 {
    //abstract method CANNOT BE created in regular class
    // public abstract void method1();
    @Override
    public void method1() {


    }

    @Override
    public void method2() {

    }

    @Override
    public int method3() {
        return 0;
    }
}
