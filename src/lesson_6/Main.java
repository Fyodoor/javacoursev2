package lesson_6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 1 - Primitive types
        // 2 - Linked types by Oracle
        // 3 - Linked types by your own / other companies
        Scanner scanner = new Scanner(System.in);
//        int a = 5;
//        String s = new String("Hello world");
//        String w = "Hello World";
//        char [] str = {'H', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
//        String str1 = new String(str);
//        System.out.println(s);
//        System.out.println(w);
//        System.out.println(str1);

        /**
         length() - возвращает длину строки

         concat(): объединяет строки / +=

         equals(): сравнивает строки с учетом регистра

         equalsIgnoreCase(): сравнивает строки без учета регистра

         startsWith(): определяет, начинается ли строка с подстроки

         endsWith(): определяет, заканчивается ли строка на определенную подстроку

         String replace(char oldChar, char newChar)
         Возвращает новую строку, в результате, заменив все вхождения oldChar в этой строке на newChar.

         String[] split(String regex)
         Разделяет эту строку, окружая данным регулярным выражением.

         trim(): удаляет начальные и конечные пробелы

         toLowerCase(): переводит все символы строки в нижний регистр

         toUpperCase(): переводит все символы строки в верхний регистр
         */

        String st = "Hello world!";
        System.out.println(st.length());
        String st1 = st.concat(" Nice day");
        System.out.println(st1);

        int a = 5;
        int b = 10;

        String stt = "Hello World!";
        System.out.println(st.equals(stt));
        String stringForExampleInUpperCase = "HELLO WORLD!";
        String stringForExampleInLowerCase =  "hello world!";
        System.out.println(stringForExampleInUpperCase.equals(stringForExampleInLowerCase));
        System.out.println(stringForExampleInUpperCase.equalsIgnoreCase(stringForExampleInLowerCase));

        System.out.println(stt.startsWith("Hello"));
        System.out.println(st1.endsWith("day"));
        System.out.println(st1.endsWith("!"));

        String newSt1 = st1.replace("Nice", "Bad");
        System.out.println(newSt1);

        String st3 = "Hello World! ";
        String trim = st3.trim();
        System.out.println(trim);
        System.out.println(st3);

        System.out.println();

        String s1 = stringForExampleInLowerCase.toUpperCase();
        System.out.println(s1);

    }
}
