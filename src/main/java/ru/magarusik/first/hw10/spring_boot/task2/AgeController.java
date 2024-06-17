package ru.magarusik.first.hw10.spring_boot.task2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/age")
public class AgeController {

    @GetMapping("/{age}")
    public String getAge(@PathVariable int age) {
        return "Ваш возраст: " + age + " и вы " +
               (age >= 18 ? "cовершеннолетний и вам можно пиво"
                       : "не совершеннолетний и вам нельзя пить пиво");
    }
}
