package day26_MethodOverloading;

import java.util.Arrays;

public class TaskSolutions {
    /*
    warmup task:
	1. write a method that can return the maximum number from an int array
	2. write a method that can return the maximum number from a double array
			NOTE: MUST apply method overloading
	3. write a method that can return the minimum number from an int array
	4. write a method that can return the minimum number from a double array
			NOTE: MUST apply method overloading
	5. write an int[] return method that can sort an int array in desending order
	6. write a double[] return method that can sort a double array in desending order
	7. write a char[] return method that can sort a char array in desending order
			NOTE: MUST apply method overloading
     */

    public static int maximumNumber(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public static int maximumNumber(double[] arr){
        Arrays.sort(arr);
        return (int)arr[arr.length-1]; // cast into int
    }
    public static int minimumNumber(int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }
    public static int minimumNumber(double[] arr){
        Arrays.sort(arr);
        return (int) arr[0]; // cast into int
    }
    public static int[] descendingOrder(int[] arr){
        Arrays.sort(arr);
        int[] descending= new int[arr.length];

        int j=arr.length-1;
        for (int i=0; i<descending.length; i++){
            descending[i]=arr[j];
            j--;
        }
        return descending;
    }
    public static double[] descendingOrder(double[] arr){
        Arrays.sort(arr);
        double [] descending= new double[arr.length];

        int j=arr.length-1;
        for (int i=0; i<descending.length; i++){
            descending[i]=arr[j];
            j--;
        }
        return descending;
    }

    public static char[] descendingOrder(char[] arr){
        Arrays.sort(arr);
        char [] descending = new char[arr.length];
        int j=arr.length-1;
        for (int i=0; i<descending.length; i++){
            descending[i]=arr[j];
            j--;
        }
        return descending;

    }

    public static void main(String[] args) {
        int [] ar={-1,0,23,18,36,5,222};
        int max=maximumNumber(ar);
        int min=minimumNumber(ar);
        System.out.println(max);
        System.out.println(min);


        double [] ar1={-1.4,0,23,18,36.5,5,222.3};
        double max1=maximumNumber(ar1);
        double min1=minimumNumber(ar1);
        System.out.println(max1);
        System.out.println(min1);


        int [] arr={-1,0,23,18,36,5,222};
        double [] arr1={-1,0.3,23.2,18,36,5.1,222};
        char[]ch={'f','a','t','i','h'};
        System.out.println(Arrays.toString(descendingOrder(arr)));
        System.out.println(Arrays.toString(descendingOrder(arr1)));
        System.out.println(Arrays.toString(descendingOrder(ch)));
    }


}
