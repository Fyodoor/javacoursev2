package lesson_7;

import lesson_7.animals.Cat;
import lesson_7.animals.Dog;

public class Main {
    public static void main(String[] args) {
        Cat snezhok = new Cat("Snezhok tretiy", 10);
        Cat ulichniy = new Cat(5);
        Cat podval = new Cat("Podval'niy uzhas");
        Cat neizvestniy = new Cat();

        Dog sharik = new Dog("Sharik", 6);
    }
}
