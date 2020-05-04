package selfStudy;

import java.util.ArrayList;
import java.util.Arrays;

public class ArListWup2 {
    /*
   2. write a program that can print the list of integers in reversed order
   ex:
       list=> {1,2,3,4,5}
       output: 5 4 3 2 1
    */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 6, 12, 0, 9));
        ArrayList<Integer> reversed = new ArrayList<>();

        for (int i =list.size()-1; i>=0; i--){
           reversed.add(list.get(i));

        }
        System.out.println(reversed);

    }
}
