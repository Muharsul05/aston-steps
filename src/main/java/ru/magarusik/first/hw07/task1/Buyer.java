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
        LOGGER.info(Thread.currentThread().getName() + " зашёл в магазин");
    }

    /**
     * Покупатель выбирает товар в магазине.
     */
    @Override
    public void chooseGoods() {
        LOGGER.info(Thread.currentThread().getName() + " выбирает товар");
        doTask();
    }

    /**
     * Покупатель выходит из магазина.
     */
    @Override
    public void goOut() {
        LOGGER.info(Thread.currentThread().getName() + " выходит из магазина");
        LOGGER.info("Товары в корзине: " + this.basket.toString());
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
        try {
            SEMAPHORE.acquire();

            this.enterToMarket();
            this.takeBasket();

            int randomBuyCount = RANDOM.nextInt(1, 4);
            for (int i = 0; i < randomBuyCount; i++) {
                this.chooseGoods();
                this.putGoodsToBasket();
            }

            this.goOut();
            SEMAPHORE.release();
        } catch (InterruptedException e) {
            LOGGER.log(Level.WARNING, e.getMessage(), e);
        }
    }

    /**
     * Покупатель берёт корзину в магазине.
     */
    @Override
    public void takeBasket() {
        LOGGER.info(Thread.currentThread().getName() + " берёт корзину");
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
        LOGGER.info(Thread.currentThread().getName() + " положил товар " + product + " в корзину");
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
     * @return IBasket корзина.
     */
    public void setBasket(IBasket basket) {
        this.basket = basket;
    }
}
