package ru.magarusik.first.hw03.task1;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Введите 3 строки:");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();

        String max = str1.length() > str2.length() && str1.length() > str3.length() ? str1
                : str2.length() > str3.length() ? str2 : str3;

        String min = str1.length() < str2.length() && str1.length() < str3.length() ? str1
                : str2.length() < str3.length() ? str2 : str3;

        System.out.println("Максимальная строка: " + max + " длина: " + max.length());
        System.out.println("Минимальная строка: " + min + " длина: " + min.length());
    }
}