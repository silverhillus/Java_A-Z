package Replit;

import java.util.Arrays;
import java.util.Scanner;

public class r102_split_reverse {
    public static void main(String[] args) {

        //String str="YESTERDAY I WAS CLEVER, SO I CHANGED THE WORLD. TODAY I AM WISE, SO I AM CHANGING MYSELF";
        //       str= str.toLowerCase();
        //System.out.println(str);


        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();//"yesterday i was clever, so i changed the world. today i am wise, so i am changing myself"-RUMI

        //TODO: Type your code below

        // string sentence converted to string array by split method
        String[] words=sentence.split(" ");
        System.out.println(Arrays.toString(words));//>> [yesterday, i, was, clever,, so, i, changed, the, world., today, i, am, wise,, so, i, am, changing, myself]
        for (int i=words.length-1; i>=0; i-- ){
            System.out.println(words[i]);
        }

    }
}
