package selfStudy;

import java.util.Scanner;

public class Revision6 {
    public static void main(String[] args) {

       /*
    task:
    write a program that can remove duplicated characters from a string
    abcdabcd ==> abcd
       */

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your word");// arcabadabbad ...
        String word=input.next();

        String noduplicate="";
        for (int i=0; i<=word.length()-1; i++){
            if (noduplicate.contains(""+word.charAt(i))){ //!!!! .CONTAINS not .equals !!!!
                continue;
            }
            noduplicate+=""+word.charAt(i);// prints all the characters of the word one by one and concat each other unless if block
        }
        System.out.println(noduplicate);







    }
}
