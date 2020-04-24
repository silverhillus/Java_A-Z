package day09_NestedIf_Ternary;

public class NestedIf_Loan {
    public static void main(String[] args) {
        // NESTED IF  Statement
        int salary= 15000;
        double yearsOfExperience= 2.5;
        if (salary>=30000){
            if (yearsOfExperience>=2){
                System.out.println("You qualify for the loan");
            } else{
                System.out.println("You must have at least 2 years of working history");
            }
        }else {
            System.out.println("You must earn at least $30000");
        }
        System.out.println("=============================");

        // TERNARY
        double salary1= 15000;
        double yearsOfExperience1= 2.5;
        String loan= "";
        if (salary>=30000){
            loan= (yearsOfExperience1>=2)? "You qualify for the loan" : "You must have at least 2 years of working history";
        }else {
            loan="You must earn at least $30000";
        }
        System.out.println(loan);







    }
}
