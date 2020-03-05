package ca.monor.week07.W7_06_PromissoryNote.cours;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private HashMap<String, Book> collection;

    public Library(HashMap<String, Book> collection) {
        this.collection = collection;
    }

    public void addBook(Book book) {
        String name = stringCleaner(book.getName());
        if (this.collection.containsKey(name)) {
            System.out.println("The book is already in the library!");
        } else collection.put(name, book);
    }

    public void removeBook(String bookName) {
        String name = stringCleaner(bookName);
        if (this.collection.containsKey(name)) {
            collection.remove(bookName);
        }else System.out.println("The book was not found, you can't remove it!");
    }

    private String stringCleaner(String string) {
        if (string == null) {
            return "";
        }

        string = string.toLowerCase();
        return string.trim();
    }

    public Book getBook(String bookName) {
        bookName = stringCleaner(bookName);
        return this.collection.get(bookName);
    }

    public Book getBookUsingItsBeginningCharacters(String beginning) {
        beginning = stringCleaner(beginning);

        for (String key: this.collection.keySet()) {
            if (key.startsWith(beginning)) {
                return this.collection.get(key);
            }
        }
        return null;
    }

    public ArrayList<Book> bookList() {
        return new ArrayList<Book>(this.collection.values());
    }

}
