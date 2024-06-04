package ru.magarusik.first.hw06.task1;

import ru.magarusik.first.hw06.task1.exceptions.WrongLoginException;
import ru.magarusik.first.hw06.task1.exceptions.WrongPasswordException;

import java.util.List;
import java.util.logging.Logger;

public class Runner {

    private static final Logger LOGGER = Logger.getLogger(Runner.class.getName());

    public static void main(String[] args) {

        List<String> logins = List.of(
                "", "login login", "loginloginloginloginloginl",
                "login1", "login2", "login3", "login4", "login5");

        List<String> passwords = List.of("", "", "",
                "passwordpasswordpasswordpasswordpassword", "passwordpassword",
                "password1", "password3", "password4");

        List<String> confirmPasswords = List.of("", "", "",
                "", "", "password2", "password3", "password4");

        testValidateMethod(logins, passwords, confirmPasswords);
    }

    /**
     * Метод прогоняет тесты над методом validate для каждого случая проверки.
     *
     * @param logins           Логины пользователей
     * @param passwords        Пароли пользователей
     * @param confirmPasswords Подтверждения паролей
     * @see Validator#validate(String, String, String)
     */
    private static void testValidateMethod(List<String> logins, List<String> passwords,
                                           List<String> confirmPasswords) {
        for (int i = 0; i < logins.size(); i++) {
            String message;
            try {
                message = """
                        Test case: %d
                        Login: %s
                        Password: %s
                        Confirm password: %s
                        """.formatted(i + 1, logins.get(i),
                        passwords.get(i), confirmPasswords.get(i));

                LOGGER.info(message);

                if (Validator.validate(logins.get(i), passwords.get(i), confirmPasswords.get(i))) {
                    message = "Пароль и логин введены верно. Пароли совпали\n";
                    LOGGER.info(message);
                }

            } catch (WrongLoginException | WrongPasswordException e) {
                message = e.getMessage() + "\n";
                LOGGER.warning(message);
            }
        }
    }
}
