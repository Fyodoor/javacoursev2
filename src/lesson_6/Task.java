package lesson_6;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task 1
        // Reverse text

//        String text = scanner.nextLine();
//        char[] chars = text.toCharArray();
//        String reverse = "";
//        for (int i = text.length() - 1; i >= 0 ; i--) {
//            reverse += chars[i];
//        }
//        System.out.println(reverse);

        // Task 2
        //Check email of user

        String email = scanner.nextLine();
        char [] chars = email.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '@') {
                System.out.println("Собака есть");
                return;
            }
        }

    }
}
