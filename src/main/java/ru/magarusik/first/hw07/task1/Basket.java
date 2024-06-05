package ru.magarusik.first.hw07.task1;

import java.util.ArrayList;
import java.util.List;

/**
 * Реализует покупательскую корзину в которую можно положить товары.
 *
 * @see IBasket
 * @see Buyer
 */
public class Basket implements IBasket {

    /**
     * Список нужен для хранения выбранных покупателем товаров.
     */
    private final List<Product> marketBasket;

    /**
     * Конструктор с корзиной.
     *
     * @param basket Корзина.
     */
    private Basket(List<Product> basket) {
        this.marketBasket = basket;
    }

    /**
     * Конструктор без аргументов создаёт пустую корзину.
     */
    public Basket() {
        this(new ArrayList<>());
    }

    /**
     * Кладёт товар в корзину.
     *
     * @param product Товар.
     */
    @Override
    public void put(Product product) {
        this.marketBasket.add(product);
    }

    /**
     * @return String Возвращает содержимое корзины.
     */
    @Override
    public String toString() {
        return "Basket{" + marketBasket + '}';
    }
}
