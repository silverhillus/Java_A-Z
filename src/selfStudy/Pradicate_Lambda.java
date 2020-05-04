package selfStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Pradicate_Lambda {
    public static void main(String[] args) {
        Predicate<String> startsWithM= s -> s.startsWith("M");
        ArrayList<String> names =  new ArrayList<>();
        names.addAll(Arrays.asList("Resul", "Fatih", "Musa", "Sha", "Mehmet" ));

        names.removeIf(startsWithM);
        System.out.println(names); // [Resul, Fatih, Sha]
    }
}
