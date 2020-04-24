package day15_ForLoops;

public class ReverseString {
    public static void main(String[] args) {
        String str="Java";
        //          0123

        /*
        //that's how  ""+  you change char characters into string by concatenation.
        //way1 charAt
        String reverse=""+str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0);

        //way2 substring
        String reverse1=str.substring(3)+str.substring(2,3)+str.substring(1,2)+str.substring(0,1);

        System.out.println(reverse);
        System.out.println(reverse1);

         */

        //reverse a word with for loop

        String reverse3="";// declare a new reverse string with empty initial value.
        int maxIndexNumber=str.length()-1;// last character
        for (int i=maxIndexNumber; i>=0; i--){
             reverse3+=str.charAt(i);
        }
        System.out.println(reverse3);


    }
}
