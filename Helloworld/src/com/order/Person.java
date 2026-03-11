package com.order;

class Person {
    String name;
    Person(String name) {
        this.name = name;
    }
}

class Employee extends Person {

    int id;

    Employee(String name, int id) {
        super(name);   // initialize parent data
        this.id = id;
    }

    public static void main(String[] args) {
        Employee e = new Employee("Ganpat", 101);
        System.out.println(e.name + " " + e.id);
    }
}
