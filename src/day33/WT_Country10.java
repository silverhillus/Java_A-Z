package day33;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class WT_Country10 {
    /*
    3. task:
			1. create an ArrayList of string called country names
			2. write a program that can remove all the country names that have length of 10 or greater
     */
    public static void main(String[] args) {
        String [] str= {"Tukey", "Switzerland", "Brazil","United Kingdom","China","Japan","Cambodia","Dominican Republic"};
        ArrayList<String > list= new ArrayList<>(Arrays.asList(str));
        Predicate<String>longerthan10= each -> each.length()>10;
        list.removeIf(longerthan10);
        System.out.println(list); // [Tukey, Brazil, China, Japan, Cambodia]


    }

}
