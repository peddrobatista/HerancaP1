package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccounts;

public class Program {
	
	public static void main(String[] args) {
		
		Account acc = new Account(101, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.00);
		
		// UPCASTING
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.00);
		Account acc3 = new SavingAccounts(1004, "Ana", 0.0, 0.01);
		acc1.getBalance(); // saldo da conta
		
		// DOWNCASTING 
		
		BusinessAccount acc4 = (BusinessAccount) acc2;
		
		// BusinessAccount acc5 = (BusinessAccount) acc3; // vai dar erro ao executar
		
		if (acc3 instanceof BusinessAccount) { // false
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("Loan");
		}
		
		if (acc3 instanceof SavingAccounts) { // true
			SavingAccounts acc5 = (SavingAccounts) acc3; 
			acc5.updateBalance();
			System.out.println("Update!");
		}
		acc4.loan(100.0);
	}

}
