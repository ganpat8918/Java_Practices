package com.february.day20;
abstract class BankAccount{
	abstract void deposit(int depositAmount);
	abstract void withdraw(int withdrawalAmount );
	
}
class SavingsAccount extends BankAccount{
	public void deposit(int depositAmount) {
		int balance = 100;
		balance = balance + depositAmount;
		System.out.println("Saving's New Balance after deposit is: " + balance);
	}
	public void withdraw(int withdrawalAmount) {
		int balance = 100;
		balance = balance - withdrawalAmount;
		System.out.println("Saving's New Balance after withdrawal is: " + balance);
	}
}
class CurrentAccount extends BankAccount{
	public void deposit(int depositAmount) {
		int balance = 100;
		balance = balance + depositAmount;
		System.out.println("Current's New Balance after deposit is: " + balance);
	}
	public void withdraw(int withdrawalAmount) {
		int balance = 100;
		balance = balance - withdrawalAmount;
		System.out.println("Current's New Balance after withdrawal is: " + balance);
	}
}
public class Problem3 {

	public static void main(String[] args) {
		SavingsAccount s =  new SavingsAccount();
		s.deposit(1000);
		
	}

}
