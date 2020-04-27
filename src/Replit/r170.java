package Replit;

public class r170 {
    /*
    This method gets two strings (text and badWord)  and returns a string.

basicly what it dose is take out all the occurrences of badWord in text.

for example:

clean ("one two three","two")
returns "one three"

clean ("foo bar","foo")
returns "bar"

clean ("he said bla bla bla","bla")
returns "he said "

hint:

https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#replace(char,%20char)
     */
    public static String clean(String text, String badWord) {
        return text.replace(badWord, "");

    }

    public static void main(String[] args) {
        String s="he said bla bla bla";
        String b="bla";
        String re=clean(s,b);
        System.out.println(re);
    }
}
