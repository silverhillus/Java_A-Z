package day08_IfStatements;

/*
1.  write a program that can check the equality of the three given numberrs
 			declare 3 numbers n1, n2, n3
  			if n1 and n2 are equal  => n1&n2 are equal
   			if n2 and n3 are equal ==> n2&n3 are equal
   			if n3 and n1 are qual ==>n3&n1 are equal
			if all equal ==> all equal
			if none of them are euqal ==> none of them are equal
	2.. write a program that can find the number of days in a month
	 	(Assume that Feb has 28 days)
 */

public class Warmup1_EqualNumbers {
    //1_Equal Numbers
    public static void main(String[] args) {
        double n1=100.2;
        double n2=100.3;
        double n3=100.4;
        boolean n1Equaln2= n1==n2 && n1!=n2;
        boolean n1Equaln3= n1==n3 && n1!=n3;
        boolean n2Equaln3= n2==n3 && n2!=n3;
        boolean allEqual= n1==n2 && n1==n3;
        boolean nonEqual= n1!=n2 && n1!=n3 && n2!=n3;
        //!allEqual>> is not gonna work because it also includes other possibilities
        //boolean nonEqual1= n1Equaln2==false && n1Equaln3==false && allEqual==false;
        //boolean nonEqual2= !n1Equaln2 && !n1Equaln3 && !allEqual;
        if (n1Equaln2){
            System.out.println(n1 + " is equal to " + n2);
        }
        if (n1Equaln3){
            System.out.println(n1 + " is equal to " + n3);
        }
        if (n2Equaln3){
            System.out.println(n2 + " is equal to " + n3);
        }
        if (allEqual){
            System.out.println(" All equal");
        }
        if (nonEqual){
            System.out.println("None of them are equal");
        }




    }
}
