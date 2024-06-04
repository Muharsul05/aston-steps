package ru.magarusik.first.hw02.task1;

class Sedan extends Car {

    private int numberOfDoors;
    private int trunkCapacity;
    private LuxaryLevel luxuryLevel;

    public Sedan(FuelType fuelType, int numberOfDoors, int trunkCapacity, LuxaryLevel luxuryLevel) {
        super(fuelType);
        this.numberOfDoors = numberOfDoors;
        this.trunkCapacity = trunkCapacity;
        this.luxuryLevel = luxuryLevel;
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
    public int getNumberOfDoors() {
        return this.numberOfDoors;
    }

    @Override
    public int getTrunkCapacity() {
        return this.trunkCapacity;
    }

    public LuxaryLevel getLuxuryLevel() {
        return luxuryLevel;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void setTrunkCapacity(int trunkCapacity) {
        this.trunkCapacity = trunkCapacity;
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