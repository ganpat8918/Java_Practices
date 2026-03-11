package com.february.day17;
interface Payments
{
	public abstract void add();
	public abstract void sub();
	public static void percent()
	{
		System.out.println("percent");
	}
	public default void sqaure()
	{
		System.out.println("default");
	}
}
class Trans implements Payments
{
	public  void add()
	{
		System.out.println("add");
	    Payments.percent();
		sub();
	}
	public  void sub()
	{
		System.out.println("substract");
	}
}
public class Banks {

	public static void main(String[] args) {
		Trans s1=new Trans();
		s1.add();
		s1.sqaure();
		//s1.percent();
		
	}

}
