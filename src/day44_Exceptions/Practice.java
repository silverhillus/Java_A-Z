package day44_Exceptions;

public class Practice {

    /* 1. Write a method called "wait" that causes the current executing thread to sleep
            for the specific number of seconds
                parameters: double seconds


     */

    public static void main(String[] args) {
        /*
          print hello,
           wait two seconds
            print Cybertek
            wait three second
            Java
            you can do this manually and use Thread.sleep() in between every word but it takes time and space
            so better create a custom method so that I can just call the method to do the same!!!
            Check practice2 for method!
         */

        System.out.println("Hello");

        try {
            Thread.sleep(2000); // checked exception
        }catch (Exception e){ }

        System.out.println("Cybertek");

        try {
            Thread.sleep(3000);
        }catch (Exception e){ }

        System.out.println("Java");

        try {
            Thread.sleep(4000);
        }catch (Exception e){ }

        System.out.println("Completed");

    }

}
