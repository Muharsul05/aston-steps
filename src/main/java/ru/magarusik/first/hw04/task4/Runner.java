package ru.magarusik.first.hw04.task4;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(
                List.of(
                        new Student("Ivan", "ИС", 2, 4),
                        new Student("Petr", "ИБ", 1, 2),
                        new Student("Sidor", "ПИ", 3, 3),
                        new Student("Oleg", "ПИ", 3, 3),
                        new Student("Alexey", "ИС", 2, 4),
                        new Student("Andrey", "ПИ", 3, 2),
                        new Student("Sergey", "ПИ", 3, 5)
                )
        );

        System.out.println("\nСтуденты до отчисления:");
        printStudents(students);

        deleteStudents(students);

        System.out.println("\nСтуденты после отчисления:");
        printStudents(students);

        printStudents(students, 1);
        printStudents(students, 2);
        printStudents(students, 3);
        printStudents(students, 4);

        printStudents(students, "ИС");
        printStudents(students, "ПИ");
        printStudents(students, "ИБ");
    }

    private static void deleteStudents(List<Student> students) {
        var iterator = students.iterator();
        while (iterator.hasNext()) {
            var student = iterator.next();
            if (student.getMark() < 3) {
                iterator.remove();
            } else {
                student.setCourse(student.getCourse() + 1);
            }
        }

    }

    private static void printStudents(List<Student> students) {
        if (students.isEmpty()) {
            System.out.println("Список пуст");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    private static void printStudents(List<Student> students, int course) {
        System.out.println("\nСтуденты в курсе " + course + ":");
        printStudents(students.stream()
                .filter(student -> student.getCourse() == course)
                .toList());
    }

    private static void printStudents(List<Student> students, String group) {
        System.out.println("\nСтуденты в группе " + group + ":");
        printStudents(students.stream()
                .filter(student -> student.getGroup().equalsIgnoreCase(group))
                .toList());
    }
}
