package com.february.day17;
	interface IPayment{
	public abstract	void payment();
	public abstract	void cancelTransaction();
		public static void sendNotification(){
			System.out.println("Transaction done!");
		}
		public default void sendEmail() {
	     System.out.println("Email received");
		}
	}
class StateBank implements IPayment{
	public void payment() {
		
		System.out.println("Payment done"  );
		cancelTransaction();
	}
	public void cancelTransaction() {
		System.out.println("Transaction cancelled");
		IPayment.sendNotification();
	}
}
class PunjabBank implements IPayment{
	public void payment() {
		System.out.println("Payment done");
		cancelTransaction();
	}
	public void cancelTransaction() {
		System.out.println("Transaction cancelled");
		IPayment.sendNotification();
		sendEmail();
	}
}
public class Transfer {
	public static void main(String args[]) {
		StateBank s1 =new StateBank();
		s1.payment();
		PunjabBank p1 = new PunjabBank();
		p1.payment();
	}
}
 
