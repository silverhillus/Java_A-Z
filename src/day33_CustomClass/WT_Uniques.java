package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class WT_Uniques {
    /*
    1. write a program that can return the unique objects from a anArray List of Integers
			Ex:
				list: {1,1,2,3,4,5,5}
				sout(list); ==> {2,3,4};
		Note: 1. DO NOT use any extra arrayList
			  2. DO NOT use any loops
			  3. do not use any sort method
			  4. use predicate only and collections methods only
		Hint:   Collections.frequency() // will return the frequency
				removeIf( frequency == 1)  can keep the unique objects in arrayList

     */
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1,1,2,3,4,5,5));
        ArrayList<Integer>uniques= new ArrayList<>();
       for (int each : list) {
           int count=Collections.frequency(list, each);
           if (count==1){
               uniques.addAll(Arrays.asList(each));
           }
       }
        System.out.println(uniques);

       // with Predicate
        ArrayList<Integer>list2=new ArrayList<>(Arrays.asList(1,1,2,3,4,5,5));
        Predicate<Integer>duplicate= each-> Collections.frequency(list,each)>1;
        //list2.addAll(unique); >>accepts collection  / when unique==1
        //list2.retainAll(unique); >>accepts collection / when unique==1
        list2.removeIf(duplicate); //keep the uniques
        System.out.println(list2); // [2, 3, 4]

        ArrayList<Integer>list3=new ArrayList<>(Arrays.asList(1,1,2,3,4,5,5));
        Predicate<Integer>unique= each-> Collections.frequency(list,each)==1;
        list3.removeIf(unique); // keep the duplicates
        System.out.println(list3); // [1, 1, 5, 5]




    }
}
