package day16_ForLoop;

public class Alphabet_UpperLower2 {
    public static void main(String[] args) {
        for (char i = 'A'; i <= 'Z'; i++) {
           // System.out.print(i);
            //System.out.print(i+Character.toLowerCase(i) + " ");//prints> 162 164 166 168 170... char addition char
            //System.out.print(i+""+Character.toLowerCase(i));// prints> AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz
            System.out.print(i+""+Character.toLowerCase(i)+" ");// prints> Aa Bb Cc Dd Ee..


        }





    }
}
