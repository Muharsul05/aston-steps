package ru.magarusik.first.hw01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

public class Task1 {
    /*
    Для уменьшения бойлерплейта было решено добавить lombok в проект
    для упрощения и читаемости кода.
     */
    public static void main(String[] args) {
        var transportList = List.of(
                Bike.builder().brand("Yamaha")
                        .name("Yamaha")
                        .model("YZF-R1")
                        .maxSpeed(60)
                        .build(),
                Car.builder().brand("BMW")
                        .model("X5")
                        .name("X5")
                        .color("Black")
                        .weight(3000)
                        .year(2020)
                        .build()
                , Truck.builder().brand("Volvo")
                        .name("Truck")
                        .model("Road Xpeditor")
                        .maxCarryWeight(3000)
                        .build()


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

@Data
@SuperBuilder
@NoArgsConstructor
abstract class Transport {
    private String brand;
    private String name;
    private String model;

    abstract void drive();

    abstract void stop();

    abstract void showInfo();
}

@Data
@AllArgsConstructor
@SuperBuilder
class Car extends Transport {
    private String color;
    private int year;
    private double weight;


    @Override
    void drive() {
        System.out.println("Машина поехала");
    }

    @Override
    void stop() {
        System.out.println("Машина остановилась");
    }

    void beep() {
        System.out.println("Бип бип бип");
    }

    @Override
    void showInfo() {
        System.out.println("Машина: 'name:' " + getName() +
                "\t'model:' " + getModel() +
                "\t'brand:' " + getBrand() +
                "\t'color:' " + getColor() +
                "\t'year:' " + getYear() +
                "\t'weight': " + getWeight()
        );
    }
}

@Data
@SuperBuilder
class Bike extends Transport {
    private int maxSpeed;

    @Override
    void drive() {
        System.out.println("Велосипед едет");
    }

    @Override
    void stop() {
        System.out.println("Велосипед остановился");
    }

    @Override
    void showInfo() {
        System.out.println("Байк: 'name:' " + getName() +
                "\t'model:' " + getModel() +
                "\t'brand:' " + getBrand() +
                "\t'maxSpeed:' " + getMaxSpeed()
        );
    }
}

@Data
@SuperBuilder
class Truck extends Transport {
    private double maxCarryWeight;

    @Override
    void drive() {
        System.out.println("Грузовик едет");
    }

    @Override
    void stop() {
        System.out.println("Грузовик остановился");
    }

    @Override
    void showInfo() {
        System.out.println("Грузовик: 'name:' " + getName() +
                "\t'model:' " + getModel() +
                "\t'brand:' " + getBrand() +
                "\t'maxCarryWeight:' " + getMaxCarryWeight()
        );
    }

    boolean canCarry(double weight) {
        return weight <= maxCarryWeight;
    }
}
