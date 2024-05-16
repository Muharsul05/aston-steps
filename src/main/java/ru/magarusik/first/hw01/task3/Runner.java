package ru.magarusik.first.hw01.task3;

class Runner {

    public static void main(String[] args) {
        Person personPrimitive = new Person();
        personPrimitive.age = 20;
        personPrimitive.name = "Alex";
        personPrimitive.surname = "Primitive";
        System.out.println(personPrimitive);


        Person personSetter = new Person();
        personSetter.setAge(30);
        personSetter.setName("Alex");
        personSetter.setSurname("Setter");
        System.out.println(personSetter);


        Person personConstructor = new Person("Alex", "Constructor", 40);
        System.out.println(personConstructor);

        PersonBuilder builder = new PersonBuilder();
        Person personBuilder = builder.builder()
                .name("Alex")
                .surname("Builder")
                .age(50)
                .build();
        System.out.println(personBuilder);
    }
}

