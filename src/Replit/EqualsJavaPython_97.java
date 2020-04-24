package Replit;

import java.util.Scanner;

public class EqualsJavaPython_97 {
    public static void main(String[] args) {
        /*
        Java is a general-purpose computer-programming language that is concurrent, class-based,object-oriented,[15]and specifically designed to have as few implementation dependencies as possible.
         */
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        //sentence=sentence.toLowerCase();// not required
        System.out.println();
        System.out.println(sentence);
        int javaCount=0;
        int pythonCount=0;
        while ( sentence.contains("java") || sentence.contains("python") ) {
            if (sentence.contains("java") ) {
                javaCount++;
                sentence=sentence.replaceFirst("java","");
            }
            if (sentence.contains("python") ) {
                pythonCount++;
                sentence=sentence.replaceFirst("python","");
            }

        }
        System.out.println(javaCount);
        System.out.println(pythonCount);
        System.out.println(javaCount==pythonCount);


    }
}
