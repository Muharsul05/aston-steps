package ru.magarusik.first.hw01.task1;

import java.util.List;

class Runner {

    public static void main(String[] args) {
        var transportList = List.of(
                new Bike("Yamaha", "Bike Yamaha", "YZF-R1", 60),
                new Car("BMW", "Car X5", "X5", "Black", 3000, 2020),
                new Truck("Volvo", "Truck Volvo", "Road Xpeditor", 3000)
        );

        for (var transport : transportList) {
            System.out.println("\n____________________" + transport.getClass().getSimpleName() + "___________________");

            transport.showInfo();
            transport.drive();
            transport.stop();

            switch (transport) {
                case Car car -> car.beep();
                case Bike bike -> bike.trick();
                case Truck truck -> System.out.println(truck.canCarry(1000));
                default -> throw new IllegalStateException("Unexpected value: " + transport);
            }
        }
    }
}


