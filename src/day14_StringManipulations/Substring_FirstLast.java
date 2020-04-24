package day14_StringManipulations;

public class Substring_FirstLast {
    public static void main(String[] args) {
        String w1="apple";
        String w2="erica";
        w2=w2.substring(0,1);
        System.out.println(w2);
        w1=w1.substring(4,5);// index of last char is 4 so RANGE(4,4+1)
        System.out.println(w1);
    }
}
