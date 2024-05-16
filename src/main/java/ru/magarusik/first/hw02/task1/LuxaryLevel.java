package ru.magarusik.first.hw02.task1;

enum LuxaryLevel {

    ECONOM("Эконом"),
    STANDARD("Стандарт"),
    COMFORT("Комфорт"),
    LUX("Люкс"),
    PREMIUM("Премиум");

    private final String name;

    LuxaryLevel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "LuxaryLevel{" +
                "name='" + name + '\'' +
                '}';
    }
}
