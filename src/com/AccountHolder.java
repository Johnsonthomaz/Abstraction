package com;

class AccountHolder {
public static void main(String[] args) {
	
	//UPCASTING
	Bank b= new BankImpl();
	
	
	b.checkBalance();
	System.out.println("-------");
	
	b.deposit(2000);
	b.checkBalance();
	System.out.println("--------");
	
	b.withdraw(40000);
	b.checkBalance();
	System.out.println("--------");
	
	b.withdraw(2000);
	b.checkBalance();
}
}
