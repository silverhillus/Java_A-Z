package day25_Methods_Recap;
/*
2. write a return method that accepts two strings str1 & str2, and returns the frequency of str2 in str1 as an int
		Ex:
			Frequency("AAABB", "A");  ==> 3
			Frequency("ABAB", "B"); ==> 2

 */

public class Frequency_SingleChar {
    public static void main(String[] args) {

        int fr=Frequency("AAABB", "A");
        System.out.println(fr);
        fr=Frequency("ABAB", "B");
        System.out.println(fr);
        fr=Frequency_replaceFirst("AAABB","A");
        System.out.println(fr);

    }

    public static int Frequency(String str1,String str2){
        //Frequency("AAABB", "A");  ==> 3
        //str1="AAABB";
        //str2="A";
        //String str2="";
        int count=0;
            for (int i=0; i<str1.length();i++){
                if ( str1.substring(i,i+1).equals(str2.substring(0,1))){
                    count++;
                }
            }
        return count;
    }

    public static int Frequency_replaceFirst(String str1,String str2){
        //Frequency("AAABB", "A");  ==> 3
        //str1="AAABB";
        //str2="A";
        //String str2="";
        int count=0;
        while (str1.contains(str2)){
                count++;
                str1=str1.replaceFirst(str2,"");
            }
        return count;
        }

    }





