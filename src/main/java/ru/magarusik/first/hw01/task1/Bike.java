package ru.magarusik.first.hw01.task1;

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

    public void trick() {
        System.out.println("Велосипедист делает трюк");
    }

    public Bike(String brand, String name, String model, int maxSpeed) {
        super(brand, name, model);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
