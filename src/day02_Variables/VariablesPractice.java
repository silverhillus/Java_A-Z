package day02_Variables;

public class VariablesPractice {
    public static void main(String[] args) {
        /* salary, federal tax rate, state tax rate, loan,ssn */

        int salary= 120000;
        double federalTax= .18;
        float stateTax= 0.065f; // by default double so you add f at the end
        System.out.println("============================================");
        // salary after tax=salary(1-sum of taxes)

        double sumTaxes= federalTax + stateTax;
        double salaryAfterTax= salary*(1-sumTaxes);
        System.out.println(salaryAfterTax);
        System.out.println("============================================");

        // are of a circle = r^2*pi

        double r=5.5;
        double area= r*r*3.14;
        System.out.println(area);
        System.out.println("============================================");
        // kg to pound converter

        int kg= 90;
        double pound= kg*2.25;
        System.out.println(pound);
        System.out.println("============================================");
        // currency converter

        double lira=1000;
        double liraToDollar= lira / 6.5;
        System.out.println(liraToDollar);
        System.out.println("============================================");
        // liter to gallon

        double liter= 1000;
        double gallon=liter / 3.78;
        System.out.println(gallon);
        System.out.println("============================================");





    }
}
