package ru.magarusik.first.hw10.spring_boot.task2;

import org.springframework.web.bind.annotation.*;

/**
 * Контроллер для проверки возраста пользователя.
 */
@RestController
@RequestMapping("/age")
public class AgeController {

    /**
     * Сначала проверяется возраст. Если возраст меньше нуля или больше 120,
     * то выбрасывается исключение. Если возраст в пределах диапазона, то
     * проверяется его совершеннолетие.
     *
     * @param age Возраст для проверки
     * @return Сообщение о возрасте
     * @throws IllegalArgumentException Если возраст меньше нуля или больше 120
     */
    @GetMapping("/{age}")
    public String validateAge(@PathVariable int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        } else if (age > 120) {
            throw new IllegalArgumentException("Возраст не может быть больше 120");
        } else {
            return "Ваш возраст: " + age + " и вы " +
                   (age >= 18 ? "cовершеннолетний и вам можно пиво"
                           : "не совершеннолетний и вам нельзя пить пиво");
        }
    }

    /**
     * Обрабатывает исключения в методе
     *
     * @param exception Выброшенное исключение
     * @return Сообщение об ошибке
     */
    @ExceptionHandler(IllegalArgumentException.class)
    public String handleException(IllegalArgumentException exception) {
        return exception.getMessage();
    }
}
