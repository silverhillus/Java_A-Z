package Replit;

public class r172 {
    public static String at3(String target,String word)
    {
        return target.substring(0,3)+word+target.substring(3);

    }

    public static void main(String[] args) {
        String s="longword";
        String r="foo";
        String res=at3(s,r);
        System.out.println(res);
    }
}
