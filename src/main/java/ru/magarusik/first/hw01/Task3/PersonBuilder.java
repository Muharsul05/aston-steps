package ru.magarusik.first.hw01.Task3;

class PersonBuilder {
    private String name;
    private String surname;
    private int age;

    public PersonBuilder builder() {
        return this;
    }

    public PersonBuilder name(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder surname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder age(int age) {
        this.age = age;
        return this;
    }

    public Person build() {
        var person = new Person(name, surname, age);
        this.name = null;
        this.surname = null;
        this.age = 0;
        return person;
    }
}
