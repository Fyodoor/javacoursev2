package lesson_5.homework;




import java.util.Scanner;

public class HomeWorkFive {
    Scanner scanner = new Scanner(System.in);
    void MenuPlay() {
        while(true) {
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
                System.out.println("-------------------------lvl 6--------------------------");
                System.out.println("-------------------------lvl 7--------------------------");;
                int voteTask = scanner.nextInt();
                if (voteTask == 1) {
                    new HomeWorkFive().Task1();
                } else if (voteTask == 2) {
                    new HomeWorkFive().Task2();
                } else if (voteTask == 3) {
                    new HomeWorkFive().Task3();
                } else if (voteTask == 4) {
                    new HomeWorkFive().Task4();
                } else if (voteTask == 5) {
                    new HomeWorkFive().Task5();
                } else if (voteTask == 6) {
                    new HomeWorkFive().Task6();
                } else if (voteTask == 7) {
                    new HomeWorkFive().Task7();
                }
                else {
                    System.out.println("This level does not exist.");
                }
            }
            else if (vote == 0) {
                break;
            } else {
                System.out.println("Choose either 1 or 0");
            }
        }


    }
    void Task1() {
        String [] lines = new String[10];
        System.out.println("Введите 8 слов/строк");
        for (int i = 0; i < 8; i++) {
            lines[i] = scanner.nextLine();
        }
        for (int i = lines.length - 1; i >= 0; i--) {
            System.out.println(lines[i]);
        }


    }

    void Task2() {
        int [] numbers = new int[10];
        int max = 0;
        System.out.println("Введите 10 чисел");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            if ( max < numbers[i]) {
                max = numbers[i];
            }
        }

        System.out.printf("Максимальное число в массиве равно: %d", max);
        System.out.println();

    }

    void Task3() {
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

    void Task4() {
        int [] numbers = new int[10];
        System.out.println("Введите 10 чисел");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int i = numbers.length - 1; i >= 0 ; i--) {
            System.out.println(numbers[i]);
        }

    }

    void Task5() {
        int [] tooMuchNumbers = new int[20];
        int [] firstHalf = new int[10];
        int [] secondHalf = new int[10];
        System.out.println("Введите 20 чисел");
        for (int i = 0; i < tooMuchNumbers.length; i++) {
            tooMuchNumbers[i] = scanner.nextInt();
            if (i < (tooMuchNumbers.length/2)) {
                firstHalf[i] = tooMuchNumbers[i];
            } else if (i >= (tooMuchNumbers.length/2 - 1)) {
                secondHalf[i - tooMuchNumbers.length/2] = tooMuchNumbers[i];
            }
        }
        for (int i = 0; i < secondHalf.length; i++) {
            System.out.println(secondHalf[i]);
        }


    }

    void Task6() {
        int [] numbers = new int[20];

        System.out.println("Введите 20 чисел");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int max = numbers[0];
        int min = max;
        for (int i = 0; i < numbers.length; i++) {
            if ( max < numbers[i]) {
                max = numbers[i];
            }
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }

        System.out.printf("Максимальное и минимальное значения в массиве: %s %d", max, min);

    }

    void Task7() {
        int [] numbers = new int[20];


        System.out.println("Введите 20 чисел");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        while(true) {
            int count = 0;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] < numbers[i + 1]) {
                    int bub = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = bub;
                    count++;
                }
            }
            if (count == 0) {
                break;
            }

        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

    }




    public static void main(String[] args) {
        new HomeWorkFive().MenuPlay();

    }
}
