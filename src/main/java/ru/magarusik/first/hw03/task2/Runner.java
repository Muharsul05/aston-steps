package ru.magarusik.first.hw03.task2;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Введите 3 строки:");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();

        int avgLength = (str1.length() + str2.length() + str3.length()) / 3;

        System.out.println("Средняя длина: " + avgLength);
        if (str1.length() < avgLength) System.out.println(str1 + " длина: " + str1.length());
        if (str2.length() < avgLength) System.out.println(str2 + " длина: " + str2.length());
        if (str3.length() < avgLength) System.out.println(str3 + " длина: " + str3.length());
    }
}