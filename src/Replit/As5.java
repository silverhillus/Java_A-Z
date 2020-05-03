package Replit;

public class As5 {
    /*
    HINT:  vowel is a letter representing a vowel sound, such as a, e, i, o, u.
    return vowel
     */
    public static void main(String[] args) {
        String word="howdyho";
        char [] ch = word.toCharArray();
        String result="";
        for (char each :ch){
            if (each=='a' || each=='e' || each=='i' || each=='o' || each=='u'){
                result+=each;
            }
        }
        System.out.println(result);
    }
}
