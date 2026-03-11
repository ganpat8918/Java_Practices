package com.february.day10;

 class Expense {
	public void expenses() {
		System.out.println("Your expenses are below : ");
	}
}
public class DriverExpense{
	public static void main(String args[]) {
		Expense main = new Expense();
		main.expenses();
		Expense e = new FoodExpense();
		Expense e2 = new DriverExpenses();
		e.expenses();
		e2.expenses();
		
	}
}
