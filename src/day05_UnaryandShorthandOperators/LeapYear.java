package day05_UnaryandShorthandOperators;

public class LeapYear {
    /*
    Warm Up tasks:
        1. create a class called LeapYear, and write a program that can identify if the given is Leap Year, print true if it's leap year, otherwise print false
            Ex:
                year = 2020
            output:
                2020 is leap year: true
     */
    public static void main(String[] args) {
        short year = 2020;
        // leapYear => year % 4 == 0;
        boolean leapYear= year % 4 == 0; //true
        //  System.out.println( year + " is leap year: " + leapYear ); >> that also works

        System.out.println(year + " is leap year: " + leapYear);

        System.out.println("====================================");



    }
}
