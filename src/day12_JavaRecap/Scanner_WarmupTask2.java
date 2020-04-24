package day12_JavaRecap;
/*
2. Ask user to enter two words. Then add them together and print.
                        Input:
                            one
                            eight
                        Output:
                            oneeight
 */

import java.util.Scanner;

public class Scanner_WarmupTask2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //1_nextLine();
        System.out.println("Enter two words:");
        String word1=input.nextLine();
        String word2=input.nextLine();
        String together= word1 + word2;
        System.out.println(together);
        System.out.println("=========");

        //2_next();
        String pTogether="";//you need to initialize the String pTogether first before you use.
        System.out.println("Enter two words:");
        String words1=input.next(); //only accepts single word.
        pTogether += words1; // you need to initialize the String pTogether first. // one
        String words2=input.next();
        pTogether += words2;//oneeight

        System.out.println(pTogether);



    }
}
