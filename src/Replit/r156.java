package Replit;

import java.util.Arrays;

public class r156 {

    public static int  count_appearance(String[] arr, String t) {
        int count = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equalsIgnoreCase(t)) {
                    count++;
                }
            }
        return count;

    }
     //end  count_appearance

    public static void main(String[] args) {
        String ar[]={"a","foo","bar","foo","bla"};
        String t="foo";
        int app=count_appearance(ar,t);
        System.out.println(app);

    }

}
