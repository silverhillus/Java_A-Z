package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Revision {
    public static void main(String[] args) {
        //COLLECTIONS METHODS
        // General Syntax: Collections.methodName(listName)
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,7,8,4,5,6,3,2));

        //Collections.sort(list)
        Collections.sort(list);
        System.out.println(list); // [1, 2, 3, 4, 5, 6, 7, 8]

        //Collections.max(list) returns int value
        int max=Collections.max(list);
        System.out.println(max); //8

        //Collections.min(list) returns int value
        int min=Collections.min(list);
        System.out.println(min); //1




    }
}
