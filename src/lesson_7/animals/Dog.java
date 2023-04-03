package lesson_7.animals;

public class Dog {
    // Поля
    String name;
    Integer age;

    // конструктор


    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Dog(Integer age) {
        this.age = age;
    }

    public Dog(String name) {
        this.name = name;
    }

    public Dog() {
    }
}
