package lesson_8.phone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Contact vasya = new Contact("Vasiliy", "895146542311", "test1@gmail.ru");
        Contact patya = new Contact("Pyotr", "895146542312", "test2@gmail.ru");
        Contact olya = new Contact("Olga", "895146542313", "test3@gmail.ru");
        Contact vova = new Contact("Vladimir", "895146542314", "test4@gmail.ru");
        Contact alex = new Contact("Alexey", "895146542315", "test5@gmail.ru");

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact(vasya);
        phoneBook.addContact(patya);
        phoneBook.addContact(olya);
        phoneBook.addContact(vova);
        phoneBook.addContact(alex);

        //Поиск контакта
        System.out.println("Введите имя искомого контакта");
        phoneBook.searchContact(scanner.nextLine());

        System.out.println();

        //Удаление контакта
        System.out.println("Введите имя котакта, который хотите удалить");
        phoneBook.deleteContact(scanner.nextLine());

        System.out.println();

        //Замена контакта
        System.out.println("Введите имя контакта который хотите заменить");
        String oldName = scanner.nextLine();
        System.out.println("Введите имя на которое хотите заменить");
        String newName = scanner.nextLine();

        phoneBook.editContact(oldName, newName);

        System.out.println();


        phoneBook.printNameConntact(phoneBook.contacts);



    }
}
