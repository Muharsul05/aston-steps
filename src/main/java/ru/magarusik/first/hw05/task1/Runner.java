package ru.magarusik.first.hw05.task1;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Runner {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {

        var result = generateIntegerList().stream()
                .distinct()
                .filter(Runner::isEven)
                .reduce(0, Integer::sum);

        System.out.println(result);
    }


    private static List<Integer> generateIntegerList() {
        return Stream
                .generate(() -> RANDOM.nextInt(0, 1_000_000))
                .limit(1_000)
                .toList();
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
