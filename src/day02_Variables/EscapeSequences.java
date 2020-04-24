package day02_Variables;

public class EscapeSequences {
    public static void main(String[] args) {
        System.out.println("\t\t\tHorizantal tab");
        // 			Horizantal tab -paragraph space in front of the line

        System.out.println("Cybertek School\n");
        System.out.println("My\nName\nis\nFatih");
        /* new lines
        My
        Name
        is
        Fatih
         */

        System.out.println("My favourite Tv show is \"The Big Bang Theory\" ");

        /* \"The Big Bang Theory >> "The Big Bang Theory
         \"The Big Bang Theory\" >> "The Big Bang Theory"  */

        System.out.println("\\This is a remark\\");
        /*  "\\This is a remark\\" output \This is a remark\     */

    }

}
