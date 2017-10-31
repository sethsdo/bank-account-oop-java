package com.codingdojo.bankaccount;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account1 = new BankAccount();
		
		//Check Balance
		System.out.println(account1.getCheckBalance());
		System.out.println(account1.getSaveBalance());
		
		//Deposit
		account1.deposit(25.00, "savings");
		account1.deposit(25.00, "checking");
		
		//withdraw
		account1.withdraw(16.55, "savings");
		account1.withdraw(11.55, "checking");
		
		//Total Amount
		account1.totallAmount();
		
		
	}

}
