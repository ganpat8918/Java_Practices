package com.amazon.order;
	class Student{
		int id;
		String name;
		Student (int _id){
			this(_id, "rahul");
		}
		Student(int _id,String _name){
			this.id = _id;
			this.name = _name;
		}
		public static void main(String args[]) {
			Student s1 = new Student(1,"ganesh");
			System.out.println(s1.id + "\n" + s1.name);
			Student s2 = new Student(2);
			System.out.println(s2.id +"\n" + s2.name);
		}
	}