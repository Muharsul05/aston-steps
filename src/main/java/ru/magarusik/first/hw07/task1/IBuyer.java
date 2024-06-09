package ru.magarusik.first.hw07.task1;

/**
 * Интерфейс определяет поведение покупателя.
 */
public interface IBuyer {

    /**
     * Покупатель может входить в магазин.
     */
    void enterToMarket();

    /**
     * Покупатель может выбирать товар в магазине.
     */
    void chooseGoods();

    /**
     * Покупатель может выходить из магазина.
     */
    void goOut();
}
