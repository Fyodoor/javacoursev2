package lesson_6.homework;

import lesson_5.homework.HomeWorkFive;

import java.util.Scanner;

public class HomeWork {
    Scanner scanner = new Scanner(System.in);


    void MenuPlay() {
        while (true) {
            System.out.println();
            System.out.println("**************************************************");
            System.out.println("---------------------START(1)---------------------");
            System.out.println("---------------------EXIT(0)----------------------");
            System.out.println("**************************************************");
            System.out.println();
            int vote = scanner.nextInt();
            if (vote == 1) {
                System.out.println("---------------------Choose a level---------------------");
                System.out.println("-------------------------lvl 1--------------------------");
                System.out.println("-------------------------lvl 2--------------------------");
                System.out.println("-------------------------lvl 3--------------------------");
                System.out.println("-------------------------lvl 4--------------------------");
                System.out.println("-------------------------lvl 5--------------------------");
                int voteTask = scanner.nextInt();
                if (voteTask == 1) {
                    new HomeWork().Task1();
                } else if (voteTask == 2) {
                    new HomeWork().Task2();
                } else if (voteTask == 3) {
                    new HomeWork().Task3();
                } else if (voteTask == 4) {
                    new HomeWork().Task4();
                } else if (voteTask == 5) {
                    new HomeWork().Task5();
                } else {
                    System.out.println("This level does not exist.");
                }
            } else if (vote == 0) {
                break;
            } else {
                System.out.println("Choose either 1 or 0");
            }
        }
    }

    void Task1() {
        String [] arrayLines = new String[100];
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
                } else  {
                    System.out.println(arrayLines[i] + arrayLines[i] + arrayLines[i]);
                }
            }
        }

    }

    void Task2() {
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


    }

    void Task3() {
        String [] lines = new String[10];
        System.out.println("Введите 8 строк.");
        for (int i = 0; i < 8; i++) {
            System.out.print((i+1) + ". ");
            lines[i] = scanner.nextLine();
        }

        for (int i = lines.length - 1; i >= 0 ; i--) {
            System.out.println(lines[i]);
        }


    }

    void Task4() {
        String [] lines = new String[10];
        int [] linesFly = new int[10];
        System.out.println("Введите десять слов/строк");
        for (int i = 0; i < lines.length; i++) {
            lines[i] = scanner.nextLine();
            linesFly[i] = lines[i].length();
        }
        for (int i = 0; i < lines.length; i++) {
            System.out.println("Длина слова - " + lines[i] + " - равна = " + linesFly[i]);
        }
    }

    void Task5() {
        String [] linesArray = new String[6];
        System.out.println("Введите 6 строк");
        for (int i = 0; i < linesArray.length; i++) {
            linesArray[i] = scanner.nextLine();
        }
        for (int i = 0; i < linesArray.length; i++) {
            for (int j = 0; j < linesArray.length; j++) {
                if (linesArray[i] != null && i != j) {
                    if (linesArray[i].equals(linesArray[j])) {
                        linesArray[i] = null;
                    }
                }
            }
        }
        for (String c : linesArray) {
            if (c != null) {
                System.out.println(c);
            }
        }

    }

    public static void main(String[] args) {
        new HomeWork().MenuPlay();

    }
}