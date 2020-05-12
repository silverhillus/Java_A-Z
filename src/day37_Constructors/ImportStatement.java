package day37_Constructors;

// import java.util.Arrays; // only imports Arrays class from java util

import java.util.Arrays;
import static day37_Constructors.Data.staticVariable;
import static day37_Constructors.Data.staticMethod;

//import static day37_Constructors.Data.*; // imports all the static variables and methods from Data class

/*
import static packageName.ClassName.Name
import static day37_Constructors.Data.staticVariable; // imports only static staticVariables from Data Class
import static day37_Constructors.Data.staticMethod; // imports only static staticMethod from Data Class
 */

public class ImportStatement {

    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        Arrays.sort(arr);

        System.out.println( staticVariable );

        staticMethod();

    }

}
