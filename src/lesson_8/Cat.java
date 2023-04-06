package lesson_8;

public class Cat {
    // Поля
    String name;
    int age;
    String parentName;
    Kitten [] kittens = new Kitten[10];

    // конструктор


    public Cat() {
    }

    public Cat(String name, int age, String parentName) {
        this.name = name;
        this.age = age;
        this.parentName = parentName;
    }

    // методы


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public void sayHello(String name, int age) {
        System.out.println("Hello, im a cat");
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
        System.out.println("My parentName is Snezhkovich");
    }

    public void sayGoodBye() {
        System.out.println("GoodBye");
        System.out.println("See you tomorrow");
    }

    public int giveMeFive() {
        System.out.println("Inside method giveMeFive");
        int a = 5;
        System.out.println("goin outside of method giveMyFive");
        return a;
    }

    public double giveMePiNumber() {
        return 3.1415926535;
    }

    public int multiple(int a, int b){
        return a * b;
    }

    public void addKitten(Kitten kitten) {
        kittens[0] = kitten;
    }
}
