package com.february.day13;

public class Account {
	int interestRate;
	public static void main(String args[]) {
		Account a1 = new Account();
		a1.doTransfer(5);
		Account a2 = new SavingAccount();
		a2.doTransfer(3);
		Account a3 = new CurrentAccount();
		a3.doTransfer(0);
	}
	public void doTransfer(int interestRate)
	{
		this.interestRate = interestRate;
		System.out.println("Interest rate for Account is " + interestRate+"%");
	}
}
class SavingAccount extends Account{
	public void doTransfer(int interestRate) {
		this.interestRate = interestRate;
		System.out.println("Interest rate for SavingsAccount is " + interestRate+"%");
	}
}
class CurrentAccount extends Account{
	public void doTransfer(int interestRate) {
		this.interestRate = interestRate;
		System.out.println("Interest rate for CurrentAccount is " + interestRate+"%");
	}
}
