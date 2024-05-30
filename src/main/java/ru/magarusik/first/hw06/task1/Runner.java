package ru.magarusik.first.hw06.task1;

import ru.magarusik.first.hw06.task1.exceptions.WrongLoginException;
import ru.magarusik.first.hw06.task1.exceptions.WrongPasswordException;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        List<String> logins = List.of(
                "", " ", "loginloginloginloginloginl",
                "login1", "login2", "login3", "login4", "login5");

        List<String> passwords = List.of("", "", "",
                "passwordpasswordpasswordpasswordpassword", "passwordpassword",
                "password1", "passward3", "password4");

        List<String> confirmPasswords = List.of("", "", "",
                "", "", "password2", "password3", "password4");

        printResults(logins, passwords, confirmPasswords);
    }

    /**
     * Данный метод прогоняет тесты над методом validate для каждого случая проверки.
     *
     * @param logins           Логины пользователей
     * @param passwords        Пароли пользователей
     * @param confirmPasswords Подтверждения паролей
     * @see Validator#validate(String, String, String)
     */
    private static void printResults(List<String> logins, List<String> passwords,
                                     List<String> confirmPasswords) {
        for (int i = 0; i < logins.size(); i++) {
            try {
                System.out.println("\nLogin: " + logins.get(i));
                System.out.println("Password: " + passwords.get(i));
                System.out.println("Confirm password: " + confirmPasswords.get(i));

                if (Validator.validate(logins.get(i), passwords.get(i), confirmPasswords.get(i))) {
                    System.out.println("Пароль и логин введены верно. Пароли совпали");
                }
            } catch (WrongLoginException | WrongPasswordException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
