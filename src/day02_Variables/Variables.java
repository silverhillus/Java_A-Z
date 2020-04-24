package day02_Variables;

public class Variables {
    public static void main(String[] args) {
        /* declare variables
DataType variableName=Data;
*/

        byte l = 4;
        byte w =2;
        byte area =8;
        System.out.println(l);
        System.out.println(w);
        System.out.println(area);

        // byte num=2.5; byte,short,int.long they only accept whole numbers
        // byte num1=130; exceeds the range of byte
        // short num2=3.5; only accept whole numbers
        // shot num3= 40000; no exceeds the range

        System.out.println("============================================");

        short num4=2000;
        System.out.println(num4);

        int n1=30000;
        int n2=1000000;
        System.out.println(n1);
        System.out.println(n2);

        /*long n4= 999999999999; // out of int range-it takes it as int
        System.out.println(n4); */
        System.out.println("============================================");

        long n5= 999999999999l; // you need to end with l to make it long
        System.out.println(n5);

        System.out.println("============================================");

        double k= 3.5;
        System.out.println(k);

        System.out.println("============================================");
        //float m=3.5;  double primitive is larger than float primitive so if you don't put f (3.5f) the compiler will give an error

        float m= 4.5f;
        System.out.println(m);

        float pi=3.14f;
        double p=3.14;

        int    i = 100;
        float  f = 200f;
        double d = 300L;
       /* i = f;
        f = i;
        d = f;

        */

    }
}
