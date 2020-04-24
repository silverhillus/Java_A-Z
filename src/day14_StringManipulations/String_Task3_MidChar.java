package day14_StringManipulations;
/*
       3. Write a Java method to display the middle character of a string
        a) If the length of the string is even there will be two middle characters.
        b) If the length of the string is odd there will be one middle character.
                Input :
                    elephant
                Output:
                    The middle character in the string: ph
 */

import java.util.Scanner;

public class String_Task3_MidChar {
    public static void main(String[] args) {
        //3_Display the middle character of a string
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a word");
        String word=input.next();//elephant

        //First Way_My own way
        int midIndexNum = (word.length() - 1)/2;
        if(word.length()%2!=0){
            char odd=word.charAt(midIndexNum);
            System.out.println(odd);
        }else{
            String even=word.substring(midIndexNum,(midIndexNum+2)); //end
            System.out.println(even);
        }

        System.out.println("==================");

        ///Second Way_Cybertek
        String middleCharacter = "";  // to store the middle characters at the end

        int totalChars  =  word.length();  //8
        int middleNumber = totalChars/2; // 8/2 = 4

        if(totalChars % 2 != 0){ // odd numbers

            // middleCharacter += word.charAt( middleNumber );
            middleCharacter = middleCharacter + word.charAt( middleNumber );

        }else{  // even number
            // middleCharacter = middleCharacter + word.charAt(middleNumber -1)+word.charAt( middleNumber );

            middleCharacter +=  word.charAt(middleNumber - 1)+"" + word.charAt(middleNumber);
            /// any thing we added to a string will return it as string

        }

        System.out.println("Middle character: "+middleCharacter);



    }
}
