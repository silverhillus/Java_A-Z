package day09_NestedIf_Ternary;


public class Ternary_Practice {
    public static void main(String[] args) {
        int a=80;
        int b=60;
        String result=(a>b)? a+" is greater": b+" is greater";
        System.out.println(result);

        //eligible to vote
        int ageOfThePerson=7;
        String eligibleToVote="";
        eligibleToVote=(ageOfThePerson>=18)? "Yes you're eligible to vote" : "No you're not eligible";
        System.out.println(eligibleToVote);

        // Grades
        double score=45.5;
        String grade = (score >=90 && score <=100) ? "A" : (score >= 80 && score <90)? "B":
                (score >= 70 && score <80)? "C" : (score >= 60 && score <70) ? "D" : (score <60) ? "F" :
                "invalid";
                //for the last one you don't need this ==> (score <0) ? "Invalid";
        System.out.println(grade);

        System.out.println("===============================================");

        int number =100;
        char ch1 =' ';

        if(number >0){
            ch1 = '+';
        }else  if(number < 0){
            ch1 = '-';
        } else {
            ch1 = '0';
        }

        char ch2 = (number >0) ? '+' : (number < 0) ? '-' : '0';

        System.out.println(ch1);
        System.out.println(ch2);

        //  System.out.println(ch1 + ch2);

        System.out.println("=====================================================");

        byte scores = -10;
        String grades ="";
        if(scores>= 90 && scores<= 100){
            grade = "Excellent";
        }else if(score>= 80 && scores < 90){
            grade = "Great";
        }else if(scores >= 70 && scores < 80){
            grade = "Good";
        }else if(scores >= 60 && scores <70){
            grade = "Pass";
        }else if( scores < 60 && scores >0){
            grade = "Failed";
        }else{ // if score is less than 0 or greater than 100
            grade = "Invalid";
        }

        System.out.println(grade);

        String grade2 = (scores>= 90 && scores<= 100) ? "Excellent" : (scores>= 80 && scores < 90) ? "Great"
                :(scores >= 70 && scores < 80) ? "Good" :(scores >= 60 && scores <70) ? "Pass"
                :( scores < 60 && scores >0)? "Failed" : "Invalid" ;

        System.out.println(grade2);








    }



}
