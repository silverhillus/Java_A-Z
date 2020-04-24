package day13_StringClass;

public class StringLiterals {
    public static void main(String[] args) {
        /*
        String Class:presented in "java.lang" package but it's not required to
        import java.lang because it's imported automatically.

        There are 2 ways of creating String Object
        1. String Literal
        ex:String item1="Pencil";
        >>it's stored in String Pool in Java Heap Memory
        >>literals They all go to string pool so no duplication

        2. New keyword
        ex:String item3= new String(original:"Cat")
        >>it's not stored in string pool, each new keyword creates an independent object in Java Heap Memory.
        ======================
        String is immutable
        so the original object in string pool cannot be modified but it can be reassigned.
        ex: String s1="Java"; //it goes to string pool so it's immutable
        s1="JavaScript"; // now the value is reassigned and new object is created but the original object(Java) still stays there
         */
        String item1="Cat";//literal
        String item2="Cat";//literal
        String item3= new String("Cat");// ***you don't type original*** it's a feature of inteliJ//new keyword

        System.out.println(item1==item2); // it's TRUE! they share the same value in string pool
        System.out.println(item1==item3); // it's FALSE! They are different.



        System.out.println("====================");
        /*
        String is immutable
        so the original object in string pool cannot be modified by can be reassigned.
        ex: String s1="Java"; //it goes to string pool so it's immutable
        s1="JavaScript"; // now the value is reassigned and new object is created but the original object(Java) still stays there
         */

        String s1="Java";
        System.out.println(s1); // prints Java

        String s2="Java";
        System.out.println(s2); // prints Java

        System.out.println(s1==s2); // true >> no new object is created in the memory, they share Java object in string pool.


        s1="JavaScript"; // s1 is reassigned to JavaScript SO s1's value has changed
        System.out.println(s1); // prints JavaScript

        String s3="Java";// no new object is created in the memory
        System.out.println(s1==s3); // false because s1 Java is reassigned to javascript to s1!=s2






    }
}
