package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class Revision {
    public static void main(String[] args) {
        //COLLECTIONS METHODS
        //<<<<<< General Syntax: Collections.methodName(listName); >>>>>>>
        //Collections.sort(list);
        //Collections.max(list); returns int value
        //Collections.min(list); returns int value
        //Collections.swap(listName, index1 , index2); >> objects in index1 & index2 swaps
        //Collections.replaceAll(listName, oldValue, newValue);
        //Collections.frequency(listName,object);
        //-----------
        //listName.removeIf(Predicate);


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

        System.out.println("========");
        ArrayList<Integer> numbers = new ArrayList<>( Arrays.asList(1,1,2,3,4,4));
        //MAX
        int max1=Collections.max(numbers); // 4
        //numbers.removeAll(max1); // ERROR ! parameter has to be collection >> Arrays.asList(max1)
        numbers.removeAll(Arrays.asList(max1)); // 4,4 have been removed!

        int secindmax=Collections.max(numbers); // max has been updated as secondmax
        System.out.println(secindmax); // 3

        //MIN
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,1,2,3,4,5,6,7,8));
        int min2=Collections.min(list2);
        System.out.println(min2); // 1,1
        list2.removeAll(Arrays.asList(min2)); // min numbers removed
        int secondmin=Collections.min(list2); // second min initialised
        System.out.println(secondmin); // 2

        //Collections.swap(listName, index1 , index2); >> objects in index1 & index2 swaps
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        System.out.println(list3); // [1, 2, 3, 4, 5, 6, 7, 8]
        Collections.swap(list3,2,list3.size()-1);
        System.out.println(list3); // [1, 2, 8, 4, 5, 6, 7, 3] // 3 & 8 swapped
        System.out.println("=============");

        //Collections.replaceAll(listName, oldValue, newValue);
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Omer", "Omer", "Mary", "Sha", "Fatih", "Omer"));
        System.out.println(names); // [Omer, Omer, Mary, Sha, Fatih, Omer]
        Collections.replaceAll(names, "Omer","Filiz"); //case sensitive
        System.out.println(names); // [Filiz, Filiz, Mary, Sha, Fatih, Filiz]

        // Collections.frequency(listName,object);
        int count=Collections.frequency(names,"Filiz"); // 3
        System.out.println(count);

        // Predicate<Integer> name= X->X<5;
        Predicate<Integer> lessthan5= X -> X<5;
        ArrayList<Integer>num = new ArrayList<>(Arrays.asList(0,1,2,2,5,7,12,10,23,35));
        System.out.println(num); // [0, 1, 2, 2, 5, 7, 12, 10, 23, 35]

        //listName.removeIf(Predicate);
        num.removeIf(lessthan5);
        System.out.println(num); // [5, 7, 12, 10, 23, 35]











    }
}
