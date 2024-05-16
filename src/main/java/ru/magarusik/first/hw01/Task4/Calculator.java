package ru.magarusik.first.hw01.Task4;

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
