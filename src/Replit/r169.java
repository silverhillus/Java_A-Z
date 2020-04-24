package Replit;

public class r169 {
    /*
    This method gets a string and returns the word count of that string.

example:

wordCount("foo bar")
returns 2

wordCount("one two three")
returns 3

wordCount("bla")
returns 1
     */

    public static int wordCount(String words) {

        String [] wordAr=words.split(" ");
        int wordCount=wordAr.length;
        return wordCount;
    }

    public static void main(String[] args) {
        String str="one two three";
        int count=wordCount(str);
        System.out.println(count);
    }

}
