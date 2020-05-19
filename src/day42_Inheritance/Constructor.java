package day42_Inheritance;

class test {

    public test(){
        System.out.println("A");
    }



}


public class Constructor extends test {

    public Constructor(){
        System.out.println( "B");
    }



    public static void main(String[] args) {

      // test obj = new test();  // A
        Constructor obj2 = new Constructor(); // AB

    }


}
