package day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods {
    public static void main(String[] args) {
        /*
        ArrayList Methods
        list.add(element)
        list.add(index,element)
        list.set(index,element)
        list.remove(index)
        list.remove(object)

         */

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(5); // 0
        list1.add(7);  //2
        list1.add(8);  // 3

        //how to add an element in specific index
        list1.add(1, 6);  //1  // that's how you add an element in specific index
        // {5,6, 7,8}

        //   list1.add( 7, 10);  // index out of bound



        // how to change an element in specific index?
        list1.set(3, 9);

        System.out.println(list1);

        int[] arr = {1, 2, 3, 4}; // {1,2,3,4,5}
        arr[3] = 5;   // {1,2,3,4,5} // that's how you change it in arrays.

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A"); // {A}
        list2.add("B");  //{A, B}
        list2.add(1, "C"); // {A, C, B}
        list2.add(1, "D");  // {A, D, C, B}

        list2.set(3, "F"); // {A, D, C, F}

        list2.set(2,  "E"); // {A, D, E, F}

        System.out.println(list2);   // {A, D, E, F}


        System.out.println("===============================================");
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1); // 0
        list3.add(2); // 1
        list3.add(3); // 2
        list3.add(4); //3

        System.out.println(list3); // [1, 2, 3, 4]


        // list.remove(index) method
        // list.remove(object) method
        int a=1; // if it's an integer that means index number
        list3.remove(a); // the object 2 at index 1 has been removed
        System.out.println(list3); //[1, 3, 4]

        Integer b=1; // wrapper class so it refers to the object
        list3.remove(b);
        System.out.println(list3); // [3, 4] // object 1 found and removed.


        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(10);
        list4.add(20);
        list4.add(30);
        // {10, 20, 30}
        //          0    1   2

        // list4.remove(20); // index out of bound

        //  list4.remove(1);  //{10, 30}

        Integer a2 = 100;
        boolean r1 = list4.remove(a2);  // false

        System.out.println(list4);
        System.out.println(r1);




    }
}
