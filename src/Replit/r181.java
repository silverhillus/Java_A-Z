package Replit;

import java.util.ArrayList;
import java.util.Arrays;

public class r181 {

    public static String combineRs(String[] r1,String[] r2) {

        ArrayList<String> combined = new ArrayList<>();
        combined.addAll(Arrays.asList(r1));
        combined.addAll(Arrays.asList(r2));
        System.out.println(combined);

        String result="";
        for (String each: combined){
           result+=(each+" ");
        }
        return result;

    }



    public static void main(String[] args) {
        String [] r1={"a","b","c"};
        String [] r2={"d","e"};

        System.out.println(combineRs(r1,r2));

        /*testing
        ArrayList<String> combined = new ArrayList<>();
        combined.addAll(Arrays.asList(r1));
        combined.addAll(Arrays.asList(r2));
        System.out.println(combined);

        for (String each: combined){
            System.out.print(each+" ");
        }

         */

    }
}
