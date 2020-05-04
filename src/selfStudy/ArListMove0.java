package selfStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArListMove0 {
     /*
    Write a program that can move all the zeros to  last indexes of ArrayList
		Ex:
			list:  {1, 0, 2, 0, 3, 0, 4, 0};
			output: [1, 2, 3, 4, 0, 0, 0, 0]

			DO NOT USE SORT method, DO NOT decleare  any extra lists
     */
     public static void main(String[] args) {
         ArrayList<Integer> list = new ArrayList<>();
         list.addAll(Arrays.asList(10, 0, 20, 0, 30, 0, 40, 0, 0, 0) );
         System.out.println(list); // [10, 0, 20, 0, 30, 0, 40, 0, 0, 0]
         //What to do?
         /*
         1>count the frequency of 0's
         2>remove all 0's from the list first
         3>add by the frequency of 0's at the end
          */

         //1
         int count= Collections.frequency(list,0);
         System.out.println(count);// 6

         //2
         list.removeAll(Arrays.asList(0));
         System.out.println(list); // [10, 20, 30, 40]

         //3
        for (int i=0; i<count; i++){
            list.add(0);
        }
         System.out.println(list); // [10, 20, 30, 40, 0, 0, 0, 0, 0, 0]


     }
}
