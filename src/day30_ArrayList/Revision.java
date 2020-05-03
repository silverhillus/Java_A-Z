package day30_ArrayList;

import java.util.ArrayList;

public class Revision {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //listName.add(object);
        list.add(3);
        list.add(4);
        list.add(2,10); // 10 at index 2
        list.add(1,7);  // 7 at index 1
        System.out.println(list); // [3, 7, 4, 10]

        //listName.size();
        int size=list.size();
        System.out.println(size); // 4

        //listName.clear();
        list.clear();
        System.out.println(list); // []
        size=list.size();
        System.out.println(size); //0

        //listName.indexOf(object);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);  // 0
        list2.add(1);  // 1
        list2.add(2);  // 2
        list2.add(3);  // 2

        int index=list2.indexOf(1); // gives the index of first occurring object
        System.out.println(index); // 0
    }
}
