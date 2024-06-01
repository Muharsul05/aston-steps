package ru.magarusik.first.hw06.task1;

import ru.magarusik.first.hw06.task1.exceptions.WrongLoginException;
import ru.magarusik.first.hw06.task1.exceptions.WrongPasswordException;

/**
 * Класс проверяет логин и пароль введенные пользователем.
 */
public class Validator {

    /**
     * Переопределил конструктор по умолчанию и сделал приватным для чтобы не создавать объекты этого класса.
     */
    private Validator() {
    }

    /**
     * Метод проверяет логин и пароль. Если login не соответствует требованиям то, выбрасывает WrongLoginException.
     * Если password не соответствует требованиям то, выбрасывает WrongPasswordException.
     *
     * @param login           логин
     * @param password        пароль
     * @param confirmPassword подтверждение пароля
     * @return true, если значения верны, false в противном случае
     * @throws WrongLoginException    если логин некорректен
     * @throws WrongPasswordException если пароль некорректен
     * @see WrongLoginException
     * @see WrongPasswordException
     */
    public static boolean validate(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

        validateLogin(login);
        validatePassword(password);

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают: " + password + " и " + confirmPassword);
        }

        return true;
    }

    /**
     * В этом методе проверяется корректность ввода логина. Если логин некорректен выбрасывается исключение
     *
     * @param login Логин пользователя
     * @throws WrongLoginException Если логин некорректен выбрасывается исключение
     */
    private static void validateLogin(String login) throws WrongLoginException {
        if (validateString(login)) {
            throw new WrongLoginException(generateErrorMessage(login, "Логин"));
        }
    }

    /**
     * В этом методе проверяется корректность ввода пароля. Если пароль некорректен выбрасывается исключение
     *
     * @param password Пароль пользователя
     * @throws WrongPasswordException Если пароль некорректен выбрасывается исключение
     */
    private static void validatePassword(String password) throws WrongPasswordException {
        if (validateString(password)) {
            throw new WrongPasswordException(generateErrorMessage(password, "Пароль"));
        } else if (!password.matches(".*\\d.*")) {
            throw new WrongPasswordException("Пароль должен содержать хотя бы одну цифру: " + password);
        }
    }

    /**
     * В этом методе проверяется корректность ввода строки. Если строка некорректна выбрасывается исключение.
     * Этот метод обрабатывает null, пустую строку, строку больше 20 символов и строку содержащую пробелы.
     * Метод работает в других методах для проверки строки.
     *
     * @param string Проверяемая строка
     * @return true, если строка корректна и false в противном случае
     */
    private static boolean validateString(String string) {
        return string == null || string.isEmpty() || string.length() > 20 || string.contains(" ");
    }

    /**
     * Метод возвращает сообщение об ошибке для разных случаев проверки.
     *
     * @param string Проверяемая строка
     * @param type   Тип проверяемой строки
     * @return Сообщение об ошибке
     */
    private static String generateErrorMessage(String string, String type) {
        return type + switch (string) {
            case "" -> " не может быть пустым";
            case String s when s.length() > 20 -> " не может быть больше 20 символов";
            case String s when s.contains(" ") -> " не может содержать пробелы";
            case null -> " не может быть null";
            default -> "Unexpected value: " + string;
        } + ": " + string;
    }
}
