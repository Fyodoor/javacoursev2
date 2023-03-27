package lesson_5;

import java.util.Scanner;

public class PrintTask {
    public static void main(String[] args) {
        System.out.println("println"); // + enter
        System.out.print("println"); // без переноса
        System.out.println();
        Scanner scanner =  new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        System.out.printf("My name is %s", name);
        System.out.println();
        System.out.printf("My age is %d", age);

    }
}
