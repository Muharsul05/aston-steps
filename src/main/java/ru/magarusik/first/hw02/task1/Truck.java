package ru.magarusik.first.hw02.task1;

class Truck extends Car {

    private int numberOfDoors;
    private int trunkCapacity;
    private int maxLoadCapacity;

    public Truck(FuelType fuelType, int numberOfDoors, int trunkCapacity, int maxLoadCapacity) {
        super(fuelType);
        this.numberOfDoors = numberOfDoors;
        this.trunkCapacity = trunkCapacity;
        this.maxLoadCapacity = maxLoadCapacity;
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
    public int getNumberOfDoors() {
        return this.numberOfDoors;
    }

    @Override
    public int getTrunkCapacity() {
        return this.trunkCapacity;
    }

    public int getMaxLoadCapacity() {
        return this.maxLoadCapacity;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void setTrunkCapacity(int trunkCapacity) {
        this.trunkCapacity = trunkCapacity;
    }

    public void setMaxLoadCapacity(int maxLoadCapacity) {
        this.maxLoadCapacity = maxLoadCapacity;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "maxLoadCapacity=" + maxLoadCapacity +
                ", fuelType=" + getFuelType() +
                ", numberOfDoors=" + getNumberOfDoors() +
                ", trunkCapacity=" + getTrunkCapacity() +
                '}';
    }
}
