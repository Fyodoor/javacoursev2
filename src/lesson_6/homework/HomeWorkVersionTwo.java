package lesson_6.homework;

import java.util.Scanner;

public class HomeWorkVersionTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("****************************************************************************************");
        System.out.println("Первая задача");
        System.out.println();
        String[] arrayLines = new String[100];
        System.out.println("Вводите строки/слова. Ввод закончится после пустой строки.");

        for (int i = 0; i < arrayLines.length; i++) {
            arrayLines[i] = scanner.nextLine();
            if (arrayLines[i].isEmpty()) {
                break;
            }

        }

        System.out.println("Тут все строки в верхний регистр переводятся:");
        for (int i = 0; i < arrayLines.length; i++) {
            if (arrayLines[i] != null) {
                System.out.println(arrayLines[i].toUpperCase());
            }
        }

        System.out.println("Тут строки чья длина чётная - удваиваются, иные утраиваются:");
        for (int i = 0; i < arrayLines.length; i++) {
            if (arrayLines[i] != null) {
                if (arrayLines[i].length() % 2 == 0) {
                    System.out.println(arrayLines[i] + arrayLines[i]);
                } else {
                    System.out.println(arrayLines[i] + arrayLines[i] + arrayLines[i]);
                }

            }
        }

        System.out.println();
        System.out.println("****************************************************************************************");
        System.out.println("Вторая задача");
        System.out.println();

        String [] arr = new String[5];
        System.out.println("Введите пять строк");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextLine();
        }
        // поиск самой длинной строки
        int max = arr[0].length();
        for (String n : arr) {
            if (max < n.length()) {
                max = n.length();
            }
        }
        // поиск самой короткой строки
        int min = max;
        for (String n : arr) {
            if (min > n.length()) {
                min = n.length();
            }
        }

        for (String n : arr) {
            if (n.length() == max) {
                System.out.println("Самая длинная строка - " + n + " равна: " + max);
            }
            if (n.length() == min) {
                System.out.println("Самая короткая строка - " + n + " равна: " + min);
            }
        }

        System.out.println();
        System.out.println("****************************************************************************************");
        System.out.println("Третья задача");
        System.out.println();

        String [] linesOne = new String[10];
        System.out.println("Введите 8 строк.");
        for (int i = 0; i < 8; i++) {
            System.out.print((i+1) + ". ");
            linesOne[i] = scanner.nextLine();
        }

        for (int i = linesOne.length - 1; i >= 0 ; i--) {
            System.out.println(linesOne[i]);
        }

        System.out.println();
        System.out.println("****************************************************************************************");
        System.out.println("Четвёртая задача");
        System.out.println();

        String [] linesTwo = new String[10];
        int [] linesFly = new int[10];
        System.out.println("Введите десять слов/строк");
        for (int i = 0; i < linesTwo.length; i++) {
            linesTwo[i] = scanner.nextLine();
            linesFly[i] = linesTwo[i].length();
        }
        for (int i = 0; i < linesTwo.length; i++) {
            System.out.println("Длина слова - " + linesTwo[i] + " - равна = " + linesFly[i]);
        }

        System.out.println();
        System.out.println("****************************************************************************************");
        System.out.println("Пятая задача");
        System.out.println();

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
