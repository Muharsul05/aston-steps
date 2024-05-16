package ru.magarusik.first.hw01.Task4;

class Runner {
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

