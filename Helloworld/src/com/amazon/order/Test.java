package com.amazon.order;

class Test {

    Test() {
        this(100);
        System.out.println("Default constructor executed");
    }

    Test(int x) {
        System.out.println("Parameterized constructor executed: x = " + x);
    }

    public static void main(String[] args) {
        Test t = new Test();
    }
}
