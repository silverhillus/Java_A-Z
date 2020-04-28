package day30_ArrayList;

import java.util.ArrayList;

public class List_Reverse {
    public static void main(String[] args) {
        /*
        2. write a program that can print the list of integers in reversed order
		ex:
			list=> {1,2,3,4,5}
			output: 5 4 3 2 1
         */

        ArrayList<Integer> list= new ArrayList<>();
        for (int i=0; i<6; i++){
            list.add(2*i+1);
        }
        System.out.println(list); //[1, 3, 5, 7, 9, 11]

        ArrayList<Integer> reverse= new ArrayList<>();
        for (int i=list.size()-1; i>=0; i--){
           reverse.add(list.get(i));
        }
        System.out.println(reverse); //[11, 9, 7, 5, 3, 1]

    }
}
