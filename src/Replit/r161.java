package Replit;
/*
the regular calculation under 50 is
bill = units * 0.60;
above 50 is:
bill = units * 0.90;

above 100 the calculation is like above 50 but with a 50 as fine

and above 150 its the same as above 50 (units *0.90) but with a 100 fine added to the price .
 */
public class r161 {
    public static double waterTax(double units)
    {
        double bill = 0.0;
        //your code here
        if (units<=50) {
            bill = units * .6;
        }else if (units>50 && units<100){
            bill = (units * .9);
        }else if (units>=100 && units<150){
            bill = (units * .9) +50;
        }else{
            bill = (units * .9) +100;
        }
        //end your code here
       return bill;
    }//end waterTax

    public static void main(String[] args) {
        double bill=waterTax(75);
        System.out.println(bill);
    }

}
