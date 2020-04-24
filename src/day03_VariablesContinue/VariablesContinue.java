package day03_VariablesContinue;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class VariablesContinue {
    /*
    comparision operators:
		>: greater
		>=: greater or equal
		<: less
		<=: less or equal
		== : equal
		!= : not equal
     */
    public static void main(String[] args) {

        /*
        BOOLEAN
        TRUE / FALSE

        CHAR
        It's only used for single characters

        char ch = 'A' // Unicode or single character must be used with single quote '
         */
        System.out.println("Fatih" == "Fatih");
        System.out.println("Fatih" == "Hitaf");
        System.out.println("Fatih" != "Fatih");
        System.out.println("===========================");


        char ch1 = 'A';
        char ch2 = 69;
        int num = 'F'; // you can assign char to an int bc int range > char range
        byte b1 = 'z'; // char > byte
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(num);
        System.out.println(b1);

    }
}
