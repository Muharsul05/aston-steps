package ru.magarusik.first.hw02.task1;

enum FuelType {

    GAS("Газ"),
    GASOLINE("Бензин"),
    DIESEL("Дизель"),
    ELECTRIC("Электричество");

    private final String name;

    FuelType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "FuelType{" +
                "name='" + name + '\'' +
                '}';
    }
}
