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

    static List<Employee> generateEmployeeList(int count) {
        return Stream
                .generate(EmployeeGenerator::generateEmployee)
                .limit(count)
                .toList();
    }

    private static Employee generateEmployee() {
        return new Employee(
                NAMES.get(RANDOM.nextInt(0, NAMES.size())),
                RANDOM.nextInt(20, 60),
                DEPARTMENTS.get(RANDOM.nextInt(0, DEPARTMENTS.size())),
                RANDOM.nextInt(30_000, 90_000));
    }
}
