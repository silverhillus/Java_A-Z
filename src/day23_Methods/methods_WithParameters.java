package day23_Methods;

public class methods_WithParameters {

    //declare a method with parameter within class
    public static void eligibleToBuy(int age){
        if (age>=21){
            System.out.println("Eligible to buy alcohol");
        }else{
            System.out.println("You can buy a milk instead!");
        }
    }

    public static void main(String[] args) {
        //call the method by it's name
        //eligibleToBuy();>> !!!!!!this will give you an error without a age parameter
        eligibleToBuy(45);// just type the (number) no need to type (int 45)

    }




}
