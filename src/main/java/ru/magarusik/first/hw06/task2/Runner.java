package ru.magarusik.first.hw06.task2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {

    private static final String FILE_NAME = "tms.txt";

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        inputStringsInConsole(strings);

        System.out.println("\nСтроки записываются в файл: " + FILE_NAME);
        writeStringsToFile(strings);

        System.out.println("\nСтроки считываются из файла: " + FILE_NAME);
        readStringsFromFile(strings);

        strings.stream().forEach(System.out::println);
    }

    /**
     * Метод для ввода строк с консоли и добавления их в список строк до тех пор, пока не будет введено exit.
     *
     * @param strings список строк
     */
    private static void inputStringsInConsole(List<String> strings) {
        System.out.println("Введите строки и если нужно выйти, то напишите exit:");
        try (var scanner = new Scanner(System.in);) {
            String str = scanner.nextLine();
            while (!str.equalsIgnoreCase("exit")) {
                strings.add(str + "\n");
                str = scanner.nextLine();
            }
        }
    }

    /**
     * Метод для записи списка строк в файл.
     *
     * @param strings список строк
     */
    private static void writeStringsToFile(List<String> strings) {
        try (var fos = new FileOutputStream(FILE_NAME)) {
            for (String string : strings) {
                fos.write(string.getBytes());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Метод для считывания списка строк из файла.
     *
     * @param strings список строк
     */
    private static void readStringsFromFile(List<String> strings) {
        strings.clear();
        try (var fis = new FileInputStream(FILE_NAME)) {
            strings.add(new String(fis.readAllBytes()).replace(" ", "_"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
