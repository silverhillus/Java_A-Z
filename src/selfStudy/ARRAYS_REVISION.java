package selfStudy;

import java.util.Arrays;
import java.util.jar.JarOutputStream;

public class ARRAYS_REVISION {
    public static void main(String[] args) {

        //MULTIDIMENSIONAL ARRAYS

        int[][] arr2D = { {1,2,3 } , {4,5,6,7}  };
        System.out.println(arr2D[1]);// hashcode
        System.out.println(Arrays.toString(arr2D[1]));
        System.out.println(Arrays.deepToString(arr2D));
        System.out.println("========================");

        int[][]  numbers = {
                {5,4,3,2,1},  //0
                {10,11,12,13,14,15},  //1
                {16,17,18,19,20}, // 2
        };
        // print all the odd numbers with regular for loop. MUST use continue statement
        //odd elements/integers
        //need to repeat all single array indexes
            // in each single array repeat all element indexes.

        for (int j=0; j<numbers.length; j++){
            for (int i=0; i<numbers[j].length; i++){

                if (numbers[j][i]%2==0){
                    continue;
                }
                System.out.print(numbers[j][i]+" ");
            }
        }

        System.out.println();
        // print all the even number with for each loop. MUST use continue statement

        for (int[] eacharr1D : numbers){
            for (int eachElement :eacharr1D ){
                if (eachElement%2!=0){
                    continue;
                }
                System.out.print(eachElement+" ");
            }
        }

        System.out.println();
        System.out.println("========================");

        int a = 100;
        int[] arr = {100, 200, 300};
        //            0    1     2

        // how to print single array?
        System.out.println(a); // 100
        //System.out.println(arr); // cannot print single array directly you need to convert it to string by Arrays.toString(arrayName)

        //1_Arrays.toString(arr)
        System.out.println(Arrays.toString(arr));//[100, 200, 300]

        // OR PRINT EACH ELEMENT AS INTEGERS BY FOR LOOP

        //2_for each loop
        for (int each : arr){
            System.out.print(each+" "); // 100 200 300
        }
        System.out.println();

        //3_for loop
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        // while loop

        int j=0;//iterator initialized before the loop
        while( j < arr.length){
            System.out.print(arr[j]+" ");//arr[0] arr[1] arr[2]
            j++; // don't forget the increment

        }
        System.out.println();

        System.out.println("========================");

        //STRING ARRAY
        String[] names = {"John", "Aaron", "Luoise", "Muhtar"}; // 3
        //                  0        1         2        3

        System.out.println(names);// hashcode
        // NOT NECESSARY !!! >> JUST USE PRINTLN //System.out.print(Arrays.toString(names)+" ");//[John, Aaron, Luoise, Muhtar]
        System.out.println();
        System.out.println(Arrays.toString(names));// [John, Aaron, Luoise, Muhtar]

        //CREATE A NEW STRING ARRAY
        String [] namesRev= new String[4]; // size 4 >> {0,0,0,0}

        // HOW TO PRINT SINGLE ARRAY IN REVERSE ORDER?


        //1_for loop
        int k=0; // k is the increment for namesRev[]
        for (int i=names.length-1; i>=0; i--){ // i is the decrement for names []
           //names[i]= should be assigned to a new string array in reverse order!!!
            namesRev[k] =names[i];
            k++;
            //since namesRev is declared outside the loop you may use it outside loop so print statement is outside!!!!!
        }

        System.out.println(Arrays.toString(namesRev));// [Muhtar, Luoise, Aaron, John]


        //2_ while loop

        int i=0; //increment for the namesRev []
        int m=names.length-1; // decrement for the names []
        while(m<names.length-1){
            names[m]=namesRev[i];
            i++;
            m--;
        }
       // System.out.println(namesRev); // hashcode : >> [Ljava.lang.String;@60e53b93
        System.out.println(Arrays.toString(namesRev)); // [Muhtar, Luoise, Aaron, John]

        System.out.println("========================");

        /*
    String methods:
            toCharArray(): returns char array
            split(str): splits the string by given str, returns string array
     */
        String str = "Cybertek";

        // how to convert string text to char array?

        char[]ch=str.toCharArray();
        System.out.println(Arrays.toString(ch));// [C, y, b, e, r, t, e, k]

        System.out.println(str.length()==ch.length); // true> sizes are the same

        System.out.println("========================");

        String str1 = "ABCD";
        String str2 = "BAC";

        //convert to char []

        char [] ch1 = str1.toCharArray();
        System.out.println(Arrays.toString(ch1)); // [A, B, C, D]

        char [] ch2 = str2.toCharArray();
        System.out.println(Arrays.toString(ch2)); // [B, A, C]

        // sort
        Arrays.sort(ch1);
        System.out.println(Arrays.toString(ch1)); // [A, B, C, D]

        Arrays.sort(ch2);
        System.out.println(Arrays.toString(ch2)); // [A, B, C]

        System.out.println("========================");

        // convert to string array with split method

        String [] sar1=str1.split("");
        System.out.println(Arrays.toString(sar1)); // [A, B, C, D]

        String [] sar2=str2.split("");
        System.out.println(Arrays.toString(sar2)); // [B, A, C]

        // sort
        Arrays.sort(sar1);
        System.out.println(Arrays.toString(sar1)); // [A, B, C, D]

        Arrays.sort(sar2);
        System.out.println(Arrays.toString(sar2)); // [A, B, C]

        System.out.println("========================");






























    }

}
