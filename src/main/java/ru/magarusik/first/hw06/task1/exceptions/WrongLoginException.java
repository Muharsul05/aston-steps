package ru.magarusik.first.hw06.task1.exceptions;

/**
 * Класс нужен для выбрасывания исключения при некорректном вводе логина.
 */
public class WrongLoginException extends Exception {

    /**
     * Конструктор по умолчанию
     */
    public WrongLoginException() {
    }

    /**
     * Конструктор с сообщением исключения
     *
     * @param message сообщение исключения
     */
    public WrongLoginException(String message) {
        super(message);
    }
}
