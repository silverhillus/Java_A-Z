package day03_VariablesContinue;

public class SalaryTest {
/* Task 08:
        Create a class called salary calculator, write a program that can calculate the tax, and salary after tax based on the hourly rate & tax rates
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
        your income after tax: 64338.3 USD */

    public static void main(String[] args) {

        float hourlyRate = 50f;
        double stateTaxRate= 0.04;
        double federalTaxRate =0.22;
        byte weeklyHours = 40;
        byte weeksAYear = 52;

        double salary = hourlyRate * weeklyHours * weeksAYear;
        double stateTax = salary * stateTaxRate;
        double federalTax = salary * federalTaxRate;

        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salary - totalTax;

        System.out.println("The salary is " + salary + "\nThe state tax is " + stateTax + "\nThe federal tax is "
                +federalTax + "\nThe total tax is " + totalTax + "\nThe salary after tax is " + salaryAfterTax);








    }

    }

