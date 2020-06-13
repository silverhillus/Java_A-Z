package day44_Exceptions;

public class try_catchBlocks2 {

    public static void main(String[] args) {
        System.out.println("Hello");

    try {

        Thread.sleep(3000); // if try fix this will be compiled
        System.out.println("try");

    }catch(Exception  e){ // if try cannot handle then catch will be compiled
        System.out.println("catch");

    }


        System.out.println("World");

    }
    /*
    output:
    Hello
    waits for 3 seconds
    try
    World

     */


}
