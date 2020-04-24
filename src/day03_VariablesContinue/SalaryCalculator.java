package day03_VariablesContinue;

public class SalaryCalculator {
    /* Task 08:
        Create a class called salary calculator, write a program that can calculate the taxt, and salary after tax based on the hourly rate & tax rates
        ex:
        if:
        rate = 55;
        stateTax = 0.04;
        federalTax =0.22;
        weeklyHours = 40;
        then output will be:
        your salary is: 105600 USD
        your total tax is: 27456 USD
        your income after tax is: 78144 USD

        if:
        rate = 45.25;
        stateTax =0.045;
        federalTax = 0.25;
        weeklyHours = 45;

        then output will be:
        your salary is: 91260 USD
        your total tax is: 26921.7
        your income after tax: 64338.3 USD
        */
    public static void main(String[] args) {
        // First it's required to declare the variables.
        // DataType variableName= Data;

        double hourlyRate = 55; //why double any number ex 32.9
        double stateTaxRate = 0.04;
        double federalTaxRate =0.22;
        byte weeklyHours = 40; // byte stores less memory and max number 127 so that's fit
        byte totalWeeksAYear = 52;

        // salary=hourlyRate * weeklyHours
        double salary= hourlyRate * weeklyHours * totalWeeksAYear; //Salary before tax

        // stateTax = salary * stateTaxRate
        double stateTax = salary * stateTaxRate;

        // federalTax = salary * federalTaxRate;
        double federalTax = salary * federalTaxRate;

       //totalTax = stateTax + federalTax
        double totalTax = stateTax + federalTax;

        // salaryAfterTax = salary - totalTax and we know that totalTax=(stateTax + federalTax )
        double salaryAfterTax = salary - (stateTax + federalTax );

        System.out.println("Your salary is: $" + salary +
               "\nYour state tax is: $" + stateTax + "\nYour federal tax is: $" + federalTax +
                "\nYour total tax is: $" + totalTax +
                "\nYour income after tax is: " + salaryAfterTax );

    }
}

