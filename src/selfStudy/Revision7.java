package selfStudy;

import java.util.Scanner;

public class Revision7 {
    public static void main(String[] args) {

      /*

    7. write a program that can calculate the sum of all numbers between 1 to any given number
		ex:
			input: 100
			output: 5050
			input: 50
			output: 1275
			input : 200
			output : 20100
       */
      Scanner input=new Scanner(System.in);
        System.out.println("Enter a number that you would like to be calculated the sum of all numbers");
        long num=input.nextLong();
      long sum=0;
      for (int i=1; i<=num; i+=1){
          sum+=i;
      }
        System.out.println("sum of all the numbers to "+ num+ " is: "+ sum );







    }
}
