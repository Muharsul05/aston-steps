package ru.magarusik.first.hw01;

public class Task2 {
    public static void main(String[] args) {
        B b = new B();
    }
}

class A {
    public static final String A_CONST = "A_CONST";
    public final String A_FIELD = "A_FIELD";

    static {
        System.out.println("A static block");
        System.out.println(A_CONST);
    }

    {
        System.out.println("A non static block");
        System.out.println(A_FIELD);
    }

    public A() {
        System.out.println("A constructor");
    }

    public void showInfo() {
        System.out.println("A showInfo method");
    }

    public static void staticShowInfo() {
        System.out.println("A staticShowInfo method");
    }
}

class B extends A {
    public static final String B_CONST = "B_CONST";
    public final String B_FIELD = "B_FIELD";

    static {
        System.out.println("B static block");
        System.out.println(B_CONST);
    }

    {
        System.out.println("B non static block");
        System.out.println(B_FIELD);
    }

    public B() {
        System.out.println("B constructor");
    }

    public void showInfo() {
        System.out.println("B showInfo method");
    }

    public static void staticShowInfo() {
        System.out.println("B staticShowInfo method");
    }
}

