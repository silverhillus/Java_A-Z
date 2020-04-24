package day10_Switch_Scanner;
/*Warm up task:
	1. Wash your hand
	2. write a program that can display the days based on the numbers 1 ~ 7
			MUST USE NESTED IF
	3. write a java program that can convert numbers between 0 ~ 9 to words, if the number is greater than 9 or less than zero, out put should be "Invalid".
				DO NOT USE IF STATEMENTS
	4. write a program that can find the number of days in a month
	 	(Assume that Feb has 28 days)
		 		28 days: 2
		 		30 days: 4,6, 9, 11
		 		31 days: 1,3,5,7,8,10,12
	 		MUST USE NESTED IF

 */

public class days {
    public static void main(String[] args) {
        int num=4;
        String days="";
        if (num>0 && num<8){
              days= (num==1)? "Mon": (num==2)? "Tue":(num==3)? "Wed":(num==4)? "Thu" : (num==5)? "Fri":
                    (num==6)? "Sat" : "Sun";
        }else{
            days="invalid";
        }
        System.out.println(days);
        System.out.println("=========================");

        // Number to Word with Ternary
        int number=8;
        String numberToWord="";
        /* with else at the end
        if (number>=0 && number<10){
            numberToWord= (number==0)?"Zero":(number==1)?"One":(number==2)?"Two":(number==3)?"Three":(number==4)?"Four":(number==5)?"Five":
                    (number==6)?"Six":(number==7)?"Seven":(number==8)?"Eight":"Nine";
        }else{
            numberToWord="Invalid Entry";

         */
        // all together better version
        if (number>=0 && number<10){
            numberToWord= (number==0)?"Zero":(number==1)?"One":(number==2)?"Two":(number==3)?"Three":(number==4)?"Four":(number==5)?"Five":
                    (number==6)?"Six":(number==7)?"Seven":(number==8)?"Eight": (number==9)?"Nine": "Invalid Entry";
        }
        System.out.println(numberToWord);




    }
}
