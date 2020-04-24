package day26_MethodOverloading;

public class MethodOverloading {
    public static void sum(int a,int b){ System.out.println("sum:"+(a+b)); }
    public static void sum(int a,int b, int c){
        System.out.println("sum:"+(a+b+c));
    }
    public static void sum(int a,int b, int c, int d){
        System.out.println("sum:"+(a+b+c+d));
    }

    public static void method(int a){
        System.out.println("Original method");
    }

    public static void method(double a){
        System.out.println("Overloaded method");
    }

    public static void main(String[] args) {
        sum(2,3);
        String str;
        method(10);  //"Original method"
        method(10.0); // "Overloaded method"



    }

}
