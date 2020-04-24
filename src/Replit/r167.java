package Replit;

public class r167 {
    public static String uniques(String str) { // picks the characters that only appear once!!!
        //TODO: write your below  // "java" ==> "jav"
        String result="";
        for (int j=0; j<str.length(); j++){
            int count=0;
            for (int i=0; i<str.length(); i++){
                if (str.charAt(i)==str.charAt(j)){
                    count++; }
            }
            if (count==1){
            result+=str.charAt(j);
            }
        }

        return result;
    }

    public static String uniqueChars(String str){ //Remove Duplicates
        String nonDup="";
        for (int i=0; i<str.length(); i++){
            if (!nonDup.contains(""+str.charAt(i))){
                nonDup+=str.charAt(i);
            }
        }
        return nonDup;

    }

    public static void main(String[] args) {
        String str="java";
        String un=uniques("java");
        System.out.println(un);
        un=uniqueChars(str);
        System.out.println(un);
    }

}
