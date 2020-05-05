package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class BankOfAmerica {
    public static void main(String[] args) {
        Tester tester1= new Tester();
        tester1.setTesterInfo("Fatih",12345678,"Senior SDET",100_000);
        //System.out.println(tester1); // Name: Fatih, EmployeeID: 12345678, Job Title: Smoke Tester, Salary: 100000.0
        Tester tester2= new Tester();
        tester2.setTesterInfo("Venera",234567834,"Senior SDET",150000 );
        Tester tester3= new Tester();
        tester3.setTesterInfo("Sha Rejepov",6235487,"QA",120000);
        Tester tester4= new Tester();
        tester4.setTesterInfo("Arnav",62354871,"Manual Tester",110000);
        Tester tester5= new Tester();
        tester5.setTesterInfo("John",2354874,"Office Boy",50000);

        ArrayList<Tester>testers= new ArrayList<>(Arrays.asList(tester1,tester2,tester3,tester4,tester5));
        //remove testers who are not SDET!
        testers.removeIf(p->!p.jobTitle.contains("SDET"));

        double totalBudget = 0;
        for (Tester each:testers){
            System.out.println(each);
            totalBudget += each.salary;
        }
        System.out.println(totalBudget);







    }
}
