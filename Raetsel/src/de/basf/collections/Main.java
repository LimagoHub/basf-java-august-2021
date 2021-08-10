package de.basf.collections;

public class Main {

    public static void main(String[] args) {
	    new B();
	    new B();
    }
}

class A {

    static {
        System.out.println("static ctor");
    }
    public A () {
        System.out.println("Ctor A");
        foo();
    }

    public final void foo() {
        System.out.println("Hier ist foo von A");
    }
}

class B extends  A {
    public B () {
        super(); // Implicit
        System.out.println("Ctor B");
        foo();
    }

    public void foo() {
        System.out.println("Hier ist foo von B");
    }
}
