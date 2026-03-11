package com.orders;
import java.util.Scanner;
public class ControlFlow {
public static void main(String args[]) {
	int luckyNumber = 8;
	int userEntered = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("please enter the number....");
	while(userEntered != luckyNumber) {
		userEntered = sc.nextInt();
		if(userEntered != luckyNumber) {
			System.out.println("try again...");
		}
	}
	System.out.println("you won");
	sc.close();
}
}
