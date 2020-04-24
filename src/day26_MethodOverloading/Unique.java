package day26_MethodOverloading;
import Resources.Library;
public class Unique {

    /*
    2. use the above method to create another called uniques that accepts a string paramter and returns it's unique characters as String
			Ex: uniques("ABBC"); 		==> "AC"
				uniques("Cybertek");  	==> "cybrtk"
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

    public static String uniques(String str){ // "AABCDCD"
       //removeDuplicates>> "Cybertek" > Cybertk so it's not the same
        String uniques="";//ACD
        //int fr=frequency(str,str.charAt(0)); // fr of first character

        for (int i=0; i<str.length(); i++){
            int fr=frequency(str,str.charAt(i));// fr of each character in a loop
            if (fr==1){ // if it's appeared only once
                uniques+=str.charAt(i); // concat to the predefined uniques string.
            }
        }
        return uniques; // return the unique characters as string.

    }



    public static void main(String[] args) {
        String str="Cybertek";
        String uniques=uniques(str);
        System.out.println(uniques);
    }

}
