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

//        String text = "Hello World";
//        int w = text.indexOf('W');
//        System.out.println(w);

        String email = scanner.nextLine();
        if (email.indexOf('@') == -1) {
            System.out.println("Your email is not correct");
            return;
        }
        System.out.println();

        // Task 3
        //Check that '@' is only one

        String[] split = email.split("@");

        if (split.length != 2) {
            System.out.println("Your email is not correct. You have 2 '@'");
            return;
        }

        String partBeforeDog = split[0];
        String partAfterDog = split[1];
        if (partBeforeDog.startsWith(".") || partBeforeDog.endsWith(".")) {
            System.out.println("Your email is not correct. Too many points");
            return;
        }
        if (partAfterDog.startsWith(".") || partAfterDog.endsWith(".")) {
            System.out.println("Your email is not correct. Too many points");
            return;
        }
        System.out.println("Your email accepted");


    }
}
