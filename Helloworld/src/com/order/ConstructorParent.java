package com.order;


class ConstructorParent {
    ConstructorParent() {
        System.out.println("Parent Constructor");
    }
}

 class Child extends ConstructorParent {

    public Child() {
        super();
        System.out.println("Child Constructor");
    }

    public static void main(String[] args) {
        new Child();
    }
}
