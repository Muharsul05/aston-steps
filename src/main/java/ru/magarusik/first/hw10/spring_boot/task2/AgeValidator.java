package ru.magarusik.first.hw10.spring_boot.task2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Magarusik.
 */
@SpringBootApplication
public class AgeValidator {

    /**
     * Запуск приложения для проверки возраста.
     *
     * @param args Аргументы для запуска приложения.
     */
    public static void main(String[] args) {
        SpringApplication.run(AgeValidator.class, args);
    }
}
