package day22_MultiDimensionalArrays_NestedLoop;


public class NestedLoop3 {
    public static void main(String[] args) {
        int[][] numbers = {
                {1,2,3},
                {4,5,6,7,8,9},
                {10,11,12,13,14},
                {15,16,17,18,19,20,21}
        };

        // 1. print all even numbers ina same line
        // 2. count odd numbers ==> return the total odd number



        int countOdd = 0;

        for(int j = 0; j < numbers.length; j++){ // j: index num of 1D arrays

            for(int i = 0; i < numbers[j].length; i++ ){ // i: index num of elements in 1Darray
                int num =   numbers[j][i];
                if(num % 2 ==0){
                    System.out.print(num +" ");
                }else{
                    countOdd++;
                }

            }

        }


        System.out.println();

        System.out.println(countOdd);

        /*
        int oddCount=0;
        int sumOdd=0;
        int sumEven=0;
        String elements="";
        for (int [] each1DArray :  numbers){
            for (int eachElement : each1DArray){
                if (eachElement%2==0){
                    //System.out.print(eachElement+" ");
                    elements+=eachElement+" ";
                    sumEven+=eachElement;
                }else{
                    oddCount++;
                    sumOdd+=eachElement;
                }
            }
        }
        System.out.println();
        System.out.println(elements);
        System.out.println("sum even: "+ sumEven);
        System.out.println(sumOdd);

        System.out.println();

         */
















    }
}
