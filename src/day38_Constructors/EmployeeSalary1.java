package day38_Constructors;

public class EmployeeSalary1 {
    public static void main(String[] args) {
        SalaryCalculator1 fatih= new SalaryCalculator1(50,40,6.625,0.2);
        System.out.println(fatih);
        SalaryCalculator1 Namik = new SalaryCalculator1(62,40, 8.75/100, 0.26);
        System.out.println(Namik);
    }
}
