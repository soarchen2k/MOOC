package monor.week06.exercise101_Library;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<Book>();

    public void addBook(Book newbook) {
        this.books.add(newbook);
    }

    public void printBooks() {
        for (Book b :
                books) {
            System.out.println(b);
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        return searchBook(title, null, -1);
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        return searchBook(null, publisher, -1);
    }


    public ArrayList<Book> searchByYear(int year) {
        return searchBook(null, null, year);
    }

    public ArrayList<Book> searchBook(String title, String publisher, int year) {
        ArrayList<Book> founds = new ArrayList<Book>();
        for (Book b :
                this.books) {
            if (StringUtils.included(b.title(), title)
                    || StringUtils.included(b.publisher(), publisher)
                    || b.year() == year) {
                founds.add(b);
            }
        }
        return founds;
    }
}
