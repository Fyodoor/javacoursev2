package lesson_8.phone;

public class Main {
    public static void main(String[] args) {
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
    }
}
