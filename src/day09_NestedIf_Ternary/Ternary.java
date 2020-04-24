package day09_NestedIf_Ternary;
public class Ternary {
    public static void main(String[] args) {
        int num=100;
        //ODD OR EVEN WITH IF ELSE
        String result="";
        if (num%2==0){
             result="Even";
        }else {
            result="Odd";
        }
        System.out.println(result);

        //ODD OR EVEN WITH TERNARY
        String result2=(num%2==0) ? "Even" : "Odd";
        System.out.println(result2);

        // max with ternary
        int num1=20;
        int num2=12;
        int max=0; // initial value

        max= (num1>num2) ? num1 :num2;
        System.out.println(max);

        // min with ternary
        int num3=300;
        int num4=128;
        int min=0; // initial value

        min= (num3<num4) ? num3 :num4;
        System.out.println(min);

        //Greeting with tenary
        String greeting="";
        greeting=(true) ? "Hello" : "Hola";
        System.out.println(greeting);






    }
}
