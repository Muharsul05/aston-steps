package ru.magarusik.first.hw01;

public class Task3 {
    public static void main(String[] args) {
        Person personPrimitive = new Person();
        personPrimitive.age = 20;
        personPrimitive.name = "Alex";
        personPrimitive.surname = "Primitive";

        System.out.println(personPrimitive);

        Person personSetter = new Person();
        personSetter.setAge(30);
        personSetter.setName("Alex");
        personSetter.setSurname("Setter");

        System.out.println(personSetter);

        Person personConstructor = new Person("Alex", "Constructor", 40);

        System.out.println(personConstructor);

        PersonBuilder builder = new PersonBuilder();
        Person personBuilder = builder.builder()
                .name("Alex")
                .surname("Builder")
                .age(50)
                .build();

        System.out.println(personBuilder);
    }
}

class Person {
    public static String name;
    public static String surname;
    public static int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}

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

