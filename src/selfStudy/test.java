package selfStudy;
              /*


=============
Revision
Primitive Data Types / 8
               Range
1.byte       127
2.short
3.int
4.long
5.float
6.double
7.char      /character/    ''
8.boolean  /condition/true/false

============

String sequence of characters / "cybertek"  " "

               */


import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //YOUR CODE HERE
        int numOfCharacters=word.length();
        String middle="";

        middle=numOfCharacters%2!=0 && numOfCharacters>=5 ? middle+=word.substring(numOfCharacters/2-1,numOfCharacters/2+2):"Inalid!";
        System.out.println(middle);


        /*if(word.length()%2!=0 && word.length()>=3){
            middle=""+word.charAt(numOfCharacters/2);
            System.out.println(middle);
            System.out.print(middle+middle+middle);
        }else if(word.length()%2==0 && word.length()>=4){
            middle+=word.substring(numOfCharacters/2-1,numOfCharacters/2+1);
            System.out.println(middle);
            System.out.print(middle+middle);

        }


        //fifteen ==> fte

         */



    }

}
