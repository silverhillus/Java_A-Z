package day24_Methods;



public class day24_Methods_Tasks {
    /*
    1. write a methods that can return the maximum number between two numbers
			Ex: Max(10, 20) ==> 20
	2. write a method called Calculation, that passes 3 parameters: 2 numbers and one operator, and prints out the calculation
		if operator is not between [-, +, *, /, %] output should be Invalid Operator
		Ex: calculate(10, 2, '*') ==> 20;
			calculate(10, 2, '&') ==> Invalid operator
			NOTE: The method MUST take three arguments when it's called
	3. write a method that can identify if a string is palindrome
			ex: palindrom("level")  ==> true
				palindrome("Cybertek") ==> false
     */

    public static void Max(int num1,int num2){
        //Don't use Scanner for this question instead use parameters
        if (num1>=num2){
            System.out.println("Max: "+ num1);
        }else{
            System.out.println("Max: "+ num2);
        }


    }

    public static void Calculation (int num1,int num2,char operator){

        switch (operator){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            case '%':
                System.out.println(num1%num2);
                break;
            default:
                System.out.println("Invalid Entry!");
        }



    }

    public static void Palindrome(String word){
        String reverse="";
        for (int i=word.length()-1; i>=0; i--){
            reverse+=word.charAt(i);
        }
        System.out.println(word.equalsIgnoreCase(reverse));
    }


    public static void main(String[] args) {
        int a=1000;
        int b=120;
        Max(a,b);
        Calculation(a,b,'+');
        Calculation(12,-32,'-');
        Palindrome("level");
    }












}

