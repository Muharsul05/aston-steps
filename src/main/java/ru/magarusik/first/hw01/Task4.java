package ru.magarusik.first.hw01;

public class Task4 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Add");
        System.out.println(calculator.add(1, 2));
        System.out.println(calculator.add(1, 2.0));
        System.out.println(calculator.add(1.0f, 2.0));
        System.out.println(calculator.add(1.0f, 2.0f));

        System.out.println("Sub");
        System.out.println(calculator.sub(10, 7));
        System.out.println(calculator.sub(14.0, 9.0));
        System.out.println(calculator.sub(1.0f, 2.0));
        System.out.println(calculator.sub(1.0f, 2.0f));

        System.out.println("Mul");
        System.out.println(calculator.mul(10, 7));
        System.out.println(calculator.mul(14.0, 9.0));
        System.out.println(calculator.mul(1.0f, 2.0));
        System.out.println(calculator.mul(1.0f, 2.0f));

        System.out.println("Div");
        System.out.println(calculator.div(10, 7));
        System.out.println(calculator.div(14.0, 9.0));
        System.out.println(calculator.div(1.0f, 2.0));
        System.out.println(calculator.div(1.0f, 2.0f));
    }
}

class Calculator {
    // Add
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public float add(float a, float b) {
        return a + b;
    }

    // Sub
    public int sub(int a, int b) {
        return a - b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public float sub(float a, float b) {
        return a - b;
    }

    // Mul
    public int mul(int a, int b) {
        return a * b;
    }

    public double mul(double a, double b) {
        return a * b;
    }

    public float mul(float a, float b) {
        return a * b;
    }

    // Div
    public int div(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        return a / b;
    }

    public double div(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        return a / b;
    }

    public float div(float a, float b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        return a / b;
    }
}
