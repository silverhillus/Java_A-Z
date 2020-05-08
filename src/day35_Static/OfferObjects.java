package day35_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class OfferObjects {
    //it has to be in main
    public static void main(String[] args) {
        Offer offer1= new Offer();
        offer1.setInfo("VA","BOA",100_000,true);
        //System.out.println(offer1); // Location: VA, Company: BOA, Salary: 100000.0, is FullTime: true
        Offer offer2= new Offer();
        offer2.setInfo("KY","CapitalOne",120_000,false);
        Offer offer3= new Offer();
        offer3.setInfo("MD","Chase",90_000,false);
        Offer offer4= new Offer();
        offer4.setInfo("NY","Google",115_000,true);

        // create your condition with location which is near to you
        String myLocation="NY";

        // create array with those offers
        Offer[] offers={offer1,offer2,offer3,offer4};
        ArrayList<Offer>Accept=new ArrayList<>(Arrays.asList(offers));
                                                                            //location is not equal to mylocation
        Accept.removeIf(each->each.salary<100_000 || each.isFullTime==false || !each.location.equals(myLocation)); // less than 100K and not fulltime's will be removed

        System.out.println(Accept.size());
        for (Offer eachOffer : Accept){
            System.out.println(eachOffer); // Location: NY, Company: Google, Salary: 115000.0, is FullTime: true
        }





    }
}
