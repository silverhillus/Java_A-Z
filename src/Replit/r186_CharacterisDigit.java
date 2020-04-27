package Replit;

public class r186_CharacterisDigit {
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
 or conditions
     */
    public static String extractNum(String s) {
        String result="";
        for (int i=0; i<s.length(); i++){
            if (Character.isDigit(s.charAt(i))){
                result+=s.charAt(i);
            }
        }
        return result;

    }

    public static void main(String[] args) {
        String s="aa2aa3";
        System.out.println(extractNum(s));
    }
}
