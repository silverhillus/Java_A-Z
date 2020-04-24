package day14_StringManipulations;

public class StringManipulations2 {
    public static void main(String[] args) {
        //>.isEmpty();
        //Fields are required (username / password )is an example use of .isEmpty()
        String str="";
        boolean bool1=str.isEmpty(); //true
        System.out.println(bool1);

        System.out.println("================");

        //.equals();
        String z1="Cat"; // literal > stored in string pool
        String z2=new String("Cat"); //though the value is SAME but stored in different location
        String z3="Cat";// literal > stored in string pool

        //==
        System.out.println(z1==z2); // prints  false
        System.out.println(z1==z3);
        //.equals
        System.out.println(z1.equals(z2)); // prints true // more accurate for comparing the same text.
        System.out.println(z1.equals(z3));

        System.out.println("===================");

        //> .equalsIgnoreCase()

        String str1 = "CYBERTEK";
        String str2 = "cybertek";

        System.out.println( str1.equals(str2) ); // false

        System.out.println(str1.equalsIgnoreCase(str2) ); // true, ignores case sensitivity


        System.out.println("===================");


        String gmail = "cybertekschool@gmail.com";

        String userinputGmail = "CybertekSchool@gmail.com";

        boolean result =  gmail.equalsIgnoreCase( userinputGmail );  // true

        if(result){
            System.out.println("Logged in");
        }


        System.out.println("==================================");

        //>.contains();
        String s1 = "Cybertek School";

        boolean r1 =   s1.contains("school");   // true

        System.out.println(r1);

        //>.startsWith();
        String s3 = "United States";
        System.out.println( s3.startsWith("U") );  // true


        //>.endsWith();
        String s4 = "Cybertel School";
        System.out.println( s4.endsWith("l") );  // true
        System.out.println( s4.endsWith("School") ); // true

        System.out.println(s4.endsWith("Cybertek")); // false





    }
}
