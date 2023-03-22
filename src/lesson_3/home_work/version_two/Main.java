package lesson_3.home_work.version_two;

import java.util.Scanner;
class HomeWork {
    Scanner scanner = new Scanner(System.in);

    void resultTask1() {
        System.out.println("Введите число");
        int number = scanner.nextInt();
        if (number < 5 ) {
            System.out.println("Число меньше 5");
        }
        if (number > 5) {
            System.out.println("Число больше 5");
        } else if ( number == 5) {
            System.out.println("Число равно 5");
        }

    }
    

    void resultTask2() {
        System.out.println("Введите число");
        int number = scanner.nextInt();

        if (number >= 50 && number <= 100) {
            System.out.println("Число " + number + " содержится в интервале.");
        } else {
            System.out.println("Число " + number + " не содержится в интервале.");
        }
    }
 
     
        void resultTask3() {
            System.out.println("Введите номер месяца");
            int numberMonth = scanner.nextInt();

            if ( (numberMonth >= 1 && numberMonth < 3) || (numberMonth == 12) ) {
                System.out.println("Зима");
            } else if ( numberMonth >= 3 && numberMonth < 6 ) {
                System.out.println("Весна");
            } else if ( numberMonth >= 6 && numberMonth < 9 ) {
                System.out.println("Лето");
            } else if ( numberMonth >= 9 && numberMonth < 12 ) {
                System.out.println("Осень");
            } else {
                System.out.println("Такого месяца нет");
            }
        }
        
        void resultTask4() {
            System.out.println("Введите число");
            int num = scanner.nextInt();

            if (num > 0) {
                num *= 2;
                System.out.println(num);
            } else if (num < 0) {
                num += 1;
                System.out.println(num);
            } else {
                System.out.println(num);
            }
        }

        void resultTask5() {
            System.out.println("Введите год");

            int age = scanner.nextInt();

            if (age % 400 == 0) {
                System.out.println("количество дней в этом году: 366");
            } else if (age % 100 == 0) {
                System.out.println("количество дней в этом году: 365");
            } else if (age % 4 == 0) {
                System.out.println("количество дней в этом году: 366");
            }
            else {
                System.out.println("количество дней в этом году: 365");
            }
        }

        void resultTask6() {
            System.out.println("Введите три числа");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            if ( (a + b) > c && (a + c) > b && (b + c) > a) {
                System.out.println("Треугольник существует");
            }
            else {
                System.out.println("Трейгольник не существует");
            }

        }

        void resultTask7() {
            System.out.println("Введите кол-во минут");
            double t = scanner.nextDouble();

            t %= 5;

            if (t >= 0 && t < 3) {
                System.out.println("Зелёный");
            }
            else if (t >= 3 && t < 4) {
                System.out.println("Желтый");
            }
            else if (t >= 4 && t < 5) {
                System.out.println("Красный");
            }
            else {
                System.out.println("Зелёный");
            }
        }

}
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--------------------------------------");
        System.out.println("----------- Здравствуйте -----------");
        System.out.println("---------- Список заданий: ----------");
        System.out.println("---------------- 1 ----------------");
        System.out.println("---------------- 2 ----------------");
        System.out.println("---------------- 3 ----------------");
        System.out.println("---------------- 4 ----------------");
        System.out.println("---------------- 5 ----------------");
        System.out.println("---------------- 6 ----------------");
        System.out.println("---------------- 7 ----------------");


        int vote = scanner.nextInt();

        if (vote == 1) {
            new HomeWork().resultTask1();
        } else if (vote == 2) {
            new HomeWork().resultTask2();
        } else if (vote == 3) {
            new HomeWork().resultTask3();
        } else if (vote == 4) {
            new HomeWork().resultTask4();
        } else if (vote == 5) {
            new HomeWork().resultTask5();
        } else if (vote == 6) {
            new HomeWork().resultTask6();
        } else if (vote == 7) {
            new HomeWork().resultTask7();
        } else {
            System.out.println("Нет такого задания");
        }


    }
}
