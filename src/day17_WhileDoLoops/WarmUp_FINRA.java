package day17_WhileDoLoops;
/*
Warmup tasks:
4.	write a program that can calculate the two numbers based on the user provided operators, the program will ask:
						1. enter first number
						2. enter the second number
						3. enter the math operators
								(assume that only the +, -, *, /, and % will be entered)
						then the system will give the result based on the operator
						at the end it will ask if the user want's to calculate another numbers, if user
						entered "NO" or "no", the program will stop execution, otherwise it repeats all the previous steps
								(you will need a lop that has true condition without the iterator)
	//Interview question
	3. write a program which prints out the numbers from 1 to 30:
			1. for numbers which are divisible by 3, print "FIN" instead of the number.
			2. for numbers which are divisible by 5, print "RA" instead of the number
			3. for numbers which are a divisible by both 3 and 5, print "FINRA" instead of the number
		Ex:
			1 2 FIN 4 RA FIND .... FINDRA

 */

public class WarmUp_FINRA {
    public static void main(String[] args) {

        String result="";
        for (int i=1; i<=30; i+=1){
            if(i%3==0 && i%5==0 ) { // this one should be the first condition or else it won't print FINRA for 15,30.
                //System.out.print("FINRA" + " ");
                //result="FINRA" + " ";// WRONG! prints> if not concatenated 124781113141617192223262829FINRA
                result += "FINRA "; // concatenation
            }else if(i%3==0){
                //System.out.print("FIN"+" ");
                //result="FIN" + " "; // WRONG!
                result += "FIN "; // concatenation
            }else if(i%5==0){
                //System.out.print("RA"+" ");
                //result="RA" + " ";// WRONG!
                result += "RA "; // concatenation
            } else {
                //result=""+i;// WRONG!
                result += i+" ";   // concatenation
            }
        }
        System.out.print(result);




    }
}
