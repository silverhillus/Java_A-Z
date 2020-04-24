package day04_JavaRecap;

public class Variable_Practice {
    public static void main(String[] args) {
        System.out.println(5/2);
        System.out.println(5%2);

        int num= 5/2;
        double num1=(5/2); // *** 2.0
        double num2= 5.0/2; //*** 2.5 Don't get confused
        double num3= 5/2.0; // 2.5
        System.out.println(num);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println( 10.0 / 4.0);

        // CHAR

        char f = 'f'; char a= 'a'; char t= 't'; char i= 'i'; char h= 'h';
        System.out.println(f);
        System.out.println(f+a+t+i+h);
        System.out.println("f+a+t+i+h");

        char k= 'f' + 'a' + 't' + 'i' + 'h';
        System.out.println(k);

        // odd even

        boolean oddNumber= 22%2!=0;
        System.out.println(oddNumber); // false 22 not odd

        System.out.println(11%2==0); // false 11 is not even

        System.out.println(5%2!=0); // != 0 => true for odd







    }
}
