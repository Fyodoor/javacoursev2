package lesson_3.home_work;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double t = scanner.nextDouble();

        t %= 5;

        if (t >= 0 && t < 3) {
            System.out.println("Зелёный");
        }
        else if (t >= 3 && t < 4) {
            System.out.println("Желтый");
        }
        else if (t >= 4 && t < 5) {
            System.out.println("Красный");
        }
        else {
            System.out.println("Зелёный");
        }
    }
}
