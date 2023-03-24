package lesson_4.home_work;

import java.util.Scanner;

class Scan {
    Scanner scanner = new Scanner(System.in);

}

class Menu {
    void menuPlay() {
        while (true) {
            System.out.println();
            System.out.println("--------------------------------------------------");
            System.out.println("---------------------START(1)---------------------");
            System.out.println("---------------------EXIT(0)---------------------");
            int vote = new Scan().scanner.nextInt();
            if (vote == 1) {
                System.out.println("Выберите задание по номеру");
                System.out.println("№ 1");
                System.out.println("№ 2");
                System.out.println("№ 3");
                System.out.println("№ 4");
                System.out.println("№ 5");
                int voteTask = new Scan().scanner.nextInt();
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
                    System.out.println("Нет такого задания");
                }
            }
            else if (vote == 0) {
                break;
            } else {
                System.out.println("Выберите либо 1, либо 0 ");
            }
        }
    }
}


class HomeWork {

    void Task1() {
        System.out.println("Введите два числа: ");
        int m = new Scan().scanner.nextInt();
        int n = new Scan().scanner.nextInt();
        for (int i = 0; i < m; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.print(8);
            }
        }
    }

    void Task2() {
        for (int i = 0; i < 10; i++) {
            System.out.println();
            for (int j = 0; j < i + 1; j++) {
                System.out.print(8);
            }
        }
    }

    void Task3() {
        System.out.println("Введите 3 числа");
        int first = new Scan().scanner.nextInt();
        int second = new Scan().scanner.nextInt();
        int third = new Scan().scanner.nextInt();
        if ((first > second && first < third) || (first < second && first > third)) {
            System.out.println(first);
        } else if ((second > first && second < third) || (second < first && second > third)) {
            System.out.println(second);
        } else if ((third > first && third < second) || (third < first && third > second)) {
            System.out.println(third);
        } else {
            System.out.println(third);
        }
    }

    void Task4() {
        int count = 0;
        while (count < 10) {
            count++;
            for (int i = 1; i < 11; i++) {
                System.out.print(count * i + " ");
            }
            System.out.println();
        }
    }

    void Task5() {
        System.out.println("Введите имя: ");
        String name =  new Scan().scanner.nextLine();
        System.out.println("Введите день рождения");
        int dayHB = new Scan().scanner.nextInt();
        System.out.println("Введите месяц рождения (от 1 до 12)");
        int month = new Scan().scanner.nextInt();
        System.out.println("Введите год рождения");
        int year = new Scan().scanner.nextInt();
        System.out.println();
        System.out.println("Меня зовут " + name + ".");
        System.out.println("Я родился " + dayHB + "." + month + "." + year);

    }



    public static void main(String[] args) {

        new Menu().menuPlay();


    }
}
