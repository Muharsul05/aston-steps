package ru.magarusik.first.hw07.task1;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Моделирование потока покупателей в магазине.
 *
 * @author Magarusik
 */
public class Runner {
    public static void main(String[] args) {

        AtomicInteger counter = new AtomicInteger(1);

        List<Thread> buyers = Stream.generate(() -> new Thread(new Buyer()))
                .peek(thread -> thread.setName("Buyer " + counter.getAndIncrement()))
                .limit(10)
                .toList();

        buyers.stream()
                .peek(Thread::start)
                .collect(Collectors.toList());
    }
}
