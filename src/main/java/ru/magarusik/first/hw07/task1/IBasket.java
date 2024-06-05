package ru.magarusik.first.hw07.task1;

/**
 * Интерфейс определяет поведение корзины.
 */
public interface IBasket {

    /**
     * В корзину можно положить какой-нибудь товар.
     *
     * @param product Товар.
     */
    void put(Product product);
}
