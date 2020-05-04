package selfStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArListUniques {
    /*
    // write a program that can return the unique objects from arraylist of characters
     */
    public static void main(String[] args) {
        Character[] chars = {'A', 'A', 'B', 'C', 'D', 'D'};
        ArrayList<Character>list=new ArrayList<>(Arrays.asList(chars)); // [A, A, B, C, D, D]
        System.out.println(list);
        ArrayList<Character>unique= new ArrayList<>();

        for (int i=0; i<list.size(); i++){
            int count= Collections.frequency(list,list.get(i));
            if (count==1){
                unique.addAll(Arrays.asList(list.get(i)));
            }
        }
        System.out.println(unique); // [B, C]


    }
}
