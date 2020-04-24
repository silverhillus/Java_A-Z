package day20_Arrays;

import java.util.Arrays;

public class Arrays_CombineTwo {
    public static void main(String[] args) {

        /*
        Warmup tasks:
	1. Write a program that can combine two arrays to return the third array
		ex1:
			arr1 ==> {1,2,3}
			arr2 ==> {4,5,6}
			arr3 ==> {1,2,3,4,5,6}
		ex2:
			arr1 ==> {4,5,6};
			arr2 ==> {7,8,9};
			arr3 ==>{4,5,6,7,8,9}

			HINT: Array.toString(array name)
         */
        int [] arr1={1,2,3};
        int arr2 []={4,5,6,7};
        System.out.println(arr1.length);//3
        System.out.println(arr2.length);//4

        int arr3 []= new int[(arr1.length+arr2.length)]; //new arr3 has been created with size of 6. by default it's 0,0,0,0,0,0.
        System.out.println(arr3.length);//7

        for (int i=0; i<=arr1.length-1; i++){
            arr3[i]=arr1[i];
        }
        System.out.println(Arrays.toString(arr3));//[1, 2, 3, 0, 0, 0, 0]
        for (int i=0; i<=arr2.length-1;i++){
         // arr3[i]=arr2[i]; WRONG!!! you have to start where you left off and add 1 to it each time.
         //  index:  2+1
         //        2+2
         //        2+3
          arr3[arr1.length-1+i]=arr2[i];
        }
        System.out.println(arr3);//error >> [I@61bbe9ba

        System.out.println(Arrays.toString(arr3));//>>[1, 2, 4, 5, 6, 7, 0]




        /*
        This is not the right way!!!
        String arr3= Arrays.toString(arr1)+Arrays.toString(arr2);
        System.out.println(arr3);
         */





    }

}
