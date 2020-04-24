package day25_Methods_Recap;

public class RemoveDuplicates {

    /*
    warmup task:
	1.  write a return method that accepts a String and removes duplicate values from the String
		Ex:
				RemoveDuplicate("aaabbbccc");  ==> "abc"

	2. write a return method that accepts two strings str1 & str2, and returns the frequency of str2 in str1 as an int
		Ex:
			Frequency("AAABB", "A");  ==> 3
			Frequency("ABAB", "B"); ==> 2

     */

    public static void main(String[] args) {
        String str="aaaabbccDDDEEHH";
        String nonDuplicates=RemoveDuplicate(str);
        System.out.println(nonDuplicates);
    }

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

    public static int Frequency(String str1,String str2){
        //Frequency("AAABB", "A");  ==> 3
        //str1="AAABB";
        //str2="A";
        //String str2="";
        int count=0;
        for (int j=0; j<str2.length();j++){

            for (int i=0; i<str1.length();i++){
            if ( str1.substring(i,i+1).equals(str2.substring(j,j+1))){
               count++;
            }
        }

        }


        return count;
    }






}
