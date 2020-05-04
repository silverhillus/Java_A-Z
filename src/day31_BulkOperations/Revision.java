package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Revision {
    public static void main(String[] args) {
        //Collections in ArrayList
        ArrayList<String>list= new ArrayList<>();
        list.add("A");
        list.add("D");
        list.add("C");
        list.add("B");
        System.out.println(list); // [A, D, C, B]

        //Collections.sort(listName);
        Collections.sort(list);
        System.out.println(list); // [A, B, C, D]

        ArrayList<String>list2= new ArrayList<>();
        list.add("F");
        list.add("D");
        list.add("C");

        //listName.equals(listName);
        boolean r=list.equals(list2);
        System.out.println(r);

        //REMARKS!!!
        /*
        EQUALS IN ARRAY
        Arrays.equal(arr1,arr2); //boolean

        EQUALS IN ARRAYLIST
        listName1.equals(listName2) //boolean
         */


        //listName.isEmpty();

        boolean emp=list.isEmpty();
        System.out.println(emp); // false

        list.clear();
        emp=list.isEmpty();
        System.out.println(emp); //true

        //               (Arrays.asList())
        //listName.addAll(collection)
        ArrayList<Integer> num= new ArrayList<>();
        //num.addAll(1,2,3,4,5,6); // ERROR!! this is not a collection
        num.addAll(Arrays.asList(1,2,3,4,5,6));
        System.out.println(num); // [1, 2, 3, 4, 5, 6]

        System.out.println("=========");

        String[] names = {"Fatih", "Muhtar", "Muhesong", "Sada", "Rustem"}; // String Array

        ArrayList<String >list3= new ArrayList<>(); // String ArrayList
        list3.addAll(Arrays.asList(names));
        System.out.println(list3); // [Fatih, Muhtar, Muhesong, Sada, Rustem]
        list3.add(2,"Filiz"); // added at index 2
        System.out.println(list3);
        list3.set(3,"Ekrem"); //changed at index 3
        System.out.println(list3);

        // listName.remove(object)
        // listName.remove(indexNum)
        list3.remove(3); // index 3 removed
        System.out.println(list3);
        list3.remove("Sada"); // case sensitive
        System.out.println(list3); // [Fatih, Muhtar, Filiz, Rustem]

        //               (Arrays.asList())
        //listName.removeAll(collection)         //boolean
        list3.removeAll(Arrays.asList("Rustem", "Muhtar"));
        System.out.println(list3);// [Fatih, Filiz]

        // listName.contains(object);
       boolean r2=list3.contains("Fatih"); // case sensitive
        System.out.println(r2);

        //               (Arrays.asList())
        //listName.containsAll(collection)       //boolean
        r2=list3.containsAll(Arrays.asList("Fatih", "Mehmet")); // false >> all should match!!!!
        System.out.println(r2);

        System.out.println("============");

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.addAll( Arrays.asList(1,2,3,4,5,6,1,2,3) );

        //               (Arrays.asList())
        //listName.retainAll(collection)

        list4.retainAll(Arrays.asList(0,-1,3)); // [3, 3] >> only matching object returned
        System.out.println(list4);


    }
}
