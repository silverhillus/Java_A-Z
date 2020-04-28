package day30_CustomClass;

public class WT_SumOfDigits {
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

	3. write a program that can print out the unique elements from an int array
		   HINT: store all the unqie elemenbts of array into a list of integers
		   Ex: array==> {1,1,2,3,3,4,5}
		   	   output: {2,4,5}
    4.	write a program that can find the unique elements from an ArrayList of integers and stores into another list called uniques
    		ex: list==> {1,1,2,3,3,4,5}
    			uniques ==> {2,4,5}
    5. write a program that can combine two String arrays into one arrayList
    		ex:
    			arr1 = {"A", "B", "C"};
    			arr2 = {"D", "E", "F", "G"};
    			list ==> {"A", "B", "C", "D", "E", "F", "G"}
     */
    public static void main(String[] args) {
        String str="a1b2c3";

        //solution 1 /ascii table
        String result="";
        int sum=0;
        for (int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if (ch>47 && ch<58){
                result+=ch;
                sum+=Integer.parseInt(""+ch);

            }
        }
        System.out.println(sum);

        //solution 2
        String str1= "Today's date is 04/27/2020";
        String result1="";
        int sum1=0;
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                sum1+=Integer.parseInt(""+str.charAt(i));
            }
        }
        System.out.println(sum1);






    }
}
