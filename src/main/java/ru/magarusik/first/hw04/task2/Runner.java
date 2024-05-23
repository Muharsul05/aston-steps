package ru.magarusik.first.hw04.task2;

import ru.magarusik.first.hw04.task1.Country;

import java.util.LinkedList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
//        2.1
        List<Country> countries = new LinkedList<>();

//        2.2
        countries.addFirst(new Country("Belarus", "Minsk", "Belarusian", "BYN", 9, 10));
        countries.addFirst(new Country("Russia", "Moscow", "Russian", "RUB", 144, 17.098));

        countries.addLast(new Country("China", "Beijing", "Chinese", "CNY", 1_138, 9.596));
        countries.addLast(new Country("USA", "Washington", "English", "USD", 327, 9.984));
//        2.3
        countries.removeFirst();
        countries.removeLast();

//        2.4
        System.out.println("Первый элемент: " + countries.getFirst());
        System.out.println("Последний элемент: " + countries.getLast());
    }
}
