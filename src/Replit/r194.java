package Replit;

public class r194 {
    public static boolean isPalindrome(String check) {
        check=check.replace(" ", ""); // ignore space
        String reverse="";

        for (int i=check.length()-1; i>=0; i--){
            reverse+=check.charAt(i);
        }
        return (check.equalsIgnoreCase(reverse)) ? true : false;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome("Nurses Run"));
    }
}
