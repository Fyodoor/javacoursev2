package lesson_5;

import java.util.Scanner;

public class TaskArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 12 23 36 49 76 87 91 134
        int [] lenina = new int[8];
        for (int i = 0; i < lenina.length; i++) {
            lenina[i] = scanner.nextInt();
        }
//        for (int c : lenina) {
//            System.out.println(c);
//        }

        int even = 0;  //четные
        int odd = 0; //нечетные

        for (int i = 0; i < lenina.length; i++) {
            if (i % 2 == 0) {
                even += lenina [i];
            }else {
                odd += lenina [i];
            }
        }

        if ( even > odd ) {
            System.out.println("На чётной стороне улицы живёт больше людей");
        } else if ( even < odd ) {
            System.out.println("На нечётной стороне улицы живёт больше людей");
        } else {
            System.out.println("На обеих сторонах улицы живёт одинаковое кол-во людей");
        }
    }
}
