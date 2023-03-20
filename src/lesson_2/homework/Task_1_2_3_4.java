package lesson_2.homework;

public class Task_1_2_3_4 {
    public static void main(String[] args) {
        // Задача 1:

        double allMoneyOfCunningAccountant = 5;
        double cash = 2;
        double moneyInCash = allMoneyOfCunningAccountant / cash;
        System.out.println("В каждой кассе по " + moneyInCash + " рублей");

        System.out.println();

        // Задача 2:

        int sideOne = 50;
        int sideTwo = 20;
        int square = sideOne * sideTwo;
        System.out.println("Площадь прямоугольника равна " + square);

        System.out.println();

        // Задача 3:

        int hungryTime = 9;
        int fullTime = 15;
        int bananas = 3;
        int hunryBananasPerMinute = hungryTime / bananas;
        int fullBananasPerMinute = fullTime / bananas;
        int diff = fullBananasPerMinute - hunryBananasPerMinute;
        System.out.println("The difference is " + diff);

        System.out.println();

        // Задача 4:

        int a = 3;
//        int a = 10;
        int b = 6;
//        int b = 12;
//        int sum = 1 + a + b;
//        int sum = 2 + a + b;
        int sum = 3 + a + b;
//        int sum = 4 + a + b;

        System.out.println("sum = " + sum);



    }
}
