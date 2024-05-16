package ru.magarusik.first.hw01.task2;

class ChildB extends SuperA {

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

    public ChildB() {
        System.out.println("B constructor");
    }

    public void showInfo() {
        System.out.println("B showInfo method");
    }

    public static void staticShowInfo() {
        System.out.println("B staticShowInfo method");
    }
}
