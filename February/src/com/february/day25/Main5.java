package com.february.day25;
interface Payment{
	public abstract int doCalculation(int a, int b);
}
public class Main5 {

	public static void main(String[] args) {
		Payment p = (i,j) ->{
			return i*j;
		};
		System.out.println(p.doCalculation(4, 5));
	}

}
