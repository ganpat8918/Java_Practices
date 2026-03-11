package com.order;
class Test {

    Test() {
        this(10);   // calls parameterized constructor
        System.out.println("Default Constructor");
    }

    Test(int x) {
        System.out.println("Parameterized Constructor: " + x);
    }

    public static void main(String[] args) {
        new Test();
    }
}
