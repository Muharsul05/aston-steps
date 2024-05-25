package ru.magarusik.first.hw03;

import java.util.List;
import java.util.Scanner;

public class Utils {

    private static final Scanner scanner = new Scanner(System.in);

    public static List<String> inputStrings() {
        System.out.println("Введите 3 строки:");
        return List.of(scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
    }

    public static String inputString() {
        System.out.println("Введите строку для преобразования:");
        return scanner.nextLine();
    }
}
