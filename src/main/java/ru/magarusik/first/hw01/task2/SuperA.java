package ru.magarusik.first.hw01.task2;

class SuperA {
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

    public SuperA() {
        System.out.println("A constructor");
    }

    public void showInfo() {
        System.out.println("A showInfo method");
    }

    public static void staticShowInfo() {
        System.out.println("A staticShowInfo method");
    }
}
