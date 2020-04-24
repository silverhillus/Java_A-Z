package OfficeHours.Practice_03_18_2020;

/*
check the age if it's eligible to buy an alcohol
 */

public class WarmupTask_CheckAge {
    public static void main(String[] args) {

        byte age= 20;
        boolean eligibleToBuy= age > 21 || age == 21;

        if (eligibleToBuy){
            System.out.println("Here is your beer");
        }

        if (!eligibleToBuy){
            System.out.println("Alcohol is dangerous for your health so get your milk instead");
        }

    }



}
