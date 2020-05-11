package selfStudy;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObjects {
    public static void main(String[] args) {
        Carpet carpet1= new Carpet();
        carpet1.customOrder(2.5,3,1200,true);
        Carpet carpet2= new Carpet();
        carpet2.customOrder(12.5,3,2500,true);
        Carpet carpet3= new Carpet();
        carpet3.customOrder(10.5,7,500,false);
        Carpet carpet4= new Carpet();
        carpet4.customOrder(15,10,240,false);
        Carpet carpet5= new Carpet();
        carpet5.customOrder(15,10,150,false);

        Carpet [] carpets={carpet1,carpet2,carpet3,carpet4,carpet5};
        ArrayList<Carpet>persianCarpets= new ArrayList<>();
        ArrayList<Carpet>regularCarpets= new ArrayList<>();
        for (Carpet eachCarpet : carpets){
            if (eachCarpet.isPersian){
                persianCarpets.add(eachCarpet);
            }else {
                regularCarpets.add(eachCarpet);
            }
        }
        System.out.println("There are "+ persianCarpets.size()+" Persian Carpets");
        for (int i=0; i<persianCarpets.size(); i++){
            System.out.println("The costs is: "+persianCarpets.get(i).calcCost());
        }
        System.out.println("There are "+ regularCarpets.size()+" Regular Carpets");
        for (int i=0; i<regularCarpets.size(); i++){
            System.out.println("The costs is: "+regularCarpets.get(i).calcCost());
        }






    }
}
