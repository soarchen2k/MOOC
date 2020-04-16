package ca.monor.week08.W8_09_CarRegistrationCentre.cours39_Object;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Book, String> loaners = new HashMap<Book, String>();

        Book objectbook = new Book("Objectbook", 2000);
        loaners.put(objectbook, "Pekka");
        loaners.put(new Book("Test Driven Development", 1999), "Arto");

        System.out.println(loaners.get(objectbook));
        System.out.println(loaners.get(new Book("Objectbook", 2000)));
        System.out.println(loaners.get(new Book("Test Driven Development", 1999)));
    }
}
