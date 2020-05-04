package selfStudy;

public class rleyla {
    public static void main(String[] args) {
        //test your code
        // System.out.println( uniqueChars("Bugbunters") ) ;
        String s = "Bughunters";
        String r = uniqueChars(s);
        System.out.println(r);
    }
    /*public static String uniqueChars(String str){ //Remove Duplicates
        String nonDup="";
        for (int i=0; i<str.length(); i++){
            if (!nonDup.contains(""+str.charAt(i))){
                nonDup+=str.charAt(i);
            }
        }
        return nonDup;
    }

     */


    public static String uniqueChars(String str) {
        //TODO: write your below
        str = str.toLowerCase();
        String nonDup = ""; // to store the unique characters
        for (int j = 0; j <= str.length() - 1; j++) {
            if (!nonDup.contains("" + str.charAt(j))) {
                nonDup += str.charAt(j);
            }
        }
        return nonDup;

    }
}
