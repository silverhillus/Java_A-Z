package day22_MultiDimensionalArrays_NestedLoop;

public class NestedLoop2 {
    public static void main(String[] args) {

        int[][]num={   {9,8,7},   {6},   {5,4,3,2,1,0}   };
        //ind num         0           1         2

        //elements in num[0]
        for (int i=0; i<num[0].length; i++){
            System.out.println(num[0][i]);
        }

        //elements in num[1]
        for (int i=0; i<num[1].length; i++){
            System.out.println(num[1][i]);
        }

        //elements in num[2]
        for (int i=0; i<num[2].length; i++){
            System.out.println(num[2][i]);
        }
        System.out.println("=========");


        //instead of printing each single array 1 by 1 use a loop to print all the indexes in num 2d array

        for (int j=0; j<num.length; j++){ // num.length=3 so it repeats 3 times to print each single D arrays in num 2D array
            for (int i=0; i<num[j].length; i++){
                System.out.print(num[j][i]+" "); // 9 8 7 6 5 4 3 2 1 0
            }

        }

        for (int j=0; j<num.length; j++){ // num.length=3 so it repeats 3 times to print each single D arrays in num 2D array
            for (int i=0; i<num[j].length; i++){
                System.out.print(num[j][i]+" "); // 9 8 7
                                                 // 6
                                                 //5 4 3 2 1 0
            }
            System.out.println();// breaking the line

        }

        System.out.println("======================");

        // 7 8 9 6 0 1 2 3 4 5
        for (int j=0; j<num.length; j++){
            for (int i=num[j].length-1; i>=0; i--){
                System.out.print(num[j][i]+" "); //
            }

        }

        System.out.println("======================");

        // 5 4 3 2 1 0 6 9 8 7

        for (int j=num.length-1; j>=0; j--){
            for (int i=0; i<num[j].length; i++){
                System.out.print(num[j][i]+" ");
            }

        }
        System.out.println("======================");

        //0 1 2 3 4 5 6 7 8 9

        for (int j=num.length-1; j>=0; j--){
            for (int i=num[j].length-1; i>=0; i--){
                System.out.print(num[j][i]+" ");
            }

        }






    }
}
