package lesson_6.homework;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] linesArray = new String[6];
        System.out.println("Введите 6 строк");
        for (int i = 0; i < linesArray.length; i++) {
            linesArray[i] = scanner.nextLine();
        }
        for (int i = 0; i < linesArray.length; i++) {
            for (int j = 0; j < linesArray.length; j++) {
                if (linesArray[i] != null && i != j) {
                    if (linesArray[i].equals(linesArray[j])) {
                        linesArray[j] = null;
                    }
                }
            }
        }

        for (String c : linesArray) {
            System.out.println(c);
        }
    }
}
