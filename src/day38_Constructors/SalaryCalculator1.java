package day38_Constructors;

/*
Create class called SalaryCalculator
                instance variables:
                    hourlyRate, weeklyHours, stateTaxRate, fedralTaxRate

                add a constructor can initialize those fields

                instance methods:
                    salary(): returns the total salary as double  (hourlyRate * weeklyHours * 48)
                    salaryAftertax(): retuns the salary after tax as double ( salary - stateTax - federalTax)
                    stateTax(): retuns the total state tax as double ( salary * stateTaxRate)
                    federalTax(): retuns the total federal tax as double ( salary * fedralTaxRate)

                    toString(): returns the hourlyRate, weeklyHours and salary info as calculated by salary()

 */

public class SalaryCalculator1 {
    double hourlyRate;
    int weeklyHours;
    double stateTaxRate;
    double federalTaxRate;

    public SalaryCalculator1(double hourlyRate,int weeklyHours, double stateTaxRate, double federalTaxRate){
        this.hourlyRate=hourlyRate;
        this.weeklyHours=weeklyHours;
        this.stateTaxRate=stateTaxRate;
        this.federalTaxRate=federalTaxRate;

    }
    public double salary(){ // annual income
        return hourlyRate * weeklyHours * 48;
    }
    public double stateTax(){
        return salary() * stateTaxRate;
    }
    public double federalTax(){
        return salary() * federalTaxRate;
    }

    //salary after tax
    public double salaryAfterTax(){ // this on should be last after we initialize stateTax() and federalTax()
       return salary()-stateTax()-federalTax();
    }
    public String toString(){
        return  "Hourly Rate: $"+hourlyRate+
                "\nWeekly Hours: "+weeklyHours+
                "\nGross Salary: $"+salary()+
                "\nState Tax: $"+stateTax()+
                "\nFederal Tax: $"+ federalTax()+
                "\nNet Salary: $"+salaryAfterTax();
    }


}
