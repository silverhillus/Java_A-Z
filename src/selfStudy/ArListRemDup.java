package selfStudy;

import java.util.ArrayList;
import java.util.Arrays;

public class ArListRemDup {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,2,3,3)) ;
        System.out.println(list); // [1, 1, 2, 2, 3, 3]
        ArrayList<Integer>removed=new ArrayList<>();

        //for loop
        for (int i=0; i<list.size(); i++){
                if (!removed.contains(list.get(i))){
                    removed.add(list.get(i));
                }
            }
        System.out.println(removed);

        // for each loop
            for (int each : list){
                if (!removed.contains(each)){
                    removed.add(each);
                }
            }
        System.out.println(removed);


    }
}
