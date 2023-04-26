package lesson_13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        /**
         * ArrayList<Integer> - это безразмерная коллекция, реализация изменяемого массива интерфейса List.
         * Изменяет размер динамически, но может включать в себя элементы только одного типа.
         * Примитивные типы нельзя хранить внутри коллекций.
         Для этого есть ссылочные типы примитивов:
         int Integer
         byte Byte
         short Short
         char Character
         */

//        String number = "25232";
//        Integer a = Integer.valueOf(number);
//        System.out.println();


        //ArrayList<Integer> arrayList = new ArrayList(); тоже можно, но не стоит
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        //1. Добавление объктов в коллекцию
        arrayList.add(11);
        arrayList.add(22);
        arrayList.add(33);
        arrayList.add(44);

        //2. Получение объекта
        System.out.println("Print first element " + arrayList.get(0));
        System.out.println("Print fourth element " + arrayList.get(3));

        //3. Печать списка
        System.out.println(arrayList); // не используется

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("Print arrayList in fori + " + arrayList.get(i));
        }
        System.out.println();
        for (Integer var: arrayList) {
            System.out.println("Print arrayList in foreach + " + var);
        }
        System.out.println();

        //4. Удаление элементов коллекции
        // удаление по индексу
        arrayList.remove(0);
        // удаление объекта
       arrayList.remove(Integer.valueOf(33));
        // очищение коллекции
        arrayList.clear();
        System.out.println(arrayList);


        ArrayList<String> strings = new ArrayList<>();

        strings.add("AAA");
        strings.add("BBB");
        strings.add("CCC");
        strings.add("DDD");

        //5. Проверка на наличие объекта
        System.out.println(strings.contains("CCC"));
        System.out.println(strings.contains("EEE"));

        //6. Добавление элемента коллекциина определенный индекс
        strings.add(3, "EEE");
        System.out.println(strings);

        //7. Замена элемента коллекции
        strings.set(3, "NNN");
        System.out.println(strings);

        //8. Узнать размер коллекции
        System.out.println("Размер коллекции - " + strings.size());

        //9. Преобразование коллекции в массив
        Object[] array = strings.toArray();

        //10. Добавить все элементы в новую коллекцию
        ArrayList<String> copyArrayList = new ArrayList<>();
        copyArrayList.addAll(strings);
        System.out.println("Скопированная коллекция " + copyArrayList);
        copyArrayList.clear();

        //11. проверка на наличие элементов
        System.out.println(strings.isEmpty());
        System.out.println(copyArrayList.isEmpty());

        //12. Возвращать индекс элемента в коллекции
        System.out.println("index of element NNN is " + strings.indexOf("NNN"));
        strings.add("NNN");
        System.out.println(strings);


        System.out.println("");

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(111);
        linkedList.add(222);
        linkedList.add(333);
        linkedList.add(444);
        linkedList.add(555);


    }
}
