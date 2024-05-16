package ru.magarusik.first.hw02.task3;

public class Runner {

    public static void main(String[] args) {
        var computer = new Computer();

        var processor = new Computer.Processor("Intel");
        System.out.println("Модель процессора: " + processor.getDetails());

        var ram = computer.new RAM(16);
        System.out.println("Размер оперативной памяти: " + ram.getDetails());
    }
}
