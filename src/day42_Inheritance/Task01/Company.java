package day42_Inheritance.Task01;
/*
create a class called company:
                    create 3 objects of employee and set thier info
                    create an array of employees and store all those employee objects
                    use regular for loop to print out each employee' name and employeeID

 */

public class Company {

    //initialised 3 objects as static
    public static Employee employee1 = new Employee();
    public static Employee employee2 = new Employee();
    public static Employee employee3 = new Employee();

    static{

        employee1.setEmployeeInfo("Messi", 32, 'M', 140_000, 13654,"SDET");

        employee2.setEmployeeInfo("Aigerim", 18, 'F', 130_000, 65654,"QA");

        employee3.setEmployeeInfo("Safar", 25, 'M', 128_000, 6599,"BA");

    }

    public static void main(String[] args) {

        Employee[] employees = {employee1, employee2, employee3};

        for(int i =0; i < employees.length; i++){
           // System.out.println(employees[i]);
            System.out.println("Name: "+ employees[i].name +", ID: "+ employees[i].employeeID );
        }


    }



}
