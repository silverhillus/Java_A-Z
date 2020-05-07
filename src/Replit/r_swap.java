package Replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class r_swap {

    public static ArrayList<String> swap(ArrayList<String> list,int pos1,int pos2) {
        Collections.swap(list,pos1,pos2);
        return list;
    }

    public static void main(String[] args) {
        ArrayList<String>list= new ArrayList<>(Arrays.asList("one","two","three","three","three"));
        System.out.println(  swap(list,0,2));

        list.removeIf(p->p.equals("three"));
        System.out.println(list);


    }
}
