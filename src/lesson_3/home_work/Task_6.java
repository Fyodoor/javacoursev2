package lesson_3.home_work;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if ( (a + b) > c && (a + c) > b && (b + c) > a) {
            System.out.println("Треугольник существует");
        }
        else {
            System.out.println("Трейгольник не существует");
        }
    }
}
