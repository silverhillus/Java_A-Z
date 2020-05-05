package day34_CustomClass;

public class Tester {
    /*
    create a class called Testers
			Attributes:
				name, employeeID, JobTitle, Salary

			Actions://Bank of America
				setTesterInfo(), smokeTesting(),  creatingTicket();
     */

    String name;
    long employeeID;
    String jobTitle;
    double salary;

    public void setTesterInfo(String name, long employeeID, String jobTitle, double salary){
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    public String toString(){
        return "Name: "+name+", EmployeeID: "+employeeID+", Job Title: "+jobTitle+", Salary: "+salary;
    }


}
