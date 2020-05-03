package day29_Wrapper_ArrayList;

public class ParseMethods {
    public static void main(String[] args) {
        String str = "123";

        int a1 = Integer.parseInt(str);  //123

        System.out.println(str + 1); // text
        //        "123" + 1   ==> "1231"

        System.out.println(a1+1);  // number
        //         123 + 1 ==> 124


        byte b1 =  Byte.parseByte(str);    // byte = 123

        System.out.println( b1 + 5 );

        Integer I1 =  (int)Byte.parseByte(str);  // AutoBoxing

        // Integer  = (int)byte;
        // Integer = int;

        String str2="10.5";

        float f1=Float.parseFloat(str2);
        System.out.println(f1); //>> 10.5 //check if num by adding
        System.out.println(f1+1); // >> 11.5

        double d1=Double.parseDouble(str2);
        System.out.println(d1);
        System.out.println(d1+1.5);

        String str3 = "3147483647";

        long num1 = Long.parseLong(str3);   //long 3147483647L

        System.out.println(num1 + 2);

        Long num2 = Long.parseLong(str3);  // autoboxing

        System.out.println(num2 + 2);


        String result1 = "TrUE"; //  not "true" or not "false" ==> false

        boolean r1 =Boolean.parseBoolean(result1);   // boolean, false //not case sensitive

        System.out.println( r1 );


        String result2 = "fALsE"; // "false" //not case sensitive

        boolean r2 = Boolean.parseBoolean(result2);

        System.out.println(r2);

        String s="Maybe"; //false
        boolean b=Boolean.parseBoolean(s);
        System.out.println(b);





    }

}
