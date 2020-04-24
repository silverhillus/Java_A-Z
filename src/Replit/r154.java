package Replit;

import java.util.Scanner;

public class r154 {
    /*
    Complete a method isPalindrome() that will check if number is a palindrome. Print your result as a boolean (true or false).
Example:
input: 1001
output: true

Example:
input: 1234
output: false
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }

    public static void isPalindrome(int num){
        //WRITE YOUR CODE HERE
        /*
        char [] chNum =num.toCharArray();
        char [] rev= new char[chNum.length];

        int j=0;
        for (int i=chNum.length-1; i>=0; i--){
            chNum[i]=rev[j];
            j++;
        }
        boolean result= (chNum==rev)? true: false;

         */
        String text=""+num;
        String reversed="";
        for (int i=text.length()-1; i>=0; i--){
            reversed+=text.charAt(i);
        }
        if (text.equals(reversed)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }
}
