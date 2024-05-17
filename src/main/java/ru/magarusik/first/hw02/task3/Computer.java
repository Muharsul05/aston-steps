package ru.magarusik.first.hw02.task3;

class Computer {

    public static class Processor {

        private String model;

        public Processor(String model) {
            this.model = model;
        }

        public String getDetails() {
            return model;
        }
    }

    public class RAM {

        private int size;

        public RAM(int size) {
            this.size = size;
        }

        public String getDetails() {
            return String.valueOf(size);
        }
    }
}
