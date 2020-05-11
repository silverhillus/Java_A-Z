package selfStudy;

public class CapitalOne {
    public static void main(String[] args) {
        //Create objects from BankAccount class
        BankAccount Fatih = new BankAccount();
        Fatih.accountHolder="Fatih";
        Fatih.accountNumber=10230078;
        Fatih.showBalance(); //0.0
        Fatih.withdraw(30);
        Fatih.showBalance(); // Not enough balance! //0.0
        Fatih.deposit(50); // 50.0
        Fatih.showBalance(); // 50.0
        System.out.println(Fatih);
        Fatih.withdraw(70); //70.0
        Fatih.showBalance(); //-55.0
        Fatih.withdraw(150); // Not enough balance!

        System.out.println(Fatih);



        BankAccount Filiz= new BankAccount();
        BankAccount Rosebud= new BankAccount();
    }
}
