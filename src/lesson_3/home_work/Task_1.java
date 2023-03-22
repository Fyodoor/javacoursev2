package lesson_3.home_work;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if ( number < 5 ) {
            System.out.println("Число меньше 5");
        }
        if (number > 5) {
            System.out.println("Число больше 5");
        } else if ( number == 5) {
            System.out.println("Число равно 5");
        }
    }
}
