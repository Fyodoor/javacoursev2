package lesson_3.home_work;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberMonth = scanner.nextInt();

        if ( (numberMonth >= 1 && numberMonth < 3) || (numberMonth == 12) ) {
            System.out.println("Зима");
        } else if ( numberMonth >= 3 && numberMonth < 6 ) {
            System.out.println("Весна");
        } else if ( numberMonth >= 6 && numberMonth < 9 ) {
            System.out.println("Лето");
        } else if ( numberMonth >= 9 && numberMonth < 12 ) {
            System.out.println("Осень");
        } else {
            System.out.println("Такого месяца нет");
        }
    }
}
