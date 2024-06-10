package ru.magarusik.first.hw07.task1;

import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

/**
 * Утилитарный класс нужен, для того чтобы получать полезные объекты.
 */
public class Utils {

    /**
     * Генерирует случайные числа.
     */
    static final Random RANDOM = new Random();

    /**
     * Ассортимент магазина
     */
    static final List<Product> PRODUCTS = List.of(
            new Product("Apple", 100),
            new Product("Orange", 200),
            new Product("Banana", 300),
            new Product("Watermelon", 400),
            new Product("Bread", 50),
            new Product("Cheese", 150),
            new Product("Milk", 200),
            new Product("Meat", 250),
            new Product("Chicken", 300),
            new Product("Fish", 350),
            new Product("Potato", 60),
            new Product("Tomato", 70));

    /**
     * Логирование на консоль.
     */
    static final Logger LOGGER = Logger.getLogger(Utils.class.getName());

    private Utils() {
    }
}
