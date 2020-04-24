package Replit;

public class email {
    public static void main(String[] args) {
        String email ="barakobama@gmail.com"; //"mike_tyson@gmail.com";
        String result="";

        /* PLEASE NOTE!!!!! THIS ONE DOESN'T WORK

        int undrscr=email.indexOf("_");
        int at=email.indexOf("@");
        String fName=email.substring(0,undrscr);
        String lName=email.substring(undrscr+1,at);

         if (email.contains("_") ){

         **You need to declare variables declared on the top inside this if block because it's only valid in this condition!!!
         **So that it won't give you compile error.


            result=lName+"_"+fName+"@gmail.com";

        }else{
            result=email;
        }
        System.out.println(result);


         */

        if (email.contains("_") ){
            int undrscr=email.indexOf("_");
            int at=email.indexOf("@");
            String fName=email.substring(0,undrscr);
            String lName=email.substring(undrscr+1,at);
            result=lName+"_"+fName+"@gmail.com";

        }else{
            result=email;
        }
        System.out.println(result);



    }
}
