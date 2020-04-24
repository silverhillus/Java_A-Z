package day16_ForLoop;
/*
      5. Write a program that will print out all letters in English alphabet in ascending order

	  6. Write a program that will print out all letters in English alphabet in descending order
 */

public class EnglishAlphabet {
    public static void main(String[] args) {


        // Refer to ASCII TABLE- numbers
        //5_Ascending
        for(char ch='A'; ch<='Z'; ch++){

            System.out.print(ch+" ");
        }
        System.out.println();

        ////6_Descending
        for(char ch='Z'; ch>='A'; ch--){

            System.out.print(ch+" ");
        }





    }
}
