package ru.magarusik.first.hw03.task4;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Введите строку для преобразования:");
        String str = scanner.nextLine();

        String doubleStr = doubleString(str);

        System.out.println(doubleStr);
    }

    public static String doubleString(String string) {
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