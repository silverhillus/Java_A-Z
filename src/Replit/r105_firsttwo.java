package Replit;

import java.util.Scanner;

public class r105_firsttwo {
    public static void main(String[] args) {

        //Scanner input = new Scanner(System.in);
        //String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
String[] words={"hello", "why", "by", "apple" , "note"};

        //TODO: Write your code below

        String firstlast="";
        //String result="";
        for (String each: words){
             firstlast+=each.substring(0,1)+each.substring(each.length()-1)+", ";
        }
        //result="["+firstlast.substring(0,firstlast.length()-2)+"]";

        System.out.println("["+firstlast.substring(0,firstlast.length()-2)+"]");




      /*
        String[] firstlast= new String[words.length];

       */




    }
}
