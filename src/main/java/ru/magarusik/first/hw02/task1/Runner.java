package ru.magarusik.first.hw02.task1;

class Runner {

    public static void main(String[] args) {

        System.out.println("________________Truck___________________");
        var truck = new Truck(FuelType.GASOLINE, 5,
                1000, 2000);
        truck.start();
        System.out.println("Количество дверей: " + truck.getNumberOfDoors());
        System.out.println("Максимальная грузоподъемность: " + truck.getMaxLoadCapacity());
        System.out.println("Тип топлива: " + truck.getFuelType());
        System.out.println("Ёмкость багажника: " + truck.getTrunkCapacity());
        truck.stop();

        System.out.println("\n________________Sedan___________________");
        var sedan = new Sedan(FuelType.DIESEL, 5,
                1000, LuxaryLevel.PREMIUM);
        sedan.start();
        System.out.println("Количество дверей: " + sedan.getNumberOfDoors());
        System.out.println("Комплектация: " + sedan.getLuxuryLevel());
        System.out.println("Тип топлива: " + sedan.getFuelType());
        System.out.println("Ёмкость багажника: " + sedan.getTrunkCapacity());
        sedan.stop();

        System.out.println("\n_____________Vehicle_Sedan_______________");
        Vehicle vehicleSedan = sedan;
        vehicleSedan.start();
        System.out.println(vehicleSedan.getFuelType());
        vehicleSedan.stop();

        System.out.println("\n_____________Vehicle_Truck_______________");
        Vehicle vehicleTruck = truck;
        truck.start();
        System.out.println(truck.getFuelType());
        truck.stop();
    }
}
