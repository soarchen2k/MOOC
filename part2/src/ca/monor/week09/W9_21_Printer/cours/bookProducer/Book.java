package ca.monor.week09.W9_21_Printer.cours.bookProducer;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URI;
import java.util.Scanner;

public class Book extends File {
    private Scanner scanner;

    public Book(String pathname) {
        super(pathname);
    }

    public Book(String parent, String child) {
        super(parent, child);
    }

    public Book(File parent, String child) {
        super(parent, child);
    }

    public Book(URI uri) {
        super(uri);
    }

    public String bookProducer(File file) throws FileNotFoundException {
        String lines = "";
        this.scanner = new Scanner(file);
        while (this.scanner.hasNextLine()) {
            lines += scanner.nextLine() + "\n";
        }
        return lines;
    }

    @Override
    public String toString() {
        return "Book{" +
                "scanner=" + scanner +
                '}';
    }
}
