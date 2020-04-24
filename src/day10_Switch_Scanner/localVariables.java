package day10_Switch_Scanner;

public class localVariables {
    int c=10; // ex 1 >> you can use this variable inside this class
    public static void main(String[] args) {
        //LOCAL VARIABLES
        // is declared within the block (it could be main method, class) and
        // can only be used within block in other words from "{" to "}".
        // It needs to be initialised.
        int a=3;// ex 2 >> you can use this variable inside this main method

        if(true){
            System.out.println(a);
            int b=7; // ex 4 >> you can use this variable inside this if block outside it's invalid
        }
       // System.out.println(b); that's why it gives error outside if block

        switch (4){
            case 1:
                int c=100;//ex 5
            case 2:
                // System.out.println(c); >> c variable is declared in case 1 block so outside invalid.
                break;


        }


    }
}
