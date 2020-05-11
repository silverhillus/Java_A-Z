package selfStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Arr_Unique {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>(Arrays.asList(1,1,2,3,4,5,5));
        System.out.println(numbers);
        numbers.removeIf(p-> Collections.frequency(numbers,p)>1);
        System.out.println(numbers);
        System.out.println("============");

        ArrayList<Integer>numbers2=new ArrayList<>(Arrays.asList(1,1,2,3,4,5,5));
        numbers2.removeIf(p-> Collections.frequency(numbers2,p)==1);
        System.out.println(numbers2);
        System.out.println("============");

        String str="ABCD123&$#@EFG!?";
        char [] ch=str.toCharArray();
        System.out.println(Arrays.toString(ch));
        ArrayList<Character>list1= new ArrayList<>();
        ArrayList<Character>list2= new ArrayList<>();
        ArrayList<Character>list3= new ArrayList<>();
        for (char each:ch){
            if (Character.isDigit(each) ){
                list1.addAll(Arrays.asList(each));
            }else if (Character.isAlphabetic(each) ){
                list2.addAll(Arrays.asList(each));
            }else{
                list3.addAll(Arrays.asList(each));
            }

        }
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
        System.out.println("==============");
        String str2="ABCD123&$#@EFG!?";
        char [] ch2=str.toCharArray();

        ArrayList<Character>list4= new ArrayList<>();



    }
}
