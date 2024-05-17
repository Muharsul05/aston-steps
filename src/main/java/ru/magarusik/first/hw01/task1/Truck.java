package ru.magarusik.first.hw01.task1;

class Truck extends Transport {

    private double maxCarryWeight;

    public Truck(String brand, String name, String model, double maxCarryWeight) {
        super(brand, name, model);
        this.maxCarryWeight = maxCarryWeight;
    }

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

    public double getMaxCarryWeight() {
        return maxCarryWeight;
    }

    public void setMaxCarryWeight(double maxCarryWeight) {
        this.maxCarryWeight = maxCarryWeight;
    }
}
