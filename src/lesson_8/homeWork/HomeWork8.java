package lesson_8.homeWork;

import java.util.Scanner;

public class HomeWork8 {

    static int numberInCube (int number) {
       return number*number*number;
    }

    static int numberInCubeRecursion (int number, int degree) {
        if (degree == 1) {
            return number;
        } else {
            return number * numberInCubeRecursion(number, degree -1);
        }
    }

    static boolean numberMoreFive (int number) {
        if (number > 5) {
            return true;
        } else {
            return false;
        }
    }

    static int numberOrNumber (int numOne, int numTwo) {
        if (numOne > numTwo) {
            return numTwo;
        } else {
            return numOne;
        }
    }

    static int numberOperation (int numOne, int numTwo, int degree) {
        int result1 = 1;
        int result2 = 1;
        for (int i = 1; i <= degree ; i++) {
            result1 = result1 * numOne;
            result2 = result2 * numTwo;
        }

        return result1 + result2;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Первое задание. Возведение в степень двумя способами");
        System.out.println("Введите число которое хотите возвести в куб");
        System.out.println(numberInCube(scanner.nextInt()));
        System.out.println("Возведение в куб через рекурсию");
        System.out.println(numberInCubeRecursion(scanner.nextInt(), 3));

        System.out.println();
        System.out.println("####################################################################################");
        System.out.println();

        System.out.println("Второе задание. Больше или меньше пяти");
        System.out.println("Введите число");
        System.out.println(numberMoreFive(scanner.nextInt()));

        System.out.println();
        System.out.println("####################################################################################");
        System.out.println();

        System.out.println("Третье задание. Вывод меньшего числа");
        System.out.println("Введите два числа");
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        System.out.println(numberOrNumber(first, second));

        System.out.println();
        System.out.println("####################################################################################");
        System.out.println();

        System.out.println("Четвёртое задание. Возведение в степень чисел и их суммирование");
        System.out.println("Введите два числа");
        int numFirst = scanner.nextInt();
        int numSecond = scanner.nextInt();
        System.out.println("Введите степень в которую хотите возвести");
        int power = scanner.nextInt();
        System.out.println(numberOperation(numFirst, numSecond, power));

        System.out.println();
        System.out.println("####################################################################################");
        System.out.println();

        System.out.println("Пятое задание. Калькулятор");

        System.out.println("Введите первое число");
        int firstNum = getInt();
        char op = getOperation();
        System.out.println("Введите второе число");
        int secondNum = getInt();
        System.out.println(firstNum + " " + op + " " + secondNum + " = " + calc(firstNum, secondNum, op));;





    }


    //5.Калькулятор

    public static int getInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static char getOperation() {
        int count = 0;
        char oper = 0;
        while (count == 0) {
            System.out.println("| + | - | * | / |");
            System.out.println("Выберите операцию введя соответствующий символ");
            Scanner scanner = new Scanner(System.in);
            oper = scanner.next().charAt(0);
            switch (oper) {
                case '+':
                    count += 1;
                    return '+';
                case '-':
                    count += 1;
                    return '-';
                case '*':
                    count += 1;
                    return '*';
                case '/':
                    count += 1;
                    return '/';
                default:
                    System.out.println("Ошибка. Введите один из перечисленных символов");
                    break;
            }
        }

        return oper;
    }

    public static int calc(int num1, int num2, char operation) {
        int result = 0;
        switch (operation) {
            case '+' -> {
                return result = num1 + num2;
            }
            case '-' -> {
                return result = num1 - num2;
            }
            case '*' -> {
                return result = num1 * num2;
            }
            case '/' -> {
                return result = num1 / num2;
            }
        }

        return result;
    }


}
