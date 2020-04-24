package day18_NestedLoop;

public class DivisionBySubtraction {
    public static void main(String[] args) {
        /*
     1. write a program that can divide two numbers. ( Assume that first number is greater than the second)
            NOTE: DO NOT USE division, multiplication, or module operators
            10 / 3  ==> 3 with a remainder of 1
            10 - 3 - 3 - 3 = 1
          a = a - b = 7;
          a = a - b = 4;
          a = a - b = 1;
            COUNT =  3;   a = 1;
     */

            int a = 20;
            int b = 3;

            if(b == 0){
                System.out.println("b cannot be zero");
                System.exit(0);//it'll force and exit from the program immediately.

            }

            int count = 0; // count the execution of the loop

            while( a  >= b){
                a -= b;
                count++;
            }


            if(a == 0) {
                System.out.println("The result is " + count);
            }else{
                System.out.println("The result is " + count+" with a remainder of "+a);
            }


        }
}
