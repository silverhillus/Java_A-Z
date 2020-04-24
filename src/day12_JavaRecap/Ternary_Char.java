package day12_JavaRecap;
/*
Create a new switch statement using char instead of int.
Create a new char variable
Create a switch statement testing for A, B, C, D or E
Display a message if any of these are found and then break
Add a default which displays a message saying not found.
 */


public class Ternary_Char {
    public static void main(String[] args) {

        /*
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a character:");
        you cannot use char ch=input.next(); directly so use String instead.
         */
        char ch = 'Z';
        String result = (ch == 'A') ? "A" : (ch == 'B') ? "B" : (ch == 'C') ? "C" : (ch == 'D') ? "D" : (ch == 'E') ? "E" : "Invalid!";
        System.out.println(result);


    }
}
