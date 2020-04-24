package day14_StringManipulations;

public class StringManipulations_Practice {
    public static void main(String[] args) {

        /*
        every website has "www." at the beginning of the web address
         */

        String webAddress = "Www.amazon.com";
        webAddress = webAddress.toLowerCase();

        if( webAddress.startsWith("www.") ){
            // false
            System.out.println("valid");

        }
        System.out.println("==================================");

        /*
        every single gmail address ends with @gmail.com
         */

        String email = "CybertekSchool@Yahoo.com";

        if(email.endsWith("@gmail.com")){
            System.out.println("valid Gmail");
        }else{
            System.out.println("Invalid gmail");
        }

        /*
        write a program that can validate if a web address is valid
            valid web address:
                    MUST start with www.
                    Must ends with  .com, or .edu, .net, .Gov
         */

        System.out.println("=====================");
        String web="www.silverhill.gom";
        web=web.toLowerCase();
        if (web.startsWith("wwww.")) {
            if (web.endsWith(".com") || web.endsWith(".edu") || web.endsWith(".net") || web.endsWith(".gov")) {
                System.out.println("Valid web address");
            } else {
                System.out.println("Invalid!");
            }

            //
            String website = "cyberte.www.com" ;
            website =    website.toLowerCase();

            boolean validEnding = website.endsWith(".com") ||  website.endsWith(".edu") ||  website.endsWith(".gov") ;

            if(website.startsWith("www.") && validEnding)  {

                System.out.println("Valid address");

            }else{
                System.out.println("Invalid Address");

            }

        }





    }
}
