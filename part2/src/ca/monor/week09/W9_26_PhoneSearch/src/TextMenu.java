package ca.monor.week09.W9_26_PhoneSearch.src;

import java.util.Scanner;

public class TextMenu {

    public static void startSearch(PhoneBook phoneBook) {
        Scanner scanner = new Scanner(System.in);
        showTextMenu();
        String command = "";
        while (true) {
            System.out.print("command: ");
            command = scanner.nextLine();
            if (command.equalsIgnoreCase("x")) {
                break;
            }
            if (command.equals("1")) {
                setPhoneNumber(scanner, phoneBook);
            }
            if (command.equals("2")) {
                searchForANumber(scanner, phoneBook);
            }
            if (command.equals("3")) {
                searchForAPersonByPhoneNumber(scanner, phoneBook);
            }
            if (command.equals("4")) {
                addAddress(scanner, phoneBook);
            }
            if (command.equals("5")) {
                searchForPersonalInformation(scanner, phoneBook);
            }
            if (command.equals("6")) {
                deletePersonalInformation(scanner, phoneBook);
            }
            if (command.equals("7")) {
                filteredListing(scanner, phoneBook);
            }
        }
    }

    private static void filteredListing(Scanner scanner, PhoneBook phoneBook) {
        System.out.print("keyword (if empty, all listed): ");
        String key = scanner.nextLine();
        if (key.isEmpty()) {
            for (String name :
                    phoneBook.getKeySet()) {
                phoneBook.getPerson(name).printAddress();
                phoneBook.getPerson(name).printNumber();
            }
        } else {
            phoneBook.printContainsKey(key);
        }
    }

    private static void deletePersonalInformation(Scanner scanner, PhoneBook phoneBook) {
        System.out.print("whose information: ");
        String name = scanner.nextLine();
        phoneBook.clear(name);
    }

    private static void searchForPersonalInformation(Scanner scanner, PhoneBook phoneBook) {
        System.out.print("whose information: ");
        String name = scanner.nextLine();
        if (!phoneBook.contains(name)) {
            System.out.println("  not found");
        } else {
            phoneBook.getPerson(name).printAddress();
            System.out.println("  phone numbers:");
            phoneBook.getPerson(name).printNumber();
        }
    }

    private static void addAddress(Scanner scanner, PhoneBook phoneBook) {
        PersonAddress address = new PersonAddress();
        System.out.print("whose address: ");
        String name = scanner.nextLine();
        System.out.print("street: ");
        String street = scanner.nextLine();
        System.out.print("city: ");
        String city = scanner.nextLine();

        if (phoneBook.contains(name)) {
            address.setStreet(street);
            address.setCity(city);
            phoneBook.getPerson(name).setAddress(address);
        } else {
            phoneBook.addPerson(name);
            address.setStreet(street);
            address.setCity(city);
            phoneBook.getPerson(name).setAddress(address);
        }
    }

    private static void searchForAPersonByPhoneNumber(Scanner scanner, PhoneBook phoneBook) {
        System.out.print("number: ");
        String number = scanner.nextLine();
        phoneBook.searchForAPersonByPhoneNumber(number);
    }

    private static void searchForANumber(Scanner scanner, PhoneBook phoneBook) {
        System.out.print("whose number: ");
        String name = scanner.nextLine();
        if (!phoneBook.contains(name)) {
            System.out.println("  not found");
        } else {
            phoneBook.getPerson(name).printNumber();
        }
    }

    private static void setPhoneNumber(Scanner scanner, PhoneBook phoneBook) {
        System.out.print("whose number: ");
        String name = scanner.nextLine();
        System.out.print("number: ");
        String number = scanner.nextLine();
        if (phoneBook.contains(name)) {
            phoneBook.getPerson(name).setPhoneNumber(number);
        } else {
            phoneBook.addPerson(name);
            phoneBook.getPerson(name).setPhoneNumber(number);
        }
    }

    public static void showTextMenu() {
        System.out.println("phone search\n" +
                "available operations:\n" +
                " 1 add a number\n" +
                " 2 search for a number\n" +
                " 3 search for a person by phone number\n" +
                " 4 add an address\n" +
                " 5 search for personal information\n" +
                " 6 delete personal information\n" +
                " 7 filtered listing\n" +
                " x quit\n");
    }
}
