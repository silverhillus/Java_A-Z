package day29_Wrapper_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Revision {
    public static void main(String[] args) {
        String[] arr = {"1","2.5", "3", "3.5", "4.5"};// find the minimum?
        //Initialize max num first
        Double max=Double.MIN_VALUE; //

        for(String each : arr){
            if (Double.parseDouble(each)>max){ // Double.valueOf(each) converts each string elements to double
                max=Double.valueOf(each);
            }
        }
        System.out.println(max);
        // Double.parseDouble(each) converts each string elements to Double that can be then assigned to double.
        // Double.valueOf(each) returns the value of of each element as double.
        // Summary both are the same!!
        System.out.println("===================");
        //Arraylist
        ArrayList<String> names= new ArrayList<>();
        ArrayList<Integer> numbers= new ArrayList<>();
        ArrayList<Character> characters= new ArrayList<>();

        // add method
        //syntax: listName.add();
        names.add("fatih");
        names.add("us");

        numbers.add(3);
        numbers.add(5);
        numbers.add(12);

        characters.add('f');
        characters.add('h');

        //System.out.println(listName);
        System.out.println(names); // [fatih, us]
        System.out.println(numbers);// [3, 5, 12]
        System.out.println(characters); // [f, h]

        //get method
        //syntax: listName.get(int index);

        String s=names.get(0);
        System.out.println(s);
        int a=numbers.get(1); // returns Integer but can be assigned to int
        System.out.println(a);
        //int a1=numbers.get(5); // no index 5 exist
        //System.out.println(a1); // compile ERROR!!! Index: 5, Size: 3

        int size=numbers.size();
        System.out.println(size); // 3

        int lastInd= numbers.size()-1;
        System.out.println(lastInd); // 2

        System.out.println("===================");

        ArrayList<Integer> di= new ArrayList<>();
        di.add(2);
        di.add(3);
        di.add(5);
        di.add(23);
        System.out.println(di); // [2, 3, 5, 23]
        int get = di.get(3);
        System.out.println(get); // 23
        int si=di.size();
        System.out.println(si); // 4

        // find the max of [2, 3, 5, 23]
        // sol 1
        int max1= di.get(0); // assuming the first element is the largest

        for (Integer each: di)
            if (each > max1) {
                max1 = each;
            }
        System.out.println(max1); // 23

        // sol 2
        //since the dataType of this list is wrapper class Integer so I can use MIN_VALUE/ MAX_VALUE
        int max2= Integer.MIN_VALUE;
        for (int i=0; i<di.size(); i++)
            if (di.get(i) > max1) {
                max2 = di.get(i);
            }
        System.out.println(max1); // 23






    }



}

