package lesson_7.animals;

public class Cat {
    // Поля
    String name;
    Integer age;
    String loveName;

    // конструктор


    public Cat() {
    }

    public Cat(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Cat(Integer age) {
        this.age = age;
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, Integer age, String loveName) {
        this.name = name;
        this.age = age;
        this.loveName = loveName;
    }
}
