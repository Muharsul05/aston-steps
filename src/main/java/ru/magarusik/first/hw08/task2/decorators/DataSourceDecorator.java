package ru.magarusik.first.hw08.task2.decorators;

public class DataSourceDecorator implements DataSource {

    private final DataSource wrapper;

    DataSourceDecorator(DataSource source) {
        this.wrapper = source;
    }

    @Override
    public void writeData(String data) {
        wrapper.writeData(data);
    }

    @Override
    public String readData() {
        return wrapper.readData();
    }
}
