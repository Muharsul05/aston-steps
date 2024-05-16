package ru.magarusik.first.hw01.Task1;

abstract class Transport {
    private String brand;
    private String name;
    private String model;

    abstract void drive();

    abstract void stop();

    abstract void showInfo();

    public Transport(String brand, String name, String model) {
        this.brand = brand;
        this.name = name;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
