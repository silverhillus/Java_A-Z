package day05_UnaryandShorthandOperators;

public class PrimitiveCasting {
    public static void main(String[] args) {

        // IMPLICIT CASTING DONE AUTOMATICALLY NO NEED TO WORRY
        int a = 10;
        long b = a; // implicit casting done by automatically>> b=10l

        int a1 = 100;
        long b1 = (long) a1; // manually doing the implicit casting

        System.out.println(b);

        /* EXPLICIT CASTING
        Converts large primitives to smaller primitives

        int k = 100;

        byte m = k; //  you cannot assign int to a byte ==> compile error
        byte m = (long)k; // you cannot assign int to a long ==> compile error
        byte m = (byte)k // we casted int value to byte.
        */

        int k = 100;
        byte m = (byte)k;

        double dNum = 5.5;
        float fNum= (float) dNum;
        System.out.println(fNum); // 5.5

        float fNum1= (int) dNum;
        System.out.println(fNum1); // (int) dNum changes to 5 >> float fNum1 becomes 5.0

        char ch = 'a';
        double dbl = ch;

        System.out.println(dbl);


    }
}
