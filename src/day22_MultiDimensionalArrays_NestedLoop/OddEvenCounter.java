package day22_MultiDimensionalArrays_NestedLoop;

public class OddEvenCounter {
    public static void main(String[] args) {

        int[]nums={1,5,12,20,9,13,45,18,0,-2,7,-124};

        int oddCounter=0;
        int evenCounter=0;
        for (int eachnum: nums){
            if(eachnum%2!=0){
                oddCounter++;
            } else {
                evenCounter++;
            }

        }
        System.out.println("Number of odd numbers in array: "+oddCounter);
        System.out.println("Number of even numbers in array: "+evenCounter);
        System.out.println(oddCounter==evenCounter);


    }
}
