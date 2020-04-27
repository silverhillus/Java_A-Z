package Replit;

public class r174 {
    public static String removeFirst(String target) {

        return target.substring(1);

    }

    public static void main(String[] args) {
        String target="challenge";
        String res=removeFirst(target);
        System.out.println(res);
    }
}
