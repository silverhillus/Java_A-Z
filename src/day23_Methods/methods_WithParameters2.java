package day23_Methods;

public class methods_WithParameters2 {
    /*
    create a function that can reverse any string
    fatih>> hitaf
     */

    public static void main(String[] args) {
        String name="Fatih";
        reverseString(name);
        name="Silverhill";
        reverseString(name);
    }



                                 ///like int num
    public static void reverseString(String str){

        for (int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }


}
