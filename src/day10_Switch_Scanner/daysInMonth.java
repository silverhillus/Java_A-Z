package day10_Switch_Scanner;
/*
 write a program that can find the number of days in a month
	 	(Assume that Feb has 28 days)
		 		28 days: 2
		 		30 days: 4,6, 9, 11
		 		31 days: 1,3,5,7,8,10,12
	 		MUST USE NESTED IF
 */

public class daysInMonth {
    public static void main(String[] args) {
        byte num=12;
        boolean days28= num==2;
        boolean days30= num==4 || num==6 || num==9 ||num==11;
        // the rest is 31 days so no need to declare =>> boolean days31=
        String months="";

        if (num>0 && num<=12){
            months=(days28)? "has 28 days" : (days30)? "has 30 days": "has 31 days";
        }else{
            months="Invalid Entry";
        }
        System.out.println(months);


    }
}
