package day09_NestedIf_Ternary;
/*
write a program that can define the age groups of a person
             age groups are:
                    baby (< 3 year)
                    Toddler (3 - 5),
                    Kid (6 - 9),
                    Pre-Teen (10 - 12),
                    Teenager (13 - 17),
                    Young Adult (18 - 20),
                    Adult (21 - 39),
                    Young Middle-Aged Adult (40 - 49),
                    Middle-Aged Adult (50 - 54),
                    Very Young Senior Citizen (55 - 64),
                    Young Senior Citizen (65 - 74),
                    Senior Citizen (75 - 84),
                    Old Senior Citizen (85+)
 */

// command + option + L ==>REFORMATTING LINES// ALIGNS THEM PROPERLY

public class ageGroups {
    public static void main(String[] args) {
        byte age = 23;
        String ageGroups = "";
        if (age < 3 && age > 0) {
            ageGroups = "Baby";
        } else if (age <= 5 && age > 3) {
            ageGroups = "Toddler";
        } else if (age <= 9 && age > 6) {
            ageGroups = "Kid";
        } else if (age <= 12 && age > 10) {
            ageGroups = "Pre-Teen";
        } else if (age <= 17 && age > 13) {
            ageGroups = "Teenager";
        } else if (age <= 20 && age > 18) {
            ageGroups = "Young Adult";
        } else if (age <= 39 && age > 21) {
            ageGroups = "Adult";
        } else if (age <= 49 && age > 40) {
            ageGroups = "Young Middle-Aged Adult";
        } else if (age <= 54 && age > 50) {
            ageGroups = "Middle-Aged Adult";
        } else if (age <= 64 && age > 55) {
            ageGroups = "Very Young Senior Citizen";
        } else if (age <= 74 && age > 65) {
            ageGroups = "Young Senior Citizen";
        } else if (age <= 84 && age > 75) {
            ageGroups = "Senior Citizen";
        } else if (age <= 120 && age > 85) {
            ageGroups = "Old Senior Citizen";
        } else {
            ageGroups = "Invalid Entry";
        }

        System.out.println("Age group is: " + ageGroups);

        // Alcohol

        boolean eligibleToBuy = ageGroups == "Adult" || ageGroups == "Young Middle-Aged Adult" ||
                ageGroups == "Middle-Aged Adult";

        if (eligibleToBuy) {
            System.out.println("You are eligible");
        } else {
            System.out.println("You are not eligible");
        }




    }
}
