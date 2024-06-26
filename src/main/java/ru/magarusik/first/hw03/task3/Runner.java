package ru.magarusik.first.hw03.task3;

import ru.magarusik.first.hw03.Utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        List<String> strings = Utils.inputStrings();
        List<String> words = new ArrayList<>();

        strings.forEach(string -> addAllWordsToList(words, string));

        words.stream()
                .filter(Runner::isStringHasDifferentChars)
                .findFirst()
                .ifPresent(System.out::println);
    }

    private static boolean isStringHasDifferentChars(String string) {
        if (string.isEmpty()) {
            return false;
        }

        var set = new HashSet<Character>();

        for (char c : string.toCharArray()) {
            if (set.contains(c)) {
                return false;
            }
            set.add(c);
        }

        return true;
    }

    private static void addAllWordsToList(List<String> words, String string) {
        Collections.addAll(words, string.split(" "));
    }
}