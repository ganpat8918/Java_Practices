class A {
    A() {
        System.out.println("Class A Constructor");
    }
}

class B extends A {

    B() {
        this(5);
        System.out.println("B Default Constructor");
    }

    B(int x) {
        super();
        System.out.println("B Parameterized Constructor: " + x);
    }

    public static void main(String[] args) {
        new B();
    }
}
