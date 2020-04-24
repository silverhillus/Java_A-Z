package day07_IfStatements;

public class EligibleToVote {
    public static void main(String[] args) {
        byte age= 18;
        boolean eligibleToVote = age > 18 || age ==18;

        if (eligibleToVote){
            System.out.println("Age: " + age + " \nYou're eligible to vote.");
        }

        if (!eligibleToVote){
            System.out.println("Age: " + age + " \nSorry you're not eligible to vote.");
        }
    }
}
