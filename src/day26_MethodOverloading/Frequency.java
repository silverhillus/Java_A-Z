package day26_MethodOverloading;

public class Frequency {
    /*
    Warmup tasks:
	1. write a return method called frequency that accepts two parameters: string str and char ch,
		the method returns the frequency of the ch from the str as an int
			Ex:
				frequency("AAA", 'A') ==>  3
				frequency("ABAB", 'B') ==> 2
			Note: MUST use Arrays and for each loop
     */

    public static int frequency(String str,char ch){
        char [] arr=str.toCharArray();
        int count=0;
        for (char each : arr){
            if (each==ch){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str="AAAAAABB";
        char ch='A';
        int fr=frequency(str,ch);
        System.out.println(fr);
    }



}
