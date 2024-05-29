package ru.magarusik.first.hw05.task2;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class EmployeeGenerator {

    private static final Random RANDOM = new Random();

    private static final List<String> NAMES = List.of(
            "John", "Jane", "Bob", "Alice", "Mark", "Kate",
            "Alex", "Tom", "Sarah", "Emily", "Olivia", "Emma",
            "Michael", "David", "Jessica", "Daniel");

    private static final List<String> DEPARTMENTS = List.of(
            "IT", "HR", "Sales", "Marketing", "Engineering", "Finance");

    private static final int MIN_AGE = 20;
    private static final int MAX_AGE = 60;
    private static final int MIN_SALARY = 30_000;
    private static final int MAX_SALARY = 90_000;

    static List<Employee> generateEmployeeList(int count) {
        return Stream
                .generate(EmployeeGenerator::generateEmployee)
                .limit(count)
                .toList();
    }

    private static Employee generateEmployee() {
        return new Employee(
                getRandomName(),
                RANDOM.nextInt(MIN_AGE, MAX_AGE),
                getRandomDepartment(),
                RANDOM.nextInt(MIN_SALARY, MAX_SALARY));
    }

    private static String getRandomDepartment() {
        return DEPARTMENTS.get(RANDOM.nextInt(0, DEPARTMENTS.size()));
    }

    private static String getRandomName() {
        return NAMES.get(RANDOM.nextInt(0, NAMES.size()));
    }
}
