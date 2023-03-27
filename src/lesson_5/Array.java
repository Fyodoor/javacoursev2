package lesson_5;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        byte a = 5;
//        byte [] array2 = {12, 14, 16, 21};

        byte [] array1 = new byte[7];
        array1 [0] = 5;
        array1 [1] = 7;
        array1 [2] = 11;
        array1 [3] = 23;
        array1 [4] = 47;
        array1 [5] = 52;
        array1 [6] = 59;


        // Task1. Print array
//        for (int i = 0; i < array1.length; i++) {
//            System.out.println(" on index " + i + " set value " + array1[i]);
//        }
        // Task1. Print array with foreach
//        for (int c: array1) {
//            System.out.print(c + " ");
//        }

        // Task 3. Print only odd elements of array

//        for (int i = 0; i < array1.length; i++) {
//            if (array1[i] % 2 == 0) {
//                System.out.println(array1[i]);
//            }
//        }

        // Task 3. Print only odd index of array

//        for (int i = 0; i < array1.length; i++) {
//            if (i % 2 == 0) {
//                System.out.println(array1[i]);
//            }
//        }

        // Task 4. Fill array in cycle

        int [] array2 = new int[10];

        for (int i = 0; i < array2.length; i++) {
            array2 [i] = i;
        }
//        for (int i = 0; i < array2.length; i++) {
//            System.out.println(array2[i]);
//        }

        double [] arr3 = new double[5];
        boolean [] arr4 = new boolean[5];
        String [] arr5 = new String[5];




        System.out.println(" ");
    }
}
