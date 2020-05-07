package Replit;

public class r_extractnum {
    /*
    extractNum

description:
a method that cleans any non number string from a string it gets
and returns the clean string
input:
-s (string)- a string the method gets
return: string: a string of numbers only

example use:

extractNum("aa2aa3") ==> 23

extractNum("aa2") ==> 2

extractNum("aa10aa") ==> 10

extractNum("aa!!%$#.10aa") ==> 10


hint:
you can use:
 Character.isDigit(ch)
 or Conditions (on ascii table, the characters between #48 ~ #57 are digits)


     */
    public static String extractNum(String s) {

        String digits="";
        for (int i=0; i<s.length(); i++){
            if (Character.isDigit(s.charAt(i)) ){
                digits+=s.charAt(i);
            }
        }
        return digits;
    }

    public static void main(String[] args) {
        String s="aaa23bbcc45";
        System.out.println(extractNum(s));
    }



}
