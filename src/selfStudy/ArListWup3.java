package selfStudy;

import java.util.ArrayList;
import java.util.Arrays;

public class ArListWup3 {
    /*
   3. write a program that can print out the unique elements from an int array
          HINT: store all the unique elements of array into a list of integers
          Ex: array==> {1,1,2,3,3,4,5}
                 output: {2,4,5}
    */
    public static void main(String[] args) {
        ArrayList<Integer>list= new ArrayList<>(Arrays.asList(1,1,2,3,3,4,5));
        ArrayList<Integer>unique= new ArrayList<>();
        for (int each : list){
            int count=0;
            for (int each2 : list){
                if (each==each2) {
                    count++;
                }
            }
            if (count==1){
                unique.add(each);
            }
        }

        System.out.println(unique); // [2, 4, 5]

        /*
        REMOVE DUPLICATES
        for (int each : list){
            if(!unique.contains(each)){
                unique.add(each);
            }
        }
        System.out.println(unique); // [1, 2, 3, 4, 5]
         */


    }
}
