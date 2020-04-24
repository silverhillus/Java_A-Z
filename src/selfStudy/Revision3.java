package selfStudy;

import java.util.Scanner;

public class Revision3 {
    public static void main(String[] args) {

/*for loop
1_print ABCDEFGHIJKLMNOPQRSTUVWXYZ
2_print abcdefghijklmnopqrstuvwxyz
3_print z-a
4_print Aa Bb Cc Dd Ee Ff Gg Hh Ii Jj Kk Ll Mm Nn Oo Pp Qq Rr Ss Tt Uu Vv Ww Xx Yy Zz

 */

String r="";
String R="";
String z="";
String together="";

        for (char ch='A'; ch<='Z'; ch++){
            R+=ch+" ";
        }
        System.out.println(R);

        System.out.println("======");

        for(char ch='a'; ch<='z'; ch++){

            r=r+ch+" ";
        }
        System.out.println(r);
        System.out.println("======");

        /*Explanation:
        currently
       index of   0 1 2 3 4.....
        String r="a b c d e f g h i j k l m n o p q r s t u v w x y z";
        String R="A B C D E F G H I J K L M N O P Q R S T U V W X Y Z";
         */

        for (int i=0; i<r.length()-1; i++){
                                                  //i=0        i=1
            together+=R.charAt(i)+""+r.charAt(i);//A concat a + B concat b
        }
        System.out.println(together);

        System.out.println("======");






        for(char ch='z'; ch>='a'; ch--){

            z+=ch+" ";
        }
        System.out.println(z);
        System.out.println("======");






    }
}
