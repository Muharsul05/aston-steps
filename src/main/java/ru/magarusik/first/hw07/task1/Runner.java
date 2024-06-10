package ru.magarusik.first.hw07.task1;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

/**
 * Моделирование потока покупателей в магазине.
 *
 * @author Magarusik
 */
public class Runner {

    public static void main(String[] args) {

        var counter = new AtomicInteger(1);

        List<Thread> buyers = Stream.generate(() -> new Thread(new Buyer(), "Buyer " + counter.getAndIncrement()))
                .limit(1_000)
                .toList();

        var iterator = buyers.iterator();

        long endTime = System.currentTimeMillis() + TimeUnit.MINUTES.toMillis(2);
        while (iterator.hasNext()) {
            if (endTime < System.currentTimeMillis()) {
                break;
            }
            iterator.next().start();
            iterator.next().start();

            try {
                Thread.sleep(1_000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
