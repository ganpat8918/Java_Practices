package com.students.classtest;

public class Payment {
	int transactionNo;
	String senderName;
	String receiverName;
	int transactionAmount;
	String transactionRemarks;
	
	public Payment(int _transactionNo, String _senderName, String _receiverName, int _transactionAmount, String _transactionRemarks){
		transactionNo = _transactionNo;
		senderName = _senderName;
		receiverName = _receiverName;
		transactionAmount = _transactionAmount;
		transactionRemarks = _transactionRemarks;
		System.out.println("Transaction :" + transactionNo + "\nFrom :" + senderName + "\nTo :" + receiverName + "\nAmount :" + transactionAmount + "\nPurpose :" + transactionRemarks);
		System.out.println("_____________________________________________________________");
	}
	public static void main(String[] args) {
		Payment p1 = new Payment(001, "Bhulu", "Ganesh", 555, "Food");
		Payment p2 = new Payment(002, "Rahul", "Gunjan", 456, "Shopping");
		Payment p3 = new Payment(003, "Abhishek", "Akash", 800, "Travel");
	}

}
