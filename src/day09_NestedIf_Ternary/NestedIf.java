package day09_NestedIf_Ternary;

public class NestedIf {
    public static void main(String[] args) {
        // NESTED IF  Statement
        int salary = 15000;
        float yearsOfExperience = 2;
        if (salary >= 30000) {
            if (yearsOfExperience >= 2) {
                System.out.println("You qualify for the loan");
            } else {
                System.out.println("You must have at least 2 years of working history");
            }
        } else {
            System.out.println("You must earn at least $30000");
        }
        System.out.println("=================================");

        //eligible to vote

        byte age= 29;
        boolean uSCitizen= true;

        if(uSCitizen){
            if (age>17){
                System.out.println("Eligible");
            }else{
                System.out.println("Not Eligible");
            }
        }else {
            System.out.println("You need to be an US citizen");
        }
        System.out.println("================================");

        //GRADES ==> Nested IF
        int score =66;
        String grade = "";

        if(score>=0 && score<=100){
            if(score >=90){
                grade = "A";
            }else if( score>=80){
                grade ="B";
            }else if (score>=70){
                grade = "C";
            }else if (score>=60){
                grade ="D";
            }else {
                grade = "F";
            }
        }else {
            grade = "Invalid";
        }
        System.out.println(grade);
        System.out.println("=========================");

        // TERNARY
        int score2 =10;
        String grade2 = "";

        if(score2>=0 && score2<=100){
            grade2= (score2 >=90)? "A" : (score2 >=80)? "B": (score2 >=70)? "C" : (score2 >=60)? "D": "F";
        }else {
            grade2="Invalid";
        }
        System.out.println(grade2);
        System.out.println("===========================");









    }
}


