package com.codingdojo.bankaccount;

import java.util.Random;

public class BankAccount {
	private String accountNumber;
	private double checkingBalance;
	private double savingsBalance;
	private static int numberOfAccounts = 0;
	private static double totalAmount;
	
	private String randomNumber() {
		Random rand = new Random();
		String accNum = "";
		int i = 0;
		while (i < 11) {
			accNum += (rand.nextInt(10) + 1);
			i++;
		}
		return accNum;
	}
	
	public BankAccount() {
		this.accountNumber = randomNumber();
		numberOfAccounts++;
	}
	
	public double getCheckBalance() {
		return this.checkingBalance;
	}
	public double getSaveBalance() {
		return this.savingsBalance;
	}
	
	public void deposit(Double amount, String account) {
		if (account == "savings") {
			this.checkingBalance += amount;
			System.out.println(this.checkingBalance);
		} else if (account == "checking") {
			this.savingsBalance += amount;
			System.out.println(this.savingsBalance);
		}
		else {
			System.out.println("There Seems to be an issue with your deposit.");
		}
	}
	
	public void withdraw(Double amount, String account) {
		if (account == "savings") {
			if(amount < this.checkingBalance) {
				this.checkingBalance -= amount;
				System.out.println(this.checkingBalance);
			}
			else {
				System.out.println("insufficient funds. Your balance is:" + this.checkingBalance );
			}
		} else if (account == "checking") {
			if(amount < this.savingsBalance) {
				this.savingsBalance -= amount;
				System.out.println(this.savingsBalance);
			}
			else {
				System.out.println("insufficient funds. Your balance is:" + this.savingsBalance );
			}
		}
		else {
			System.out.println("There Seems to be an issue with your withdrawal.");
		}
	}
	
	public void totallAmount() {
		System.out.println("You have in Savings: " + this.savingsBalance);
		System.out.println("You have in Checking: " + this.checkingBalance);
	}
	
	
	
}
