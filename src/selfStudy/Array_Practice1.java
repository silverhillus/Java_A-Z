package selfStudy;

import java.util.Scanner;

public class Array_Practice1 {
    public static void main(String[] args) {
        /*
        enter five num then find the sum by using arrays!!!!
         */
        Scanner input=new Scanner(System.in);
        int[] num= new int[5];
        for (int i=0; i<num.length; i++){
            System.out.println("Enter a number");
            //1_input.nextInt();
            //2_ you have to assign each number to the indices of the array 1 by like
            //num[0]=input.nextInt();
            //num[1]=input.nextInt(); so on...
            num[i]=input.nextInt();
        }

       // how do i find the sum?
        int sum=0;//initialise a sum value first.
        for (int i=0; i<num.length; i++){
            System.out.print(num[i]+" ");// prints >> 1 2 3 4 2
            sum+=num[i];// sum=sum+num[0]+num[1].....
        }
        System.out.println();
        System.out.println("sum: "+ sum);



    }
}
