package day25_Methods_Recap;
/*
	3. (This one I will do it too tomorrow in class) Combine above two methods to write a return method that can return the frequencyt of characters as a stringfrom any given string
		Ex:
			FrequencyOfChars("ABABCB"); ==> "A2B3C1";
			FrequencyOfChars("AAABCCCDD") ==> "A3B1C3D2"
 */

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "AAABCCCDD";
        String non = RemoveDup(str);
        System.out.println(non);
        System.out.println("=========");
        String res=FrequencyOfChars(str);
        System.out.println(res);

    }


    public static String RemoveDup(String str) { // Removing Duplicates

        //String str="AAABCCCDD";   >> "ABCD"
        String remDup = "";
        for (int i = 0; i < str.length(); i++) {
            if (!remDup.contains("" + str.charAt(i))) {
                remDup += "" + str.charAt(i);
            }
        }
        return remDup;
    }

    public static String FrequencyOfChars(String str) {
        String nonDup = RemoveDup(str); //String str="AAABCCCDD";   >> "ABCD"
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


}