package com.amazon.order;
  public	class Balance {
		System.out.println("This will print at last");
	}

public class Funds extends Balance {
	Funds(){
		super();
		this(100);
		System.out.println("this will print at second");
	}
	Funds(int x){
		System.out.println("This will print first:" + x);
	}
	public static void main(String args[]) {
		Funds f = new Funds();
		System.out.println("This will print at last");
	}
}
