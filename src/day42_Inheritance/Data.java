package day42_Inheritance;

public class Data {

    public static String publicData = "public";
    protected static String protectedData = "protected";
    static String defaultData = "default";
    private static String privateData = "private";
    public void methodA(){
        System.out.println("a");
    }

}


class testing extends Data {
    /*
    public, default, protected
     */
    public void methodB(){
        System.out.println("b");
    }

    public static void main(String[] args) {
        Data obj = new Data();


        System.out.println( testing.defaultData );
        System.out.println( testing.protectedData );
        System.out.println( testing.publicData );
       // System.out.println( testing.privateData );

    }


}
