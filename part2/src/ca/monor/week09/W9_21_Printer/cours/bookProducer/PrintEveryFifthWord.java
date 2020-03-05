package ca.monor.week09.W9_21_Printer.cours.bookProducer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrintEveryFifthWord {
    private Scanner scanner;
    private File file;
    public PrintEveryFifthWord(File file) {
        this.file = file;
    }

    public void printWord() throws FileNotFoundException {
        scanner = new Scanner(file);
        int counter = 0;
        while (scanner.hasNext()) {
            counter++;
            String word = scanner.next();
            if (counter % 5 == 0) {
                System.out.println(word);
            }
        }
    }
}
