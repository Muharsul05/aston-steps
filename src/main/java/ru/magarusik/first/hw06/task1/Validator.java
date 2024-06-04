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
     * Проверяет логин и пароль, а также соответствие паролей. Если login не соответствует требованиям то,
     * выбрасывает WrongLoginException. Если password не соответствует требованиям то, выбрасывает
     * WrongPasswordException. Если пароли не соответствует то, выбрасывается WrongPasswordException.
     * Если пароль, логин и пароли соответствуют требованиям, то возвращает true.
     *
     * @param login           логин
     * @param password        пароль
     * @param confirmPassword подтверждение пароля
     * @return true, если значения верны, false в противном случае
     * @throws WrongLoginException    если логин некорректен
     * @throws WrongPasswordException если пароль некорректен
     * @see #validatePassword(String password)
     * @see #validateLogin(String login)
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
     * Проверяет корректность ввода логина и если логин некорректен выбрасывается исключение
     *
     * @param login Логин пользователя
     * @throws WrongLoginException Если логин некорректен выбрасывается исключение
     * @see #validateString(String stringToCheck)
     */
    private static void validateLogin(String login) throws WrongLoginException {
        if (validateString(login)) {
            throw new WrongLoginException(generateErrorMessage(login, "Логин"));
        }
    }

    /**
     * Проверяет корректность ввода пароля и если пароль некорректен выбрасывается исключение.
     *
     * @param password Пароль пользователя
     * @throws WrongPasswordException Если пароль некорректен выбрасывается исключение
     * @see #validateString(String stringToCheck)
     */
    private static void validatePassword(String password) throws WrongPasswordException {
        if (validateString(password)) {
            throw new WrongPasswordException(generateErrorMessage(password, "Пароль"));
        } else if (!password.matches(".*\\d.*")) {
            throw new WrongPasswordException("Пароль должен содержать хотя бы одну цифру: " + password);
        }
    }

    /**
     * Проверяет корректность ввода строки и если строка некорректна возвращается true иначе false.
     * Метод обрабатывает null, пустую строку, строку больше 20 символов и строку содержащую пробелы.
     * Метод работает в других методах для проверки строки.
     *
     * @param stringToCheck Проверяемая строка
     * @return true, если строка корректна и false в противном случае
     * @see #validatePassword(String password)
     * @see #validateLogin(String login)
     */
    private static boolean validateString(String stringToCheck) {
        return stringToCheck == null || stringToCheck.isEmpty() || stringToCheck.length() > 20 || stringToCheck.contains(" ");
    }

    /**
     * Возвращает сообщение об ошибке для разных случаев проверки.
     *
     * @param stringToCheck Проверяемая строка (login123 или password123)
     * @param type          Тип проверяемой строки (логин или пароль)
     * @return Сообщение об ошибке
     */
    private static String generateErrorMessage(String stringToCheck, String type) {
        return type + switch (stringToCheck) {
            case "" -> " не может быть пустым";
            case String s when s.length() > 20 -> " не может быть больше 20 символов";
            case String s when s.contains(" ") -> " не может содержать пробелы";
            case null -> " не может быть null";
            default -> "Unexpected value: " + stringToCheck;
        } + ": " + stringToCheck;
    }
}
