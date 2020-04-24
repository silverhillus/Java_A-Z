package day06_Shorthnd_LogicalOperators;

public class IfStatement_Practice {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
// inside if (boolean ) you need to write boolean expression
        if (a > b){
            System.out.println(a + " is greater than "+ b);
        }
        if (b > a){
            System.out.println(b + " is greater than "+ a);
        }

        if (a == b){ // in inteliJ you don't need this but this is a bug so you need to include.
            System.out.println(a + " is equal to "+ b);
        }

        System.out.println("========================");

        int x = 300;
        int y = 300;
        boolean xGreater = x > y;
        boolean yGreater = y > x;

        if(xGreater){
            System.out.println(x+" is gereater than "+y);
        }

        if(yGreater){
            System.out.println(y+" is greater than "+x);
        }

/*
        if(xGreater == false && yGreater == false){
            System.out.println(x+" is equal to "+y);
        }
*/

/*
        if(!xGreater  && !yGreater){
            System.out.println(x+" is equal to "+y);
        }
*/

        if(xGreater == yGreater){
            System.out.println(x+" is equal to "+y);
        }







    }
}
