package selfStudy;

import java.util.Arrays;

public class quizt {
    public static void main(String[] args) {
        int[]num1=new int[3]; // size 3 >{0,0,0}
        int[]num2={1,2,3,4,5};// size 5 >{1,2,3,4,5}
        num1=num2;// !!!!reassigned so num1={1,2,3,4,5}

        //prints each element 1 by 1.>> 12345
        for (int i=0; i<num1.length; i++){
            System.out.print(num1[i]);
        }
        System.out.println(Arrays.toString(num1));


    }
}
