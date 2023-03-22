package lesson_3.home_work;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num > 0) {
            num *= 2;
            System.out.println(num);
        } else if (num < 0) {
            num += 1;
            System.out.println(num);
        } else if (num == 0) {
            System.out.println(num);
        }
    }
}
