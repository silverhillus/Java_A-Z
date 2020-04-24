package day11_Scanner;
/*

Task: Scanner_Practice1
    1. ask the user enter first name
    2. ask user to enter last name
    3. ask the user employeed or not? true ==> employeed, false ==> unemployeed
    4. if he is employeed , ask the salary
    4. if he is not employeed set the salary to 0
    output:
        full name:
        employeeed status:
        salary:

 */
import java.util.Scanner;

public class Scanner_Practice1 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firstName= input.next(); // next() ==> only accepts single word so
        System.out.println("Enter your last name:");
        String lastName= input.next();
        String fullName= firstName+" "+lastName;

        System.out.println("Are you employed or not");
        boolean employed= input.nextBoolean();
        double salary= 0;

        if (employed==true){
            System.out.println("What's your salary:");
             salary=input.nextDouble();
        }
        System.out.println("Full name is: " + fullName);
        System.out.println("Employment status: "+ employed);
        System.out.println("Your salary is: "+ salary);


    }
}
