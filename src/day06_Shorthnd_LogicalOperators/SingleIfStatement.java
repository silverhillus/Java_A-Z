package day06_Shorthnd_LogicalOperators;

public class SingleIfStatement {

    public static void main(String[] args) {
        boolean coldWeather = true;
        if (coldWeather) {
            System.out.println("Wear your jacket");
            System.out.println("Wear your hat");
        }

        boolean  coronaDetected = true;
        if(coronaDetected){

             System.out.println("Buy more toilet papers");
             System.out.println("Buy more water");
             System.out.println("Stay at home");
             System.out.println("Do more java coding");
        }

        int a = 101;
        boolean evenNum = a%2==0; // only gets executed if the statement is true
        boolean oddNum = a%2!=0;
        if (evenNum){
            System.out.println(a + " is an even number");
        }
        if (oddNum) {
            System.out.println(a + " is an odd number");
        }

        /* THIS ALSO WORKS WITH LESS CODING
        int a = 201;
        boolean evenNumber = a % 2 == 0;  // if a number can be devided by 2 without the reminader
        //    boolean oddNumber = a % 2 != 0;  // if the number cannot be divided by 2 evenly

        if( evenNumber ){
            System.out.println(a +" is even number" );
        }

        if(!evenNumber){  // if the number is not even number, then it must be odd
            System.out.println(a+" is odd number ");
        }
         */


    }
}
