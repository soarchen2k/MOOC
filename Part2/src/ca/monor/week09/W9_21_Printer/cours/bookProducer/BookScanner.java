package ca.monor.week09.W9_21_Printer.cours.bookProducer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BookScanner {
    private Scanner bookScanner;

    public BookScanner(File file) {
        try {
            this.bookScanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
