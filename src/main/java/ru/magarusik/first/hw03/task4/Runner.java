package ru.magarusik.first.hw03.task4;

import ru.magarusik.first.hw03.Utils;

public class Runner {

    public static void main(String[] args) {
        String str = Utils.inputString();

        String doubleStr = doubleString(str);

        System.out.println(doubleStr);
    }

    private static String doubleString(String string) {
        var stringBuilder = new StringBuilder();

        for (var c : string.toCharArray()) {
            if (Character.isLetter(c)) {
                stringBuilder.append(c);
            }
            stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }
}