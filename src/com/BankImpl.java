package com;

class BankImpl implements Bank{
	int balance =5000;

	@Override
	public void deposit(int amount) {
		System.out.println("Depositing Rs."+amount);
		balance=balance+amount;
		System.out.println("Amount Successfully Deposited");
	}

	@Override
	public void withdraw(int amount) {
		if(amount<=balance) {
			System.out.println("Withrawing Rs."+amount);
			balance=balance-amount;//balance-=amount;
			System.out.println("Amount Successfully Withdrawn");
		}
		else
			System.out.println("Insufficient balance");
	}

	@Override
	public void checkBalance() {
		System.out.println("Available balance is "+balance);
	}
}
