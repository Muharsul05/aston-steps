package ru.magarusik.first.hw02.task1;

class Truck extends Car {

    private int maxLoadCapacity;

    @Override
    public int getNumberOfDoors() {
        return super.getNumberOfDoors();
    }

    @Override
    public int getTrunkCapacity() {
        return super.getTrunkCapacity();
    }

    @Override
    public void start() {
        System.out.println("Грузовик едет");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик остановился");
    }

    @Override
    public FuelType getFuelType() {
        return super.getFuelType();
    }

    public int getMaxLoadCapacity() {
        return maxLoadCapacity;
    }

    public void setMaxLoadCapacity(int maxLoadCapacity) {
        this.maxLoadCapacity = maxLoadCapacity;
    }

    public Truck(FuelType fuelType, int numberOfDoors, int trunkCapacity, int maxLoadCapacity) {
        super(fuelType, numberOfDoors, trunkCapacity);
        this.maxLoadCapacity = maxLoadCapacity;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "maxLoadCapacity=" + maxLoadCapacity +
                ", fuelType=" + super.getFuelType() +
                ", numberOfDoors=" + super.getNumberOfDoors() +
                ", trunkCapacity=" + super.getTrunkCapacity() +
                '}';
    }
}
