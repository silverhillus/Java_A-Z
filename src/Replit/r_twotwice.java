package Replit;

import java.util.ArrayList;
import java.util.Arrays;

public class r_twotwice {
    public static ArrayList<Integer> twoTimes(ArrayList<Integer>num ){
        ArrayList<Integer>list=new ArrayList<>();
        for (int i=0; i<num.size(); i++){
            list.add(num.get(i));
            list.add(num.get(i));

        }
        return list;

    }

    public static void main(String[] args) {
       ArrayList<Integer>nums= new ArrayList<>(Arrays.asList(1,2,3,4));
        System.out.println( twoTimes(nums));
    }
}
