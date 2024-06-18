package ru.magarusik.first.hw10.spring_boot.task1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Magarusik.
 */
@SpringBootApplication
public class TimeApplication {

    /**
     * Запуск приложения для определения времени по часовому поясу.
     *
     * @param args Аргументы для запуска.
     */
    public static void main(String[] args) {
        SpringApplication.run(TimeApplication.class, args);
    }
}
