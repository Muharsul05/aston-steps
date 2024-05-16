package ru.magarusik.first.hw02.task1;

class Sedan extends Car {

    private LuxaryLevel luxuryLevel;

    public Sedan(FuelType fuelType, int numberOfDoors, int trunkCapacity, LuxaryLevel luxuryLevel) {
        super(fuelType, numberOfDoors, trunkCapacity);
        this.luxuryLevel = luxuryLevel;
    }

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
        System.out.println("Седан едет");
    }

    @Override
    public void stop() {
        System.out.println("Седан остановился");
    }

    @Override
    public FuelType getFuelType() {
        return super.getFuelType();
    }

    public LuxaryLevel getLuxuryLevel() {
        return luxuryLevel;
    }

    public void setLuxuryLevel(LuxaryLevel luxuryLevel) {
        this.luxuryLevel = luxuryLevel;
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "fuelType=" + getFuelType() +
                ", numberOfDoors=" + getNumberOfDoors() +
                ", trunkCapacity=" + getTrunkCapacity() +
                ", luxuryLevel=" + luxuryLevel +
                '}';
    }
}