package lesson_3.home_work;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age % 400 == 0) {
            System.out.println("количество дней в этом году: 366");
        } else if (age % 100 == 0) {
            System.out.println("количество дней в этом году: 365");
        } else if (age % 4 == 0) {
            System.out.println("количество дней в этом году: 366");
        }
        else {
            System.out.println("количество дней в этом году: 365");
        }
    }
}
