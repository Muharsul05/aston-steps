package ru.magarusik.first.hw08.task2;

import ru.magarusik.first.hw08.task2.decorators.CompressionDecorator;
import ru.magarusik.first.hw08.task2.decorators.DataSource;
import ru.magarusik.first.hw08.task2.decorators.EncryptionDecorator;
import ru.magarusik.first.hw08.task2.decorators.FileDataSource;

public class DecoratorRunner {

    public static void main(String[] args) {

        String usersTable = """
                Name        Salary
                John Smith  100000
                Steven Jobs 912000""";

        var fileDataSource = new FileDataSource("OutputDemo.txt");

        DataSource decoratorSource = new CompressionDecorator(
                new EncryptionDecorator(fileDataSource));

        decoratorSource.writeData(usersTable);

        System.out.println("- Input ----------------");
        System.out.println(usersTable);
        System.out.println("- Encoded --------------");
        System.out.println(fileDataSource.readData());
        System.out.println("- Decoded --------------");
        System.out.println(decoratorSource.readData());
    }
}
