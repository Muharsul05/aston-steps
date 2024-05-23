package ru.magarusik.first.hw04.task1;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
//        1.1
        List<Country> countries = new ArrayList<>();
        System.out.println("Пустой список стран: " + countries);


        Country belarus = new Country("Belarus", "Minsk", "Belarusian", "BYN", 9, 10);

//        1.2
        countries.add(belarus);
        countries.add(new Country("Poland", "Warsaw", "Polish", "PLN", 38, 1.5));
        countries.add(new Country("Germany", "Berlin", "German", "EUR", 83, 1.5));

        System.out.println("\nДобавили 3 страны: ");
        printCountries(countries);

//        1.3
        countries.set(1, new Country("USSR", "Moscow", "Russian", "RUB", 144, 17.098));

        System.out.println("\nЗаменил Польшу на СССР: ");
        printCountries(countries);

//        1.4
        countries.remove(1);
        System.out.println("\nУдалил СССР: ");
        printCountries(countries);

//        1.5
        countries.remove(belarus);
        System.out.println("\nУдалили Беларусь: ");
        printCountries(countries);

        countries.addAll(List.of(
                new Country("Russia", "Moscow", "Russian", "RUB", 144, 17.098),
                new Country("USA", "Washington", "English", "USD", 327, 9.984),
                new Country("China", "Beijing", "Chinese", "CNY", 1_138, 9.596),
                new Country("Canada", "Ottawa", "English", "CAD", 35, 9.984),
                new Country("Australia", "Sydney", "English", "AUD", 23, 7.741),
                new Country("Brazil", "Brasilia", "Portuguese", "BRL", 21, 8.515),
                new Country("Belarus", "Minsk", "Belarusian", "BYN", 9, 10),
                new Country("India", "New Delhi", "Hindi", "INR", 1_150, 3.287)
        ));

        System.out.println("\nДобавили еще 7 стран: ");
        printCountries(countries);

//        1.6
        System.out.println("\nИндекс Беларуси: " + countries.indexOf(belarus));

//        1.7
        System.out.println("\nЕсть ли Беларусь в списке стран: " + countries.contains(belarus));
    }

    private static void printCountries(List<Country> countries) {
        for (Country country : countries) {
            System.out.println(country);
        }
    }
}
