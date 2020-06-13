package day44_Exceptions;

import java.util.NoSuchElementException;

public class multi_catchBlocks {
    public static void main(String[] args) {
        try {
            System.out.println(9 / 0);
        } catch (ClassCastException e) { // this cannot handle the exception so we give another
            System.out.println("class cast exception");

        } catch (IndexOutOfBoundsException e) { // this cannot handle the exception so we give another
            System.out.println("Index out of bound exception");

        } catch (NoSuchElementException e) { // this cannot handle the exception so we give another
            System.out.println("No such element exception");
        } catch (ArithmeticException e) { // CHILD first       //this one can handle and comes first so it'll ONLY compile
            System.out.println("Arithmetic exception");

        } catch (RuntimeException e) { // PARENT comes after      // this one can handle  but it's already handled
            System.out.println("Runtime exception");

        } catch (Exception e) { // GRANDPARENT comes after      // this one can handle  but it's already handled
            System.out.println("Runtime exception");
        }

        /*
            //Parent CANNOT COME BEFORE THE CHILD / runtime parent > Arithmetic child
            //Switch the order

        } catch (RuntimeException e) { // this one can handle  but it's already handled
            System.out.println("Runtime exception");
        } catch (ArithmeticException e) { // CompileError // this one can handle and comes first so it'll compile
            System.out.println("Arithmetic exception");
        }
         */

    }


}
