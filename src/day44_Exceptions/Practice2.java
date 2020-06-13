package day44_Exceptions;

public class Practice2 {

    public static void main(String[] args) {
        System.out.println("Java");
        waits(3.5); // since it's a static method it can be called directly
        System.out.println("Cybertek");

    }


    public static void waits(double seconds){ // custom method to handle Thread.sleep () exception
        try {
            //Thread.sleep(seconds * 1000) ; // required type is long by default but it's double so cast it to double
            Thread.sleep((long)(seconds * 1000)) ; // double casted to long
        }catch (Exception e){ }

    }

    public static void waits(int seconds){ // custom method to handle Thread.sleep () exception
        try {
            Thread.sleep(seconds * 1000 );
        }catch (Exception e){ }

    }


}
