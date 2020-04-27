package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class List_Practice2 {
    public static void main(String[] args) {
        /*
        1. create a list of Integers
        2. add 5 Integers to it
        3. return the maximum number from the list
         */
        ArrayList<Integer> num= new ArrayList<>();
        num.add(2); // autoboxing size dynamic is 1
        num.add(5); // autoboxing size dynamic is 2
        num.add(8); // autoboxing size dynamic is 3
        num.add(-2); // autoboxing size dynamic is 4
        num.add(4); // autoboxing size dynamic is 5
        System.out.println(num.size()); // size is 5

        //System.out.println(num); // [2, 5, 8, -2, 4]

        //1_for each loop
        int max=Integer.MIN_VALUE; // possible min value
        for (Integer each : num){
            if (each>max){
                max=each;
            }
        }
        System.out.println(max);

        //2_for loop
        for (int i=0; i<num.size(); i++){
            if (num.get(i)>max){
                max=num.get(i);
            }
        }
        System.out.println(max);

        //3_ for loop without using integer.MIN_VALUE;
        max=num.get(0);// assuming the the first object is the maximum
        for (int i=0; i<num.size(); i++){
            if (num.get(i)>max){
                max=num.get(i);
            }
        }
        System.out.println(max);



    }
}
