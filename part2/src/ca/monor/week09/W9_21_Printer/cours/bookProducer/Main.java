package ca.monor.week09.W9_21_Printer.cours.bookProducer;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        Book book = new Book();
//        String books = book.bookProducer(new File("part2/src/ca/monor/week09/W9_21_Printer/cours/fileReader/names.txt"));
//        System.out.println(books);
        File book = new Book("part2/src/ca/monor/week09/W9_21_Printer/cours/fileReader/names.txt");

        String books = ((Book) book).bookProducer(book);
        System.out.println(books);

//        PrintEveryFifthWord printEveryFifthWord = new PrintEveryFifthWord(new File("part2/src/ca/monor/week09/" +
//                "W9_21_Printer/cours/bookProducer/textFile"));

        PrintEveryFifthWord texts = new PrintEveryFifthWord(book);
        texts.printWord();
    }
}
