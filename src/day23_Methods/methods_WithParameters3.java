package day23_Methods;

import java.util.Arrays;

public class methods_WithParameters3 {
   /*
    4. creata a function that can print the maximum number from any given array
	5. creata a function that can print the minimum number from any given array
	6. create a function that can print out the array in descending order
		[1,2,3] == > [3,2,1]
    */

    public static void main(String[] args) {
        int [] arr={1,135,-134,0,9999, 12000000, -23};
        maxNum(arr);
        minNum(arr);
        descending(arr);



    }

    public static void maxNum(int[] num){
       int max= -2147483648;
       for (int i=0; i<num.length; i++){
           if(num[i]>max){
               max=num[i];
           }
       }
       System.out.println(max);
   }

    public static void minNum(int[] num){
        int min= 2147483647;
        for (int i=num.length-1; i>=0; i--) {
            if(num[i]<min){
                min=num[i];
            }
        }
        System.out.println(min);
    }

    public static void descending(int [] num){
        Arrays.sort(num);
        int[] rev= new int[num.length];

        int j=0;
        for (int i=num.length-1; i>=0; i--){
            rev[j]=num[i];
            j++;
        }
        System.out.println(Arrays.toString(rev));
   }







}
