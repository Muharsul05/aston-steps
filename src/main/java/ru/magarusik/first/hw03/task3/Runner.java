package ru.magarusik.first.hw03.task3;

import java.util.*;

public class Runner {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Введите 3 строки:");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();

        List<String> words = new ArrayList<>();
        addAllWordsToList(words, str1);
        addAllWordsToList(words, str2);
        addAllWordsToList(words, str3);

        for (String word : words) {
            if (isStringHasDifferentChars(word)) {
                System.out.println(word);
                break;
            }
        }
    }

    public static boolean isStringHasDifferentChars(String string) {
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

    public static void addAllWordsToList(List<String> words, String string) {
        Collections.addAll(words, string.split(" "));
    }
}