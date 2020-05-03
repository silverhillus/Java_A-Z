package selfStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class arltest {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("a"); // 0
        list1.add("b");  //2
        list1.add("c");  // 3
        list1.add("d");

        if (list1.remove("b")){
            list1.remove("f");
        }
        System.out.println(list1);

        ArrayList<Integer> list = new ArrayList<>();
        Integer a=1;
        System.out.println(list.remove(a));

        ArrayList<Character> list3 = new ArrayList<>();
        for (char i='a'; i<='z';i++){
            list3.add(i);
        }
        boolean r=list3.containsAll(Arrays.asList('a','c','D'));
        System.out.println(r);

        ArrayList<Integer>list4= new ArrayList<>();
        list4.addAll(Arrays.asList(1,2,3,4,5));
        list4.set(0,list4.get(4));
        list4.set(4,list4.get(0));

        System.out.println(list4);


    }
}
