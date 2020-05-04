package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Lambda {
    public static void main(String[] args) {
        Predicate<Integer> lessThan5= Y->Y<5;
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 0, 20, 0, 30, 0, 40, 0, 0, 0) );
        list.removeIf(lessThan5);
        System.out.println(list);

        Character[] ch = {'A', 'A', 'B', 'C', 'D', 'D'};
        //ArrayList<Character> chars = new ArrayList<>(Arrays.asList(ch)); // [A, A, B, C, D, D]
        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList(ch));




    }
}
