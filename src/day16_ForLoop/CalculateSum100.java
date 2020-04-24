package day16_ForLoop;
/*
        3. write a program that can calculate the sum of all the even numbers between 1 ~ 100
 */

public class CalculateSum100 {
    public static void main(String[] args) {
        int sum1=0;
        int sum2=0;

        /*
        //MY WAY
        //sum of all even numbers
        for (int i=2; i<=100; i+=2 ){
             sum1+=i;
        }
        System.out.println("Sum of all the even numbers: "+sum1);

        //sum of all odd numbers
        for (int i=1; i<=100; i+=2 ){
            sum2+=i;
        }
        System.out.println("Sum of all the odd numbers: "+sum2);

         */
        //Muhtar's way

        for(int i = 0 ; i <= 100; i++ ){
            if(i %2 ==0) {  // even number
                sum1 += i;

            }else{  // odd number
                sum2 += i;
            }

        }

        System.out.println("sum of all even numbers: "+sum1);
        System.out.println("sum of all odd numbers: "+sum2);




    }
}
