package day27_DateTime;

public class TaskSolutions_Min {
    /*
    armup task:
		1. write a return method that can return the minimum number from an int array
		2. write a return method that can return the minimum number from a double array
					NOTE: apply method overloading,  DO NOT USE SORT METHOD.
		3. write a method that can print out the unique elements from an int array
					Ex: {1,1,2,3,3} ==> 2
						{6,6,7,7,8,9} ==> 8 9
		4. write a method that can print out the unique elements from a double array
					Note: Apply method overloading
     */
    public static int minimum(int[] arr){
        //without using sort method

        int minimum = arr[0]; //4 // //let's assume this is the min first
        for(int each  : arr ){ //each: 5, 4, 7, 5
            if(each < minimum){
                minimum = each;
            }
        }

        return minimum;
    }

    public static double minimum(double[] arr){
        //without using sort method

        double min=arr[0];//let's assume this is the min first
        for (double each : arr){
            if (each<min){
                min=each;
            }
        }
        return min;
    }



    public static void main(String[] args) {
        int [] arr={12,0,3,5,-4,34};
        double [] arr1={12.3,0,3,5,-4.3,34};
        int min=minimum(arr);
        double min2=minimum(arr1);
        System.out.println(min);
        System.out.println(min2);
    }





}
