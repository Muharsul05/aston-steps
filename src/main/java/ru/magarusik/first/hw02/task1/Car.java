package ru.magarusik.first.hw02.task1;

abstract class Car implements Vehicle {

    private FuelType fuelType;
    private int numberOfDoors;
    private int trunkCapacity;

    protected Car(FuelType fuelType, int numberOfDoors, int trunkCapacity) {
        this.fuelType = fuelType;
        this.numberOfDoors = numberOfDoors;
        this.trunkCapacity = trunkCapacity;
    }


    @Override
    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getTrunkCapacity() {
        return trunkCapacity;
    }

    public void setTrunkCapacity(int trunkCapacity) {
        this.trunkCapacity = trunkCapacity;
    }
}
