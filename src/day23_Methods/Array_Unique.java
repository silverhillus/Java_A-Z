package day23_Methods;

public class Array_Unique {
    public static void main(String[] args) {
        /*
        warmup task:
	1.  Write a program that can print out the unique values from a String Array
			Ex:
				if arr -> {"A", "A", "B", "C", "C"}
				output: B
				if arr -> {"A", "B", "B", "C"}
				output:  A
						 C
			MUST use for each loop
         */
        String [] arr= {"A", "A", "B", "C", "C"};

        /*
        int count=0;
        for (String each : arr){ // //This loop is only for the first element-compare each element with each element
            if (each.equals("A")){
                count++;

            }
        }
        if (count==1){
            System.out.println("A");
        }

         */

        // 1_For each loop
        for (String each2 : arr){ // This loop checks each

            int count=0;
            for (String each : arr){ // //This loop is only for the first element-compare each element with each element
                if (each.equals(each2)){
                    count++;

                }
            }
            if (count==1){
                System.out.println(each2); // B is the unique element
            }

        }
        System.out.println("=======================================");

        // 2_ For loop

        /*
        //Checking only 1 element so I need to repeat it for each element
        int count2=0;
        for (int i=0; i<arr.length; i++){
            // arr[i] represent each element and it's string so
            if (arr[i].equals("A")){
                count2++;

            }
        }
        if (count2==1){
            System.out.println("A");
        }

         */

        for (int j=0; j<arr.length; j++){
            int count2=0;
            for (int i=0; i<arr.length; i++){

                if (arr[i].equals(arr[j])){// arr[i],arr[j] represent each element and it's string so .equals can be used to compare
                    count2++;

                }
            }
            if (count2==1){
                System.out.println(arr[j]);
            }
        }







    }
}
