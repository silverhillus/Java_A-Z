package day29_Wrapper_ArrayList;
import java.util.ArrayList;
public class List_Intro {
    public static void main(String[] args) {
        // ArrayList<DataType>  listName = new ArrayList<DataType>();
        /*
        parameters data type cannot be primitive but wrapper class is fine
        The first data type is mandatory but second one is optional
        Size is dynamic not fixed

         */

        ArrayList<Integer> scores = new ArrayList<>(); // size : 0
        // add five elements, size: 5
        // remove two elements, size:3

        scores.add(10);  // Autoboxing    size: 1
        scores.add(20);  // Autoboxing,  size: 2
        scores.add(30);  // size: 3

        System.out.println( scores );

        //Array list is an object so it can only be assigned to an object(wrapper) but not a primitive
        Integer a1 =   scores.get(2);  // none

        int a2 =  scores.get(2);   // unboxing

        double a3 =  scores.get(2);  // unboxing

        System.out.println(a3);

        //  System.out.println( scores.get(100) ); //index out of bound







    }
}
