package Replit;

import java.util.Scanner;

public class r103 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String reversed = "";
        //TODO: start your code here
        String[] word= sentence.split(" ");

        for (int i=word.length-1; i>=0; i--){
            reversed+=word[i]+" ";

        }

        reversed=reversed.substring(0,reversed.length()-1);



        //End your code here. do not modify below statement
        System.out.println(reversed);

    }
}
