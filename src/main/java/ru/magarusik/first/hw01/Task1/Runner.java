package ru.magarusik.first.hw01.Task1;

import java.util.List;

class Runner {

    public static void main(String[] args) {
        var transportList = List.of(
                new Bike("Yamaha", "Bike Yamaha", "YZF-R1", 60),
                new Car("BMW", "Car X5", "X5", "Black", 3000, 2020),
                new Truck("Volvo", "Truck", "Road Xpeditor", 3000)
        );

        for (var transport : transportList) {
            transport.showInfo();
            switch (transport) {
                case Car car -> {
                    car.drive();
                    car.stop();
                    car.beep();
                }
                case Bike bike -> {
                    bike.drive();
                    bike.stop();
                }
                case Truck truck -> {
                    truck.drive();
                    truck.stop();
                    System.out.println(truck.canCarry(1000));
                }
                default -> throw new IllegalStateException("Unexpected value: " + transport);
            }
        }

    }
}


