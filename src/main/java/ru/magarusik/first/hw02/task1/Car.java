package ru.magarusik.first.hw02.task1;

abstract class Car implements Vehicle {

    private FuelType fuelType;

    protected Car(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public abstract int getNumberOfDoors();

    public abstract int getTrunkCapacity();

    @Override
    public FuelType getFuelType() {
        return this.fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }
}
