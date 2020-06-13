package day44_Exceptions;

public class Unchecked {
    // when it happens during thr RUNTIME it's called unchecked exception
    // which means while you're writing the code it look fine

    public static void main(String[] args) {

        System.out.println("Test started"); // any thing BEFORE unchecked exception is compiles /printed

        //System.out.println(9/0); // any number divided by 0 >> unchecked >> ArithmeticException: / by zero
        //System.out.println("Passed"); // !!!this one will not compile because AFTER exception above

        String str = "Cybertek";

        //    System.out.println( str.charAt(-1) );

        int[] arr = {1,2,3};
        //    System.out.println( arr[200] );

        System.out.println("Test completed"); // !!!this one will not compile because AFTER exception above


    }

}
