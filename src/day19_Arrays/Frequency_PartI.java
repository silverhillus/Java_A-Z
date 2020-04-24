package day19_Arrays;

public class Frequency_PartI {
    public static void main(String[] args) {
        String str = "AABCC";     //"A2B1C2"
        String result = "";   //"A2B1C2"

        String nonDup =""; //ABC

        for (int i=0; i<=str.length()-1; i++){
            if(!nonDup.contains(""+str.charAt(i))){
                nonDup+=str.charAt(i);
            }
        }
        System.out.println(nonDup);







    }
}
