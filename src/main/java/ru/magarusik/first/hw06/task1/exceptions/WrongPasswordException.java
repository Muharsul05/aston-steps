package ru.magarusik.first.hw06.task1.exceptions;

/**
 * Класс нужен для выбрасывания исключения при некорректном вводе пароля.
 */
public class WrongPasswordException extends Exception {

    /**
     * Конструктор по умолчанию
     */
    public WrongPasswordException() {
    }

    /**
     * Конструктор с сообщением исключения
     *
     * @param message сообщение исключения
     */
    public WrongPasswordException(String message) {
        super(message);
    }
}
