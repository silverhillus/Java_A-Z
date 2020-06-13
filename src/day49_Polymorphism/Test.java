package day49_Polymorphism;

interface A{

    void readBook();  // public abstract
    abstract void watchTV(); // public

}

abstract class B implements A {

    public void readBook(){
        System.out.println("REading Books");
    }

    // public abstract void watchTV();

}


public class Test extends B {

    public void watchTV(){
        System.out.println("Watching TV");
    }

}
