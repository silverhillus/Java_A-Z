package day05_UnaryandShorthandOperators;

public class AssessmentQuiz01 {
    public static void main(String[] args) {

        //Q_11
        System.out.println ( 10/3 ); // by default prints int value >>3
        System.out.println("=================");

        //Q_12
        System.out.println (  10/3.0  ); // by default prints double full value >> 3.3333333333333335
        System.out.println("=================");

        //Q_13
        System.out.println (  (int)(10.0/3)   ); // prints in >>3
        System.out.println("=================");

        //Q_15
        int  x =  10;
        int  y =  x++;
        System.out.println( y++  + "  " +  x++  + "  " + y);



       /* Q_5
       double a , b , c = 10.5; // // Error:(8, 29) java: variable b might not have been initialized

       System.out.println( b );

       ===============

       Q_7
       byte a = 200; // Error: byte value cannot be greater than 127

       ===============
       Q_9
       int a =9 ,  b = 0,  c = a / b ; // c= 9/0 >> undefined
       System.out.println( c*b );
       // it compiles!!! but throws an error message:Exception in thread "main" java.lang.ArithmeticException: / by zero

       ================

       Q_11
       System.out.println ( 10/3 ); // by default prints int value >>3

       =================
       Q_12
       System.out.println (  10/3.0  ); // by default prints double full value >> 3.3333333333333335

       =================
       Q_13
       System.out.println (  (int)(10.0/3)   ); // prints in >>3

       ================
       Q_14
       String str = "10.5" + 3;
       int num = (int) str; // Error incompatible types: java.lang.String cannot be converted to int
        System.out.println(num);

        ===============
        Q_15
        int  x =  10;
        int  y =  x++;

        System.out.println( y++  + "  " +  x++  + "  " + y);
        */
    }
}
