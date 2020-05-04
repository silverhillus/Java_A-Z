package selfStudy;

import java.util.ArrayList;
import java.util.Arrays;

public class ArListDup {
    /*
    write a program that can return the duplicated values from an ArrayList of String
		Ex:
			list: {"A", "B", "A", "C", "D"};
			output: ["A"]

			list: {"A", "B", "B", "C", "D", "D"};
			output: ["B", "D"]

     */
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>();
        list.addAll(Arrays.asList("A", "B", "A", "C", "D"));
        System.out.println(list); // [A, B, A, C, D]

        ArrayList<String>dup = new ArrayList<>();

        for (String each:list){
            int count=0;
            for (String each2:list){
                if (each.equals(each2)){
                    count++;
                }
            }
            if (count>1 && !dup.contains(each)){  // (count>1) >>  [A, A]

                dup.add(each);
            }
        }
        System.out.println(dup); // [A]


    }
}
