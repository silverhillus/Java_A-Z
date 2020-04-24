package day16_ForLoop;

public class ContinueStatement {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; //skip or jump
            }
            System.out.print(i);//prints> 12345 // prints 1245 when used continue 3 skipped
        }
        System.out.println();


        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                continue; //skip or jump odd numbers
            }
            System.out.print(i); // prints> 2468101214161820
        }






    }
}
