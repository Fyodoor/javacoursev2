package lesson_8.homeWork;

import java.util.Scanner;

public class TestCalc {
    public static void main(String[] args) {
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
