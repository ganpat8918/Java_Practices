package com.students.classtest;

public class Test {
	String name;
	int rollNo;
	int subject1;
	int subject2;
	int subject3;

	Test(String _name, int _rollNo, int _subject1, int _subject2, int _subject3) {
		name = _name;
		rollNo = _rollNo;
		subject1 = _subject1;
		subject2 = _subject2;
		subject3 = _subject3;
}
	void display() {
		System.out.println("Name is :" + name);
		System.out.println("Roll NO : " + rollNo);
		System.out.println("English :" + subject1);
		System.out.println("Maths : " + subject2);
		System.out.println("Science :" + subject3);
		System.out.println("___________________");
	}

}
