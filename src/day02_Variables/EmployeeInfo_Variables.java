package day02_Variables;

public class EmployeeInfo_Variables {
    public static void main(String[] args) {
        /*
        create a class called EmployeeInfo_Variables:
            print:
                your company's name
                your name
                your EmployeeId
                your JobTitle
                your Salary
         */

        String employeeName="Fatih";
        String companyName="Google";
        int employeeId= 9;
        String jobTitle="Developer";
        double salary= 110000.99;
        long ssn= 1235813;
        //

        System.out.println("Employee Name: " +employeeName );
        System.out.println("Company Name: " +companyName );
        System.out.println("Employee Id: " + employeeId);
        System.out.println("Job Title: "+jobTitle);
        System.out.println("Salary: "+ salary);
        System.out.println("SSN: "+ ssn);
        // one single statement. \n  has to be in " " and  + in between each statement

        System.out.println("Employee Name: " +employeeName +"\nCompany Name: " +companyName +"\nEmployee Id: " + employeeId +
                "\nJob Title: "+jobTitle +"\nSalary: "+ salary +"\nSSN: "+ ssn );

        // one more practice firstName and lastName
        String firstName= "Albert"; // it has to be in "Albert"
        String lastName= "Einstein";
        System.out.println("His first name is "+firstName + " and his last name is "+ lastName );



    }
}
