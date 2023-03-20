package lesson_2;

public class Main {
    public static void main(String[] args) {
        // ТИП кличка_переменной = ЗНАЧЕНИЕ_КОТОРОЕ_МЫ_ХОТИМ_ЕЙ_ПРИСВОИТЬ
//        byte a;
//        a = 50;
//        System.out.println("byte " + a);
//        a = 70;
//        System.out.println("byte " + a);
//
//        short s = 12345;
//        System.out.println("short " + s);
//
//        int i = 1234567;
//        System.out.println("int " + i);
//
//        long l = 1_231_321_654L;
//        System.out.println("long " + l);
//
//        float f = 12.345f;
//        System.out.println("float " + f);
//
//        double d = 123.543123898359292;
//        System.out.println("double" + d);
//
//        char c = 'a';
//        System.out.println("char " + c);
//        c = 64;
//        System.out.println("char " + c);
//
//        boolean n = 10 > 5;
//        System.out.println(n);

        // Задача 1. Дано: a = 60, b = 45, c = 17. Найти периметр треугольника
        int a = 60;
        int b = 45;
        int c = 17;
        int p = a + b + c;
        System.out.println("Perimeter is " + p);

        //Задача 2. Дано: Голодный Вася съедает за 9 минут 3 банана, а сытый за 15 минут
        //насколько быстрее голодный Вася съедает один бана?
        int hungryTime = 9;
        int fullTime = 15;
        int bananas = 3;
        int hunryBananasPerMinute = hungryTime / bananas;
        int fullBananasPerMinute = fullTime / bananas;
        int diff = fullBananasPerMinute - hunryBananasPerMinute;
        System.out.println("The difference is " + diff);

        //Задача 3. Дано: Коля получил много двоек и закопал свой дневник на 127 метров.
        //Потом вернулся вернулся и углубил ещё до 2 метров. На сколько метров закопал свой дневник Коля?

        int first = 127;
        int plus = 2;
        int result = first + plus;
        System.out.println("Result is " + result);

        //Задача 4. Дано хитрый бугалтер разделил 5 рублей на 2 кассы. сколько рублей лежит в каждой кассе?
        double rub = 5;
        double kass = 2;
        double res = rub / kass;
        System.out.println("В каждой кассе лежит по " + res + " рублей");

        //Задача 5. Дано: 10 краных и 5 зеленых яблок.
        // Вопрос : Верно ли утверждение что  красных яблок больше?

        int redApple = 10;
        int greenApple = 5;
        boolean condition = redApple > greenApple;
        System.out.println("Красных яблок больше: " + condition); 
    }
}