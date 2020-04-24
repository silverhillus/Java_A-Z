package Replit;

public class r114_nonduplicates {
    public static void main(String[] args) {

        //114 non duplicate
        /*
        Given an array nums with 7 integers every element is repeated twice - except one.
        Find that element and print it to console.

Example: 2
         */
        int[] num = {1, 1, 2, 3, 4, 3, 4};

        //Concatenating all the non duplicate elements //>> 1234
        String nonDup="";
        for (int i=0; i<num.length;i++){
            if (!nonDup.contains(""+num[i])){
                nonDup+=num[i];
            }
        }
        System.out.println(nonDup);

        // Frequency of the characters/elements
        
        for (int j=0; j<num.length; j++){
            int count=0;
            for (int i=0; i<num.length; i++){ //1,1,2,3,4,3,4
            if (num[i]==num[j]){
                count++;
            }
        }
            if (count==1){
                System.out.println(num[j]);

            }
        }








        /*int counter=0;
        for (int j=0; j<num.length; j++){
            counter=0;
            for (int i=0; i<num.length; i++){
                if (num[i]==num[j]) {
                    counter++;
                }
            }
            if(counter==1){
                System.out.println(num[j]);
            }

        }

         */






    }
}
