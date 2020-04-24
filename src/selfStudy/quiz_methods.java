package selfStudy;

public class quiz_methods {
    public static void test(int x, int y) {
        System.out.println(x+y);
    }

    public static void test(double x, double y) {
        System.out.println(x+y);
    }

    public static void test(float x, float y) {
        System.out.println(x+y);
    }

    public static void main(String[] args) {
        test(10,20);
        test(10.0,20.0);
    }

    public static void main(double[] args) {
        System.out.println("double");
    }

    public static void main(char[] args) {
        System.out.println("char");
    }

}
