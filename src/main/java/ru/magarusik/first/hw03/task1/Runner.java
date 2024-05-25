package ru.magarusik.first.hw03.task1;

import ru.magarusik.first.hw03.Utils;

import java.util.Comparator;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        List<String> strings = Utils.inputStrings();

        String max = getMaxStringByLength(strings);

        String min = getMinStringByLength(strings);

        System.out.println("Максимальная строка: " + max + " длина: " + max.length());
        System.out.println("Минимальная строка: " + min + " длина: " + min.length());
    }


    private static String getMaxStringByLength(List<String> list) {
        return list.stream()
                .max(Comparator.comparingInt(String::length))
                .orElseThrow(() -> new RuntimeException("Список пустой"));
    }

    private static String getMinStringByLength(List<String> list) {
        return list.stream()
                .min(Comparator.comparingInt(String::length))
                .orElseThrow(() -> new RuntimeException("Список пустой"));
    }
}