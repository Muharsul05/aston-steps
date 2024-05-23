package ru.magarusik.first.hw03.task2;

import ru.magarusik.first.hw03.Utils;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        List<String> list = Utils.inputStrings();

        long avgLength = getAvgLength(list);

        System.out.println("Средняя длина: " + avgLength);

        printStringIfLessThanAvgLength(list, avgLength);
    }

    private static long getAvgLength(List<String> list) {
        return (long) list.stream()
                .mapToInt(String::length)
                .average()
                .orElse(0L);
    }

    private static void printStringIfLessThanAvgLength(List<String> list, long avgLength) {
        list.stream()
                .filter(s -> s.length() < avgLength)
                .forEach(str -> System.out.println(str + " длина: " + str.length()));
    }
}