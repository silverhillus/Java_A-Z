package day29_Wrapper_ArrayList;

public class ValueOfMethods {
    public static void main(String[] args) {

        String str = "123";

        Integer a = Integer.valueOf(str);  // Integer, 123

        System.out.println(a+1);

        double b = Integer.valueOf(str);  // unboxing
        // double  = Integer

        System.out.println(b);


        String str2 = "15.5";

        double d1 =  Double.parseDouble(str2);
        // double = double  // none

        double d2 = Double.valueOf(str2);  // 15.5
        //   double   = Double  // Unboxing


        System.out.println(d1);  // 15.5
        System.out.println(d2);  // 15.5

        System.out.println( d1 == d2);

        System.out.println("================================================");
        int z1 = 2000;
        //   Long L1 = z1; // does not accept any other primitives except for long

        Short sh1 = 3000;
        int z2 = sh1 ;


      /*
      "True"
      "FAlSe" ==> to boolean
      "1000000000.5" ==> to float
      "123456"  ==> to short
       */

    }
}
