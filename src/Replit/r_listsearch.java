package Replit;

import java.util.ArrayList;

public class r_listsearch {
    public static String search(ArrayList<String> r, String find)
    {
        String result="";
        for (int i=0; i<r.size();i++){
            if(r.get(i).contains(find)){
                result=r.get(i);
                return result;
            }
        }
        return "search failed";

        /* #########it didn't compile#########
        for (String each : r){
            result=each.contains(find) ? each : "search failed";
        }
        return result;
        =============================================
        #######it didn't compile###########
         for (int i=0; i<arr.size(); i++){
            if (arr.get(i).contains("foo")){
                result=arr.get(i);
            }else{
                result="search failed";
            }
        }
        return result;
         */



    }//end wineSeller

    public static void main(String[] args)
    {

        ArrayList<String>  arr = new ArrayList<String>();
        arr.add("2");
        arr.add("6");
        arr.add("foo bar");
        arr.add("abc");

        String find_tst = search(arr,"foo");
        System.out.print(find_tst);//foo bar


    }//end main
}
