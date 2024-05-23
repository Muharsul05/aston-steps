package ru.magarusik.first.hw04.task3;

import java.util.HashSet;
import java.util.Set;

public class Runner {

    public static void main(String[] args) {
//        3.2
        Set<Person> persons = new HashSet<>();

//        3.3
        var ivan = new Person("Ivan", "Ivanov", 25);
        var petr = new Person("Petr", "Petrov", 27);
        var sidorov = new Person("Sidor", "Sidorov", 30);

        persons.add(ivan);
        persons.add(petr);
        persons.add(sidorov);

        System.out.println("\nВсе персоны в множестве: ");
        for (Person person : persons) {
            System.out.println(person);
        }

//        3.4
        System.out.println("\nСодержится ли Иван в множестве: " + persons.contains(ivan));

        persons.remove(ivan);
        persons.remove(petr);

        System.out.println("\nА теперь: " + persons.contains(ivan));

//        3.5
        System.out.println("\nСидоров в множестве: " + persons.contains(sidorov));
    }
}
