package day11_Scanner;
/* warmup task:
        1. Wash Your hands
        2. write a program that can calculate the salary after tax
                needed informations:
                                employee' salaray
                                state tax
                                federal tax


 */

import java.util.Scanner;

public class Scanner_WTask_Salary {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your salary:");
        int employeeSalary= input.nextInt();
        System.out.println("Enter the state tax rate:");
        double stateTaxRate=input.nextDouble();
        System.out.println("Enter the federal state tax rate:");
        double federalTaxRate=input.nextDouble();
        double stateTax= employeeSalary*stateTaxRate;
        double federalTax=employeeSalary*federalTaxRate;
        double salaryAfterTax=employeeSalary-(stateTax+federalTax);
        System.out.println("The salary after the tax is " +salaryAfterTax );


    }
}
