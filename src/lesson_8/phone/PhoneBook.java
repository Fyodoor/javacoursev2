package lesson_8.phone;

import java.util.Scanner;

public class PhoneBook {
    // fields
    Contact [] contacts = new Contact [100];
    Scanner scanner = new Scanner(System.in);
    // constructor

    public PhoneBook() {
    }

    // methods

    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }


    public void addContact(Contact contact) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] == null) {
                contacts[i] = contact;
                break;
            }
        }
    }


    //Домашняя работа
    public Contact searchContact(String nameOfContact) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null && contacts[i].getName().equalsIgnoreCase(nameOfContact)) {
                System.out.println(contacts[i].getName() + " присутствует в записной книжке");
                return contacts[i];
            }
        }
        System.out.println("Нет такого контакта, либо введён неверно");
        return null;
    }

    public void deleteContact(String nameOfContact) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null && contacts[i].getName().equalsIgnoreCase(nameOfContact)) {
                contacts[i] = null;
                return;
            }
        }

    }

    public Contact editContact(String searchName, String newNameOfContact) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null && contacts[i].getName().equalsIgnoreCase(searchName)) {
                contacts[i].setName(newNameOfContact);
                break;
            }
        }
        return null;
    }

    public void printNameConntact(Contact[] contacts) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null) {
                System.out.println(contacts[i].name);
            }
        }
    }
}
