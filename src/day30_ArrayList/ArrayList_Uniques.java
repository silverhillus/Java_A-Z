package day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Uniques {
    /*
    3. write a program that can print out the unique elements from an int array
		   HINT: store all the unqie elemenbts of array into a list of integers
		   Ex: array==> {1,1,2,3,3,4,5}
		   	   output: {2,4,5}
     */

    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        List.add(1);
        List.add(2);
        List.add(1);

        ArrayList<Integer> uniques = new ArrayList<>();

        for (int i=0; i<List.size(); i++) {
            int count = 0;
            for (Integer each : List) {
                if (each == List.get(i)) {
                    count++;
                }
            }
            if (count == 1) {
                uniques.add(List.get(i));
            }
        }
        System.out.println(uniques);



    }

}
