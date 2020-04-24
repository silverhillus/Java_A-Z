package day05_UnaryandShorthandOperators;

public class PostPre_Practice {
    public static void main(String[] args) {
        int a = 50;
       // a = --a +  a++  +  a--  + a++;
       //      49 + 49 + 50+ 49 = 197
        a = --a +  a++  +  a--  + a++;
        System.out.println(a);
        System.out.println( ++a ); // immediate >> 198
        System.out.println( a ); // 199

        int b =1;
        //b  =  -b--  + b++  / -b--  * --b;
        //      -1 +0  / -1
        b  =  -b-- + b + b++ / -b--  * --b;

        System.out.println(b);

        int k = 3;
        // k = -k-- + -k++ / -k-- * ++k;

        k = -k-- + -k++ / -k-- * ++k;

        System.out.println(k);

        System.out.println(-3 -2 / -3 * 3);



        System.out.println( 10/3.0 );
        System.out.println (  (int)(10.0/3)   );



    }
}
