package ca.monor.week07.W7_06_PromissoryNote.cours;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Book> bookCollection = new HashMap<>();
        Book senseAndSensibility = new Book("Sense and Sensibility", 1811, "...");
        Book prideAndPrejudice = new Book("Pride and Prejudice", 1813, "....");
        bookCollection.put(senseAndSensibility.getName(), senseAndSensibility);
        bookCollection.put(prideAndPrejudice.getName(), prideAndPrejudice);
        Book book = bookCollection.get("Persuasion");
        System.out.println(book);
        book = bookCollection.get("Pride and Prejudice");
        System.out.println(book);
    }
}
