package selfStudy;

import java.util.Scanner;

public class Revision16 {
    public static void main(String[] args) {

        /*
          2. write a program that can return the factorial number of any given number
            Ex:
                input: 5
                output: 120
            because:
                5! = 5 * 4 * 3 * 2* 1 = 120
                17 * 16 * 15 .....* 1
 */
        Scanner key=new Scanner(System.in);
        System.out.println("enter any number to calculate it's factorial");
        int num=key.nextInt();
        long factorial=1;
        for (int i=num; num>=1; num--){
            factorial*=num;
        }
        System.out.println(factorial);






    }
}

