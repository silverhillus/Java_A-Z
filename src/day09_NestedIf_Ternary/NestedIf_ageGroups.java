package day09_NestedIf_Ternary;
/*
    write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )
                  age cannot be negative or greater than 150
     */

public class NestedIf_ageGroups {
    public static void main(String[] args) {
        //TERNARY
        short age = 100;
        String ageGroup = "";

        if (age >= 0 && age < 150) {
            ageGroup = (age < 21) ? "Teenager" : (age < 55) ? "Adult" : "Senior";
        } else {
            ageGroup = "Age cannot be negative or greater than 150";
        }
        System.out.println(ageGroup);


    }
}
