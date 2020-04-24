package selfStudy;
/*
Declare and Initialize 2 numbers.Program should display if the first number is greater than second number.
Output should be in the following format:
“First number number is greater than Second number –True/False”
 */
public class greaterThan {
    public static void main(String[] args) {
        int a = 24;
        int b = -24;

        if (a>b){
            System.out.println(a + " is greater than "+ b + " -True/False");
        }

        System.out.println("================");
        short x = 12, y= 36;
        boolean xGreater = x > y;
        boolean yGreater = y > x;

        if (xGreater){
            System.out.println(x + " is greater");
        }
        if (yGreater){
            System.out.println(y + " is greater");
        }



    }
}
