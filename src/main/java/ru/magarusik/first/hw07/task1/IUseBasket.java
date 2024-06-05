package ru.magarusik.first.hw07.task1;

/**
 * Интерфейс определяет поведение покупателя при использовании корзины.
 *
 * @see Buyer
 */
public interface IUseBasket {

    /**
     * Покупатель может взять корзину.
     */
    void takeBasket();

    /**
     * Покупатель может положить выбранный товар в корзину.
     */
    void putGoodsToBasket();
}
