package Replit;

import java.util.ArrayList;

public class r_deliveryCalc {

    public static int refuel_times(ArrayList<Integer> deliveries, int max_fuel) {
        int refuel = 0;
        for (int each : deliveries) {
            refuel += (each / max_fuel);
        }

        return  (refuel % max_fuel != 0) ? refuel+1: refuel;

        /*for (int each : deliveries){
            if (max_fuel>=each){
                refuel+=(each/max_fuel);
            }else{
                refuel+=1;
            }
        }
        return refuel;

         */


    }

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(3);
        arr.add(1);
        arr.add(2);
        arr.add(6);
        int times = refuel_times(arr, 3);
        System.out.print(times);//should output 5


    }//end main
}
