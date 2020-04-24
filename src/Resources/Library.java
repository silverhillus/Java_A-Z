package Resources;

import java.util.Arrays;

public class Library {

    //1_imported sortDescending method to library
    public static int[] sortDescending(int[] arr){
        Arrays.sort(arr);  // {1,2,3,4};  ==> {4,3,2,1};
        int[] RevArr = new int[arr.length] ;

        int j = arr.length-1;
        for(int i =0; i < arr.length; i++ ){
            RevArr[i] = arr[j];
            j--;
        }

        return RevArr;

    }

    //2_imported Reverse method to library
    public static String Reverse(String str){
        String Reverse = "";

        for(int i = str.length()-1; i >= 0; i-- ){
            Reverse  += str.charAt(i);
        }

        return  Reverse;
    }


    //3_Remove Duplicates
    public static String RemoveDuplicate(String str){
        //String str="aaaabbcc";
        String nonDup="";
        /*
        //1_substring
        for (int i=0; i<str.length();i++){
            if ( !nonDup.contains(str.substring(i,i+1)) ){
                nonDup+=str.substring(i,i+1);
            }
        }
        return nonDup;

         */

        //2_charAt
        for (int i=0; i<str.length();i++){
            if ( !nonDup.contains((""+str.charAt(i))) ){
                nonDup+=""+str.charAt(i);
            }
        }
        return nonDup;
    }

    //3_Frequency of characters in a String // "AAABCCCDD" >>return A3B1C3D2
    public static String FrequencyOfChars(String str) {
        String nonDup = RemoveDuplicate(str); //String str="AAABCCCDD";   >> "ABCD"
        String result="";

        for (int j = 0; j < nonDup.length(); j++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == nonDup.charAt(j)) {
                    count++;
                }
            }
            result+=""+nonDup.charAt(j)+count;
        }
        return result;
    }

    //4_Frequency as Integer
    public static int Frequency(String str1,String str2){
        //Frequency("AAABB", "A");  ==> 3
        //str1="AAABB";
        //str2="A";
        //String str2="";
        /*
        //Nested Loop
        int count=0;
        for (int j=0; j<str2.length();j++){

            for (int i=0; i<str1.length();i++){
                if ( str1.substring(i,i+1).equals(str2.substring(j,j+1))){
                    count++;
                }
            }

        }
        return count;

         */
        //replaceFirst
        int count=0;
        while (str1.contains(str2)){
            count++;
            str1=str1.replaceFirst(str2,"");
        }
        return count;

    }




}
