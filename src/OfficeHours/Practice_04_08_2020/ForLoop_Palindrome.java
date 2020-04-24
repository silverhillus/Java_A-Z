package OfficeHours.Practice_04_08_2020;

public class ForLoop_Palindrome {
    public static void main(String[] args) {
        String name = "Fatih";
        String result = "";
        int lastIndex= name.length()-1;
        for(int i = lastIndex; i>=0; i--) {
            result = result + name.charAt(i);

        }
        System.out.print(result);

    }
}
