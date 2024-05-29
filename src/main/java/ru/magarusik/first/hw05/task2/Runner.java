package ru.magarusik.first.hw05.task2;

import java.util.Comparator;
import java.util.List;

public class Runner {

    private static final int EMPLOYEE_COUNT = 100;
    private static final int EMPLOYEE_AGE = 30;

    public static void main(String[] args) {

        List<Employee> employees = EmployeeGenerator.generateEmployeeList(EMPLOYEE_COUNT);

        printEmployeesAgeOverThirtyYears(employees);

        long countIT = countEmployeesInDepartment(employees, "it");
        System.out.println("\nКоличество сотрудников в отделе IT: " + countIT);

        Employee maxSalaryEmployee = maxSalaryEmployee(employees);
        System.out.println("\nСотрудник с максимальной зарплатой: " + maxSalaryEmployee);

        List<String> employeeNamesHR = getEmployeeNamesByDepartment(employees, "hr");
        System.out.println("\nСотрудники в отделе HR:" + employeeNamesHR);

        double averageSalary = averageSalary(employees);
        System.out.println("\nСредняя зарплата: " + averageSalary);

    }

    private static void printEmployeesAgeOverThirtyYears(List<Employee> employees) {
        employees.stream()
                .filter(employee -> employee.age() > EMPLOYEE_AGE)
                .sorted(Comparator.comparingInt(Employee::age))
                .forEach(System.out::println);
    }

    private static long countEmployeesInDepartment(List<Employee> employees, String department) {
        return employees.stream()
                .filter(employee -> isEmployeeInDepartment(employee, department))
                .count();
    }

    private static Employee maxSalaryEmployee(List<Employee> employees) {
        return employees.stream()
                .max(Comparator.comparingDouble(Employee::salary))
                .orElseThrow(() -> new RuntimeException("Список пустой"));
    }

    private static boolean isEmployeeInDepartment(Employee employee, String department) {
        return employee.department().equalsIgnoreCase(department);
    }

    private static List<String> getEmployeeNamesByDepartment(List<Employee> employees, String department) {
        return employees.stream()
                .filter(employee -> isEmployeeInDepartment(employee, department))
                .map(Employee::name)
                .sorted()
                .toList();
    }

    private static double averageSalary(List<Employee> employees) {
        return employees.stream()
                .mapToDouble(Employee::salary)
                .average()
                .orElseThrow(() -> new RuntimeException("Список пустой"));
    }
}
