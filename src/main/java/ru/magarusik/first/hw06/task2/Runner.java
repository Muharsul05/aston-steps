package ru.magarusik.first.hw06.task2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Runner {

    private static final String FILE_NAME = "tms.txt";
    private static final Logger LOGGER = Logger.getLogger(Runner.class.getName());
    private static final Level DEFAULT_LOGGER_LEVEL = Level.INFO;

    public static void main(String[] args) {

        LOGGER.setLevel(DEFAULT_LOGGER_LEVEL);

        List<String> strings = new ArrayList<>();

        inputStringsInConsole(strings);

        LOGGER.info(("\nСтроки записываются в файл: " + FILE_NAME));
        writeStringsToFile(strings);

        LOGGER.info("\nСтроки считываются из файла: " + FILE_NAME);
        readStringsFromFile(strings);

        strings.forEach(LOGGER::info);
    }

    /**
     * Метод для ввода строк с консоли и добавления их в список строк до тех пор, пока не будет введено exit.
     *
     * @param strings список строк
     */
    private static void inputStringsInConsole(List<String> strings) {
        LOGGER.warning("Введите строки и если нужно выйти, то напишите exit:");
        try (var scanner = new Scanner(System.in)) {
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
