package lesson_10.media;

public class Disk {
    private String name;
    private int year;

    Disk [] boxOfDisks;

    public Disk() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
