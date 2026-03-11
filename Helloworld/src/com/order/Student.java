package com.order;

class Student {

    String name;
    int age;

    Student(String name) {
        this(name, 18);   // default age
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Student s = new Student("Ganpat");
        System.out.println(s.name + " " + s.age);
    }
}
