package ca.monor.week09.W9_26_PhoneSearch.cours.OneObjectInManyListsAMapConstructionOrASet;

import java.util.List;
import java.util.Map;

public class Book {
    private String ISBN;
    private String writer;
    private String name;
    private int date;

    public String getIsbn() {
        return ISBN;
    }

    public String getWriter() {
        return writer;
    }
}

class Library {
    private Map<String, Book> ISBNBooks;
    private Map<String, List<String>> writerBooks;
    private List<Book> loanBooks;
    private List<Book> shelfBooks;

    public void addBook(Book newBook){
        ISBNBooks.put(newBook.getIsbn(), newBook);
        writerBooks.put(newBook.getWriter(), (List<String>) newBook);
        shelfBooks.add(newBook);
    }

    public Book getBookBasedOnISBN(String isbn){
        return ISBNBooks.get(isbn);
    }
}