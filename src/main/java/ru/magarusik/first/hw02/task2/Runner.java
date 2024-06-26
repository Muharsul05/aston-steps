package ru.magarusik.first.hw02.task2;

import java.util.ArrayList;
import java.util.List;

class Runner {

    public static void main(String[] args) {
        System.out.println("____________Immutable_Person_____________");
        var immutablePerson = new ImmutablePerson("John", 25,
                new ArrayList<>(List.of("music", "sport", "programming")));

        System.out.println(immutablePerson);

        System.out.println("\n____________Mutable_Person_____________");
        var mutablePerson = new MutablePerson("John", 25,
                List.of("music", "sport", "programming"));

        System.out.println(mutablePerson);

        mutablePerson.setName("Doe");
        mutablePerson.setAge(30);
        mutablePerson.setHobbies(List.of("sport", "programming"));

        System.out.println(mutablePerson);
    }
}
