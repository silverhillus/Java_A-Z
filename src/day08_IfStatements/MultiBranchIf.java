package day08_IfStatements;
/*
Check if the number is positive, negative or 0.
 */

public class MultiBranchIf {
    public static void main(String[] args) {

        int a=-23;

        /*1_you can solve this task with single if statement but compiler will check each conditions one by one
         so it takes more time.
         2_INSTEAD you better use multi branch if statement. It only compiles one condition. More flexible and faster.
         */

        /* 1_Single if Statement

        boolean zero= a==0;
        boolean negative= a<0;
        boolean positive= a>0;

        if (zero){
            System.out.println("zero");
        }
        if (negative){
            System.out.println("negative");
        }
        if (positive){
            System.out.println("positive");
        }
         */

        // 2_Multi Branch If Statement

        if (a==0){
            System.out.println("zero");
        }
        else if (a<0){
            System.out.println("negative");
        }
        else {                            // *** no brackets () in else
            System.out.println("positive");
        }


    }
}
