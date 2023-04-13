package lesson_10.animals;

public class Cat extends Animal{
    private String coutch;

    public String getCoutch() {
        return coutch;
    }

    public void setCoutch(String cautch) {
        this.coutch = coutch;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello, I'm the cat");
    }
}
