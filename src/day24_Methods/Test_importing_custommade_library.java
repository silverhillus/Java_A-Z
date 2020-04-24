package day24_Methods;

//import packageName.ClassName;
import Resources.Library; //PURPOSE OF THIS!!!
// in order to use custom made methods that you stored in your custom made (library class under the Resources package)
import java.util.Arrays;
public class Test_importing_custommade_library {
    public static void main(String[] args) {
        String word="Fatih"; // I have this string text
        // I can call custom made Reverse method to reverse the string word

        //HOW DO I CALL Reverse Method from Library class in Resources package?
        //1_import>>> import Resources.Library;
        //2_Call library >> className.MethodName;
        String reverse=Library.Reverse(word); // since it's static and reusable it can be assigned to a new string
        System.out.println(reverse); // >> hitaF
        System.out.println("=========================");

        //Try another example
        String name= "Math is the foundation of programming";


        Library.Reverse(name); //ClassName.MethodName(String VariableName)
        name=Library.Reverse(name);// assign into string
        System.out.println(name);// >> gnimmargorp fo noitadnuof eht si htaM

        System.out.println("=========================");

        //Call sortDescending Method from the same library
        // ex int array
        int[]ar={-2,10,0,290,32,-89,12};

        //ar=Library.sortDescending(ar); // either reassign into ar or
        int[] des=Library.sortDescending(ar);// totally assign into new int array called des
        System.out.println(Arrays.toString(des));//>> [290, 32, 12, 10, 0, -2, -89]








    }
}
