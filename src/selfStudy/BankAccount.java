package selfStudy;

public class BankAccount {
    /*
    Create a custom class for BankAccount
	attributes/data that can have are:
					1. AccountHolder, 2. AccountNumber, 3. Balance
		Actions: showBalance, deposit, withdraw
		requiremnts:
			1. user should be able to deposit money into their account
			2. user should be able to withdraw money from their account
					2.1 if the withdrawing account is greater than available balance, 35$ penalty charge will be added
					2.2 if the balance is less than or equal to 0, user should not be able to withdraw money
			3. user should be able to see their balance
     */

    //Attributes/data >> instance variables
    String accountHolder;
    long accountNumber;
    double balance;

    //Methods
    public void showBalance(){ // user should be able to see their balance
        System.out.println("Balance: "+balance);
    }
    public void deposit(double amount){ // user should be able to deposit money into their account
        System.out.println("Deposit: "+amount);
        balance+=amount;
    }
    public void withdraw(double amount){ // user should be able to withdraw money from their account
        System.out.println("Withdraw: "+amount);
        if (amount>balance && balance>0){ // if the withdrawing account is greater than available balance, 35$ penalty charge will be added
            balance-=(amount+35);
        }else if (balance<=0){ //if the balance is less than or equal to 0, user should not be able to withdraw money
            System.out.println("Not enough balance!");
        }else {
            balance -= amount;
        }
    }
    public String toString(){
        return "Account Holder: "+accountHolder+", Account Number: "+accountNumber+", Balance: "+balance;
    }

}
