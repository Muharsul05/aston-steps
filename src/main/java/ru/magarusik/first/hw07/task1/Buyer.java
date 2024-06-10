package ru.magarusik.first.hw07.task1;

import java.util.logging.Level;

import static ru.magarusik.first.hw07.task1.Utils.*;

/**
 * Реализация потока покупателя.
 *
 * @see IBuyer
 * @see IUseBasket
 * @see Runnable
 * @see Basket
 */
public class Buyer implements IBuyer, IUseBasket, Runnable {

    /**
     * Корзина покупателя
     */
    private IBasket basket;

    /**
     * Покупатель входит в магазин.
     */
    @Override
    public void enterToMarket() {
        LOGGER.info("%s зашёл в магазин".formatted(getName()));
    }

    /**
     * Покупатель выбирает товар в магазине.
     */
    @Override
    public void chooseGoods() {
        LOGGER.info("%s выбирает товар".formatted(getName()));
        doTask();
    }

    /**
     * Покупатель выходит из магазина.
     */
    @Override
    public void goOut() {
        LOGGER.info(getName() + " выходит из магазина");
        LOGGER.info("Товары в корзине: %s".formatted(this.basket));
    }

    /**
     * Порядок выполнения потока:
     * Входит в магазин.
     * Берет корзину.
     * Выбирает товары (от 1 до 4).
     * Выходит из магазина.
     */
    @Override
    public void run() {
        this.enterToMarket();
        this.takeBasket();

        int randomBuyCount = RANDOM.nextInt(1, 4);
        for (int i = 0; i < randomBuyCount; i++) {
            this.chooseGoods();
            this.putGoodsToBasket();
        }

        this.goOut();
    }

    /**
     * Покупатель берёт корзину в магазине.
     */
    @Override
    public void takeBasket() {
        LOGGER.info("%s берёт корзину".formatted(getName()));
        this.setBasket(new Basket());
        doTask();
    }

    /**
     * Покупатель положил выбранный товар в корзину.
     */
    @Override
    public void putGoodsToBasket() {
        Product product = getRandomGood();
        this.basket.put(product);
        LOGGER.info("%s положил товар %s в корзину".formatted(getName(), product.name()));
        doTask();
    }

    /**
     * На каждое задачу уходит время.
     */
    private void doTask() {
        try {
            Thread.sleep(RANDOM.nextLong(500, 2000));
        } catch (InterruptedException e) {
            LOGGER.log(Level.WARNING, e.getMessage(), e);
        }
    }

    /**
     * Возвращает случайный продукт.
     *
     * @return Product продукт.
     */
    private Product getRandomGood() {
        return PRODUCTS.get(RANDOM.nextInt(PRODUCTS.size()));
    }

    /**
     * Устанавливает IBasket корзина.
     */
    public void setBasket(IBasket basket) {
        this.basket = basket;
    }

    private String getName() {
        return Thread.currentThread().getName();
    }
}
