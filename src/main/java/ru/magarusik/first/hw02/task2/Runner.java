package ru.magarusik.first.hw02.task2;

import java.util.List;

class Runner {

    public static void main(String[] args) {

        System.out.println("____________Immutable_Person_____________");
        var immutablePerson = new ImmutablePerson("John", 25,
                List.of("music", "sport", "programming"));

//        Unsupported operations:
//        immutablePerson.name = "Doe";
//        immutablePerson.age = 30;
//        immutablePerson.hobbies = List.of("sport", "programming");
//        immutablePerson.hobbies.add("travel");
//        immutablePerson.hobbies.remove("music");
//        Даже idea предлагает класс ImmutablePerson превратить в запись (record Java 14).

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
