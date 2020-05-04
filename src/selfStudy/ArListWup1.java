package selfStudy;

public class ArListWup1 {
    /*
    WARMUP TASKS:
	1. write a program that can return the sum of all the digits from a string
			ex:
				input: "a1b2c3"
				output: 6
					(1+2+3= 6)
				input: "Today's date is 04/27/2020"
				output: 17
					(0+4+2+7+2+0+2+0=17)
			HINT: on ascii table, the characters between #48 ~ #57 are digits

     */

    public static void main(String[] args) {
        //Recall wrapper class : parse or value of converts string to Integer if it's only "123" number string
        String str="a1b2c3";
        // hint: get each character with loop
        // Wrapper class Character.isDigit(ch) returns the numbers from the list.
        int sum=0;
        String res="";
        for (int i=0; i<str.length(); i++){
         char ch=str.charAt(i);
         if (Character.isDigit(ch)) {
            // convert ch to string first then to integer with parse
             sum+=Integer.parseInt(""+ch);
         }else {
             res+=ch;
         }
        }
        System.out.println(sum);
        System.out.println(res);
        System.out.println("==================");

        String input="Today's date is 04/27/2020";

        int sum1=0;
        for (int i=0; i<input.length(); i++){
            char each=input.charAt(i);
            if (Character.isDigit(each)){
                sum1+=Integer.valueOf(""+each);
            }
        }
        System.out.println(sum1);



    }
}
