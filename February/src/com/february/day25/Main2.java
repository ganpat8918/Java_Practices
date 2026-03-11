package com.february.day25;
interface Printable{
	
}
class Report implements Printable{
	public void check(Object r) {
		if(r instanceof Printable) {
			System.out.println("Printable");
		}else {
			System.out.println("Non printable");
		}
	}
}
public class Main2 {

	public static void main(String[] args) {
		Object r = new Report();
		Report rep = new Report();
		rep.check(r);
	}

}
