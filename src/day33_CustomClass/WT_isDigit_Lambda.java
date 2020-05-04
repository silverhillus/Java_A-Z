package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class WT_isDigit_Lambda { // Extract char
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
        char [] arr=str.toCharArray();
        //ArrayList<Character>list= new ArrayList<>(Arrays.asList(ch)); Compile Error so
        Character [] ch = new Character[arr.length]; // Create a Character Array

        for (int i=0; i<ch.length; i++){ // loop to assign each arr elements to ch.
            ch[i]=arr[i];
        }
        // CHAR ARRAY CONVERTED TO CHARACTER ARRAY > char [] arr >>Character [] ch
        //now I can add Character array (ch) to the ArrayList!
        ArrayList<Character>list=new ArrayList<>(Arrays.asList(ch)); // Now it compiles!!!!
        System.out.println(list); // [A, B, C, D, 1, 2, 3, $, %, #, @, &, 4, 5, 6, E, F, G, !]


        // instead of predicate we use lambda directly
        ArrayList<Character>digit= new ArrayList<>(Arrays.asList(ch));
        digit.removeIf(c->!Character.isDigit(c)); // c-> c // variables should match!!!
        System.out.println(digit); // [1, 2, 3, 4, 5, 6] non digits removed.

        ArrayList<Character>alphabet= new ArrayList<>(Arrays.asList(ch));
        alphabet.removeIf(c-> !Character.isAlphabetic(c));
        System.out.println(alphabet); // [A, B, C, D, E, F, G] non alphabetics removed

        ArrayList<Character>specialChar=new ArrayList<>(Arrays.asList(ch));
        specialChar.removeIf(c->Character.isAlphabetic(c) || Character.isDigit(c)); // NOT &&
        System.out.println(specialChar); // [$, %, #, @, &, !]


    }

    }

