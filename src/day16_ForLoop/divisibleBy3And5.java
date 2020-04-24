package day16_ForLoop;
/*          warmup tasks:
	1. write a program that can print all the ODD numbers between 1 ~ 100 that can be divisible by 3 & 5

	2. write a program that can print all the EVEN numbers between 1 ~ 100 that can be divisible by 3 & 5


 */

public class divisibleBy3And5 {
    public static void main(String[] args) {
        //1
        for (int n=1; n<=100; n+=2){
           if(n%3==0 && n%5==0)
            System.out.print(n+", ");

        }
        //2
        for (int n=0; n<=100; n+=2){
            if(n%3==0 && n%5==0)
                System.out.print(n+", ");

        }
        //3





    }
}
