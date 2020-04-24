package Replit;

import java.util.Scanner;

public class R95_Bread {
    public static void main(String[] args) {

       /* String str="breadjambread";
        System.out.println(str.substring(str.indexOf("bread")+5,str.lastIndexOf("bread")));

        */

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String replace=str;

        int breadCounter=0;

        while(replace.contains("bread")){
            replace=replace.replaceFirst("bread","");
            breadCounter++;
        }
        //System.out.println(breadCounter); //> 2
        //System.out.println(str); // > xxbreadjambreadyy
        if (breadCounter>=2){
            System.out.println(str.substring(str.indexOf("bread")+5,str.lastIndexOf("bread")));

        } else {
            System.out.println("nothing");
        }




        /*
        if (!str.contains("bread") || breadCounter==1){
              System.out.println("nothing");
          }
         */











/*
 if (breadCounter>=2){
                System.out.println(str.substring(str.indexOf("bread")+5,str.lastIndexOf("bread")));
            }else{
                System.out.println("nothing");
                break;

            }
 */



    }
}
