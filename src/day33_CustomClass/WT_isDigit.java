package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class WT_isDigit {
    /*
    4. write a program that can extract the sepecial characters, digits and alphebets from a string and
    stores them into seperate ArrayLists of Character:
			ex:
				str = "ABCD123$%#@&456EFG!";
				list1: {$, %, #, @, &, !}
				list2: {A, B, C, D, E, F, G}
				list3: {1, 2, 3, 4, 5, 6}
     */
    public static void main(String[] args) {
        String str= "ABCD123$%#@&456EFG!";
        char[] ch=str.toCharArray();
        System.out.println(Arrays.toString(ch)); // [A, B, C, D, 1, 2, 3, $, %, #, @, &, 4, 5, 6, E, F, G, !]
        //ArrayList<Character>list= new ArrayList<>(Arrays.asList(ch)); // Compile ERROR!!!

        ArrayList<Character>digit= new ArrayList<>();
        ArrayList<Character>alphabet= new ArrayList<>();
        ArrayList<Character>specialChar=new ArrayList<>();

        for (char each : ch){
            if (Character.isDigit(each)) {
                digit.addAll(Arrays.asList(each));
            }else if (Character.isAlphabetic(each)){
                alphabet.addAll(Arrays.asList(each));
            }else{
                specialChar.addAll(Arrays.asList(each));
            }
        }
        System.out.println(digit); //[1, 2, 3, 4, 5, 6]
        System.out.println(alphabet); // [A, B, C, D, E, F, G]
        System.out.println(specialChar); // [$, %, #, @, &, !]

      // Instead of separate loop for digit/alphabet/specialChar use if else under 1 loop as above.

    }

    }

