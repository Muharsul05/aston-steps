package ru.magarusik.first.hw01.Task1;

class Car extends Transport {

    private String color;
    private int year;
    private double weight;

    @Override
    void drive() {
        System.out.println("Машина поехала");
    }

    @Override
    void stop() {
        System.out.println("Машина остановилась");
    }

    void beep() {
        System.out.println("Бип бип бип");
    }

    @Override
    void showInfo() {
        System.out.println("Машина: 'name:' " + getName() +
                "\t'model:' " + getModel() +
                "\t'brand:' " + getBrand() +
                "\t'color:' " + getColor() +
                "\t'year:' " + getYear() +
                "\t'weight': " + getWeight()
        );
    }

    public Car(String brand, String name, String model, String color, int year, double weight) {
        super(brand, name, model);
        this.color = color;
        this.year = year;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}